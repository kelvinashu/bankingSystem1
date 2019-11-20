package za.co.bankingsystem.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			String username = req.getParameter("username");
			String password = req.getParameter("password");

			if (username .equals("a") && password.equals("a")) {
				req.setAttribute("message", "Login successful");
				req.getRequestDispatcher("pages/employee.jsp").forward(req, resp);
			} else {
				req.setAttribute("message", "Invalid login credentials");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		} catch (ServletException | IOException  ex) {
			ex.printStackTrace();
		}
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}
}
