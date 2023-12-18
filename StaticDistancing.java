package coursework;
import java.util.Scanner; //Scanner class to read input from user

public class StaticDistancing {
    
    static void main(int capa, int maxcap, float waittime) {
    	//check if current capacity has exceeded maximum capacity
        if (capa < maxcap) {
            System.out.println("The maximum human capacity in this spot is " + maxcap + " people, it has not exceeded its maximum yet, welcome! \n");
            capa = capa + 1; //add human capacity of the room by 1
            System.out.println("System update: the spot capacity is now " + capa + "\n"); //system update to show the most current visitor number
        }
        //condition if it exceeds maximum capacity
        else {
        	// ask if user want to wait for a certain amount of time (spot permitted average time) to enter the room they choose
            System.out.println("The spot has reached its maximum capacity (" + maxcap + ") , the average waiting time is " + waittime + "mins");
            Scanner scan1 = new Scanner(System.in);
            System.out.print("\nDo you still wish to enter (Yes or No)? ");
            String ans = scan1.nextLine();
            
            // if they are willing to wait, then after the spot permitted average time, they will enter the spot
            if (ans.equals("Yes")) {
                System.out.println("\nThe spot is now available to enter, welcome!\n");
                capa = capa + 1;
            } 
            //if their answer is No, then they can choose to enter another room or choose to not enter any room at all
            else if (ans.equals("No")) {
            	Scanner scan2 = new Scanner(System.in);
                System.out.println("\nWould you like to visit another restricted spot within the hospital (Yes or No)?");
                String choice = scan2.nextLine();
                
                //will redirect back to the menu if they would like to choose to enter another room
                if (choice.equals("Yes")) {
                    Main.main();
                }
                //exit the system if they do not want to enter any other room
                else if (choice.equals("No")) {
                    // Exit the program
                    System.out.println("Thank you for using the app.");
                    System.exit(0);
                }
                // if user input is neither yes or no, then it is an invalid option and it will exit the system
                else {
                    System.out.println("Invalid option");
                    System.exit(0);
                }

            } 
            // if user input is neither yes or no, then it is an invalid option and it will exit the system
            else {
                System.out.println("Invalid option");
                System.exit(0);
            }
        }
    }
}
