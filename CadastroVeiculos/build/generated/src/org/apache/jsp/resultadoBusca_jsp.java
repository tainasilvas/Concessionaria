package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.cadastroveiculos.modelo.Carro;
import br.cadastroveiculos.dao.CarroDAO;

public final class resultadoBusca_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Resultado da busca</title>\n");
      out.write("        <style>\n");
      out.write("            table, th, td{\n");
      out.write("                border: 0;\n");
      out.write("                text-align: center; \n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            .even {\n");
      out.write("  background-color:#edf5ff;\n");
      out.write("}\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #edf5ff;\n");
      out.write("}\n");
      out.write("tr:hover {\n");
      out.write("  background-color:#3d80df;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write("thead tr:hover {\n");
      out.write("  background-color: transparent;\n");
      out.write("  color: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".coluna{\n");
      out.write("    background-color: beige;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("                width: 300px;\n");
      out.write("                padding: 12px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                resize: vertical;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label {\n");
      out.write("                padding: 12px 12px 12px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=submit] {\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=submit]:hover {\n");
      out.write("                background-color: darkgray;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .row:after {\n");
      out.write("                content: \"\";\n");
      out.write("                display: table;\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("                input[type=submit] {\n");
      out.write("                    width: 400px;\n");
      out.write("                    margin-top: 0;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("                a:link, a:visited {\n");
      out.write("                    display: block;\n");
      out.write("                    border:1px solid #25692A;\n");
      out.write("                    border-radius:4px;\n");
      out.write("                    display:inline-block;\n");
      out.write("                    cursor:pointer;\n");
      out.write("                    font-family:Verdana;\n");
      out.write("                    font-weight:bold;\n");
      out.write("                    font-size:13px;\n");
      out.write("                    padding:6px 10px;\n");
      out.write("                    text-decoration:none;\n");
      out.write("\n");
      out.write("                    border-color:#46a7f5;\n");
      out.write("                    background:linear-gradient(to bottom, #86c6f8 5%, #46a7f5 100%);\n");
      out.write("                    box-shadow:inset 0px 1px 0px 0px #d7ecfd;\n");
      out.write("                    color:#fff;\n");
      out.write("                    text-shadow:0px 1px 0px #528009; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                a:hover, a:active {\n");
      out.write("                    background:linear-gradient(to bottom, #46a7f5 5%, #86c6f8 100%);\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

           String placa = request.getParameter("placa");
           CarroDAO cDAO = new CarroDAO();
           
           Carro c = (Carro) cDAO.getBusca(placa);
       
      out.write("\n");
      out.write("       <h2>Resultado da Busca</h2><br/><br/><hr/><br/>\n");
      out.write("       \n");
      out.write("       <table>\n");
      out.write("           <tr>\n");
      out.write("               <th class=\"coluna\"><b>Fabricante: </b></td>\n");
      out.write("               <th class=\"coluna\"><b>Modelo: </b></td>\n");
      out.write("               <th class=\"coluna\"><b>Placa: </b></td>\n");
      out.write("               <th class=\"coluna\"><b>Valor:</b></td>\n");
      out.write("               <th class=\"coluna\"><b>Ano:</b></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("               <td>");
      out.print(c.getFabricante());
      out.write("</td>\n");
      out.write("               <td>");
      out.print(c.getModelo()  );
      out.write("</td>\n");
      out.write("               <td>");
      out.print(c.getPlaca() );
      out.write("</td>\n");
      out.write("               <td>");
      out.print(c.getValor() );
      out.write("</td>\n");
      out.write("               <td>");
      out.print(c.getAno() );
      out.write("</td>\n");
      out.write("       \n");
      out.write("       </tr>\n");
      out.write("       </table>\n");
      out.write("      <br/>\n");
      out.write("      <hr/>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <div id=\"formulario\">\n");
      out.write("      <h2>Atualizar Veículo</h2><br/>\n");
      out.write("      \n");
      out.write("      <form method=\"post\" name=\"form\" action=\"atualizarCarro?placa=");
      out.print(c.getPlaca());
      out.write("\">\n");
      out.write("            Fabricante: <br/>\n");
      out.write("            <input type=\"text\"  name=\"fabricante\" value=\"");
      out.print(c.getFabricante());
      out.write("\" /><br/>\n");
      out.write("            Modelo:  <br/>\n");
      out.write("            <input type=\"text\" name=\"modelo\" value=\"");
      out.print(c.getModelo());
      out.write("\"/><br/>\n");
      out.write("            Valor: <br/>\n");
      out.write("            <input type=\"\" name=\"valor\" value=\"");
      out.print(c.getValor());
      out.write("\"/><br/>\n");
      out.write("            Placa: <br/>\n");
      out.write("            <input type=\"text\" name=\"placa\" value=\"");
      out.print(c.getPlaca());
      out.write("\"/><br/>\n");
      out.write("            Ano: <br/>\n");
      out.write("            <input type=\"number\" name=\"ano\" value=\"");
      out.print(c.getAno());
      out.write("\"/><br/>\n");
      out.write("           \n");
      out.write("            <br/>\n");
      out.write("            <input type=\"submit\" value=\"ATUALIZAR\"/>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <a href=\"busca.jsp\">Buscar outro veículo</a>\n");
      out.write("      <a href=\"index.html\"> Voltar ao inicio </a>\n");
      out.write("      <hr/>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
