package com.outliners.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.outliners.admin.entity.BuildingMaster;

@Repository
public interface BuildingMasterRepository extends JpaRepository<BuildingMaster, Integer>{

	List<BuildingMaster> findByOdcIdIn(List<Integer> odcList);

	
}
