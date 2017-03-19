package contacts;
import java.util.Scanner;

public class people {
	private String name,email,phone;
	private int age;
	Scanner inps= new Scanner(System.in);
	public void addPeople(){
		setName();
		setEmail();
		setAge();
		setPhone();
	}
	public void setName(){
		System.out.println("Enter your name:");
		name=inps.nextLine();
	}
	public void setEmail(){
		System.out.println("Enter your E-mail address:");
		email= inps.nextLine();
	}
	public void setAge(){
		System.out.println("Enter your age:");
		age=inps.nextInt();
	}
	public void setPhone(){
		System.out.println("Enter your Phone No:");
		phone= inps.nextLine();
	}
	public void displayPeople(){
		System.out.println("Name: "+"\t"+getName());
		System.out.println("Email: "+"\t"+getEmail());
		System.out.println("Age: "+"\t"+getAge());
		System.out.println("Phone: "+"\t"+getPhone());
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public int getAge(){
		return age;
	}
	public String getPhone(){
		return phone;
	}
	

}
