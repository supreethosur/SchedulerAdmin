package com.outliners.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.outliners.admin.entity.BuildingMaster;
import com.outliners.admin.model.ODCModel;
import com.outliners.admin.repository.BuildingMasterRepository;

@Service
public class AdminService {
	
	@Autowired
	BuildingMasterRepository buildingMasterRepo;

	public List<ODCModel> getAllSeats() {
		List<ODCModel> odcModelList=new ArrayList<>();
		List<BuildingMaster> odcList = buildingMasterRepo.findAll();
		if(odcList!=null && !odcList.isEmpty()) {
			for(BuildingMaster odc:odcList) {
				ODCModel model =new ODCModel();
				
				model.setOdcId(odc.getOdcId());
				model.setFloorId(odc.getFloorId());
				model.setBuildingName(odc.getBuildingName());
				model.setBuildingId(odc.getBuildingId());
				model.setActive(odc.isComingWeekActive());
				
				odcModelList.add(model);
			}
		}
		return odcModelList;
	}

	
	public void updateCurrentWeek() {
		List<BuildingMaster> odcList = buildingMasterRepo.findAll();
		if(odcList!=null && !odcList.isEmpty()) {
			for(BuildingMaster odc:odcList) {
				odc.setActive(odc.isComingWeekActive());
			}
		}
		 buildingMasterRepo.saveAll(odcList);
	}
 
	public void blockODC(List<Integer> odcList) {
		List<BuildingMaster> odcList1 = buildingMasterRepo.findByOdcIdIn(odcList);
		if(odcList1!=null && !odcList1.isEmpty()) {
			for(BuildingMaster odc:odcList1) {
				odc.setComingWeekActive(false);
			}
		}
		buildingMasterRepo.saveAll(odcList1);
	}


	


	public void unblockODC(List<Integer> odcList) {
		List<BuildingMaster> odcList1 = buildingMasterRepo.findByOdcIdIn(odcList);
		if(odcList1!=null && !odcList1.isEmpty()) {
			for(BuildingMaster odc:odcList1) {
				odc.setComingWeekActive(true);
			}
		}
		buildingMasterRepo.saveAll(odcList1);
	}
}
