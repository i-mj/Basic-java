// reverse string using Recursion
// fact using recur and dp

public class Main
{
	// Method to Reverse Given String Using Recursion
	public static String revstr(String s){
	    if(s.isEmpty()){
	        return s;     
        }else{
            return revstr(s.substring(1))+s.charAt(0);
        }
	}
	
	// Method to Return Factorial of a Given Number Using Recursion
	public static int fact(int n){
	    if(n==1){
	        return n;
	    }
	    return n*fact(n-1);
	}
	
	// Method to Return Factorial of a Given Number Using Dynamic Programming ( DP )
	public static int factdp(int n){
	    int [] dp=new int[n+1];
	    dp[0]=1;
	    for(int i=1;i<=n;i++){
	        dp[i]=i*dp[i-1];
	    }
	    return dp[n];
	    
	}
	
	// Main to Call Methods
	public static void main(String[] args) {
		// Given String
		String s="NewtonSchool";
		
		// Calling Reverse String Method
		System.out.println(revstr(s));
		
		// Calling Factorial Method Using Recursion
		System.out.println(fact(6));
		
		// Calling Factorial Method Using Dynamic Programming
		System.out.println(factdp(6));
	}
}
