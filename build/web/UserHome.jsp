<%
    String nm = (String) session.getAttribute("username");
    if (nm == null) {
        response.sendRedirect("index.html");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <style>
            body {
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
                background-color: #ffffff

            }

            div.topnav {
                text-align: center;
                overflow: hidden;
                background-color: #666666;
            }
            div.topnav.one{
                text-align: left;
            }

            button.Logout{
                background-color:green;
                color:white;

            }
            button.Logout:active{
                border:none;
            }
            button.Add:hover{
                box-shadow: 5px 18px 15px rgba(0, 0, 0, 0.1);
            }
            button.Add:active
            {
                outline: none;
                border:none;

            }
            button.Add{
                background-color: green;
                color: white; 
                font-size: 20px;
                padding: 10px 20px; 
                font: Arial;
                border-radius: 15px;
                margin:40px 0px 0px 70px
            }
            button.Logout{
                float: right;
                border-radius: 5px
            }
            ul {
                margin: 0;
                padding: 0;
            }

            ul li {
                cursor: pointer;
                position: relative;
                padding: 12px 8px 12px 40px;
                background: #eee;
                font-size: 18px;
                transition: 0.2s;

                /* make the list items unselectable */
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }

            /* Set all odd list items to a different color (zebra-stripes) */
            ul li:nth-child(odd) {
                background: #f9f9f9;
            }

            /* Darker background-color on hover */
            ul li:hover {
                background: #ddd;
            }

            /* When clicked on, add a background color and strike out text */
            ul li.checked {
                background: #888;
                color: #fff;
                text-decoration: line-through;
            }
        </style>



    </head>
    <body>
        <div class="topnav">
            <h1 style="color:white;"> Qtask 
            </h1>
        </div>
        <p style="font-size: 15; color: green;margin: 10px 15px; text-align: left " > Welcome <%=nm%> 

            <button class = "Logout">Logout</button>
        </p> 
        <button class="Add" onclick="displayBox()" id = "addbtn">Add+</button>
        <input id= "input" type="text"style="visibility: hidden; padding: 20px; margin: 0px 0px 0px 20px " placeholder="What needs to be done..">
        <table border="0" align="center" cellpadding="40" >
            <tbody>
                <tr>
                    <td style="font-size: 20;color:white; background-color: green;padding: 20px 200px ; text-align: center; ">Task to do</td>
                </tr>
            </tbody>
        </table>
        <ul id="list" style="text-align: left ;margin: 0px 444px 0px 444px" ></ul>





    </body>

    <script>
        function displayBox()
        {
            document.getElementById("input").style.visibility = "visible";
        }
        function newItem() {
            var item = document.getElementById("input").value;
            var ul = document.getElementById("list");
            var li = document.createElement("li");
            li.appendChild(document.createTextNode("- " + item));
            ul.appendChild(li);
            document.getElementById("input").value = "";
            li.onclick = removeItem;
        }

        
        // Create a "close" button and append it to each list item
                var myNodelist = document.getElementsByTagName("LI");
        var i;
        for (i = 0; i < myNodelist.length; i++) {
            var span = document.createElement("SPAN");
            var txt = document.createTextNode("\u00D7");
            span.className = "close";
            span.appendChild(txt);
            myNodelist[i].appendChild(span);
        }

// Click on a close button to hide the current list item
        var close = document.getElementsByClassName("close");
        var i;
        for (i = 0; i < close.length; i++) {
            close[i].onclick = function () {
                var div = this.parentElement;
                div.style.display = "none";
            }
        }
        // Add a "checked" symbol when clicking on a list item
        var list = document.querySelector('ul');
        list.addEventListener('click', function (ev) {
            if (ev.target.tagName === 'LI') {
                ev.target.classList.toggle('checked');
            }
        }, false);

        function newItems() {
            var li = document.createElement("li");
            var inputValue = document.getElementById("myInput").value;
            var t = document.createTextNode(inputValue);
            li.appendChild(t);
            if (inputValue === '') {
                alert("You must write something!");
            } else {
                document.getElementById("myUL").appendChild(li);
            }
            document.getElementById("myInput").value = "";

            var span = document.createElement("SPAN");
            var txt = document.createTextNode("\u00D7");
            span.className = "close";
            span.appendChild(txt);
            li.appendChild(span);

            for (i = 0; i < close.length; i++) {
                close[i].onclick = function () {
                    var div = this.parentElement;
                    div.style.display = "none";
                }
            }
        }
        document.body.onkeyup = function (e) {
            if (e.keyCode == 13) {
                newItem();
            }
        };
    </script>
</html>
