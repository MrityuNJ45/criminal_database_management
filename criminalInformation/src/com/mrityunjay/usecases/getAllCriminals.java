package com.mrityunjay.usecases;

import java.util.List;

import com.mrityunjay.bean.Criminal;
import com.mrityunjay.dao.*;
import com.mrityunjay.dao.CriminalDaoImpl;
import com.mrityunjay.exceptions.CriminalException;

public class getAllCriminals {

	public static void main(String[] args) {
		
		CriminalDao dao = new CriminalDaoImpl();
		
		try {
			List<Criminal> criminals = dao.getAllCriminals();
			
			criminals.forEach(c -> {
			   System.out.println("Name :- " + c.getName());
			   System.out.println("Age :- "+c.getAge());
			   System.out.println("Crime Area :- " + c.getCrimeArea());
			   System.out.println("Crime Name :-" + c.getCrimeName());
			   System.out.println("Gender :- " + c.getGender());
			   System.out.println("Identity Mark :- " + c.getIdentityMark());
			   System.out.println("===================================");
			});
			
			
		} catch (CriminalException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
