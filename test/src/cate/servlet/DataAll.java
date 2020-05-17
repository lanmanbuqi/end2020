package cate.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cate.pogo.User;
import cate.pogo.population;
import cate.service.DkService;
import cate.service.inpl.Dkserviceinpl;

/**
 * Servlet implementation class DataAll
 */
@WebServlet("/DataAll")
public class DataAll extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String year=req.getParameter("year");
		DkService ds=new Dkserviceinpl();
		population u=ds.DataAllService(year);
		if(u!=null) {
//			System.out.println(u);
			resp.getWriter().write(new Gson().toJson(u));
		}
	}
}
