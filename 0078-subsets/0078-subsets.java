class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        ArrayList<Integer> ip = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            ip.add(nums[i]);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> op = new ArrayList<>();

        solutionFunc(result, op, ip, ip.size());

        return result;
    }
    
    public void solutionFunc(List<List<Integer>> result, ArrayList<Integer> op, ArrayList<Integer> ip, int n){
        if(ip.size() == 0){
            result.add(new ArrayList<>(op));
            return;
        }

        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        ArrayList<Integer> ip1 = new ArrayList<>(ip);
        ArrayList<Integer> ip2 = new ArrayList<>(ip);
        
        op2.add(ip.get(0));
        ip1.remove(0);
        ip2.remove(0);

        solutionFunc(result, op1, ip1, ip.size());
        solutionFunc(result, op2, ip2, ip.size());
    }
}