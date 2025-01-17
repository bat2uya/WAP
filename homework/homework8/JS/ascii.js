/*global ANIMATIONS */

(function () {

    'use strict';

    let interval;
    let currentPosition = 0;
    let previousValue = '';
    let started = false;

    window.onload = function () {
        let start = document.getElementById("start");
        let stop = document.getElementById("stop");
        let size = document.getElementById("size");
        let speed = document.getElementById("speed");
        let animationText = document.getElementById("mytextarea");

        start.onclick = startClickHandler;
        stop.onclick = stopClickHandler;
        size.onchange = sizeChangeHandler;
        speed.onchange = speedChangeHandler;
        animationText.style.fontSize = "12pt";
    };

    /**
     * Adds two numbers together.
     */
    function startClickHandler() {
        let animation = document.getElementById("animation");
        let stop = document.getElementById("stop");
        let mytextarea = document.getElementById("mytextarea");
        let speed = document.getElementById("speed");

        this.disabled = true;
        stop.disabled = false;
        animation.disabled = true;
        previousValue = mytextarea.value;
        started = true;
        if (speed.checked) {
            const TIME = 50;
            makeAnimation(animation, mytextarea, TIME);
        } else {
            const TIME = 250;
            makeAnimation(animation, mytextarea, TIME);
        }
    }

    /**
     * Adds two numbers together.
     */
    function stopClickHandler() {
        let animation = document.getElementById("animation");
        let start = document.getElementById("start");
        let mytextarea = document.getElementById("mytextarea");

        animation.disabled = false;
        start.disabled = false;
        this.disabled = true;
        clearInterval(interval);
        mytextarea.value = previousValue;
        started = false;
        currentPosition = 0;
    }

    /**
     * Adds two numbers together.
     */
    function sizeChangeHandler() {
        document.getElementById("mytextarea").style.fontSize = this.value;
    }

    /**
     * Adds two numbers together.
     */
    function speedChangeHandler() {
        if (started) {
            let animation = document.getElementById('animation');
            let mytextarea = document.getElementById('mytextarea');
            if (animation.value !== 'Blank') {
                clearInterval(interval);
                if (this.checked) {
                    const TIME = 50;
                    makeAnimation(animation, mytextarea, TIME);
                } else {
                    const TIME = 250;
                    makeAnimation(animation, mytextarea, TIME);
                }
            }
        }
    }

    /**
     * Adds two numbers together.
     * @param {HTMLElement} animation is the drop down list element in the HTML.
     * @param {HTMLElement} mytextarea is the textarea element in the HTML.
     * @param {int} time used to use in the interval.
     */
    function makeAnimation(animation, mytextarea, time) {
        if (animation.value !== 'Blank' && animation.value !== 'Custom') {
            let animationVal = ANIMATIONS[animation.value];
            let frames = animationVal.split("=====\n");
            interval = setInterval(function () {
                if (currentPosition === frames.length) {
                    mytextarea.value = "";
                    currentPosition = 0;
                }
                mytextarea.value = frames[currentPosition];
                currentPosition++;
                mytextarea.scrollTop = animationText.scrollHeight;
            }, time);
        }
    }
})();