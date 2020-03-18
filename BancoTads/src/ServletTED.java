import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ted")
public class ServletTED extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletTED() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().println("<h1>Bem vindo(a)</br> ao Banco TADS</h1> </br>");
		response.getOutputStream().println("<h3>Serviço de transferência indisponível no momento!</h3> </br>");
		response.getOutputStream().println("<h5>Tente novamente em alguns minutos.</h5> </br>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
