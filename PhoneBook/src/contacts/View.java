package contacts;

public class View extends people {
	public void viewPeople(int lastPerson, people arry[]){
		System.out.println("Displaying All the Contacts...");
		for(int i=0;i<lastPerson;i++){
			System.out.printf("Index[%d]\n", i);
			System.out.println("\tName:\t"+arry[i].getName());
			System.out.println("\tEmail:\t"+arry[i].getEmail());
			System.out.println("\tAge:\t"+arry[i].getAge());
			System.out.println("\tPhone:\t"+arry[i].getPhone());
		}
	}

}
