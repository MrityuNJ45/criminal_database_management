package com.mrityunjay.usecases;
import java.util.List;
import java.util.Scanner;

import com.mrityunjay.bean.Crime;
import com.mrityunjay.dao.*;
import com.mrityunjay.exceptions.CrimeException;

public class GetCrimesAreaWise {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Area :- ");
		String area = sc.next();
		
		
		CrimeDao dao = new CrimeDaoImpl();
		
		
		try {
			List<Crime> crimes = dao.getCrimeAreaWise(area);
			
			crimes.forEach( c -> {
			
				System.out.println("Date :- " + c.getDate());
				System.out.println("Place :- " + c.getPlace());
				System.out.println("Description :- " + c.getDescription());
				System.out.println("Victims :- " + c.getVictims());
				System.out.println("Detailed Description :- " + c.getDetailDescription());
				System.out.println("Suspect :- " + c.getSuspect());
				
				System.out.println("============================");
				
				
			});
			
			
			
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
