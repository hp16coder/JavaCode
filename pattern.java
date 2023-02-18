package placement_code;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upper half...
		int n = 4;
		//1st Part 
		for(int i=1; i<=n; i++){
	
		for(int j=1; j<=i; j++){
			System.out.print("*");
		}
		
		//Spaces 
		int Sp = 2*(n-i);
		for(int j=1; j<=Sp; j++){
			System.out.print(" ");
		}
		
		//2nd Part 
		for(int j=1; j<=i; j++){
			System.out.print("*");
		}
		
		System.out.println();
	}
		
		// lower part...
		
		for(int i=n; i>=1; i--){
			
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			
			//Spaces 
			int Sp = 2*(n-i);
			for(int j=1; j<=Sp; j++){
				System.out.print(" ");
			}
			
			//2nd Part 
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
