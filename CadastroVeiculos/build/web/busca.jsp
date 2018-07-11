<%-- 
    Document   : busca
    Created on : 10/06/2018, 02:04:32
    Author     : Taina Santos
--%>

<%@page import="java.util.List"%>
<%@page import="br.cadastroveiculos.dao.CarroDAO"%>
<%@page import="br.cadastroveiculos.modelo.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
        <style>
            input[type=text] {
                width: 400px;
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                font-size: 16px;
                background-color: white;

                background-position: 10px 10px; 
                background-repeat: no-repeat;
                padding: 10px;


                display: block;
                margin-left: auto;
                margin-right: auto;

                margin-top: 10px;
            }
            #botao{
                width:120px;
                height: 30px;
                font-size: 16px;
                border: 1px solid #E6E6E6;
                background: #f7f7f7;
                display: block;
                margin-left: auto;
                margin-right: auto;



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
        <br/>
        <hr>
        <form method="post" action="resultadoBusca.jsp">
            <center> <h3>Placa:</h3> </center><br/>
            <input type="text" name="placa" action=""/><br/>

            <br/>
            <input type="submit" value="Pesquisar" id='botao'/>
        </form>

        <br/><hr>
        <a href="index.html">Voltar ao inicio</a>
    </body>
</html>
