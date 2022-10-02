package com.mrityunjay.usecases;

import java.util.Scanner;

import com.mrityunjay.bean.Criminal;
import com.mrityunjay.dao.*;

public class RegisterCriminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :- ");
		String name = sc.next();
		System.out.println("Enter age :- ");
		int age = sc.nextInt();
		System.out.println("Enter Gender :- ");
		String gender = sc.next();
		System.out.println("Enter Address :- ");
		String address = sc.next();
		System.out.println("Enter Identity Mark :- ");
		String im = sc.next();
		System.out.println("Enter Crime Area :- ");
		String ca = sc.next();
		System.out.println("Enter Crime Name :- ");
		String cn = sc.next();
		
		
		CriminalDao dao = new CriminalDaoImpl();
		
		Criminal cr = new Criminal(name,age,gender,address,im,ca,cn);
		
		String m = dao.registerCriminal2(cr);
		
		System.out.println(m);
		
	}
}
