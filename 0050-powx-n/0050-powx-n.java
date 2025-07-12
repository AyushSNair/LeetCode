class Solution {
    public static double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;

        if(n < 0){
            nn = (-1) * nn;
        }
        while(nn > 0){
            if(nn % 2 == 0){
                x = x*x;
                nn = nn/2;
            }
            else{
                ans = ans * x;
                nn = nn -1;
            }

        }

        if(n < 0){
            ans = 1/ans;
        }
        return ans;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double x =sc.nextInt();
        int n = sc.nextInt();

        System.out.print(myPow(x,n));
    }
}