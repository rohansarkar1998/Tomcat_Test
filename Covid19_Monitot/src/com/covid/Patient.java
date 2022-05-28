package com.covid;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	String phonenum;
	int id;
	String password;
	String name;
	int age;
	String city;
	int heartRate;
	int systolicPressur;
	int diastolicPressure;
	String heartDeasis;
	String hypertention;
	String diabatis;
	int bodytemp;
	String status;
	String medicin;
	String remark;
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	public int getSystolicPressur() {
		return systolicPressur;
	}
	public void setSystolicPressur(int systolicPressur) {
		this.systolicPressur = systolicPressur;
	}
	public int getDiastolicPressure() {
		return diastolicPressure;
	}
	public void setDiastolicPressure(int diastolicPressure) {
		this.diastolicPressure = diastolicPressure;
	}
	public String getHeartDeasis() {
		return heartDeasis;
	}
	public void setHeartDeasis(String heartDeasis) {
		this.heartDeasis = heartDeasis;
	}
	public String getHypertention() {
		return hypertention;
	}
	public void setHypertention(String hypertention) {
		this.hypertention = hypertention;
	}
	public String getDiabatis() {
		return diabatis;
	}
	public void setDiabatis(String diabatis) {
		this.diabatis = diabatis;
	}
	public String getMedicin() {
		return medicin;
	}
	public void setMedicin(String medicin) {
		this.medicin = medicin;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBodytemp() {
		return bodytemp;
	}
	public void setBodytemp(int bodytemp) {
		this.bodytemp = bodytemp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	

}
