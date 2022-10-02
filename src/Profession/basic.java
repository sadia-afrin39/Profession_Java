package Profession;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		
		Person p;
		
		System.out.println("Whose information do you want to know?\n1.Engineer\n2.Doctor\n3.Teacher\n4.Athlet\n\n  Enter a number:");
		
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		if(n==1){
			p=new engineer( "Sadia Afrin Tarin", "Abdur Razzak Molllik", "Fatima Begum", "Bhandaria", "01903153062","02/10/1999",20, 60000.00);	
			p.display();
		}
		
		
		else if(n==2){
			Doctor d=new Doctor( "Shahadat Hosasin Hazra", "Abdur Rahim", "Sonia Begum", "Bhandaria", "01903153345","09/10/1979",33, 160000.00);
			d.display();
		}
		
				
		else if(n==3){
			Teacher t=new Teacher( "Mostafizur Rahman", "Abdur karim", "Rokeya Begum", "Baarisal", "01935453062","02/04/1990",29, 40000.00);
			t.display();
		}
		
		
		else if(n==4){
			Athlet a= new Athlet( "Usain Bolt", "Peter Bolt", "Elina", "Brazil", "+9876501903153062","02/10/1980",20, 206000.00);
			a.display();
		}		

	}

}
