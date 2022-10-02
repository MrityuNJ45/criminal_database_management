package com.mrityunjay.utility;

import java.sql.Connection;

import com.mrityunjay.bean.Criminal;
import com.mrityunjay.dao.CriminalDao;
import com.mrityunjay.dao.CriminalDaoImpl;

public class Demo {

	public static void main(String[] args) {
		
		Criminal c = new Criminal();
		c.setName("Mukesh");
		c.setAge(20);
		c.setAddress("Delhi");
		c.setCrimeArea("UP");
		c.setGender("Male");
		c.setCrimeName("Robbery");
		c.setIdentityMark("blackSpot");
		
		CriminalDao cd = new CriminalDaoImpl();
		String x = cd.registerCriminal2(c);
		
        System.out.println(x);		
		
	}
	
	
}
