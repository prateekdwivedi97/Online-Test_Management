package com.capg.otm.model;

public class Admin {

	private Long adminId;
	private String adminName;
	private String adminPassword;


	public Admin(String adminName, String adminPassword, long adminId) {
		
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}
	
	
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long userId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}


