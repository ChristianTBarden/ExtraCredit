import java.util.Scanner;

public class BlackHoleCalc {
	
	public static void main(String[] args) {
		
		System.out.print("##Object Black Hole Calculator##");
		
	    System.out.println("\n" + "|This program displays the voulume that an earth bound object must be compressed to," + "\n" + "in order to create a black hole and gives its mass in kilograms and gives a reference to scale created black hole|");
	 
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
		//3
		Double volumeOfObjBlckHole = ObjMassKg/(2 * Math.pow(10, 19));
		       
		System.out.print("\n" + "Mass of Object: " + ObjMassKg + " kg" + "\n");
		
		System.out.print("\n" + "Mass of " + obj_Name + " must be compressed to " + volumeOfObjBlckHole + " cubic meters"+"\n"+" in order to create a blackhole."+"\n");
		
		if(volumeOfObjBlckHole < 1.1E-28){ System.out.println("\n"+"Black Hole Scale: Smaller Than A Francium Atom.");}
		
		else if(volumeOfObjBlckHole < 3.14E-22){System.out.println("\n"+"Black Hole Scale: Smaller than Coronavirus."); }
		
		else if(volumeOfObjBlckHole < 4.5E-16){System.out.println("\n"+"Black Hole Scale: Smaller than A Human Red Blood Cell."); }
		
		else if(volumeOfObjBlckHole < 3.4E-7){System.out.println("\n"+"Black Hole Scale: Smailler Than A Single Skittle Candy."); }
		
		else if(volumeOfObjBlckHole < 4.1E-5){System.out.println("\n"+"Black Hole Scale: Smaller Than A Golf Ball."); }
		
		else{System.out.println("\n"+"Black Hole Scale: Larger Than A Golf Ball.");}

	}
}


