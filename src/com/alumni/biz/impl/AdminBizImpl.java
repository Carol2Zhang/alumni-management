package com.alumni.biz.impl;

import com.alumni.biz.AdminBiz;
import com.alumni.dao.AdminDao;
import com.alumni.entity.Admin;

public class AdminBizImpl implements AdminBiz {
	AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public Admin login(String aName, String aPwd) {
		// TODO Auto-generated method stub
		Admin a=adminDao.getByName(aName);
		if(a!=null){
			if(aPwd.equals(a.getAdminPassword())){
				return a;
			}
		}
		return null;

	}

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.add(admin);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		adminDao.delete(id);
	}

}
