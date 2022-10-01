package com.mrityunjay.dao;

import com.mrityunjay.bean.Crime;


public interface CrimeDao {

	public String registerCrime(String date,String place,String description,String victims,String detailDescription,String suspect);
	
	public String registerCrime2(Crime crime);
}
