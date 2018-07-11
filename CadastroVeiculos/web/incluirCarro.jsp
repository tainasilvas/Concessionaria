<%-- 
    Document   : incluirCarro
    Created on : 10/06/2018, 00:09:57
    Author     : Taina Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Veículo</title>
        <style>
            * {
                box-sizing: border-box;
            }

            input[type=text], select, textarea {
                width: 300px;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                resize: vertical;
            }

            label {
                padding: 12px 12px 12px 0;
                display: inline-block;
            }

            input[type=submit] {
                background-color: black;
                color: white;
                padding: 12px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;

            }

            input[type=submit]:hover {
                background-color: darkgray;
            }






            .row:after {
                content: "";
                display: table;
                clear: both;
            }


            @media screen and (max-width: 600px) {
                input[type=submit] {
                    width: 400px;
                    margin-top: 0;
                }
            }


            a:link, a:visited {
                display: block;
                border:1px solid #25692A;
                border-radius:4px;
                display:inline-block;
                cursor:pointer;
                font-family:Verdana;
                font-weight:bold;
                font-size:13px;
                padding:6px 10px;
                text-decoration:none;

                border-color:#46a7f5;
                background:linear-gradient(to bottom, #86c6f8 5%, #46a7f5 100%);
                box-shadow:inset 0px 1px 0px 0px #d7ecfd;
                color:#fff;
                text-shadow:0px 1px 0px #528009; 
            }


            a:hover, a:active {
                background:linear-gradient(to bottom, #46a7f5 5%, #86c6f8 100%);
            }

        </style>

    </head>
    <body>
        <h2>Cadastrar um carro novo</h2><br/><br/>
        <hr/>
        <br/>
        <div class='container'>
            <form method="post" action="cadastraCarro">

                <label>Fabricante: </label><br/>
                <input type="text" name="fabricante" action=""/><br/>
                <label> Modelo:</label><br/>
                <input type="text" name="modelo" value=""/><br/>
                <label>Valor:</label><br/> 
                <input type="text" name="valor" value=""/><br/>
                <label> Placa:</label><br/> 
                <input type="text" name="placa" value=""/><br/>
                <label> Ano:</label><br/> 
                <input type="text" name="ano" value=""/><br/>
                <br/>
                <br/>
                <div class="row">
                    <input type="submit" value="CADASTRAR"/>
                </div>
            </form>
        </div>
        <br/>
        <a href="index.html">Voltar ao menu</a>
    </body>
</html>
