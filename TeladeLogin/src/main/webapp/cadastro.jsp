<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cadastro</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .signup-container {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .signup-container h2 {
        text-align: center;
    }

    .signup-container input[type="text"],
    .signup-container input[type="password"],
    .signup-container input[type="submit"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    .signup-container input[type="submit"] {
        background-color: #4caf50;
        color: #fff;
        cursor: pointer;
    }

    .signup-container input[type="submit"]:hover {
        background-color: #45a049;
    }

    .login-link {
        text-align: center;
        margin-top: 10px;
    }

    .login-link a {
        color: #4caf50;
        text-decoration: none;
    }

    .login-link a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
<div class="signup-container">
    <h2>Cadastro</h2>
    <form action="cadastro">
        <input type="text" name="username" placeholder="Usuário" required>
        <input type="password" name="password" placeholder="Senha" required>
        <input type="submit" value="Cadastrar">
    </form>
  
</div>
</body>
</html>
