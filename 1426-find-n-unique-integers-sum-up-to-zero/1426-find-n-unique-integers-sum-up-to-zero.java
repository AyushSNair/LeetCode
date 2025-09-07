class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int count = 1;
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            result[i]  = count;
            sum += count;
            count++;
            
        }

        int counter = -(sum);
        result[n-1] = counter;
        
        return result;
    }
}