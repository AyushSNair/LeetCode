class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder str1 = new StringBuilder(text1);
        StringBuilder str2 = new StringBuilder(text2);

        int n = str1.length();
        int m = str2.length();

        ArrayList<Character> arrList1 = new ArrayList<>();
        ArrayList<Character> arrList2 = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arrList1.add(str1.charAt(i));
        }

        for(int j = 0; j < m; j++){
            arrList2.add(str2.charAt(j));
        }

        int[][] t = new int[n+1][m+1];

        for(int i = 0; i < n +1; i++){
            t[i][0] = 0; 
        }

        for(int j = 0 ; j < m + 1; j++){
            t[0][j] = 0;
        }

        for(int i = 1; i < n +1; i++){
            for(int j = 1; j < m+1; j++){
                if(arrList1.get(i-1) != arrList2.get(j-1)){
                    t[i][j] = Math.max( t[i-1][j] , t[i][j-1]);
                }
                else{
                    t[i][j] = 1 + t[i-1][j-1];
                }
            }
        }

        return t[n][m];
    }
}