package com.mrityunjay.dao;

import com.mrityunjay.bean.Criminal;

public interface CriminalDao {
	
	public String registerCriminal(String name, int age, String gender, String address, String identityMark, String crimeArea,
			String crimeName);
	
	public String registerCriminal2(Criminal criminal);

}
