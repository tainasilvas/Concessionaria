<%-- 
    Document   : Atualizar
    Created on : 11/06/2018, 20:54:13
    Author     : Taina Santos
--%>

<%@page import="br.cadastroveiculos.dao.CarroDAO"%>
<%@page import="br.cadastroveiculos.modelo.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String placa = request.getParameter("placa");
            Carro c = new Carro();
            CarroDAO cDAO = new CarroDAO();
            Carro c = (Carro) cDAO.atualizarCarro(c);
            
            %>
        <h2>Atualizar Veículo</h2><br/>
      <form method="post" name="form" action="atualizarCarro">
            Fabricante: <input type="text"  name="fabricante" value="<%=c.getFabricante()%>" /><br/>
            Modelo <input type="text" name="modelo" value="<%=c.getModelo()%>"/><br/>
            Valor: <input type="" name="valor" value="<%=c.getValor()%>"/><br/>
            Placa: <input type="text" name="placa" value="<%=c.getPlaca()%>"/><br/>
            Ano: <input type="number" name="ano" value="<%=c.getAno()%>"/><br/>
           
            <br/>
            <input type="submit" value="ATUALIZAR"/>
        </form>
    </body>
</html>
