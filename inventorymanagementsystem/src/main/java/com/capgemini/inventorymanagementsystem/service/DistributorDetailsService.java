package com.capgemini.inventorymanagementsystem.service;

import java.util.List;

import com.capgemini.inventorymanagementsystem.entities.DistributorDetails;

public interface DistributorDetailsService {

	public DistributorDetails addDistributorDetails(DistributorDetails distributordetails);
	
	public DistributorDetails viewDistributorDetailsById(int distributorId);

	public List<DistributorDetails> viewDistributorDetails();
}
