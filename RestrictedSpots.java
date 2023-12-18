package coursework; 
import java.util.Random; //Random class to generate random numbers
import java.util.Scanner; //Scanner class to read input from user


public class RestrictedSpots {
	
    //declare data (variables) of each spot as private
    private int sid; //spot id
    private String sname; //spot name
    private int sarea; //spot area
    private float spat; //spot permitted average time
    private int smaxcapacity; //spot max human capacity

    
    //constructor to initialise objects(data) of the RestrictedSpots class
    public RestrictedSpots (int sid, String sname, int sarea, float spat) {
        this.sid = sid;
        this.sname = sname;
        this.sarea = sarea;
        this.spat = spat;
        this.smaxcapacity = (int) Math.floor(sarea/ 1); //formula to calculate maximum capacity based on restrictions
    }
    
    //to generate random number of current visitors in restricted spots 
    static int visitorno ()
    {
        return (int)(Math.random() * 40);
    }
    
    
    //to make the private variable sname public in order to use it in other classes
    public String getName(){
        return this.sname;
    }
    
    //to make the private variable sid public in order to use it in other classes
    public int getid(){
        return this.sid;
    }
    
    //to make the private variable sarea public in order to use it in other classes
    public int getarea(){
        return this.sarea;
    }

    //to make the private variable spat public in order to use it in other classes
    public float getspat(){
        return this.spat;
    }
    
    //to make the private variable smaxcapacity public in order to use it in other classes
    public int maxcap()
    {
        return this.smaxcapacity;
    }
    
   
}
