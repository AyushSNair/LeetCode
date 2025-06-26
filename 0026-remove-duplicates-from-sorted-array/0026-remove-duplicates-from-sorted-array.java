class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hset = new HashSet<Integer>();
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            hset.add(nums[i]);
        }

        Integer[] arr = hset.toArray(new Integer[0]); //convert to array;
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++){
            nums[i] = arr[i];
            k++;
        }
        return k;
    }
}