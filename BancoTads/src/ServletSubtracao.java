import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/subtracao")
public class ServletSubtracao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletSubtracao() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double saldo = Double.parseDouble(request.getParameter("saldo").replace(",", "."));
		Double saque = Double.parseDouble(request.getParameter("saque").replace(",", "."));
		
		int index = Listar.saldos.indexOf(saldo);
		saldo -= saque;
		if(saldo >= 0){
			Listar.saldos.add(index, saldo);
		}

		response.sendRedirect("lista_saque");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
