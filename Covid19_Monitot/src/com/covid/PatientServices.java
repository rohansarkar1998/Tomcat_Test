package com.covid;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;











public class PatientServices {
	public String creatpatient(Patient p1)
	{
		EntityManager em = null;
		String str;
		try {
			System.out.println("Inside Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(p1);
			et.commit();
			str="yes";
			return str;

		}

		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			System.out.print("Wrong");
			str="not";
			return str;
		
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public int generateid()
	{
		int size=0;
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Patient");
			@SuppressWarnings("unchecked")
			List<Patient> list1= q.getResultList();
			int i;
			size=list1.size();
			System.out.print(size);
			int fsize=size+1;
			return fsize;
			
			}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		
		
		} finally {
			if (em != null)
				em.close();
		}
		
	}
	
	public String logincandidate(String phonenum,String password)
	{
		String str="";
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Patient");
			@SuppressWarnings("unchecked")
			List<Patient> list1= q.getResultList();
			int i;
			for(i=0;i<list1.size();i++)
			{
				if(list1.get(i).getPhonenum().equals(phonenum) && list1.get(i).getPassword().equals(password))
				{
					System.out.print("YEssssssss Successsss");
					str="yes";
					
				}
			}
			return str;
	}
		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			str="no";
			return str;
		} finally {
			if (em != null)
				em.close();
		}
}
	
	public String doclogin(String userid,String password)
	{
		String str="";
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Doctor");
			@SuppressWarnings("unchecked")
			List<Doctor> list2= q.getResultList();
			System.out.print("Successssss");
			int i;
			for(i=0;i<list2.size();i++)
			{
				if(list2.get(i).userid.equals(userid) && list2.get(i).getPassword().equals(password))
				{
					str="yes";
				}
			}
			return str;
			
			
			
	}
		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			str="no";
			return str;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public String adminlogin(int userid,String password)
	{
		String str="";
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Admin");
			@SuppressWarnings("unchecked")
			List<Admin> list2= q.getResultList();
			System.out.print("Successssss");
			int i;
			for(i=0;i<list2.size();i++)
			{
				if(list2.get(i).getUserid()==userid && list2.get(i).getPassword().equals(password))
				{
					str="yes";
				}
			}
			return str;
			
			
			
	}
		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			str="no";
			return str;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	
	
	public List<Patient> showpatient(String phonenum)
	{
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Patient");
			@SuppressWarnings("unchecked")
			List<Patient> list1= q.getResultList();
			List<Patient> list2= new ArrayList<Patient>();
			int i;
			for(i=0;i<list1.size();i++)
			{
				System.out.print("From bean phone num"+phonenum);
				System.out.println("The actual num"+list1.get(i).getPhonenum());
				if(list1.get(i).getPhonenum().equals(phonenum))
				{
					System.out.print("match the data");
					Patient pe = new Patient();
					pe.setPhonenum(list1.get(i).getPhonenum());
					pe.setPassword(list1.get(i).getPassword());
					pe.setName(list1.get(i).getName());
					pe.setAge(list1.get(i).getAge());
					pe.setCity(list1.get(i).getCity());
					pe.setHeartRate(list1.get(i).getHeartRate());
					pe.setSystolicPressur(list1.get(i).getSystolicPressur());
					pe.setDiastolicPressure(list1.get(i).getDiastolicPressure());
					pe.setHeartDeasis(list1.get(i).getHeartDeasis());
					pe.setHypertention(list1.get(i).getHypertention());
					pe.setDiabatis(list1.get(i).getDiabatis());
					pe.setMedicin(list1.get(i).medicin);
					pe.setRemark(list1.get(i).getRemark());
					pe.setId(list1.get(i).getId());
					pe.setBodytemp(list1.get(i).getBodytemp());
					pe.setStatus(list1.get(i).getStatus());
					list2.add(pe);
						
				}
			}
			return list2;
			}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public String treatpatient(int id,String medicin,String remark)
	{
		String str="";
		String phonenum="";
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Patient");
			@SuppressWarnings("unchecked")
			List<Patient> list1= q.getResultList();
			int i;
			for(i=0;i<list1.size();i++)
			{
				if(list1.get(i).getId()==id)
				{
					phonenum=list1.get(i).getPhonenum();
					System.out.print(phonenum);
				}
			}
			et.begin();
			Patient patient=em.find(Patient.class, phonenum);
			patient.setRemark(remark);
			patient.setMedicin(medicin);
			et.commit();
			str="yes";
			return str;
		
	}
		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			str="no";
			return str;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public List<Patient> patienttable()
	{
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Patient");
			@SuppressWarnings("unchecked")
			List<Patient> list1= q.getResultList();
			List<Patient> list2= new ArrayList<Patient>();
			int i;
			for(i=0;i<list1.size();i++)
			{
					Patient pe = new Patient();
					pe.setPhonenum(list1.get(i).getPhonenum());
					pe.setPassword(list1.get(i).getPassword());
					pe.setName(list1.get(i).getName());
					pe.setAge(list1.get(i).getAge());
					pe.setCity(list1.get(i).getCity());
					pe.setHeartRate(list1.get(i).getHeartRate());
					pe.setSystolicPressur(list1.get(i).getSystolicPressur());
					pe.setDiastolicPressure(list1.get(i).getDiastolicPressure());
					pe.setHeartDeasis(list1.get(i).getHeartDeasis());
					pe.setHypertention(list1.get(i).getHypertention());
					pe.setDiabatis(list1.get(i).getDiabatis());
					pe.setRemark(list1.get(i).getRemark());
					pe.setId(list1.get(i).getId());
					pe.setMedicin(list1.get(i).getMedicin());
					pe.setBodytemp(list1.get(i).getBodytemp());
					pe.setStatus(list1.get(i).getStatus());
					list2.add(pe);
						
			}
			
			return list2;
			}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public List<Doctor> doctortable()
	{
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Doctor");
			@SuppressWarnings("unchecked")
			List<Doctor> list1= q.getResultList();
			List<Doctor> list2= new ArrayList<Doctor>();
			int i;
			for(i=0;i<list1.size();i++)
			{
					Doctor de = new Doctor();
					de.setName(list1.get(i).getName());
					de.setUserid(list1.get(i).getUserid());
					list2.add(de);
			}
			
			return list2;
			}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public String update( String phonenum, int bodytemp,int hr,int sys,int dia,String status)
	{
		String str="";
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Patient");
			@SuppressWarnings("unchecked")
			List<Patient> list1= q.getResultList();
			et.begin();
			Patient patient=em.find(Patient.class, phonenum);
			patient.setBodytemp(bodytemp);
			patient.setHeartRate(hr);
			patient.setSystolicPressur(sys);
			patient.setDiastolicPressure(dia);
			patient.setStatus(status);
			et.commit();
			str="yes";
			return str; 
		
	}
		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			str="no";
			return str;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public String adddoc(Doctor d)
	{
		EntityManager em = null;
		String str;
		try {
			System.out.println("Inside Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(d);
			et.commit();
			str="yes";
			return str;

		}

		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			System.out.print("Wrong");
			str="not";
			return str;
		
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public String addadmin(Admin a)
	{
		EntityManager em = null;
		String str;
		try {
			System.out.println("Inside Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(a);
			et.commit();
			str="yes";
			return str;

		}

		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			System.out.print("Wrong");
			str="not";
			return str;
		
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public String docpass(String userid,String password)
	{
		String str="";
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			et.begin();
			Doctor doctor=em.find(Doctor.class, userid);
			doctor.setPassword(password);
			et.commit();
			str="yes";
			return str; 
		
	}
		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			str="no";
			return str;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	
	public String patientpass(String phonenum,String password)
	{
		String str="";
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			et.begin();
			Patient patient=em.find(Patient.class, phonenum);
			patient.setPassword(password);
			et.commit();
			str="yes";
			return str; 
		
	}
		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			str="no";
			return str;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public String adminpass(int userid,String password)
	{
		String str="";
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			et.begin();
			Admin admin=em.find(Admin.class, userid);
			admin.setPassword(password);
			et.commit();
			str="yes";
			return str; 
		
	}
		catch (Exception e) {
			//e.printStackTrace();
			//throw e;
			str="no";
			return str;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public List<Admin> admintable()
	{
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Admin");
			@SuppressWarnings("unchecked")
			List<Admin> list1= q.getResultList();
			List<Admin> list2= new ArrayList<Admin>();
			int i;
			for(i=0;i<list1.size();i++)
			{
					Admin de = new Admin();
					de.setName(list1.get(i).getName());
					de.setUserid(list1.get(i).getUserid());
					list2.add(de);
			}
			
			return list2;
			}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	public String ShowStat()
	{
		int size=0;
		int aff=0;
		int cure=0;
		String str;
		double rate;
		EntityManager em = null;
		try {
			System.out.println("InsideE Service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid19_Monitot");
			em = emf.createEntityManager();			
			EntityTransaction et = em.getTransaction();
			Query q = em.createQuery("FROM Patient");
			@SuppressWarnings("unchecked")
			List<Patient> list1= q.getResultList();
			int i;
			size=list1.size();
			for(i=0;i<list1.size();i++)
			{
				if(list1.get(i).getStatus().equals("pos"))
				{
					aff=aff+1;
				}
			}
			cure=size-aff;
			str="Total number of patient ::"+size+"        "+"Covid posative ::"+aff+"         "+"Cured ::"+cure;
			return str;
			
			}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		
		
		} finally {
			if (em != null)
				em.close();
		}
	}
	
	
}


