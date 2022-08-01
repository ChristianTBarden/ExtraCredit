import java.util.Scanner;

public class EnthalpyCalculator{
	
public static int brokenbonds;

public static int bondsformed;

	public static void main(String[] args) {
		
		System.out.print("##Enthalpy Calculator##"+"\n"+"|This program measures the Enthalpy of a chemical reaction and identifies whether it's endothermic of exothermic,"+"\n"+ "bonds are entered in Format ex: C-C , dashes represent number of bonds and elements are identified by their periodic table abreviated name.|"+"\n");
		
		
		System.out.print("\n"+"Enter Number of broken bonds:");
		
		 Scanner sc = new Scanner(System.in);
		  
		 int numOfBrokenBonds = sc.nextInt();
		 System.out.println("Enter broken bonds:");
		 
		 String x=sc.nextLine();
				 
	    	for(int i = 0;i < numOfBrokenBonds;i++){
			
			switch(sc.nextLine()) {
			case "N-Br":
				EnthalpyCalculator.brokenbonds += 243;
				break;
			case "H-F":
				EnthalpyCalculator.brokenbonds += 567;
				break;
			case "H-Cl":
				EnthalpyCalculator.brokenbonds += 431;
				break;
			case "H-H":
				EnthalpyCalculator.brokenbonds += 436;
				break;
			case "C-H":
				EnthalpyCalculator.brokenbonds += 413;
				break;
			case "C-C":
				EnthalpyCalculator.brokenbonds += 348;
				break;
			case "C-N":
				EnthalpyCalculator.brokenbonds += 293;
				break;
			case "C-O":
				EnthalpyCalculator.brokenbonds += 358;
				break;
			case "C-F":
				EnthalpyCalculator.brokenbonds += 485;
				break;
			case "C-Cl":
				EnthalpyCalculator.brokenbonds += 328;
				break;
			case "C-Br":
				EnthalpyCalculator.brokenbonds += 276;
				break;
			case "C-I":
				EnthalpyCalculator.brokenbonds += 240;
				break;
			case "C-S":
				EnthalpyCalculator.brokenbonds += 259;
				break;
			case "Si-H":
				EnthalpyCalculator.brokenbonds += 323;
				break;
			case "Si-Si":
				EnthalpyCalculator.brokenbonds += 226;
				break;
			case "Si-C":
				EnthalpyCalculator.brokenbonds += 301;
				break;
			case "Si-O":
				EnthalpyCalculator.brokenbonds += 368;
				break;
			case "N-H":
				EnthalpyCalculator.brokenbonds += 391;
				break;
			case "N-N":
				EnthalpyCalculator.brokenbonds += 163;
				break;
			case "N-O":
				EnthalpyCalculator.brokenbonds += 201;
				break;
			case "N-F":
				EnthalpyCalculator.brokenbonds += 272;
				break;
			case "N-Cl":
				EnthalpyCalculator.brokenbonds += 200;
				break;
			case "H-Br":
				EnthalpyCalculator.brokenbonds += 366;
				break;
			case "H-I":
				EnthalpyCalculator.brokenbonds += 299;
				break;
			case "O-H":
				EnthalpyCalculator.brokenbonds += 463;
				break;
			case "O-O":
				EnthalpyCalculator.brokenbonds += 146;
				break;
			case "O-F":
				EnthalpyCalculator.brokenbonds += 190;
				break;
			case "O-Cl":
				EnthalpyCalculator.brokenbonds += 203;
				break;
			case "O-I":
				EnthalpyCalculator.brokenbonds += 234;
				break;
			case "S-H":
				EnthalpyCalculator.brokenbonds += 339;
				break;
			case "S-F":
				EnthalpyCalculator.brokenbonds += 327;
				break;
			case "S-Cl":
				EnthalpyCalculator.brokenbonds += 253;
				break;
			case "S-Br":
				EnthalpyCalculator.brokenbonds += 218;
				break;
			case "S-S":
				EnthalpyCalculator.brokenbonds += 266;
				break;
			case "F-F":
				EnthalpyCalculator.brokenbonds += 155;
				break;
			case "Cl-F":
				EnthalpyCalculator.brokenbonds += 253;
				break;
			case "Cl-Cl":
				EnthalpyCalculator.brokenbonds += 242;
				break;
			case "Br-F":
				EnthalpyCalculator.brokenbonds += 237;
				break;
			case "Br-Cl":
				EnthalpyCalculator.brokenbonds += 218;
				break;
			case "Br-Br":
				EnthalpyCalculator.brokenbonds += 193;
				break;
			case "I-Cl":
				EnthalpyCalculator.brokenbonds += 208;
				break;
			case "I-Br":
				EnthalpyCalculator.brokenbonds += 175;
				break;
			case "I-I":
				EnthalpyCalculator.brokenbonds += 151;
				break;
			case "C--C":
				EnthalpyCalculator.brokenbonds += 614;
				break;
			case "C---C":
				EnthalpyCalculator.brokenbonds += 839;
				break;
			case "C--N":
				EnthalpyCalculator.brokenbonds += 615;
				break;
			case "C---N":
				EnthalpyCalculator.brokenbonds += 891;
				break;
			case "C--O":
				EnthalpyCalculator.brokenbonds += 799;
				break;
			case "C---O":
				EnthalpyCalculator.brokenbonds += 1072;
				break;
			case "N--N":
				EnthalpyCalculator.brokenbonds += 418;
				break;
			case "N---N":
				EnthalpyCalculator.brokenbonds += 941;
				break;
			case "O--O":
				EnthalpyCalculator.brokenbonds += 495;
				break;
			case "S--O":
				EnthalpyCalculator.brokenbonds += 523;
				break;
			case "S--S":
				EnthalpyCalculator.brokenbonds += 418;
				break;
				
				
				
				
				}}
	    	
	         System.out.print("Enter Number of formed bonds:");
	         
	    	 Scanner sv = new Scanner(System.in);
	    	
			 int numOfformedBonds = sc.nextInt();
			 
             System.out.println("Enter formed bonds:");
			 
					 
		    	for(int i = 0;i < numOfformedBonds;i++){
				
				switch(sv.nextLine()) {
				case "N-Br":
					EnthalpyCalculator.bondsformed += 243;
					break;
				case "H-F":
					EnthalpyCalculator.bondsformed += 567;
					break;
				case "H-Cl":
					EnthalpyCalculator.bondsformed += 431;
					break;
				case "H-H":
					EnthalpyCalculator.bondsformed += 436;
					break;
				case "C-H":
					EnthalpyCalculator.bondsformed += 413;
					break;
				case "C-C":
					EnthalpyCalculator.bondsformed += 348;
					break;
				case "C-N":
					EnthalpyCalculator.bondsformed += 293;
					break;
				case "C-O":
					EnthalpyCalculator.bondsformed += 358;
					break;
				case "C-F":
					EnthalpyCalculator.bondsformed += 485;
					break;
				case "C-Cl":
					EnthalpyCalculator.bondsformed += 328;
					break;
				case "C-Br":
					EnthalpyCalculator.bondsformed += 276;
					break;
				case "C-I":
					EnthalpyCalculator.bondsformed += 240;
					break;
				case "C-S":
					EnthalpyCalculator.bondsformed += 259;
					break;
				case "Si-H":
					EnthalpyCalculator.bondsformed += 323;
					break;
				case "Si-Si":
					EnthalpyCalculator.bondsformed += 226;
					break;
				case "Si-C":
					EnthalpyCalculator.bondsformed += 301;
					break;
				case "Si-O":
					EnthalpyCalculator.bondsformed += 368;
					break;
				case "N-H":
					EnthalpyCalculator.bondsformed += 391;
					break;
				case "N-N":
					EnthalpyCalculator.bondsformed += 163;
					break;
				case "N-O":
					EnthalpyCalculator.bondsformed += 201;
					break;
				case "N-F":
					EnthalpyCalculator.bondsformed += 272;
					break;
				case "N-Cl":
					EnthalpyCalculator.bondsformed += 200;
					break;
				case "H-Br":
					EnthalpyCalculator.bondsformed += 366;
					break;
				case "H-I":
					EnthalpyCalculator.bondsformed += 299;
					break;
				case "O-H":
					EnthalpyCalculator.bondsformed += 463;
					break;
				case "O-O":
					EnthalpyCalculator.bondsformed += 146;
					break;
				case "O-F":
					EnthalpyCalculator.bondsformed += 190;
					break;
				case "O-Cl":
					EnthalpyCalculator.bondsformed += 203;
					break;
				case "O-I":
					EnthalpyCalculator.bondsformed += 234;
					break;
				case "S-H":
					EnthalpyCalculator.bondsformed += 339;
					break;
				case "S-F":
					EnthalpyCalculator.bondsformed += 327;
					break;
				case "S-Cl":
					EnthalpyCalculator.bondsformed += 253;
					break;
				case "S-Br":
					EnthalpyCalculator.bondsformed += 218;
					break;
				case "S-S":
					EnthalpyCalculator.bondsformed += 266;
					break;
				case "F-F":
					EnthalpyCalculator.bondsformed += 155;
					break;
				case "Cl-F":
					EnthalpyCalculator.bondsformed += 253;
					break;
				case "Cl-Cl":
					EnthalpyCalculator.bondsformed += 242;
					break;
				case "Br-F":
					EnthalpyCalculator.bondsformed += 237;
					break;
				case "Br-Cl":
					EnthalpyCalculator.bondsformed += 218;
					break;
				case "Br-Br":
					EnthalpyCalculator.bondsformed += 193;
					break;
				case "I-Cl":
					EnthalpyCalculator.bondsformed += 208;
					break;
				case "I-Br":
					EnthalpyCalculator.bondsformed += 175;
					break;
				case "I-I":
					EnthalpyCalculator.bondsformed += 151;
					break;
				case "C--C":
					EnthalpyCalculator.bondsformed += 614;
					break;
				case "C---C":
					EnthalpyCalculator.bondsformed += 839;
					break;
				case "C--N":
					EnthalpyCalculator.bondsformed += 615;
					break;
				case "C---N":
					EnthalpyCalculator.bondsformed += 891;
					break;
				case "C--O":
					EnthalpyCalculator.bondsformed += 799;
					break;
				case "C---O":
					EnthalpyCalculator.bondsformed += 1072;
					break;
				case "N--N":
					EnthalpyCalculator.bondsformed += 418;
					break;
				case "N---N":
					EnthalpyCalculator.bondsformed += 941;
					break;
				case "O--O":
					EnthalpyCalculator.bondsformed += 495;
					break;
				case "S--O":
					EnthalpyCalculator.bondsformed += 523;
					break;
				case "S--S":
					EnthalpyCalculator.bondsformed += 418;
					break;
					}

		    	}
		 
		    	System.out.print("Broken Bond Enthalpy: " + brokenbonds + " kJ/mol" + "\n");	
		    	
		    	System.out.println("Formed Bond Enthalpy: " + bondsformed + " kJ/mol");	
		    	
		    	System.out.println("Enthalpy Of Chemical Reaction: " + (brokenbonds-bondsformed) + " kJ/mol");
		    	
	          int ChemEnthalpy =brokenbonds-bondsformed;
	
	          if (ChemEnthalpy<0){System.out.println("\n"+"This is an Exothermic reaction");}
	          
	          else if (ChemEnthalpy>0){System.out.println("\n"+"This is an Endothermic reaction");}
	          
	          else {System.out.println("\n"+"There's no reaction");}
	
	}}
				
			
		
		
		
		
	

