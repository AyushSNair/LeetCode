class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        if(n == 1){
            return x;
        }
        

        long nn = n;
        if(nn < 0){
            nn = -1 * nn;
        }


        double ans = powerFunc(x, nn);

        if(n < 0){
            return 1/ans;
        }else{
            return ans;
        }
    }

    public double powerFunc(double x, long nn){
        double ans  = 1;
        while(nn > 0){
            if(nn % 2 == 1){
                ans = ans * x;
                nn = nn -1;
            }
            else{
                x = x * x;
                nn = nn / 2;
            }
        }
        return ans;

        

        
    }

    
}