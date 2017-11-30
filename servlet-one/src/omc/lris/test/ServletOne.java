package omc.lris.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 
* @author Lris
* <p>Title: ServletOne<£¯p>
* <p>Description: <£¯p>
* @date 2017Äê11ÔÂ29ÈÕ
 */
public class ServletOne extends HttpServlet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServletOne() {
		System.out.println("i am class ServletOne!");
		//String lris = super.getServletConfig().getInitParameter("userName");
		//String email = super.getServletConfig().getInitParameter("email");
		//System.out.println("getInitParamter:");
		//System.out.println("lris:"+lris+";email:"+email);
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		
		PrintWriter out = resp.getWriter();
		
		out.println("---ServletOne--doPost");
		System.out.println(req.getContextPath());
		System.out.println(req.getServletContext().getContext(getServletInfo()));
		req.getServletContext().getRequestDispatcher("/WEB-INF/errorNull.jsp").forward(req, resp);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("---ServletOne --destroy");
		super.destroy();
	}
}

