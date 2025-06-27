class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int k = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = 0; i<g.length; i++){
            for(int j =0; j<s.length; j++){
                if(s[j] >= g[i]){
                    s[j] = 0;
                    k++;
                    break;
                }
              
            }
        }
        return k;
    }
}