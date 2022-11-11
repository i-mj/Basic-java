class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        int i=0;
        while(i<m){
            dp[i][n-1]=1;
            i++;
        }
        int j=0;
        while(j<n){
            dp[m-1][j]=1;
            j++;
        }
        i=m-2;
        while(i>=0){
            for(j=n-2;j>=0;j--){
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
            i--;
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
		System.out.println(uniquePaths(3,7));
	}
}
