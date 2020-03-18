import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Home() {
        super();
        Listar.usuarios.add("Batman"); Listar.contas.add(555999); Listar.saldos.add(9999.99); 
        Listar.usuarios.add("Flash"); Listar.contas.add(878787); Listar.saldos.add(87.12); 
        Listar.usuarios.add("Lois Lane"); Listar.contas.add(547123); Listar.saldos.add(748.25); 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.getOutputStream().println("<h1>Bem vindo(a)</br> ao Banco TADS</h1> </br>");
		response.getOutputStream().println("<h3>Escolha uma opção abaixo:</h3> </br>");
		response.getOutputStream().println("<a href=\"listar\">1 - Listar contas</a> </br>");
		response.getOutputStream().println("<a href=\"cadastrar\">2 - Cadastrar Conta</a> </br>");
		response.getOutputStream().println("<a href=\"lista_deposito\">3 - Depósito</a> </br>");
		response.getOutputStream().println("<a href=\"lista_saque\">4 - Saque</a> </br>");
		response.getOutputStream().println("<a href=\"ted\">5 - Transferência</a>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
