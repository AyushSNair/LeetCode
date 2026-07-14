class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int low_digit = Integer.toString(low).length();
        int high_digit = Integer.toString(high).length();
        List<Integer> arrList = new ArrayList<>();

        for(int i = low_digit; i <= high_digit; i++){
            for(int start = 1; start <= 9; start++){
                int num = start;
                int prev = start;

                int digit = i;

                while(digit != 1 && start + digit <= 10){
                    num = num * 10;
                    num = num + (prev + 1);
                    prev = prev + 1;
                    digit--;
                }
                if(num >= low && num <= high){
                    arrList.add(num);
                }
                
            }
        }
        return arrList;
    }
}