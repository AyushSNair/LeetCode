class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ip = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            ip.add(nums[i]);
        }
        
        ArrayList<Integer> op = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        solutionFunc(result, ip, op );

        return result;
    }

    public void solutionFunc(List<List<Integer>> result, ArrayList<Integer> ip, ArrayList<Integer> op){
        if(ip.size() == 0){
            result.add(new ArrayList<>(op));
            return;
        }

        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        ArrayList<Integer> ip1 = new ArrayList<>(ip);
        ArrayList<Integer> ip2 = new ArrayList<>(ip);

        ip1.remove(0);
        while(ip1.size() > 0 && ip1.get(0).equals(ip.get(0))){
            ip1.remove(0);
        }
        solutionFunc(result, ip1, op1);

        op2.add(ip2.get(0));
        ip2.remove(0);
        solutionFunc(result, ip2, op2);

    }
}