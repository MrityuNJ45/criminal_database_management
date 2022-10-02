package com.mrityunjay.dao;

import com.mrityunjay.exceptions.CrimeException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mrityunjay.bean.Crime;
import com.mrityunjay.bean.Criminal;
import com.mrityunjay.exceptions.CrimeException;
import com.mrityunjay.exceptions.CriminalException;
import com.mrityunjay.utility.DBUtil;
import com.mrityunjay.exceptions.*;
import com.mrityunjay.exceptions.*;



public class CrimeDaoImpl implements CrimeDao {

	@Override
	public String registerCrime(String date, String place, String description, String victims, String detailDescription,
			String suspect, String solved) {

		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into crime(date,place,description,victims,detailDescription,suspect,solved) values (?,?,?,?,?,?,?)");

			ps.setString(1, date);
			ps.setString(2, place);
			ps.setString(3, description);
			ps.setString(4, victims);
			ps.setString(5, detailDescription);
			ps.setString(6, suspect);
            ps.setString(7, solved);
			int x = ps.executeUpdate();

			if (x > 0)
				message = "Crime Registered Successfully..";

		} catch (SQLException e) {

			message = e.getMessage();

		}

		return message;
	}

	@Override
	public String registerCrime2(Crime crime) {

		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into crime(date,place,description,victims,detailDescription,suspect,solved) values (?,?,?,?,?,?,?)");

			ps.setString(1, crime.getDate());
			ps.setString(2, crime.getPlace());
			ps.setString(3, crime.getDescription());
			ps.setString(4, crime.getVictims());
			ps.setString(5, crime.getDetailDescription());
			ps.setString(6, crime.getSuspect());
            ps.setString(7, crime.getSolved());
			int x = ps.executeUpdate();

			if (x > 0)
				message = "Crime Registered Successfully..";

		} catch (SQLException e) {

			message = e.getMessage();

		}

		return message;
	}

	@Override
	public List<Crime> getCrimeAreaWise(String area) throws CrimeException   {

		List<Crime> crimes = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from crime where place = (?)");

			ps.setString(1, area);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				String d = rs.getString("date");
                String pl = rs.getString("place");
				String des = rs.getString("description");
				String v = rs.getString("victims");
				
                String dd = rs.getString("detailDescription");
                String s = rs.getString("suspect");
                String sol = rs.getString("solved");
                
                Crime c = new Crime(d,pl,des,v,dd,s,sol);
                crimes.add(c);
                
			}

		} catch(SQLException e) {
			throw new CrimeException(e.getMessage());
		}
		
		if(crimes.size() == 0) {
			throw new CrimeException("No Crimes Found..");
		}
			

		return crimes;

	}

	@Override
	public void updateCrimeCaseStatus(String u,String place, String desc) throws CrimeException {
		
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update crime set solved = 'yes' where description = ?");
//			ps.setString(1, u);
//			ps.setString(2,place);
			ps.setString(1, desc);

			ps.executeQuery();
			
			
			
			
		}catch(SQLException e) {
			throw new CrimeException("No Crimes found..");
		}
		
		
	}

	

}
