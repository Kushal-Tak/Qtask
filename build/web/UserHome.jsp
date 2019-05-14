<%
    String nm=(String)session.getAttribute("username");
    if(nm==null){
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
            button:hover{
                background-color:green;
                color:white;
                
                
            }
        </style>
    </head>
    <body>
        <div class="topnav">
            <h1 style="color:white;"> Qtask 
            </h1>
        </div>
          <p style="font-size: 15; color: green;margin: 10px 15px; text-align: left " > Welcome <%=nm%> 
             
          <button style="float: right;">Logout</button>
          </p>
    </body>
</html>
