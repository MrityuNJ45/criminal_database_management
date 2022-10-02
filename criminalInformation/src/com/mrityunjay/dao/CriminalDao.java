package com.mrityunjay.dao;

import java.util.List;

import com.mrityunjay.bean.Criminal;
import com.mrityunjay.exceptions.CriminalException;

public interface CriminalDao {
	
	public String registerCriminal(String name, int age, String gender, String address, String identityMark, String crimeArea,
			String crimeName);
	
	public String registerCriminal2(Criminal criminal);
	
	public List<Criminal> getCriminalByName(String name) throws CriminalException;

	public List<Criminal> getAllCriminals() throws CriminalException;
	
	public List<Criminal> getCriminalAreaWise(String area) throws CriminalException;
}
