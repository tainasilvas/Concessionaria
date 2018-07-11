<%-- 
    Document   : excluirCarro
    Created on : 10/06/2018, 00:50:21
    Author     : Taina Santos
--%>

<%@page import="br.cadastroveiculos.modelo.Carro"%>
<%@page import="br.cadastroveiculos.dao.CarroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Veículo</title>
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
            #bt{
                background-color: white;
            }
        </style>
    </head>
    <body>
        <%
            int idExcluido = Integer.parseInt(request.getParameter("idCarro"));
            CarroDAO cDAO = new CarroDAO();
            Carro c = cDAO.getCarro(idExcluido);
        %>
        <h2>Confirmar exclusão?</h2><br/><br/><hr/><br/>
        <table>
            <tr>

                <th class="coluna">Fabricante:</th>
                <th class="coluna">Modelo:</th>
                <th class="coluna">Placa</th>
            </tr>
            <tr>
                <td><%=c.getFabricante()%></td>
                <td><%=c.getModelo()%></td>
                <td><%=c.getPlaca()%></td>
                <td id='bt'> <a href="excluirCarro?idCarro=<%=idExcluido%>">Confirmar</a></td>
            </tr>
        </table>
        <br/>

        <a href="index.html">Voltar ao inicio</a>
        <hr/>
    </body>
</html>
