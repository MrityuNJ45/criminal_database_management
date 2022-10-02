package com.mrityunjay.usecases;
import com.mrityunjay.dao.*;
import com.mrityunjay.exceptions.CrimeException;

import java.util.Scanner;

public class UpdateCrimeCaseStatus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Place :- ");
		String place = sc.next();
		System.out.println("Enter Crime :- ");
		String crime = sc.next();
		System.out.println("Enter Solved or not :- ");
		String choice = sc.next();
		
		CrimeDao dao = new CrimeDaoImpl();
		
		try {
			dao.updateCrimeCaseStatus(choice, place, crime);
			
			System.out.println("Case status updated");
			
		} catch (CrimeException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
}
