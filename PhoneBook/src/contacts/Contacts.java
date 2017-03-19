package contacts;
import java.util.Scanner;

public class Contacts {

	public static void main(String[] args) {
		people userList[]=new people[100];
		Scanner inpObj= new Scanner(System.in);
		int counter=0;
		int remain=userList.length-counter;
		Message actionMessage=new Message();
		actionMessage.welocmeMessage();
		actionMessage.displayMessage();
		actionMessage.getValue();
		while(actionMessage.commandValue>=0){
			if(actionMessage.commandValue==0 || actionMessage.commandValue>4){
				System.out.println("Invalid Choise. Please enter among 1 to 4.");
				actionMessage.getValue();
			}else{
				switch(actionMessage.commandValue){
					case 1:
						userList[counter]= new people();
						userList[counter].addPeople();
						userList[counter].displayPeople();
						counter++;
						remain=userList.length-counter;
						System.out.println("This contact is saved successfully.\n");
						System.out.println(counter+" Contacts saved and "+remain+" Remains.");
						System.out.println("\nPress Enter to continue.");
						String end=inpObj.nextLine();
						actionMessage.displayMessage();
						actionMessage.getValue();
						break;
					case 2:
						View viewObj= new View();
						viewObj.viewPeople(counter,userList);
						System.out.println("\nPress Enter to continue.");
						end=inpObj.nextLine();
						actionMessage.displayMessage();
						actionMessage.getValue();
						break;
					case 4:
						actionMessage.commandValue=-1;
						break;
					default:
						System.out.println("Invalid input.Please try again");
						actionMessage.getValue();
				}
			}
		}
		
		System.out.println("Thanks for your time.");
		

	}
	

}
