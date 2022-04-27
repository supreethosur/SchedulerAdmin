package com.outliners.admin.model;

public class ODCModel {

	private String odcId;
	private Integer buildingId;
	private String buildingName;
	private String floorId;
	private boolean isActive;
	
	public String getOdcId() {
		return odcId;
	}
	public void setOdcId(String odcId) {
		this.odcId = odcId;
	}
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
