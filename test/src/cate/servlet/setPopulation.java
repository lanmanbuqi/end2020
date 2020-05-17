package cate.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cate.pogo.population;
import cate.service.DkService;
import cate.service.inpl.Dkserviceinpl;

/**
 * Servlet implementation class setPopulation
 */
@WebServlet("/setPopulation")
public class setPopulation extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String year=req.getParameter("year");
		String province=req.getParameter("province");
		String gai=req.getParameter("gai");
		DkService ds=new Dkserviceinpl();
		int u=ds.SetService(year,province,gai);
		if(u>-1) {
			resp.getWriter().write("true");
		}else
			resp.getWriter().write("false");
	}
}
