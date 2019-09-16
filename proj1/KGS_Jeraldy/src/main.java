import java.awt.Color;
import java.awt.event.KeyEvent;


import java.awt.Rectangle;

//extra libraries
import java.util.Random;



public class main {
	
	
	public static String youDEAD() {
		return "you dead son";
	}
	
	
	
	
	public static void generateBuildings(int amountOfCars) {	  //for loops can add EZ variables. cool
		  for (int x=0;x<=amountOfCars;x++) {
			  EZ.addImage("Av2_TYPE.png", randXvalue(), randYvalue());
		  }
	}
	
	public static int[] generateCord() {
		Random rand = new Random();
		int x = rand.nextInt(1024);
		int y = rand.nextInt(700);
		
		//this will generate a list between [1-maxValue]
		x+=1;
		y+=1;
				
		return new int[] {x, y};
		
	}
	
	
	//this will return the x cordinate
	public static int randXvalue() {
		Random rand = new Random();
		int x = rand.nextInt(1024);
		x+=1;
		
		return x;
	}
	
	
	//this will return y cordinate
	public static int randYvalue() {
		Random rand = new Random();
		int y = rand.nextInt(700);
		y+=1;
		
		return y;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[] result = generateCord();
		//function that generates random cordinate system
		
		Random rand = new Random();
		int n = rand.nextInt(1024);
		n+= 1;
		
		
		//set fixed LxW variables
		int length = 1024;
		int width = 700;
		//make a function that generates a value on screen
		
		

		
		// TODO Auto-generated method stub
		 // Setup EZ graphics system.
		  EZ.initialize(length,width);  // Setup ez and make a window of size 1024 by 700
		  
		  // Sets up the background color to GREEN. 0 100 0 is GREEN
		  EZ.setBackgroundColor(new Color(220,220,220));
		  
		  // Loads the bug picture and assigns it to the variable bugPicture and positions it at 512x350
		  EZImage userCar = EZ.addImage("Av2_TYPE.png", Player.X,Player.Y);
		  Rectangle rekt = new Rectangle(40, 40); //haha
		  
		  
		  //Contruct Image buildings (must be arranged like an obstacle course)
		  
		  //gotta figure out a way to generate and make a possible obstacle "pathway"
		  //figure out a way to generate without setting variables
		 
		  
		  
		  //EZ needs to be init before you can run EZ functions
		generateBuildings(5);
		 
		  while(true) {
			  //System.out.println("X: " + userCar.getXCenter());
			  //System.out.println("Y: " + userCar.getYCenter());
				System.out.println(Player.X);
			  
			  
			  
			  
			  
			  	// If the key I pressed is right arrow
			  
				if (EZInteraction.isKeyDown(KeyEvent.VK_D)) {
					// Then make the picture turn right 5 degrees
					userCar.turnRight(5);
				}
				if (EZInteraction.isKeyDown(KeyEvent.VK_A)) {  // Checks if you pressed is left arrow
					userCar.turnLeft(5);	// Turn left 5 degrees
					
				} 
				if (EZInteraction.isKeyDown(KeyEvent.VK_W)) {	// Checks if you pressed up arrow key
					userCar.moveForward(10);	
				}
				
				if (EZInteraction.isKeyDown(KeyEvent.VK_S)) {
					userCar.moveForward(-10); 
					
					
				// If the user pressed and released the space bar then add a poop image
				}
			  EZ.refreshScreen();
			    
		  }
		  
	}

}
