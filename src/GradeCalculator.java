import java.util.Arrays;

import javax.swing.JOptionPane;

public class GradeCalculator {

	public GradeCalculator() {
	}

	public static void main(String[] args) {
		String NumberGrades = JOptionPane.showInputDialog(" How many grades would you like to input? "); 
		double size = Double.parseDouble(NumberGrades); 
		
		double [] grades = new double [(int) size]; 
		for (int i = 0; i < grades.length; i++) {
			//enter grades into loop
			String ask = JOptionPane.showInputDialog(" Please enter a grade" ); 
			double input = Double.parseDouble(ask);
			
			grades [i] = input; 
			
			//average
			int sum = 0;
		    double average;

			for(int i1=0; i1 < grades.length; i1++){
		        sum = (int) (sum + grades[i1]);
		    }
		    average = (double)sum/grades.length;
		    int finalaverage = (int) average; 
		    System.out.println(" Average value of array element is " + average); 
		   
		    if (finalaverage >90 && finalaverage <100) {
		    	System.out.println(" You got an A! ");
		    }
		    if (finalaverage >80 && finalaverage <90) {
		    	System.out.println(" You got an B ");
		    }
		    if (finalaverage >70 && finalaverage <80) {
		    	System.out.println(" You got an C ");
		    }
		    if (finalaverage >60 && finalaverage <70) {
		    	System.out.println(" You got an D ");
		    }
		    if (finalaverage <=50) {
		    	System.out.println(" I'm sorry you failed ");
		    }
		}
		
		} 
	
	}


