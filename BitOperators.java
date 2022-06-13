package Basic;

public class BitOperators {

	public static void main(String[] args) {
		// &, |, ~, ^, >>, << 
		int a = 5, b = 3;
		System.out.println("A : "+a+", B : "+b);
		
		// a & b => 10 & 4 => 1010 & 0100 => 0000
		System.out.println("A & B : "+(a&b));
		
		// a | b => 10 | 4 => 1010 | 0100 => 1110 => 14
		System.out.println("A | B : "+(a|b));
		
		// ~a  => ~10  => -11
		System.out.println("~A : "+(~a));
		
		// a ^ b => 10 ^ 4 => 1010 ^ 0100 => 1110 => 14
		System.out.println("A ^ B : "+(a^b));
				
	}

}
