
public class fraction implements number {
	private int n;
	private int d;
	
	
	
	
	
	public fraction() {
		this.n=0;
		this.d=01;
	
	}
	
	public fraction(int n, int d) {
		if(d==0) {
			
			throw new ArithmeticException("Cannot have 0 in denominator");
		}
		
		this.n=n;
		this.d=d;
		
		
		
	}
	

	
	@Override
	public number add(number num) {
		
		fraction fract = (fraction) num;
		
		int denominator = d*fract.d;
		
		int numerator = n*fract.d + fract.n*d ;
		
		return new fraction(numerator, denominator);
	}

	@Override
	public number subtract(number num) {
fraction fract = (fraction) num;
		
		int denominator = d*fract.d;
		
		int numerator = n*fract.d - fract.n*d ;
		
		return new fraction(numerator, denominator);
	}

	@Override
	public number multiply(number num) {
		int numerator;
		int denominator;
		
		fraction fract = (fraction) num;
		
		numerator = n*fract.n;
		denominator = d*fract.d;
		
		return new fraction(numerator, denominator);
	}

	@Override
	public number divide(number num) {
		int numerator;
		int denominator;
		
		fraction fract = (fraction) num;
		
		numerator = n*fract.d;
		denominator = d*fract.n;
		
		return new fraction(numerator, denominator);
	}
	
	public fraction simplify() {
		int n1 = Math.abs(n);
		int d1 = Math.abs(d);
		int small  = Math.min(n1,d1);
		int gcf = 1;
		for(int i=small; i>0;i--) {
			if(n1%i == 0 && d1%i==0) {
				gcf = i;
				break;
			}
		}
		return new fraction(n/gcf,d/gcf);
	}
	
	public int getNumerator() {
		return n;
	}
	public int getDenominator() {
		return d;
	}
	
	@Override
	public String toString() {
		
		if(n<0 && d<0) {
			n=Math.abs(n);
			d=Math.abs(d);
		}
		
		if(n==0) {
			return "0";
			
		} else if(d==1) {
			return n + "";
			
		} else if(d ==- 1){
			return n*-1 + "";
			
		}else {
			

			return n + " / " + d;
		}
		
	}

}
