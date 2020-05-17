package cate.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cate.pogo.User;
import cate.service.DkService;
import cate.service.inpl.Dkserviceinpl;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		
		
		DkService ds=new Dkserviceinpl();
		User u=ds.LoginService(name,pwd);
		if(u!=null) {
//			System.out.println(u);
			resp.getWriter().write(new Gson().toJson(u));
		}
	}
}

