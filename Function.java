
package placement_code;
import java.util.*;

public class Function {
	
	//public static void printMyName(String name){
	
		//System.out.println(name);
		//return;
	//}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		//String name = sc.next();
		
		//printMyName(name);
	
	public static void printFactorial(int n){
		int factorial = 1;
		//loop 
		if(n<0){
			System.out.println("Invailid Number");
			return;
		}
		for(int i=n; i>=1; i--){
			factorial = factorial * i;
			}
		System.out.println(factorial);
		return;
	}
		public static void main(String agrs[]){
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			printFactorial(n);
			
		
		}
	
		
}
