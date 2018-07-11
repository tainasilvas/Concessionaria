<%-- 
    Document   : listarTodos
    Created on : 10/06/2018, 00:09:42
    Author     : Taina Santos
--%>


<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="br.cadastroveiculos.dao.CarroDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cadastroveiculos.modelo.Carro"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Todos os Carros</title>
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
#bt{
    background-color: white;
}

        </style>
    </head>
    <body>
        <h2>Lista de todos os carros</h2><br/><br/>
        <hr/>
        <%
            CarroDAO carroDAO = new CarroDAO();
            List<Carro> carros = carroDAO.listarTodos();
        %>
    <center>
        <table>
            <tr>
                <th class="coluna">Fabricante</th>
                <th class="coluna">Modelo</th>
                <th class="coluna">Valor</th>
                <th class="coluna">Placa</th>
                <th class="coluna">Ano</th>
                
                
            </tr>            
            <%
                for (Carro c : carros) {
                    out.print("<tr>");
                    out.print("<td>" + c.getFabricante() + "</td>");
                    out.print("<td>" + c.getModelo() + "</td>");
                    out.print("<td> R$ " + c.getValor() + "</td>");
                    out.print("<td>" + c.getPlaca() + "</td>");
                    out.print("<td>" + c.getAno()+ "</td>");
                    out.print("<td id='bt'>" + "<a href='excluirCarro.jsp?idCarro=" + c.getIdCarro() + "'>Excluir</a>" + "</td>");
                    out.print("</tr>");
                }
            %>
        </table>
    </center>
    <br/>
    <center>
        <a href="index.html">Voltar ao inicio</a>
    </center>
</body>
</html>