import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/form_saque")
public class FormSaque extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FormSaque() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double saldo = Double.parseDouble(request.getParameter("saldo").replace(",", "."));
//		int conta = Integer.parseInt(request.getParameter("conta"));
//		int posicao = Listar.saldos.indexOf(saldo);
		
		
		response.getOutputStream().println("<h1>Bem vindo(a)</br> ao Banco TADS</h1> </br>");
		response.getOutputStream().println("<h3>Informe um valor que deseja sacar:</h3> </br>");
		response.getOutputStream().println("<form action=\"subtracao\" method=\"POST\">");
		response.getOutputStream().println("<input type=\"number\" id=\"saque\" name=\"saque\"> </br>");
		response.getOutputStream().println("<input type=\"hidden\" id=\"saldo\" name=\"saldo\" value="+saldo+"> </br>");
		response.getOutputStream().println("<br> <input type=\"submit\" value=\"Sacar\">");
		response.getOutputStream().println("</form>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
