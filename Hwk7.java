package test;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hwk7 {
	public static void main(String[] args) {
		// basic variables male and females, strings variable will be used for
		// dialog and then parsed to integer
		// using JOptionPane to capture (i/o the variables from the user
		int males, females;
		String strMales, strFemales;
		int totalButterflies, sexRatio, ratioVariance;
		Scanner stdin = new Scanner(System.in);
		strMales = JOptionPane.showInputDialog(null, "Enter the estimated male population: ");
		males = Integer.parseInt(strMales);

		strFemales = JOptionPane.showInputDialog(null, "Enter the estimated females population: ");
		females = Integer.parseInt(strFemales);

		String result = new String(); // variable to gather all info and project
										// on a dialog

		// Create a DecimalFormat object. There must be a way to create only one
		// object and reuse it...
		DecimalFormat formatter3 = new DecimalFormat("#0.000");
		DecimalFormat formatter1 = new DecimalFormat("#0.0");
		DecimalFormat formatter0 = new DecimalFormat("#0");

		// now that we have the integer we can get to work
		totalButterflies = males + females;
		sexRatio = males / females;
		ratioVariance = males % females;
		double ratioFactor;

		// Capture all data in a String that will be displayed, used new line
		// for a better view
		result = "\nTotal Butterflies: " + totalButterflies + "\n";
		result = result + "Sex Ratio         " + sexRatio + "\n";
		result = result + "Variance          " + ratioVariance + "\n";
		result = result + "Gender Difference " + (males - females) + "\n";
		result = result + "Mating Pairs      " + (males * females) + "\n";
		result = result + "Growth Factor     " + formatter3.format(Math.sqrt(males * females)) + "\n";

		// pass the calculation to ratioFactor since we will need it for
		// Potential Population calc
		if (sexRatio != 0) {
			ratioFactor = (int)((Math.sqrt(males * females)) / sexRatio); // Math.sqrt	returns a double		 
			result = result + "Ratio Factor     " + formatter1.format(ratioFactor) + "\n";
		} else {
			ratioFactor = (int)Math.sqrt(ratioVariance);			 
			result = result + "Ratio Factor     " + formatter1.format(ratioFactor) + "\n";
		}

		result = result + "Potential Population     " + formatter0.format(Math.pow(2, ratioFactor)) + "\n";

		// now that we have all the data we can finally pass it on dialog...
		JOptionPane.showMessageDialog(null, "The result is " + result);
	}

}
