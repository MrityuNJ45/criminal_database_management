package com.mrityunjay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mrityunjay.bean.Crime;

import com.mrityunjay.utility.DBUtil;

public class CrimeDaoImpl implements CrimeDao {

	@Override
	public String registerCrime(String date, String place, String description, String victims, String detailDescription,
			String suspect) {

		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into crime(date,place,description,victims,detailDescription,suspect) values (?,?,?,?,?,?)");
			
			ps.setString(1, date);
			ps.setString(2, place);
			ps.setString(3, description);
			ps.setString(4, victims);
			ps.setString(5, detailDescription);
			ps.setString(6, suspect);
			
			
			int x = ps.executeUpdate();
			
			if(x>0)
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
					"insert into crime(date,place,description,victims,detailDescription,suspect) values (?,?,?,?,?,?)");
			
			ps.setString(1, crime.getDate());
			ps.setString(2, crime.getPlace());
			ps.setString(3, crime.getDescription());
			ps.setString(4, crime.getVictims());
			ps.setString(5, crime.getDetailDescription());
			ps.setString(6, crime.getSuspect());
			
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "Crime Registered Successfully..";		

		} catch (SQLException e) {

			message = e.getMessage();
			
		}

		return message;
	}

}
