import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cadastrar")
public class Cadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Cadastrar() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().println("<h1>Bem vindo(a)</br> ao Banco TADS</h1> </br>");
		response.getOutputStream().println("<h3>Cadastre sua conta:</h3> </br>");
		response.getOutputStream().println("<form action=\"listar\" method=\"POST\">");
		response.getOutputStream().println("<label>Nome:</label> <br>");
		response.getOutputStream().println("<input type=\"text\" id=\"nomeusuario\" name=\"nomeusuario\"> <br>");
		response.getOutputStream().println("<label>Nº conta:</label> <br>");
		response.getOutputStream().println("<input type=\"number\" id=\"numeroconta\" name=\"numeroconta\"> <br>");
		response.getOutputStream().println("<input type=\"submit\" value=\"Cadastrar\">");
		response.getOutputStream().println("</form>");
		response.getOutputStream().println("<form action=\"home\" method=\"POST\">");
		response.getOutputStream().println("<br> <input type=\"submit\" value=\"Voltar\">");
		response.getOutputStream().println("</form>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
