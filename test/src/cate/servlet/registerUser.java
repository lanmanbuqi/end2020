package cate.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cate.pogo.User;
import cate.service.DkService;
import cate.service.inpl.Dkserviceinpl;

/**
 * Servlet implementation class registerUser
 */
@WebServlet("/register")
public class registerUser extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		DkService ds=new Dkserviceinpl();
		User u=ds.registerService(name,pwd);
		if(u!=null) {
			resp.getWriter().write("false");
		}else {
			int a=ds.regist(name,pwd);
			resp.getWriter().write("true");
		}
			
	}
}
