package com.foxconn.dao;

import java.util.List;

import com.foxconn.model.Staff;

public interface IUserDao {
	
	public List<Staff> findAllUser();
}
