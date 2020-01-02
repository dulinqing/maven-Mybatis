package com.foxconn.model;

import java.util.Date;

public class Staff {
	
	public String userUuid;
	public String empNo;
	public String empName;
	public Date createDate;
	public int delFlag;
	public String getUserUuid() {
		return userUuid;
	}
	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}
	@Override
	public String toString() {
		return "Staff [userUuid=" + userUuid + ", empNo=" + empNo + ", empName=" + empName + ", createDate="
				+ createDate + ", delFlag=" + delFlag + "]";
	}

	
}
