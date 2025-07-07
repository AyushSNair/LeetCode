class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        char[] arr1 = haystack.toCharArray();
        char[] arr2 = needle.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        int j = 0;

        if( n < m){
            return -1;
        }

        for(int i = 0; i <= n-m; i++){
            
            if(arr1[i] == arr2[j]){
                index = i;
                while(j < m){
                    if(i<n && j<m && arr1[i] != arr2[j]){
                        i = index ;
                        j=0;
                        break;
                    }
                    i++;
                    j++;
                }
                if(j == m){
                    return index;
                }
            }
        }
        if(j==m){
            return index;    
        }
        else{
            return -1;
        }
        
    }
}