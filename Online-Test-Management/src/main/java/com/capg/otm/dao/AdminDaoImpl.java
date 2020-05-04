package com.capg.otm.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.capg.otm.model.Admin;
import com.capg.otm.exception.ExceptionExample;

public abstract class AdminDaoImpl implements AdminDao{
	
	EntityManager myManager;
	
	//METHOD 1 - ADD ADMIN()
	
	@Override
	public Boolean addAdmin(Admin admin) throws Exception{
		
		Admin checkTest;
		
		myManager.persist(admin);
		
		checkTest = myManager.find(Admin.class, admin.getAdminId());
		
		if(checkTest == null)
			throw new Exception("Adding as Admin Failed");
		return true;
	}
	
	//METHOD 2 - DELETE ADMIN()
	
	@Override
	public Boolean deleteAdmin(Long adminId) throws Exception{
		Admin admin = myManager.find(Admin.class, adminId);
		if(admin == null) {
			throw new Exception("Admin with the adminID + " + adminId + " not Found");
		}
		else {
			System.out.println(admin.getAdminId() +" "+admin.getAdminName() + " deleted");
			myManager.remove(admin);
		}
		return true;
	}
}
