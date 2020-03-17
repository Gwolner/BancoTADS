import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ts3")
public class ThreadServlet3 extends HttpServlet {

	private int balance = 15;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.getOutputStream().println("<h1>Current balance: " + balance + "</h1>");
		response.getOutputStream().println("<form action=\"ts3\" method=\"POST\">");
		response.getOutputStream().println("<input type=\"submit\" value=\"-10\">");
		response.getOutputStream().println("</form>");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

// only one thread can access this block at a time!
		synchronized (this) {
//first check whether we have enough
			if (balance > 10) {

//let's pretend the request takes ten seconds to complete
				try {
					Thread.sleep(10 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

//make a withdrawal
				balance -= 10;
			}
		}

		response.sendRedirect("ts3");
	}
}