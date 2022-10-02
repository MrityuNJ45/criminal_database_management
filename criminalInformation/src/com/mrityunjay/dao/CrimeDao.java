package com.mrityunjay.dao;

import java.util.List;

import com.mrityunjay.bean.Crime;

import com.mrityunjay.exceptions.CrimeException;

public interface CrimeDao {

	public String registerCrime(String date,String place,String description,String victims,String detailDescription,String suspect,String solved);
	
	public String registerCrime2(Crime crime);
	
	public List<Crime> getCrimeAreaWise(String area) throws CrimeException;
	
	public void updateCrimeCaseStatus(String u,String place, String desc) throws CrimeException;
	
	
	
}
