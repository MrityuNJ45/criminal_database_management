package com.mrityunjay.usecases;

import java.util.List;
import java.util.Scanner;

import com.mrityunjay.bean.Criminal;
import com.mrityunjay.dao.CriminalDao;
import com.mrityunjay.dao.CriminalDaoImpl;
import com.mrityunjay.exceptions.CriminalException;

public class GetCriminalsByArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Area :- ");
		String area = sc.next();
		
		CriminalDao dao = new CriminalDaoImpl();
		
		try {
			List<Criminal> c = dao.getCriminalAreaWise(area);
			
			c.forEach(f -> {
			       
				System.out.println("Name :- " + f.getName());
				System.out.println("Age :- " + f.getAge());
				System.out.println("Gender :- " + f.getGender());
				System.out.println("Adress :- " + f.getAddress());
				System.out.println("Identity Mark :- " + f.getIdentityMark());
				System.out.println("Crime Area :- " + f.getCrimeArea());
				System.out.println("Crime Name :- " + f.getCrimeName());
				
				System.out.println("=============================");
			
			});
			
			
			
		} catch (CriminalException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
