<%-- 
    Document   : Accountpg
    Created on : Feb 14, 2021, 3:47:53 PM
    Author     : student
--%>
<%-- 
<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mycompany.lab2.CreateAccount"%>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}


/* Add padding to container elements */
.container {
  padding: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #474e5d;
  padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
/* The Close Button (x) */




</style>
<body>

<h2>Modal Signup Form</h2>


<div>

  
    <div class="container">
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      <hr>
      <form action="FrontEnd" method="post">
      <input type="hidden" name="pageName" value="Create"/>
      <label for="email"><b>Email</b></label>
      <input type="text" id= "user" placeholder="Enter Email"  name="user"  required>

      <label for="psw"><b>Password</b></label>
      <input type="text" placeholder="Enter Password" id="psw" name="psw" required>

      <label for="buy_sell"><b>For buyer type(B) for seller type (S)</b></label>
      <input type="text" id="Buy_sell" name="Buy_sell">
      
      <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
      user
      <button type="submit">Sign Up</button>
      </form>

      
      
      <div class="clearfix">
        <form action="index.html" method="post"> 
        <button type="submit" class="cancelbtn">Cancel</button>
        
        </form>
<!--        <form action="CreateAccount" method="post">
        <button type="submit" class="signupbtn">Sign Up</button>
        </form>-->
      </div>
      
    </div>
  
</div>



</body>
</html>
