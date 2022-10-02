package Profession;

public abstract class Person {
	
	private String name,fathername,mothername,address,contact,DOB;
	private int age;
	private double income;
	
	Person(){

	}
	
	Person(String name,String fathername,String mothername,String address,String contact,String DOB,int age,double income){
		this.name=name;
		this.fathername=fathername;
		this.mothername=mothername;
		this.address=address;
		this.contact=contact;
		this.age=age;
		this.DOB=DOB;
		this.income=income;
	}
	
	abstract String getname();
	
	abstract String getfathername();
	
	public String Getname(){
		return name;
	}
	
	public String Getfathername(){
		return fathername;
	}
	
	public String Getmothername(){
		return mothername;	
	}
	
	public String Getaddress(){
		return address;	
	}
	
	public String Getcontact(){
		return contact;	
	}
	
	public String GetDOB(){
		return DOB;	
	}
	
	public int Getage(){
		return age;	
	}
	
	
	public double Getincome(){
		return income;	
	}
	
	public void display(){
		   System.out.println("NAME: "+getname());
		   System.out.println("Fathername: "+getfathername());
		   System.out.println("Mothername: "+Getmothername());
		   System.out.println("Address: "+Getaddress());
		   System.out.println("Contact: "+Getcontact());
		   System.out.println("Date of Birth: "+GetDOB());
		   System.out.println("Age: "+Getage());
		   System.out.println("Salary: "+Getincome());
		   
	}
	
	

}
