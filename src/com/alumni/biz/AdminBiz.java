package com.alumni.biz;

import com.alumni.entity.Admin;

public interface AdminBiz {
	public Admin login(String aName, String aPwd);

	public void addAdmin(Admin admin);

	public void delete(int id);
}
