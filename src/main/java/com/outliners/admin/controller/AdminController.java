package com.outliners.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.outliners.admin.model.ODCModel;
import com.outliners.admin.service.AdminService;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {


	@Autowired
	AdminService adminService;

	@GetMapping("/getAllSeats")
	public  List<ODCModel>  getAllSeats() throws Exception {
		return adminService.getAllSeats();
	}

	
	//batch service that runs on monday
	@GetMapping("/updateCurrentWeek")
	public void  updateCurrentWeek() throws Exception {
		 adminService.updateCurrentWeek();
	}
	@PostMapping("/blockODC")
	public void  blockODC(List<Integer> odcList) throws Exception {
		 adminService.blockODC(odcList);
	}
	
	@PostMapping("/unblockODC")
	public void  unblockODC(List<Integer> odcList) throws Exception {
		 adminService.unblockODC(odcList);
	}
	
	
	
}
