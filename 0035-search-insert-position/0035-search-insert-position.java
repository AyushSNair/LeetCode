class Solution {
    public int searchInsert(int[] arr, int m) {
       int low = 0;
        int n = arr.length - 1;
        int high = n ;
        int mid = 0;

        if(arr.length == 0){
            return 0;
        }
        while(low<=high){
            mid = (low + high)/2;

            if(arr[mid]< m){
                low = mid + 1;
            }
            else if(arr[mid] > m){
                high = mid - 1;
            }
            else if(arr[mid] == m){
                return mid;
            }
        }
        if(low > high){
            if(arr[mid] < m){
                return mid +1;
            } 
            else if(arr[mid]<m){
                return mid -1;
            }
        }
        return mid; 
    }
}