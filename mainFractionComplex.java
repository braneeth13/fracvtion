 import javax.swing.*;
import BreezySwing.*;


public class mainFractionComplex extends GBFrame{
	
		//JTextArea outputArea  = addTextArea ("", 4,4,2,5);
		
	//fractions input
	    JLabel Fraction1      = addLabel ("Frac1", 1,1,1,1);
	    IntegerField num1 = addIntegerField(0, 2, 1, 1,1);
	    IntegerField denom1 = addIntegerField(0, 3, 1, 1,1);
	    
	    JLabel Fraction2      = addLabel ("Frac2", 1,5,1,1);
	    IntegerField num2 = addIntegerField(0, 2, 5, 1,1);
	    IntegerField denom2 = addIntegerField(0, 3, 5, 1,1);
	   
	//complex numbers input
	    JLabel numerator1label      = addLabel ("Operations w/ fractions", 6,1,1,1);
	    JTextField complex1 = addTextField("Complex 1", 7, 1, 1,1);
	    JTextField complex2 = addTextField("Complex 2", 9, 1, 1,1);
	   
	//Buttons
	    JButton addFrac = addButton("Add", 5, 1, 1, 1);
	    JButton subtractFrac = addButton("Subtract", 5, 3, 1, 1);
	    JButton multiplyFrac = addButton("Multiply", 5, 5, 1, 1);
	    JButton divideFrac = addButton("Divide", 5, 7, 1, 1);
	  
	    JButton addComp = addButton("Add", 10, 1, 1, 1);
	    JButton subtractComp = addButton("Subtract", 10, 3, 1, 1);
	    JButton multiplyComp = addButton("Multiply", 10, 5, 1, 1);
	    JButton divideComp = addButton("Divide", 10, 7, 1, 1);
	    	    
	    public void buttonClicked(JButton buttonObj){
	    	if(buttonObj == addFrac) {
	    		fraction frac = new fraction(num1.getNumber(), num2.getNumber());
	    		
	    		
	    		
	    	}
	    	
	    	
	    	
	        
	        
	        
	     	        
	    }
	    
	   

	    public static void main(String[] args){
	    	
	        JFrame frm = new mainFractionComplex();
	        frm.setTitle ("Calculator");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
