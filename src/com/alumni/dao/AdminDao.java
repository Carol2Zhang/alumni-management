package com.alumni.dao;

import com.alumni.entity.Admin;

public interface AdminDao {
	public void add(Admin admin);

	public void delete(int id);

	public void update(Admin admin);

	public Admin getByName(String aName);

}
