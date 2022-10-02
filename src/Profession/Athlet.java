package Profession;

public class Athlet extends Person{
	
	Athlet(){
		
	}

	Athlet(String name,String fathername,String mothername,String address,String contact,String DOB,int age,double income){
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
