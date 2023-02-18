package placement_code;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("");
        System.out.println("Enter the two numbers to perform operations ");
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Choose the operation you want to perform ");
        System.out.println("Choose 1 for ADDITION");
        System.out.println("Choose 2 for SUBTRACTION");
        System.out.println("Choose 3 for MULTIPLICATION");
        System.out.println("Choose 4 for DIVISION");
        System.out.println("Choose 5 for MODULUS");
        System.out.println("Choose 6 for EXIT");
        int sum = sc.nextInt();
		 
		 //switch
		 
		 switch(sum){
		 
		 case 1: 
			 sum = a+b;
			 System.out.println(sum);
		 break;
		 
		 case 2: 
			 sum = a-b;
			 System.out.println(sum);
		 break;
		 
		 case 3: 
			 sum = a*b;
			 System.out.println(sum);
		 break;
		 
		 case 4:
			 sum = a/b;
			 System.out.println(sum);
		 break;
		 
		 case 5:
			 sum = a%b;
			 System.out.println(sum);
		 break;
		 
		 default : System.out.println("EXIT....");
		 
		 }
	}

}
