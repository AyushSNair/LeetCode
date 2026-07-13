class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";
        
        int n = digits.length();
        
        // Length of numbers to generate
        for (int len = 1; len <= 9; len++) {
            for (int i = 0; i + len <= n; i++) {
                int num = Integer.parseInt(digits.substring(i, i + len));
                
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        
        Collections.sort(result);
        return result;
    }
}