package coursework;
import java.util.Scanner; //Scanner class to read input from user

public class Main {
	
	static void main () {

		//creation of restricted spots 
    	RestrictedSpots r1 = new RestrictedSpots(1,"ICU",50,20);
        RestrictedSpots r2= new RestrictedSpots(2,"out-patient visitors’ main waiting area",5,40);
        RestrictedSpots r3= new RestrictedSpots(3,"in-patient visitors’ waiting area’",80,30);
        RestrictedSpots r4= new RestrictedSpots(4,"medicine dispensary unit waiting area’",40,25);
        RestrictedSpots r5 = new RestrictedSpots(1,"Administrative office",50,20);
        
        //Display Menu
        System.out.println("Welcome to the hospital");
        System.out.println("Due to the pandemic, we require visitors to enter their visit details in this system");
        System.out.println("\nRestricted Spots in hospital:");
        System.out.println("1) " + r1.getName());
        System.out.println("2) " + r2.getName());
        System.out.println("3) " + r3.getName());
        System.out.println("4) " + r4.getName());
        System.out.println("5) " + r5.getName());
        
        
        //user input to choose which restricted spot they would like to enter
        Scanner scan = new Scanner (System.in);
        System.out.print("\nPlease enter the id of the restricted spot you would like to enter:");
        int selectroom=scan.nextInt();
        System.out.println("\nYou've chosen to enter spot " + selectroom + "\n");
        
        
        int capacity = RestrictedSpots.visitorno(); //random current visitors in restricted spots 
   
        //switch case based on the selection of user input 
        switch (selectroom)
        {
        case 1:
        	int maxcapacity1 = (r1.getarea()/1); //calculation of max capacity for spot 1
        	System.out.println("The number of people in this spot now is " + capacity + "\n");
        	//static and dynamic distancing are imported into here and take in values (data) from room 1
        	StaticDistancing.main(capacity, maxcapacity1,r1.getspat());
        	DynamicDistancing.main(r1.getid(),r1.getName());
        	break;
        	
        case 2:
        	int maxcapacity2 = (r2.getarea()/1); //calculation of max capacity for spot 2
        	System.out.println("The number of people in this spot now is " + capacity + "\n");
        	//static and dynamic distancing are imported into here and take in values (data) from room 2
        	StaticDistancing.main(capacity, maxcapacity2,r2.getspat());
        	DynamicDistancing.main(r2.getid(),r2.getName());
        	break;
        
        case 3:
        	int maxcapacity3 = (r3.getarea()/1); //calculation of max capacity for spot 3
        	System.out.println("The number of people in this spot now is " + capacity + "\n");
        	//static and dynamic distancing are imported into here and take in values (data) from room 3
        	StaticDistancing.main(capacity, maxcapacity3,r3.getspat());
        	DynamicDistancing.main(r3.getid(),r3.getName());
        	break;
        	
        case 4:
        	int maxcapacity4 = (r4.getarea()/1); //calculation of max capacity for spot 4
        	System.out.println("The number of people in this spot now is " + capacity + "\n");
        	//static and dynamic distancing are imported into here and take in values (data) from room 4
        	StaticDistancing.main(capacity, maxcapacity4,r4.getspat());
        	DynamicDistancing.main(r4.getid(),r4.getName());
        	break;
        case 5:
        	int maxcapacity5 = (r5.getarea()/1); //calculation of max capacity for spot 5
        	System.out.println("The number of people in this spot now is " + capacity + "\n");
        	//static and dynamic distancing are imported into here and take in values (data) from room 5
        	StaticDistancing.main(capacity, maxcapacity5,r5.getspat());
        	DynamicDistancing.main(r5.getid(),r5.getName());
        	break;
        
        default:
        	System.out.println("Invalid spot ID" + "\n");
        	Main.main();
        	break;
        }
        
        
        
	}
	
	public static void main (String[] args)
	{
		//run of the main function
		main();
		
	}
}

