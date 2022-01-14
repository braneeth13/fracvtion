public class fraction implements number {
	private int n1;
	private int d1;
	
	private int n2;
	private int d2;
	
	
	
	public fraction() {
		this.n1=0;
		this.n2=0;
	}
	
	public fraction(int n1, int d1, int n2, int d2) {
		this.n1=n1;
		this.d1=d1;
		this.n2=n2;
		this.d2=d2;
	}
	
	
	static int gcd(int a, int b) 
	{ 
	    if (a == 0) 
	        return b; 
	    return gcd(b%a, a); 
	} 
	

	
	@Override
	public number add(number num) {
		return null;
	}

	@Override
	public number subtract(number num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public number multiply(number num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public number divide(number num) {
		// TODO Auto-generated method stub
		return null;
	}

}
