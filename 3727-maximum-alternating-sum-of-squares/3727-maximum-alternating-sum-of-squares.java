class Solution {
    public long maxAlternatingSum(int[] nums) {
        ArrayList<Integer> smallList = new ArrayList<>();
        ArrayList<Integer> bigList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                nums[i] = -1 * nums[i];
            }
        }

        Arrays.sort(nums);

        int j = nums.length-1;
        int i = 0;
        while(i <= j){
            if(i == j){
                bigList.add(nums[i]);
                break;
            }
            smallList.add(nums[i]);
            bigList.add(nums[j]);
            i++;
            j--;
        }

        long sum = 0;
        for(int k = 0; k < bigList.size(); k++){
            sum += bigList.get(k) * bigList.get(k);
        }

        for(int k = 0; k < smallList.size(); k++){
            sum -= smallList.get(k) * smallList.get(k);
        }


        return sum;
    }
}