/* RubiksCubeGenerator.java 2015
 * 
 * CopyRight ® Hagin Onyango & KGB Agent 2015. All rights reserved.
 */
import java.util.Scanner;
public class RubikCubeReviewG {

public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Hello Welcome to RubiksCubeReviewGenerator! Answer a few questions and you will have a Cube Review in no time. :)");
		//Enter your name
		System.out.println(" Please Enter Your name ");
		String name = userInput.nextLine();
		//enter the cube you want to review
		System.out.println(" What rubiks cube do you want to review ");
		String RubiksCube = userInput.nextLine();
		//enter the company that made the cube
		System.out.println(" What company made the cube ");
		String CubeCompany = userInput.nextLine();
		//Where did you buy the rubiks cube 
		System.out.println(" Where did you buy the puzzle ");
		String CubeBought = userInput.nextLine();
		//How much the puzzle cost
		System.out.println(" How much was the puzzle you bought ");
		float CubeCost = userInput.nextFloat();
		//How much can it cut forwards
		System.out.println(" How much can the puzzle cut forwards ");
		int CubeCut = userInput.nextInt();
		//How much can the cube reverse cut
		System.out.println(" How much can the cube reverse cut ");
		int CubeRevCut = userInput.nextInt();
		//How much does the cube cut forwards
		System.out.println(" How does the cube feel when you turn it. TWO ADJECTIVES ONLY ");
		String CubeFeel = userInput.nextLine();
		//Good or bad puzzle
		System.out.println(" is the puzzle good or bad ");
		String GJorBJ = userInput.nextLine();
		//ranking of Puzzle
		System.out.println(" What grade do you give this puzzle ");
		String CubeGrade = userInput.nextLine();
		//Review cube Paragraph 
		System.out.print("Hello guys " + name + " here going to bring you a review on the" + RubiksCube + 
				". This cube was made by " + CubeCompany + " I purchased this puzzle from the " + CubeBought +  
				" and you can get this puzzle from them for " + CubeCost + ". The "+ RubiksCube + " can cut " + CubeCut + " degrees forward, and " + 
				CubeRevCut + " degress backward. The cube feels " + CubeFeel + ". Over all the " + RubiksCube + " is a " +GJorBJ+ " I give this cube an " 
				+ CubeGrade + " Thank you guys, " + name +  " signing out. ");
		
	}
}
