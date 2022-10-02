package com.mrityunjay.usecases;


import java.util.List;
import java.util.Scanner;

import com.mrityunjay.bean.Criminal;
import com.mrityunjay.dao.CriminalDao;
import com.mrityunjay.dao.CriminalDaoImpl;
import com.mrityunjay.exceptions.CriminalException;

public class GetCriminalsByName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :- ");
		String name = sc.next();
		
		CriminalDao dao = new CriminalDaoImpl();
		
		try {
			
			
			List<Criminal> c = dao.getCriminalByName(name);
			
			System.out.println(c);
			
		} catch (CriminalException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	
}
