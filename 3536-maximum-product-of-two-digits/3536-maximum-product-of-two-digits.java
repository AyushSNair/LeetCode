class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int m = s.length();
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
            arr[i] = s.charAt(i) - '0';
        }

        Arrays.sort(arr);

        int result = arr[arr.length-1] * arr[arr.length-2];
        return result;
    }
}