import java.util.Random;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Houses {
static int size; 
//static int houseint = 100;
public static void main(String[] args) {
Tortoise.setY(910);
Tortoise.setX(20);
Tortoise.show();
Tortoise.setSpeed(5);
Tortoise.penDown();
drawHouse(houseSize);
	//3. extract that into a method that takes height as a parameter

	//4. draw 9 houses of different heights

	//5. make the method take a String instead of a height	
		
	//“small” 		60
//	“medium”	 	120
	//“large” 			250

	//6. make the method take a color 

//	7. make the grass (between houses) always green

	//8. give the houses peaked roofs

	//9. extract that into a method “drawPointyRoof” and “drawFlatRoof”

	//10. make large houses have flat rooves

//	11. make the roof type selection random
	
}

private static void drawHouse(String houseSize) {
	String small = "60";
	String medium = "120";
	String large = "250";	
	size = new Random().nextInt(3);
	if(size==0){
	houseSize = "small";	
	}
	if(size==1){
	houseSize = "medium";	
	}
	if(size==2){
	houseSize = "large";	
	}
	
	
	if(houseSize.equals(small)){
	houseint = 60;
	//Flat Roof
	}
	else if(houseSize.equals(medium)){
	houseint = 120;
	//Pointy Roof
	}
	else if(houseSize.equals(large)){
	houseint = 250;
	//Pointy Roof
	}
	Tortoise.move(houseint);
	if(houseSize.equals(small)){
	//Flat
	Tortoise.turn(90);
	Tortoise.move(100);
	Tortoise.turn(90);	}
	else{
	Tortoise.move(houseint);		
	Tortoise.turn(45);
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(50);
	Tortoise.turn(45);
}
	Tortoise.move(houseint);
}
}
