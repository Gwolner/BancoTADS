import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listar")
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ArrayList usuarios = new ArrayList();
    public static ArrayList contas = new ArrayList();
    public static ArrayList saldos = new ArrayList();

    public Listar() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("nomeusuario") != null && request.getParameter("numeroconta") != null) {
			String nomeusuario = request.getParameter("nomeusuario");
			int numeroconta= Integer.parseInt(request.getParameter("numeroconta"));
			usuarios.add(nomeusuario);
			contas.add(numeroconta);
			saldos.add(0.00);
			
		}
		
		response.getOutputStream().println("<h1>Bem vindo(a)</br> ao Banco TADS</h1> </br>");
		response.getOutputStream().println("<h3>Contas cadastradas:</h3> </br>");
		for(int i=0; i < usuarios.size();i++) {
			response.getOutputStream().println("<label>"+usuarios.get(i)+ " - "+contas.get(i)+"</label> </br>");
		}
		response.getOutputStream().println("<form action=\"home\" method=\"POST\">");
		response.getOutputStream().println("<br> <input type=\"submit\" value=\"Voltar\">");
		response.getOutputStream().println("</form>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public ArrayList getContasArrayList() {
		return this.contas;
	}

}
