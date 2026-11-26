class Solution {
    public boolean canAliceWin(int n) {
        int newN = n - 10;

        int[] arr = {9,8,7,6,5,4,3,2,1};

        if(newN < 0){
            return false;
        }

        int i = 0;

        while( i < arr.length){
            if(newN - arr[i] >= 0){
                newN = newN - arr[i];
                i++;
            }
            else if(newN - arr[i] < 0){
                if(arr[i] % 2 == 0){
                    return false;
                }
                else{
                    return true;
                }
            }
        }

        return true;
        
    }
}

