$(document).ready(function () {
    $("#buttonSubmit").click(function(event) {
        var word = $("#txtValue").val();
        document.getElementById("definition").innerHTML = "";
        $.get("/OnlineDiction/diction", {txtValue: word}, function(responseJson) {
            if (responseJson != null) {
                var i = 1;              
                $("#definition").append("<table>");
                $("#definition").append("<tr>");
                $("#definition").append("<td>Word type");
                $("#definition").append("</td>");
                $("#definition").append("<td>Definition");
                $("#definition").append("</td>");
                $("#definition").append("</tr>");
                
                $.each(responseJson, function(key, value) {
                	   $("#definition").append("<tr>");
                       $("#definition").append("<td>" + value['wordtype']);
                       $("#definition").append("</td>");
                       $("#definition").append("<td>" + value['definition']);
                       $("#definition").append("</td>");
                       $("#definition").append("</tr>");
            
                    i++;
                });
                $("#definition").append("</table>");
            }
        });
    });   
});