package com.outliners.admin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BuildingMaster {

	@Id
	private String odcId;
	private Integer buildingId;
	private String buildingName;
	private String floorId;
	private Integer noOfSeats;
	private boolean isActive;
	private boolean isComingWeekActive;
	
	
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getFloorId() {
		return floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	public String getOdcId() {
		return odcId;
	}
	public void setOdcId(String odcId) {
		this.odcId = odcId;
	}
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isComingWeekActive() {
		return isComingWeekActive;
	}
	public void setComingWeekActive(boolean isComingWeekActive) {
		this.isComingWeekActive = isComingWeekActive;
	}
	

	
}
