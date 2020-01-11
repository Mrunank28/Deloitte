package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.bean.User;
import com.deloitte.service.LoginService;
import com.deloitte.service.LoginServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService lService;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called");
		lService = new LoginServiceImpl();
	}
	
	public void destroy() {
		System.out.println("destroy called");
		lService.closeConnection(); //called when servlet is removed from memory
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet called");
		String login = request.getParameter("login");
		String password = request.getParameter("pswd"); //null if not present
		//System.out.println(login +", "+ password);
		User user = new User(login,password,null);
		String type = lService.getUserType(user);
		System.out.println(user.getLogin() + " is of " +type +" type");
		String displayPage = "customer.jsp";
		if(type == null) {
			request.setAttribute("loginerror", "Authentication Failed");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else if(type.equals("admin")) {
			request.setAttribute("usertype", "Login in as Administrator");
			displayPage  = "admin.jsp";
		}
		else if(type.equals("employee")) {
			request.setAttribute("usertype", "Login in as Employee");
			displayPage = "employee.jsp";
		}
		else {
			//default constructor
			request.setAttribute("usertype", "Login in as Customer");
		}
		request.getRequestDispatcher(displayPage).forward(request,response);
//		response.setContentType("text.html");
//		PrintWriter out = response.getWriter();
//		out.println("<html><head>From servlet</title></head>");
//		out.println("<body>");
//		out.println("<h1>Welcome to Deloitte</h1>");
//		out.println("<p>You are logged in as "+ type +"</p>");
//		out.println("</body>");
//		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post called");
		doGet(request, response);
	}

}
  