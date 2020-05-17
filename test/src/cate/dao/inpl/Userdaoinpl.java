package cate.dao.inpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cate.dao.Userdao;
import cate.pogo.User;
import cate.pogo.population;
import cate.servlet.getPopulation;


public class Userdaoinpl implements Userdao{

	@Override
	public User logindao(String name, String pwd) {
		// TODO Auto-generated method stub
		User u=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","root");
			String sql="select * from user where name=? and pwd=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pwd);
			rs=ps.executeQuery();
			while(rs.next()){
				u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPwd(rs.getString("pwd"));
				u.setLel(rs.getInt("lel"));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return u;
	}

	@Override
	public List<User> showUserAll() {
		// TODO Auto-generated method stub
		List<User> us=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","root");
				String sql="select * from user ";
				ps=conn.prepareStatement(sql);
				rs=ps.executeQuery();
				System.out.println(rs);
				us=new ArrayList<User>();
				while(rs.next()){
					User u=new User();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setPwd(rs.getString("pwd"));
					u.setLel(rs.getInt("lel"));
					us.add(u);
					}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		return us;
	}

	@Override
	public population showPopulation(String year, String province) {
		// TODO Auto-generated method stub
		population u=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","root");
				String sql="select * from population where year=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, year);
				rs=ps.executeQuery();
				while(rs.next()){
					u=new population();
					u.setYear(rs.getString("year"));
					u.setBeijing(rs.getString("beijing"));
					u.setTianjing(rs.getString("tianjing"));
					u.setHebei(rs.getString("hebei"));
					u.setShanxi1(rs.getString("shanxi1"));
					u.setNeimenggu(rs.getString("neimenggu"));
					u.setLiaolin(rs.getString("liaolin"));
					u.setJilin(rs.getString("jilin"));
					u.setHeilongjiang(rs.getString("heilongjiang"));
					u.setShanghai(rs.getString("shanghai"));
					u.setJiangsu(rs.getString("jiangsu"));
					u.setZhejiang(rs.getString("zhejiang"));
					u.setAnhui(rs.getString("anhui"));
					u.setFujian(rs.getString("fujian"));
					u.setJiangxi(rs.getString("jiangxi"));
					u.setShandong(rs.getString("shandong"));
					u.setHenan(rs.getString("henan"));
					u.setHubei(rs.getString("hubei"));
					u.setGuangdong(rs.getString("guangdong"));
					u.setHainan(rs.getString("hainan"));
					u.setGuangxi(rs.getString("guangxi"));
					u.setChongqign(rs.getString("chongqign"));
					u.setSichuan(rs.getString("sichuan"));
					u.setGuizhou(rs.getString("guizhou"));
					u.setYunnan(rs.getString("yunnan"));
					u.setXizang(rs.getString("xizang"));
					u.setGansu(rs.getString("gansu"));
					u.setSanxi2(rs.getString("sanxi2"));	
					u.setQinghai(rs.getString("qinghai"));
					u.setNingxia(rs.getString("ningxia"));
					u.setXinjiang(rs.getString("xinjiang"));
					u.setHunan(rs.getString("hunan"));
					

				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return u;
	}

	@Override
	public int setPopulation(String year, String province, String gai) {
		// TODO Auto-generated method stub
		int index=-1;
		population u=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","root");
			String sql="UPDATE population SET "+ province + "=? WHERE year = ?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, gai);
			ps.setString(2, year);
			index=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return index;
	}

	@Override
	public population DataAll(String year) {
		// TODO Auto-generated method stub
		population u=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","root");
				String sql="select * from population where year=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, year);
				rs=ps.executeQuery();
				while(rs.next()){
					u=new population();
					u.setBeijing(rs.getString("beijing"));
					u.setTianjing(rs.getString("tianjing"));
					u.setHebei(rs.getString("hebei"));
					u.setShanxi1(rs.getString("shanxi1"));
					u.setNeimenggu(rs.getString("neimenggu"));
					u.setLiaolin(rs.getString("liaolin"));
					u.setJilin(rs.getString("jilin"));
					u.setHeilongjiang(rs.getString("heilongjiang"));
					u.setShanghai(rs.getString("shanghai"));
					u.setJiangsu(rs.getString("jiangsu"));
					u.setZhejiang(rs.getString("zhejiang"));
					u.setAnhui(rs.getString("anhui"));
					u.setFujian(rs.getString("fujian"));
					u.setJiangxi(rs.getString("jiangxi"));
					u.setShandong(rs.getString("shandong"));
					u.setHenan(rs.getString("henan"));
					u.setHubei(rs.getString("hubei"));
					u.setGuangdong(rs.getString("guangdong"));
					u.setHainan(rs.getString("hainan"));
					u.setGuangxi(rs.getString("guangxi"));
					u.setChongqign(rs.getString("chongqign"));
					u.setSichuan(rs.getString("sichuan"));
					u.setGuizhou(rs.getString("guizhou"));
					u.setYunnan(rs.getString("yunnan"));
					u.setXizang(rs.getString("xizang"));
					u.setGansu(rs.getString("gansu"));
					u.setSanxi2(rs.getString("sanxi2"));	
					u.setQinghai(rs.getString("qinghai"));
					u.setNingxia(rs.getString("ningxia"));
					u.setXinjiang(rs.getString("xinjiang"));
					u.setHunan(rs.getString("hunan"));
					

				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return u;
	}

	@Override
	public User registerUser(String name, String pwd) {
		// TODO Auto-generated method stub
		User u=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","root");
			String sql="select * from user where name=? ";
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while(rs.next()){
				u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPwd(rs.getString("pwd"));
				u.setLel(rs.getInt("lel"));	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return u;
	}

	@Override
	public int regist(String name, String pwd) {
		// TODO Auto-generated method stub
		int index=-1;
		User a=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","root");
				String sql="INSERT INTO user(name,pwd,lel) VALUES (?,?,1)";
				ps=conn.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, pwd);
				index=ps.executeUpdate();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		return index;
	}

	@Override
	public int del(String name) {
		// TODO Auto-generated method stub
		int index=-1;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","root");
				String sql="DELETE FROM user WHERE name = ? ";
				ps=conn.prepareStatement(sql);
				ps.setString(1, name);
				index=ps.executeUpdate();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		return index;
	}
	
}