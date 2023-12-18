package coursework;
import java.util.Scanner; //Scanner class to read input from user
//classes needed to write into file
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class DynamicDistancing {
	
	static void main (int spotid, String spotname) {
		//to get distance of the user from people on the left,right,front and back of them
		System.out.println("Please enter your physical distance from other people in immediate surrounding in four diffrent directions (in meters) ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Front:");
        float front = scan.nextFloat();
        System.out.println("Back:");
        float back = scan.nextFloat();
		System.out.println("Left:");
        float left = scan.nextFloat();
        System.out.println("Right:");
        float right = scan.nextFloat();
        
        //extra feature
        //visualised representation of the distance 
        System.out.println("\nYour distance from people surrounding you:");
        System.out.println("       " + front);
        for (int i=0 ; i<5; i++)
        {
        	System.out.println("        " + "|");
        }
        System.out.println(left + "-----" + " -----" + right);
        for (int i=0 ; i<5; i++)
        {
        	System.out.println("       " + " |");
        }
        System.out.println("       " + back);
        
        
        //calculation of distance to move away if their distance with the person beside them is less than 1
        int safevalue = 0; //a safe value variable to determine if user will be classify as casual contact
        if (left < 1)
        {
        	float move = 1 - left;
        	String formattedMove= String.format("%.2f", move); //make sure float value is only two decimal place
        	System.out.println("\nmove right " + formattedMove + " meters");
        	safevalue += 1;
        }
        if (right < 1)
        {
        	float move = 1 - right;
        	String formattedMove= String.format("%.2f", move);//make sure float value is only two decimal place
        	System.out.println("\nmove left " + formattedMove + " meters");
        	safevalue += 1;
        }
        if (front < 1)
        {
        	float move = 1 - front;
        	String formattedMove= String.format("%.2f", move);//make sure float value is only two decimal place
        	System.out.println("\nmove back " + formattedMove + " meters");
        	safevalue += 1;
        }
        if (back < 1)
        {
        	float move = 1 - back;
        	String formattedMove= String.format("%.2f", move);//make sure float value is only two decimal place
        	System.out.println("\nmove front " + formattedMove + " meters");
        	safevalue += 1;
        }
        
        //user is safe if their distance with people surrounding them is far enough
        if (safevalue == 0)
        {
        	System.out.println("\nyou are safe in dynamic distance!\n");
        	
        	//add new visitor or exit the program
        	Scanner scan7 = new Scanner(System.in);
        	System.out.println("1)Add new visitor\n2)Exit ");
        	int input = scan7.nextInt();
        	
        	if (input == 1)
        	{
        		Main.main();
        	}
        	else if (input == 2)
        	{
        		System.exit(0);
        	}
        	
        }
        //if user has been classified as casual contact, then they need to provide their personal information
        else 
        {
        	System.out.println("\nYou have been classified as casual contact, please provide us your details: ");
        	Scanner scan1 = new Scanner(System.in);
        	System.out.println("Your ID:");
        	String id = scan1.nextLine();
        	Scanner scan2 = new Scanner(System.in);
        	System.out.println("Your name:");
        	String username = scan2.nextLine();
        	Scanner scan3 = new Scanner(System.in);
        	System.out.println("Your phone number (+60):");
        	String phonenum = scan3.nextLine();
        	Scanner scan4 = new Scanner(System.in);
        	System.out.println("Date you entered the spot (dd/mm/yyyy):");
        	String date = scan4.nextLine();
        	Scanner scan5 = new Scanner(System.in);
        	System.out.println("Time you entered the spot(hr:min): ");
        	String time = scan5.nextLine();
        	
        	//extra feature
        	//write casual contact details into file
        	try {
                FileWriter fw = new FileWriter("casual_contact_details.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("ID: " + id);
                bw.newLine();
                bw.write("Name: " + username);
                bw.newLine();
                bw.write("Phone Number: " + phonenum);
                bw.newLine();
                bw.write("Date you entered the spot: " + date);
                bw.newLine();
                bw.write("Time you entered the spot: " + time);
                bw.newLine();
                bw.write("Restricted spot id you entered: " + spotid);
                bw.newLine();
                bw.write("Restricted spot name you entered: " + spotname);
                bw.newLine();
                bw.write("Contact Status: Casual Contact");
                bw.newLine();
                bw.write("\n");
                bw.newLine();
                bw.close();
                fw.close();
              } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
              }
        	
        	
        	System.out.println("\nYour casual contact details: \n" );
        	System.out.println("ID: " + id);
        	System.out.println("Name: " + username);
        	System.out.println("Phone Number: " + phonenum);
        	System.out.println("Date you entered the spot: " + date);
        	System.out.println("Time you entered the spot: "+ time);
        	System.out.println("Restricted spot id you entered: " + spotid);
        	System.out.println("Restricted spot name you entered: " + spotname);
        	System.out.println("\nYou will be contacted at least once in the next seven days to make sure you are safe\n");
        	
        	
        	//add new visitor or exit the program
        	Scanner scan6 = new Scanner(System.in);
        	System.out.println("1)Add new visitor\n2)Exit ");
        	int input = scan6.nextInt();
        	
        	if (input == 1)
        	{
        		Main.main();
        	}
        	else if (input == 2)
        	{
        		System.exit(0);
        	}
        	
        	
        	
        }
        
        
       
	}
}
