public class LazyNumberDetails {
	private int number; 
        private boolean isPrimeCached;
        private boolean isPrimeResult; 
    
        private boolean isPerfectCached;
        private boolean isPerfectResult; 
    
        private boolean isMagicCached;
        private boolean isMagicResult; 
	
	public LazyNumberDetails(int number) {
		this.number = number; 
                this.isPrimeCached = false;
                this.isPrimeResult = false;
        
                this.isPerfectCached = false;
                this.isPerfectResult = false;
        
                this.isMagicCached = false;
                this.isMagicResult = false;
	}
	
	public void updateNumber(int number) { 
		if (this.number != number) {
			this.number = number; 
	        this.isPrimeCached = false;
	        this.isPrimeResult = false;
	        
	        this.isPerfectCached = false;
	        this.isPerfectResult = false;
	        
	        this.isMagicCached = false;
	        this.isMagicResult = false;
		}
	}	
	
	public int getNumber() {
		return number;
	} 

	public boolean isPrime() {    
		if (!this.isPrimeCached) { 
			this.isPrimeCached = true;
			this.isPrimeResult = isPrimeChecked(this.number);
			System.out.println("!!intensiveComputation!! isPrimeChecked called"); 
			return this.isPrimeResult;
		} 

		System.out.println("**cached** -> saved result from prime alg");
		return this.isPrimeResult;
	}
	
	private boolean isPrimeChecked(int number) {
		if (number <= 1) {  
			return false;
		}
		
		for (int d = 2; d <= number / 2; d++) {
			if (number % d == 0) {  
				return false;
			}
		}
 
		return true; 
	} 
	
	public boolean isPerfect() {    
		if (!this.isPerfectCached) { 
			this.isPerfectCached = true;
			this.isPerfectResult = isPerfectChecked(this.number);
			System.out.println("!!intensiveComputation!! isPerfectChecked called");
			return this.isPerfectResult;
		} 

		System.out.println("**cached** -> saved result from perfect alg");
		return this.isPerfectResult;
	}
	
	private boolean isPerfectChecked(int number) {
		int sumDiv = 1;
		
		if (number <= 1) {
			return false;
		}
		
		for (int d = 2; d <= number / 2; d ++) {
			if (number % d == 0) {
				sumDiv += d;
			}
		}
		
		if (sumDiv != number) {
			return false;
		}
		
		return true;
	} 
	
	public boolean isMagic() {    
		if (!this.isMagicCached) { 
			this.isMagicCached = true;
			this.isMagicResult = isMagicChecked(this.number);
			System.out.println("!!intensiveComputation!! isMagicChecked called");
			return this.isMagicResult;
		} 
		
		System.out.println("**cached** -> saved result from magic alg");
		return this.isMagicResult;
	}
	 
	private static boolean isMagicChecked(int n) { 
		while ( n > 9) {
			n = sumDigits(n);
		}
		
		if (n == 3 || n == 7 || n == 9) {
			return true;
		}
		
		return false;
	}
	
	private static int sumDigits(int n) {
		int sumDigits = 0;
		 
		while (n > 0) { 
			sumDigits += n % 10;
			n /= 10;
		}   
		
		return sumDigits; 
	} 
}
