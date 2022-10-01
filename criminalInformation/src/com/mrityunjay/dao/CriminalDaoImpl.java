package com.mrityunjay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mrityunjay.bean.Criminal;
import com.mrityunjay.utility.DBUtil;

public class CriminalDaoImpl implements CriminalDao {

	@Override
	public String registerCriminal(String name, int age, String gender, String address, String identityMark,
			String crimeArea, String crimeName) {

		String message = "Not inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into criminal(name,age,gender,address,identityMark,crimeArea,crimeName) values(?,?,?,?,?,?,?)");

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

}
