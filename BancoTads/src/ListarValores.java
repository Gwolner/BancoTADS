import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/valores")
public class ListarValores extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String url = "http://localhost:8080/BancoTads/form_deposito?conta=";

    public ListarValores() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().println("<h1>Bem vindo(a)</br> ao Banco TADS</h1> </br>");
		response.getOutputStream().println("<h3>Selecione uma conta para dep�sito:</h3> </br>");
		for(int i=0; i < Listar.contas.size();i++) {
			response.getOutputStream().println("<label> Conta: "+Listar.contas.get(i)+ " - R$ "+Listar.saldos.get(i)+"</label>");
			response.getOutputStream().println(String.format("<a href=\"http://localhost:8080/BancoTads/form_deposito?conta=%s&saldo=%f\"> Depositar </a> </br>", Listar.contas.get(i), Listar.saldos.get(i)));	
		}
		response.getOutputStream().println("<form action=\"home\" method=\"POST\">");
		response.getOutputStream().println("<br> <input type=\"submit\" value=\"Voltar\">");
		response.getOutputStream().println("</form>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}