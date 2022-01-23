public class complexNumber implements number {
	double a;
	double b;
	
	public complexNumber() {
		this.a=0;
		this.b=01;
	
	}
	
	public complexNumber(double a, double b) {
		this.a=a;
		this.b=b;
		
	}
	
	
	
	@Override
	public number add(number num) {
		complexNumber comp = (complexNumber) num;
		
		double real = a+comp.a;
		double imag = b+comp.b;
		
		return new complexNumber(real, imag);
			
	}

	@Override
	public number subtract(number num) {
		complexNumber comp = (complexNumber) num;
		
		double real = a-comp.a;
		double imag = b-comp.b;
		
		return new complexNumber(real, imag);
	}

	@Override
	public number multiply(number num) {
complexNumber comp = (complexNumber) num;
		
		double real = (a*comp.a) - (b*comp.b);
		double imag = (a*comp.b) + (b*comp.a);
		
		return new complexNumber(real, imag);
	}

	@Override
	public number divide(number num) {
		complexNumber comp = (complexNumber) num;
		
		double real = ((a*comp.a) + (b*comp.b)) / ((comp.a*comp.a) + (comp.b*comp.b));
		double imag = ((b*comp.a)-(a*comp.b)) / ((comp.a*comp.a) + (comp.b*comp.b));
		
		return new complexNumber(real, imag);
	}
	
	public String toString() {
		if(a==0 && b==0) {
			return 0 +"";
		}
		else if(a==0) {
			return b+ "i";
		} 
		
		else if(b==0) {
			return a+"";
		}
		
		else if(b>0) { 
			return a + " + " + b +"i";
		} 
		
		else if(b<0) {
			return a + " - " + -b +"i";
		}
		
		return a + " " + b +"i";
		
	}

}
