package com.mrityunjay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mrityunjay.bean.Crime;
import com.mrityunjay.bean.Criminal;
import com.mrityunjay.exceptions.CrimeException;
import com.mrityunjay.exceptions.CriminalException;
import com.mrityunjay.utility.DBUtil;

public class CriminalDaoImpl implements CriminalDao {

	@Override
	public String registerCriminal(String name, int age, String gender, String address, String identityMark,
			String crimeArea, String crimeName) {

		String message = "Not inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into criminal(cname,age,gender,address,identitymark,crea,crimename) values(?,?,?,?,?,?,?)");

			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, address);
			ps.setString(4, identityMark);
			ps.setString(5, crimeArea);
			ps.setString(6, crimeName);

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Criminal Registered Sucessfully !";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;

	}

	@Override
	public String registerCriminal2(Criminal criminal) {

		String message = "Not Inserted.. ";
		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into criminal(cname,age,gender,address,identitymark,crea,crimename) values(?,?,?,?,?,?,?)");

			ps.setString(1, criminal.getName());
			ps.setInt(2, criminal.getAge());
			ps.setString(3, criminal.getGender());
			ps.setString(4, criminal.getAddress());
			ps.setString(5, criminal.getIdentityMark());
			ps.setString(6, criminal.getCrimeArea());
			ps.setString(7, criminal.getCrimeName());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Criminal Registered Sucessfully !";

		} catch (

		SQLException e) {
			message = e.getMessage();
		}

		return message;

	}

	@Override
	public List<Criminal> getCriminalByName(String name) throws CriminalException {
		
		List<Criminal>  criminals = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()){
			
		 PreparedStatement ps = conn.prepareStatement("select * from criminal where cname = (?)");
		 
		 ps.setString(1, name);
		 
		 ResultSet rs = ps.executeQuery();
		 
		 while(rs.next()) {
			 
			 String n = rs.getString("cname");
			 int a = rs.getInt("age");
			 String g = rs.getString("gender");
			 String ad = rs.getString("address");
			 String i = rs.getString("identitymark");
			 String ca = rs.getString("crea");
			 String cn = rs.getString("crimename");
			 
			 Criminal criminal = new Criminal(n,a,g,ad,i,ca,cn);
			 
			 criminals.add(criminal);
			 
		 }
		 
		 
		 
		 
			
		}catch(SQLException e) {
			throw new CriminalException(e.getMessage());
		}
		
		if(criminals.size() == 0) {
			throw new CriminalException("No Criminal Found...");
		}
		
		return criminals;
		
	}

	@Override
	public List<Criminal> getAllCriminals() throws CriminalException {
List<Criminal>  criminals = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()){
			
		 PreparedStatement ps = conn.prepareStatement("select * from criminal");
		 
		
		 
		 ResultSet rs = ps.executeQuery();
		 
		 while(rs.next()) {
			 
			 String n = rs.getString("cname");
			 int a = rs.getInt("age");
			 String g = rs.getString("gender");
			 String ad = rs.getString("address");
			 String i = rs.getString("identitymark");
			 String ca = rs.getString("crea");
			 String cn = rs.getString("crimename");
			 
			 Criminal criminal = new Criminal(n,a,g,ad,i,ca,cn);
			 
			 criminals.add(criminal);
			 
		 }
		 
		 
		 
		 
			
		}catch(SQLException e) {
			throw new CriminalException(e.getMessage());
		}
		
		if(criminals.size() == 0) {
			throw new CriminalException("No Criminal Found...");
		}
		
		return criminals;
		
	}

	@Override
	public List<Criminal> getCriminalAreaWise(String area) throws CriminalException {
		
		List<Criminal> criminals = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from criminal where crea = (?)");

			ps.setString(1, area);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				String d = rs.getString("cname");
                int a = rs.getInt("age");
				String g = rs.getString("gender");
				String ad = rs.getString("address");
				
                String i = rs.getString("identitymark");
                String ca = rs.getString("crea");
                String cn = rs.getString("crimename");
                
                Criminal c = new Criminal(d,a,g,ad,i,ca,cn);
                criminals.add(c);
                
			}

		} catch(SQLException e) {
			throw new CriminalException(e.getMessage());
		}
		
		if(criminals.size() == 0) {
			throw new CriminalException("No Criminal Found..");
		}
			

		return criminals;
		
		
	}

}
