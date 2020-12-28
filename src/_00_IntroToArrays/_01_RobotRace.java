package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
		//2. create an array of 5 robots.
		Robot [] robotarray = new Robot [5];
		//3. use a for loop to initialize the robots.
		Random ran = new Random();
for (int i = 0; i < robotarray.length; i++) {
	  robotarray[i] = new Robot("mini");
	 robotarray[i].setX(100 + i*50);
	 robotarray[i].setY(500);
	 robotarray[i].setSpeed(1000);
	 
	 while (robotarray[i].getY() > 0) {
		 for (int j = 0; j < robotarray.length; j++) {
			 if (robotarray[i].getY() <= 0) {
					System.out.println("Congrats!");
				}
			 System.out.println(robotarray[i].getY());
			robotarray[i].move(ran.nextInt(50));
			
		
	}
	}
}
			//4. make each robot start at the bottom of the screen, side by side, facing up

	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
}
