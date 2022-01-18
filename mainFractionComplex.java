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
	    JLabel complex1      = addLabel ("Complex1", 6,2,1,1);
	    JLabel complex2      = addLabel ("Complex2", 6,5,1,1);
	    JTextField complex1a = addTextField("a", 7, 1, 1,0);
	    JTextField complex1b = addTextField("b", 7, 2, 1,1);
	    JLabel i1 = addLabel("i", 7, 3, 1, 1);
	    
	    JTextField complex2a = addTextField("c", 7, 4, 1,1);
	    JTextField complex2b = addTextField("d", 7, 5, 1,1);
	    JLabel i2 = addLabel("i", 7, 6, 1, 1);
	   
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
	    		
	    		if(!errorCheck(denom1.getNumber()) || !errorCheck(denom2.getNumber())) {
	    			messageBox("Error: 0 in denominator");
	    		} else {
	    			fraction frac1 = new fraction(num1.getNumber(),denom1.getNumber());
		    		fraction frac2 = new fraction(num2.getNumber(),denom2.getNumber());
		    		
		    		
		    		fraction frac3 = (fraction) frac1.add(frac2);
		    		frac3 = frac3.simplify();
		    		
		    		if(frac3.getNumerator()==0) {
		    			messageBox("0");
		    		}else if(frac3.getDenominator()==1) {
		    			messageBox("" + frac3.getNumerator());
		    		} else {
		    			messageBox(frac3, 300, 200);
		    		}
	    		}
	    		
	    		
	    		
	    		
	    		
	    	}
	    	if(buttonObj == subtractFrac) {
	    		if(!errorCheck(denom1.getNumber()) || !errorCheck(denom2.getNumber())) {
	    			messageBox("Error: 0 in denominator");
	    		} else {
	    			fraction frac1 = new fraction(num1.getNumber(),denom1.getNumber());
		    		fraction frac2 = new fraction(num2.getNumber(),denom2.getNumber());
		    		
		    		
		    		fraction frac3 = (fraction) frac1.subtract(frac2);
		    		frac3 = frac3.simplify();
		    		
		    		if(frac3.getNumerator()==0) {
		    			messageBox("0");
		    		}else if(frac3.getDenominator()==1) {
		    			messageBox("" + frac3.getNumerator());
		    		} else {
		    			messageBox(frac3, 300, 200);
		    		}
	    		}
	    		
	    		
	    		
	    		
	    	}
	    	
	    	if(buttonObj == multiplyFrac) {
	    		if(!errorCheck(denom1.getNumber()) || !errorCheck(denom2.getNumber())) {
	    			messageBox("Error: 0 in denominator");
	    		} else {
	    			fraction frac1 = new fraction(num1.getNumber(),denom1.getNumber());
		    		fraction frac2 = new fraction(num2.getNumber(),denom2.getNumber());
		    		
		    		
		    		fraction frac3 = (fraction) frac1.multiply(frac2);
		    		frac3 = frac3.simplify();
		    		
		    		if(frac3.getNumerator()==0) {
		    			messageBox("0");
		    		}else if(frac3.getDenominator()==1) {
		    			messageBox("" + frac3.getNumerator());
		    		} else {
		    			messageBox(frac3, 300, 200);
		    		}
		    		
	    		}
	    		
	    		
	    	}
	    	
	    	if(buttonObj == divideFrac) {
	    		if(!errorCheck(denom1.getNumber()) || !errorCheck(num2.getNumber())) {
	    			messageBox("Error: 0 in denominator");
	    			
	    		} else {
	    			fraction frac1 = new fraction(num1.getNumber(),denom1.getNumber());
		    		fraction frac2 = new fraction(num2.getNumber(),denom2.getNumber());
		    		
		    		
		    		fraction frac3 = (fraction) frac1.multiply(frac2);
		    		frac3 = frac3.simplify();
		    		
		    		if(frac3.getNumerator()==0) {
		    			messageBox("0");
		    		}else if(frac3.getDenominator()==1) {
		    			messageBox("" + frac3.getNumerator());
		    		} else {
		    			messageBox(frac3, 300, 200);
		    		}
		    		
	    		}
	    		
	    		
	    	}
	    	
	    	if(buttonObj == addComp) {
	    		
	    	}
	    	
	    	
	    	
	        
	        
	        
	     	        
	    }
	    
	   
	    public boolean errorCheck(int denominator) {
	    	if(denominator == 0) {
	    		return false;
	    	}
	    	return true;
	    }
	    


		public static void main(String[] args){
	    	
	        JFrame frm = new mainFractionComplex();
	        frm.setTitle ("Calculator");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
