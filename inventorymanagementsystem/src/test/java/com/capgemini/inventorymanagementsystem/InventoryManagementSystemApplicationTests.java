package com.capgemini.inventorymanagementsystem;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.inventorymanagementsystem.dao.DistributorDetailsRepository;
import com.capgemini.inventorymanagementsystem.dao.SupplierDetailsRepository;
import com.capgemini.inventorymanagementsystem.entities.DistributorDetails;
import com.capgemini.inventorymanagementsystem.entities.SupplierDetails;
import com.capgemini.inventorymanagementsystem.service.DistributorDetailsServiceImpl;
import com.capgemini.inventorymanagementsystem.service.SupplierDetailsServiceImpl;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class InventoryManagementSystemApplicationTests {
	@Mock
	private SupplierDetailsRepository sr;
	@Mock
	private DistributorDetailsRepository dr;
	@InjectMocks
	SupplierDetailsServiceImpl service;
	@InjectMocks
	DistributorDetailsServiceImpl service1;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testaddDistributorDetails()
	{
	    DistributorDetails dd = new DistributorDetails();
	    dd.setDistributorId(18);
	    dd.setDistributorName("ram");
	    dd.setAddress("hyd");
	    dd.setPhonenumber(1999946991);
	    dd.setEmailId("ram54@gamil.com");
	    service1.addDistributorDetails(dd);
	    Mockito.verify(dr,Mockito.times(1)).save(dd);
	 }
	
	@Test
	public void testviewDistributorDetails()
	{
	    List<DistributorDetails>distlist = service1.viewDistributorDetails();
	    distlist.add(new DistributorDetails(18,"ram","hyd",1999946999,"ram54@gmail.com"));
	    distlist.add(new DistributorDetails(12,"munna","chennai",1999199999,"munna4@gmail.com"));
	   
	    Mockito.when(dr.findAll()).thenReturn(distlist);
	   
	    List<DistributorDetails> returnedData = dr.findAll();
	    assertEquals(2,returnedData.size());

	}
	
	
	
	
	
	
	
	
	
	@Test
	public void testaddSupplierDetails()
	{
		SupplierDetails s = new SupplierDetails();
		s.setSupplierId(12);
		s.setSupplierName("bhoomika");
		s.setAddress("miryalguda");
		s.setPhonenumber(1999999991);
		s.setEmailId("bhoomika@gamil.com");
		service.addSupplierDetails(s);
		Mockito.verify(sr, Mockito.times(1)).save(s);
    }
	@Test
	public void testviewSupplierDetails()
	{
	     List<SupplierDetails>supplist = service.viewSupplierDetails();
	     supplist.add(new SupplierDetails(123,"sumanth","lbnagar",908907456,"deepeshmunna4@gmail.com"));
	     supplist.add(new SupplierDetails(12,"shreya","uppal",980765435,"sreya@gmail.com"));
	     
	     Mockito.when(sr.findAll()).thenReturn(supplist);
	     
	     List<SupplierDetails> returnedData = sr.findAll();
	     assertEquals(3,returnedData.size());
	
	}


}
