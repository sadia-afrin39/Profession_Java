package Profession;

public class Doctor extends Person{
	
	Doctor(){
		
	}
	
	Doctor(String name,String fathername,String mothername,String address,String contact,String DOB,int age,double income){
		super(name,fathername,mothername,address,contact,DOB,age,income);
	}
	
	@Override
	String getname() {
		return Getname();
	}

	@Override
	String getfathername() {
		return Getfathername();
	}
}
