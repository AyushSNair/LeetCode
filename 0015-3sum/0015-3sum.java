import java.util.Scanner;
class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listOfList = new ArrayList<>();

        for(int i = 0; i< nums.length-1; i++){
            if(i > 0 && nums[i] == nums[i-1]){continue;}
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){

            
            int sum = nums[i] + nums[j] + nums[k];
            if(sum < 0){
                j++;
            }
            else if(sum > 0){
                k--;
            }
            else{
                List<Integer> eleList = new ArrayList<Integer>();
                eleList.add(nums[i]);
                eleList.add(nums[j]);
                eleList.add(nums[k]);
                Collections.sort(eleList);
                listOfList.add(eleList);
                j++;
                k--;
                while(j < k && nums[j] == nums[j-1]){j++;}
                while(j < k && nums[k] == nums[k+1]){k--;}
            }
            }
            
        }
        return listOfList;
    
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> bList = new ArrayList<>();
        bList = threeSum(nums);
        for(List<Integer> triplet : bList){
            System.out.print(triplet);
        }    
    }
}