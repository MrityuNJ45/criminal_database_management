package com.mrityunjay.usecases;

import java.util.Scanner;

import com.mrityunjay.bean.Crime;
import com.mrityunjay.dao.CrimeDao;
import com.mrityunjay.dao.CrimeDaoImpl;

public class RegisterCrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date :- ");
		String date = sc.next();
		System.out.println("Enter Place :- ");
		String place = sc.next();
		System.out.println("Enter Description :- ");
		String des = sc.next();
		System.out.println("Enter Victims");

		String victims = sc.next();

		System.out.println("Enter Detail Description :- ");

		String dd = sc.next();
		System.out.println("Enter Suspect :- ");
		String sus = sc.next();
		System.out.println("Enter Solved or not :- ");
		String sol = sc.next();

		CrimeDao dao = new CrimeDaoImpl();

		Crime cr = new Crime(date, place, des, victims, dd, sus, sol);

		String m = dao.registerCrime2(cr);

		System.out.println(m);
	}

}
