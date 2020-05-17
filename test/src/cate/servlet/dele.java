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
 * Servlet implementation class dele
 */
@WebServlet("/dele")
public class dele extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		DkService ds=new Dkserviceinpl();
		int u=ds.deleService(name);
		if(u>-1) {
			resp.getWriter().write("true");
		}else {
			resp.getWriter().write("false");
		}
	}
}
