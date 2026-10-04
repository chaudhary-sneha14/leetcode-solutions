class Solution {
    boolean solve(int i,int open,String s,int[][] dp){
        boolean isValid=false;

        if(i==s.length()) return open==0;
        if(dp[i][open]!=-1) return dp[i][open]==1;

        
            if(s.charAt(i)=='('){
                isValid|=solve(i+1,open+1,s,dp);
            }
            else if(s.charAt(i)=='*'){
                isValid |=solve(i+1,open+1,s,dp); //'('
                isValid |=solve(i+1,open,s,dp); //'empty'
                if(open>0) isValid |=solve(i+1,open-1,s,dp); //')'
            }
            else if(open>0){
                isValid |=solve(i+1,open-1,s,dp);
            
        }
        dp[i][open] = isValid ? 1 : 0;
        return isValid;
    }
    public boolean checkValidString(String s) {
        int dp[][]=new int[101][101]; //s limit=100
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                dp[i][j]=-1;
            }
        }
        return solve(0,0,s,dp);
    }
}