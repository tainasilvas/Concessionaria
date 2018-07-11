<%-- 
    Document   : resultadoBusca
    Created on : 10/06/2018, 16:22:49
    Author     : Taina Santos
--%>

<%@page import="br.cadastroveiculos.modelo.Carro"%>
<%@page import="br.cadastroveiculos.dao.CarroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado da busca</title>
        <style>
            table, th, td{
                border: 0;
                text-align: center; 
                padding: 10px;
            }
            .even {
                background-color:#edf5ff;
            }
            tr:nth-child(even) {
                background-color: #edf5ff;
            }
            tr:hover {
                background-color:#3d80df;
                color: #fff;
            }
            thead tr:hover {
                background-color: transparent;
                color: inherit;
            }

            .coluna{
                background-color: beige;

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

        <%
            String placa = request.getParameter("placa");
            CarroDAO cDAO = new CarroDAO();

            Carro c = (Carro) cDAO.getBusca(placa);
        %>
        <h2>Resultado da Busca</h2><br/><br/><hr/><br/>

        <table>
            <tr>
                <th class="coluna"><b>Fabricante: </b></td>
                <th class="coluna"><b>Modelo: </b></td>
                <th class="coluna"><b>Placa: </b></td>
                <th class="coluna"><b>Valor:</b></td>
                <th class="coluna"><b>Ano:</b></td>
            </tr>
            <tr>
                <td><%=c.getFabricante()%></td>
                <td><%=c.getModelo()%></td>
                <td><%=c.getPlaca()%></td>
                <td><%=c.getValor()%></td>
                <td><%=c.getAno()%></td>

            </tr>
        </table>
        <br/>
        <hr/>



        <h2>Atualizar Veículo</h2><br/>

        <form method="post" name="form" action="atualizarCarro?placa=<%=c.getPlaca()%>">
            Fabricante: <br/>
            <input type="text"  name="fabricante" value="<%=c.getFabricante()%>"/><br/>
            Modelo:  <br/>
            <input type="text" name="modelo" value="<%=c.getModelo()%>"/><br/>
            Valor: <br/>
            <input type="" name="valor" value="<%=c.getValor()%>"/><br/>
            Placa: <br/>
            <input type="text" name="placa" value="<%=c.getPlaca()%>"/><br/>
            Ano: <br/>
            <input type="text" name="ano" value="<%=c.getAno()%>"/><br/>

            <br/>
            <input type="submit" value="ATUALIZAR"/>
        </form>

        <br/>
        <hr/>

        <a href="busca.jsp">Buscar outro veículo</a>
        <a href="index.html"> Voltar ao inicio </a>
        <hr/>
    </body>
</html>
