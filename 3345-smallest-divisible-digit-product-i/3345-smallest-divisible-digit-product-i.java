class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i = n; i <= 100; i++){
            if(i <= 9){
                if( i % t == 0){
                    return i;
                }
            }
            else if(i >= 10 && i <=99){
                int firstDigit = i / 10;
                int secondDigit = i % 10;
                int mult = firstDigit * secondDigit;
                if( mult % t == 0){
                    return i;
                } 
            }
            else{
                int mult = 0;
                if( mult % t == 0){
                    return i;
                }
            }
        }

        return n;
    }
}