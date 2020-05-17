package cate.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class User
 */
@WebServlet("/User")
public class UserAll extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.创建方法
		DkService ds=new Dkserviceinpl();
		//2.增加方法
		List<User> user=ds.GetUser();
//		System.out.println(user);
		resp.getWriter().write(new Gson().toJson(user));
	}
}
