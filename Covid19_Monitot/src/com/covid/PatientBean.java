package com.covid;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatientBean {
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
	String medicin;
	String remark;
	String userid;
	String type;
	int bodytemp;
	String status;
	String confarm;
	String msg="";
	String ans="";
	public List<Patient> p1;
	public List<Patient> d1;
	public List<Doctor> doc;
	public List<Admin> ad;
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
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	public List<Patient> getP1() {
		return p1;
	}
	public void setP1(List<Patient> p1) {
		this.p1 = p1;
	}
	
	
	public List<Patient> getD1() {
		return d1;
	}
	public void setD1(List<Patient> d1) {
		this.d1 = d1;
	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public List<Doctor> getDoc() {
		return doc;
	}
	public void setDoc(List<Doctor> doc) {
		this.doc = doc;
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
	
	
	
	
	public String getConfarm() {
		return confarm;
	}
	public void setConfarm(String confarm) {
		this.confarm = confarm;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	public List<Admin> getAd() {
		return ad;
	}
	public void setAd(List<Admin> ad) {
		this.ad = ad;
	}
	
	
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	public static boolean isValid(String s)
    {
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
	public String creatprofile()
	{
		String validity="";
		if (isValid(phonenum))
		{
			validity="valid";
		}
        else
        {
        	validity="invalid";
        }
        if(validity.equals("valid")) {   
		String s="";
		int count=0;
		String med="No data found";
		String rem="No data found";
		String status="";
		Patient p1=new Patient();
		PatientServices p = new PatientServices();
		int ans=p.generateid();
		if(heartRate>100 || heartRate<60)
		{
			count=count+1;
		}
		if(systolicPressur>140 && diastolicPressure>90 )
		{
			count=count+1;
		}
		if(bodytemp>=100)
		{
			count=count+1;
		}
		if(diabatis.equals("YES"))
		{
			count=count+1;
		}
		if(count>=2)
		{
			status="pos";
		}
		else if(count<2)
		{
			status="neg";
		}
		
		p1.setId(ans);
		p1.setPhonenum(phonenum);
		p1.setPassword(password);
		p1.setName(name);
		p1.setAge(age);
		p1.setCity(city);
		p1.setHeartRate(heartRate);
		p1.setSystolicPressur(systolicPressur);
		p1.setDiastolicPressure(diastolicPressure);
		p1.setHeartDeasis(heartDeasis);
		p1.setHypertention(hypertention);
		p1.setDiabatis(diabatis);
		p1.setMedicin(med);
		p1.setRemark(rem);
		p1.setBodytemp(bodytemp);
		p1.setStatus(status);
		s=p.creatpatient(p1);
		if(s.equals("yes")) {
		return "ProfileSuccess";
		}
		else
		{
			msg="UseId All ready exist";
			return "ProfileFail";
		}
       }
        else
        {
        	msg="Not a valid phone number";
        	return "ProfileFail";
        }
			
	}
	public String login()
	{
		String str="";
		String str1="";
		String str2="";
		String str3="";
		PatientServices p = new PatientServices();
		if(type.equals("Doctor"))
		{
			str=p.doclogin(userid, password);
			if(str.equals("yes"))
			{
				str1="yes";
			}
			else
			{
				str1="no";
			}
			
		}
		else if(type.equals("Patient"))
		{
			str=p.logincandidate(userid,password);
			if(str.equals("yes"))
			{
				System.out.print("Found");
				str2=showprofile(userid);
				
			}
			else
			{
				str2="not";
			}
			
		}
		
		else
		{
			int num=Integer.parseInt(userid);
			str=p.adminlogin(num, password);
			if(str.equals("yes"))
			{
				str3="fine";
			}
			else
			{
				str3="notfine";
			}
		}
		
		if(str1.equals("yes"))
		{
			return "DocHome";
		}
		else if(str1.equals("no"))
		{
			return "ProfileFail";
		}
		else if(str2.equals("ok"))
		{
			return "Patientdetails";
		}
		else if(str2.equals("not"))
		{
			return "ProfileFail";
		}
		else if(str3.equals("fine"))
		{
			return "Adminhome";
		}
		else
		{
			msg="Userid or password massmatch";
			return "ProfileFail";
		}
		
		
		
	}
	
	public String showprofile(String phonenum)
	{
		PatientServices p = new PatientServices();
		this.setP1(new ArrayList<>());
		try {
			//this.setp1(p.showpatient(phonenum));
			this.setP1(p.showpatient(phonenum));
			System.out.print("Rohan");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "ok";
	}
	
	
	public String treatment()
	{
		String ans="";
		PatientServices p = new PatientServices();
		ans = p.treatpatient(id,medicin,remark);
		if(ans.equals("yes"))
		{
			return "SuccessUpdate";
		}
		else
		{
			msg="Error:: please Reenter the data";
			return "ProfileFail";
		}
		
	}
	
	public String showpatienttable()
	{
		PatientServices p= new PatientServices();
		this.setD1(new ArrayList<>());
		try {
			this.setD1(p.patienttable());
			System.out.print("ok made");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "ShowPatient";
	}
	
	public String showdoc()
	{
		PatientServices p= new PatientServices();
		this.setDoc(new ArrayList<>());
		try {
			this.setDoc(p.doctortable());
			System.out.print("ok made");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Showdoc";
	}
	
	public String updatepatient()
	{
		String ans="";
		PatientServices p= new PatientServices();
		int count=0;
		if(heartRate>100 || heartRate<60)
		{
			count=count+1;
		}
		if(systolicPressur>140 && diastolicPressure>=90 )
		{
			count=count+1;
		}
		if(bodytemp>=100)
		{
			count=count+1;
		}
		if(diabatis.equals("YES"))
		{
			count=count+1;
		}
		if(count>=2)
		{
			status="pos";
		}
		else if(count<2)
		{
			status="neg";
		}
		ans=p.update(phonenum,bodytemp,heartRate,systolicPressur,diastolicPressure,status);
		if(ans.equals("yes"))
		{
			return "SuccessUpdate";
		}
		else
		{
			msg="Upadte is not done prperly";
			return "ProfileFail";
		}
	}
	
	public String add()
	{
		String str="";
		String str1="";
		if(type.equals("Doctor"))
		{
			Doctor d = new Doctor();
			d.setName(name);
			d.setUserid(userid);
			d.setPassword(password);
			PatientServices p1 = new PatientServices();
			str=p1.adddoc(d);
			if(str.equals("yes"))
			{
				str1="ok";
			}
			else
			{
				str1="not";
			}
		}
		else if(type.equals("Admin"))
		{
			int id = Integer.parseInt(userid);
			Admin a = new Admin();
			a.setUserid(id);
			a.setPassword(password);
			a.setName(name);
			PatientServices p1 = new PatientServices();
			str=p1.addadmin(a);
			if(str.equals("yes"))
			{
				str1="ok";
			}
			else
			{
				str1="not";
			}
		}
		
		if(str1.equals("ok"))
		{
			return "SuccessUpdate";
		}
		else
		{
			msg="Update Fail";
			return "ProfileFail";
		}
		
	}
	
	public String changepass()
	{
		String str="";
		String str2="";
		if(confarm.equals(password))
		{
			if(type.equals("Doctor"))
			{
				PatientServices p1 = new PatientServices();
				str=p1.docpass(userid, password);
				if(str.equals("yes"))
				{
					str2="ok";
				}
				else
				{
					str2="no";
				}
				
			}
			else if(type.equals("Patient"))
			{
				PatientServices p1 = new PatientServices();
				str=p1.patientpass(userid, password);
				if(str.equals("yes"))
				{
					str2="ok";
				}
				else
				{
					str2="no";
				}
			}
			else if(type.equals("Admin"))
			{
				int num=Integer.parseInt(userid);
				PatientServices p1 = new PatientServices();
				str=p1.adminpass(num, password);
				if(str.equals("yes"))
				{
					str2="ok";
				}
				else
				{
					str2="no";
				}
			}
		}
		else
		{
			str2="no";
		}
		if(str2.equals("ok"))
		{
			return "SuccessUpdate";
		}
		else
		{
			msg="Update Fail";
			System.out.print(msg);
			return "ProfileFail";
		}
	}
	
	public String showad()
	{
		PatientServices p= new PatientServices();
		this.setAd(new ArrayList<>());
		try {
			this.setAd(p.admintable());
			System.out.print("ok made");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "ShowAdmin";
	}
	
	public void sta()
	{
		PatientServices p= new PatientServices();
		ans=p.ShowStat();
	}
	
	
}
