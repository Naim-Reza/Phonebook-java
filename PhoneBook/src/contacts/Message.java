package contacts;
import java.util.Scanner;

public class Message {
	public int commandValue;
	public String commandString[]={"1. Add People.","2. View People.","3. Delete People.","4. Exit."};
	Scanner inps= new Scanner(System.in);
	public void welocmeMessage(){
		System.out.print("\n");
		for(int i=0;i<4;i++){
			System.out.print("\t");
		}
		System.out.print("Welcome to People");
	}
	public void displayMessage(){
		System.out.print("\n\n");
		for(int i=0;i<20;i++){
			System.out.print("====");
		}
		System.out.println("\n\n");
		for(int i=0;i<4;i++){
			System.out.println(commandString[i]);
		}
		System.out.print("\n\n");
		for(int i=0;i<20;i++){
			System.out.print("====");
		}
		System.out.print("\n\n");
		
	}
	public void getValue(){
		System.out.println("Enter your choice:");
		commandValue= inps.nextInt();
	}

}
