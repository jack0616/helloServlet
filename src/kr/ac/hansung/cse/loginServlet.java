package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//read form Data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Process: access to Database, perform business logic
		
		// Build HTML code
		PrintWriter out = response.getWriter();
		
		//ctrl + space 자동완성
		
		String htmlResponse = "<html>";
		htmlResponse += "<h2> Your username is " + username + "<br>";
		htmlResponse += " Your password is " + password + "</h2>";
		htmlResponse += "</html>";
		
		
		out.println(htmlResponse);
	}

}
