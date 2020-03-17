import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/soma")
public class ServletSoma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletSoma() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double saldo = Double.parseDouble(request.getParameter("saldo").replace(",", "."));
		Double deposito = Double.parseDouble(request.getParameter("deposito").replace(",", "."));
		
		int index = Listar.saldos.indexOf(saldo);
		saldo += deposito;
		Listar.saldos.add(index, saldo);
		
		response.getOutputStream().println("<h1>Essa porra deu:"+Listar.saldos.get(index)+"</h1>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
