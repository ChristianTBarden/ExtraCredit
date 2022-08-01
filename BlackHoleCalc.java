import java.util.Scanner;

public class BlackHoleCalc {
	
	public static void main(String[] args) {
		
		System.out.print("##Object Black Hole Calculator##");
		
	    System.out.println("\n" + "|This program displays the radius that an object must be compressed to," + "\n" + "in order to create a black hole and gives its mass in kilograms and gives a reference to scale created black hole|");
	 
	    System.out.println("All you need to do is enter the object's name and weight(in pounds) as instructed" + "\n");
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Object Name:");
		
		String obj_Name = sc.nextLine();
		
		System.out.print("\n" + "Object Weight(In Pounds):");
		
		double Objweight_InPounds = sc.nextDouble();
		//1
		Double ObjNewtonConvert = (Objweight_InPounds/.225);
		//2
		Double ObjMassKg = (ObjNewtonConvert/9.8);
		//3 I've Utilized the ScwarzchildRadius formula for accuracy. It's straight out a physics textbook;
		Double ScwarzchildRadiusOfObjBlckHole = (2*(6.67 * Math.pow(10, -8))*(ObjMassKg))/Math.pow(2.9*Math.pow(10, 8),2);
		       
		System.out.print("\n" + "Mass of Object: " + ObjMassKg + " kg" + "\n");
		
		System.out.print("\n" + "Object's Schwarzschild radius: " + ScwarzchildRadiusOfObjBlckHole + " mm " + "\n");
		
		System.out.print("\n" + "Mass of " + obj_Name + " must be compressed to a radius less than " + ScwarzchildRadiusOfObjBlckHole + " millimeters "+"\n"+"in order to create a blackhole."+"\n");
				
		
		if(ScwarzchildRadiusOfObjBlckHole < 1E-11){System.out.println("\n"+"Black Hole Scale: Smaller Than A proton's Radius."); }
	    
		else if(ScwarzchildRadiusOfObjBlckHole < 5.3E-8){ System.out.println("\n"+"Black Hole Scale: Smaller Than A Hydrogen Atom's Radius.");}
		
		else if(ScwarzchildRadiusOfObjBlckHole < .0009){System.out.println("\n"+"Black Hole Scale: Smaller than Coronavirus Radius."); }
		
		else if(ScwarzchildRadiusOfObjBlckHole < .0075){System.out.println("\n"+"Black Hole Scale: Smaller than A Human Red Blood Cell Radius."); }
		
		else if(ScwarzchildRadiusOfObjBlckHole < 6.35 ){System.out.println("\n"+"Black Hole Scale: Smailler Than A Single Skittle Candy Radius."); }
		
		else if(ScwarzchildRadiusOfObjBlckHole < 24.26){System.out.println("\n"+"Black Hole Scale: Smaller Than A U.S. Quater's Radius."+ "."); }
		
		else if(ScwarzchildRadiusOfObjBlckHole < 203.3){System.out.println("\n"+"Black Hole Scale: Smaller Than A Golf Ball's Radius."+ "."); }
		
		else{System.out.println("\n"+"Black Hole Scale: Larger Than A Golf Ball.");}

	}
}


