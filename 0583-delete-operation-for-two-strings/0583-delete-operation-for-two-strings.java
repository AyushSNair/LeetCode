class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        ArrayList<Character> arrList1 = new ArrayList<Character>();
        ArrayList<Character> arrList2 = new ArrayList<Character>();

        
        for(int i = 0; i < n; i++){
            arrList1.add(word1.charAt(i));
        }

        for(int i = 0; i < m; i++){
            arrList2.add(word2.charAt(i));
        }

        int [][] t = new int[n+1][m+1];

        for(int i = 0; i < n+1; i++){
            t[i][0] = 0;
        }
        
        for(int j = 0; j< m+1; j++){
            t[0][j] = 0;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(arrList1.get(i-1) != arrList2.get(j-1)){
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                else{
                    t[i][j] = 1 + t[i-1][j-1];
                }
            }
        }
        int lcs = t[n][m];

        int a = word1.length();
        int b = word2.length();

        return a+b - 2*lcs;
    }
}