package com.bloodbank.dto;

import java.sql.Date;
import java.sql.Time;

public class CampusRegistrationDTO {

	private String orgnType;
	private String orgnName;
	private String organiserName;
	private String organiserNum;
	private String orgId;
	private String campName;
	private String campAdd;
	private String state;
	private String district;
	private String city;
	private String bbank;
	private Date campDate;
	private String starttime;
	private String endtime;
	private int estPart;
	private String remark;
	
	public String getOrgnType() {
		return orgnType;
	}
	public void setOrgnType(String orgnType) {
		this.orgnType = orgnType;
	}
	public String getOrgnName() {
		return orgnName;
	}
	public void setOrgnName(String orgnName) {
		this.orgnName = orgnName;
	}
	public String getOrganiserName() {
		return organiserName;
	}
	public void setOrganiserName(String organiserName) {
		this.organiserName = organiserName;
	}
	public String getOrganiserNum() {
		return organiserNum;
	}
	public void setOrganiserNum(String organiserNum) {
		this.organiserNum = organiserNum;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getCampName() {
		return campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}
	public String getCampAdd() {
		return campAdd;
	}
	public void setCampAdd(String campAdd) {
		this.campAdd = campAdd;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBbank() {
		return bbank;
	}
	public void setBbank(String bbank) {
		this.bbank = bbank;
	}
	public Date getCampDate() {
		return campDate;
	}
	public void setCampDate(Date campDate) {
		this.campDate = campDate;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public int getEstPart() {
		return estPart;
	}
	public void setEstPart(int estPart) {
		this.estPart = estPart;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "CampusRegistrationDTO [orgnType=" + orgnType + ", orgnName=" + orgnName + ", organiserName="
				+ organiserName + ", organiserNum=" + organiserNum + ", orgId=" + orgId + ", campName=" + campName
				+ ", campAdd=" + campAdd + ", state=" + state + ", district=" + district + ", city=" + city + ", bbank="
				+ bbank + ", campDate=" + campDate + ", starttime=" + starttime + ", endtime=" + endtime + ", estPart="
				+ estPart + ", remark=" + remark + "]";
	}
	
	

}
