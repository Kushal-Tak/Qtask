<!DOCTYPE html>

<html>
    <head>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <style>
            body {
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
                background-color: #d6d3d3
                
            }

            div.topnav {
                text-align: center;
                overflow: hidden;
                background-color: #666666;
            }
            
            div.a{
                text-align: center;
                font:Times New Roman;
                font-size: 30px;
                
            }
            div.b{
                text-align: left;
                font:Times New Roman;
                font-size: 25px;
            }
           
        </style>
    </head>
    <body>
        <div class="topnav">
            <h1 style="color:white;"> Qtask </h1>
            
        </div>
        <div class = "a">
            <h2> Registration</h2>
        </div>   
        
        <div class ="b">
        <form action="SaveUser" method="post">
        <table align= "center" cellspacing="12" >
            <tbody>
                <tr>
                    <td>UserID</td>
                    <td><input type="text" name="userid" value="" /></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="uname" value="" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" value=""/></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="addr" value="" /></td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td><input type="text" name="contact" value="" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="" /></td>
                </tr>
   
                <tr>
                    <td><input type="submit" value="Register"/></td>
                    <td><input type="reset"/> </td>
                   
                </tr>
   
            </tbody>
        </table>
        </form>
        </div>
        
       
    </body>
</html>
