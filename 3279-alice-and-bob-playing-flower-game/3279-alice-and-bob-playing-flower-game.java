class Solution {
    public long flowerGame(int n, int m) {
        long evenOfN = 0;
        long oddOfN = 0;
        long evenOfM = 0;
        long oddOfM = 0;
        long result = 0;
        if(n % 2 == 1 && m % 2 == 0){
            evenOfN = (n-1) / 2;
            oddOfN = evenOfN + 1;
            evenOfM = m / 2;
            oddOfM = m / 2;
            result = (evenOfN * oddOfM) + (oddOfN * evenOfM);
            return result;
        }
        else if(n % 2 == 0 && m % 2 == 0){
            evenOfN = n / 2;
            oddOfN = n / 2;
            evenOfM = m / 2;
            oddOfM = m / 2;
            result = (evenOfN * oddOfM) + (oddOfN * evenOfM);
            return result;
        }
        else if(n % 2 == 0 && m % 2 == 1){
            evenOfN = n / 2;
            oddOfN = n /2;
            evenOfM = (m-1) / 2;
            oddOfM = evenOfM + 1;
            result = (evenOfN * oddOfM) + (oddOfN * evenOfM);
            return result;
        }
        else{
            evenOfN = (n-1) / 2;
            oddOfN = evenOfN + 1;
            evenOfM = (m-1) / 2;
            oddOfM = evenOfM + 1;
            result = (evenOfN * oddOfM) + (oddOfN * evenOfM);
            return result;
        }
        
    }
}