package cate.service.inpl;

import java.util.List;

import cate.dao.Userdao;
import cate.dao.inpl.Userdaoinpl;
import cate.pogo.User;
import cate.pogo.population;
import cate.service.DkService;
import cate.servlet.getPopulation;

public class Dkserviceinpl implements DkService{
	Userdao ud=new Userdaoinpl();
	@Override
	public User LoginService(String name, String pwd) {
		// TODO Auto-generated method stub
		return ud.logindao(name,pwd);
	}
	@Override
	public List<User> GetUser() {
		// TODO Auto-generated method stub
		return ud.showUserAll();
	}
	@Override
	public population DataService(String year, String province) {
		// TODO Auto-generated method stub
		return ud.showPopulation(year,province);
	}
	@Override
	public int SetService(String year, String province, String gai) {
		// TODO Auto-generated method stub
		return ud.setPopulation(year,province,gai);
	}
	@Override
	public population DataAllService(String year) {
		// TODO Auto-generated method stub
		return  ud.DataAll(year);
	}
	@Override
	public User registerService(String name, String pwd) {
		// TODO Auto-generated method stub
		return ud.registerUser(name,pwd);
	}
	@Override
	public int regist(String name, String pwd) {
		// TODO Auto-generated method stub
		return ud.regist(name,pwd);
	}
	@Override
	public int deleService(String name) {
		// TODO Auto-generated method stub
		return ud.del(name);
	}
	
	
	
}
