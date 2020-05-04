package com.capg.otm.dao;

import java.util.List;

import com.capg.otm.model.Admin;

public interface AdminDao
{
	public Boolean addAdmin(Admin admin) throws Exception;
	
	public Boolean deleteAdmin(Long adminId) throws Exception;
}
