
public class Main {

	public static void main(String[] args) {
		LazyNumberDetails lnd = new LazyNumberDetails(23);

		lnd.updateNumber(10);
		System.out.println();
		System.out.println("updateNumber: " + lnd.getNumber());
		System.out.println();

		System.out.println("-----------------------------------");
		
		lnd.updateNumber(17);
		System.out.println();
		System.out.println("updateNumber: " + lnd.getNumber());
		System.out.println();

		System.out.println("First call: " + lnd.isPrime() + "\n");
		System.out.println("Second call: " + lnd.isPrime() + "\n");
		System.out.println("Third call: " + lnd.isPrime() + "\n");

		System.out.println("-----------------------------------");

		lnd.updateNumber(28); 
		System.out.println("updateNumber: " + lnd.getNumber());
		System.out.println(); 
		
		System.out.println("First call: " + lnd.isPerfect() + "\n");   
		System.out.println("First call: " + lnd.isPrime() + "\n");       
		System.out.println("Second call: " + lnd.isPerfect() + "\n");    
		System.out.println("First call: " + lnd.isMagic() + "\n");      
		System.out.println("Second call: " + lnd.isPrime() + "\n");   

		System.out.println("-----------------------------------");
		
		lnd.updateNumber(10);
		System.out.println();
		System.out.println("updateNumber: " + lnd.getNumber());
		System.out.println();

		System.out.println("First call: " + lnd.isPrime() + "\n");
		System.out.println("Second call: " + lnd.isPrime() + "\n");
		System.out.println("Third call: " + lnd.isPrime() + "\n");

		System.out.println("-----------------------------------");
		
		lnd.updateNumber(17);
		System.out.println();
		System.out.println("updateNumber: " + lnd.getNumber());
		System.out.println();

		System.out.println("First call: " + lnd.isPrime() + "\n");
		System.out.println("Second call: " + lnd.isPrime() + "\n");
		System.out.println("Third call: " + lnd.isPrime() + "\n");

		System.out.println("-----------------------------------");
		
		lnd.updateNumber(17);
		System.out.println();
		System.out.println("updateNumber: " + lnd.getNumber());
		System.out.println();

		System.out.println("First call: " + lnd.isPrime() + "\n");
		System.out.println("Second call: " + lnd.isPrime() + "\n");
		System.out.println("Third call: " + lnd.isPrime() + "\n");
		
		System.out.println("-----------------------------------");
		
		lnd.updateNumber(12);
		System.out.println();
		System.out.println("updateNumber: " + lnd.getNumber());
		System.out.println(); 

		System.out.println("First call: " + lnd.isMagic() + "\n");
		System.out.println("First call: " + lnd.isPrime() + "\n"); 
		System.out.println("Second call: " + lnd.isPrime() + "\n");
		System.out.println("First call: " + lnd.isPerfect() + "\n");  
		System.out.println("Third call: " + lnd.isPrime() + "\n");
		System.out.println("Second call: " + lnd.isMagic() + "\n"); 
		System.out.println("Second call: " + lnd.isPerfect() + "\n");   
	}

}
