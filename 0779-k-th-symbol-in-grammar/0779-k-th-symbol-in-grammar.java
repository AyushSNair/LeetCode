class Solution {
    public int kthGrammar(int n, int k) {
        //base condition
        if(n == 1 && k == 1){
            return 0;
        }
        
        int mid =(int)(Math.pow(2,n-1)) / 2;
    
        if(k > mid){
            int r = kthGrammar(n-1, k - mid);
            if(r == 1){
                return 0;
            }
            return 1;
        }
        else{
            return kthGrammar(n-1, k);
            
        }
    }
}