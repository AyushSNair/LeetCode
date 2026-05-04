class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> wrapList = new ArrayList<>();
        
        ArrayList<Integer> ip = new ArrayList<Integer>();
        ArrayList<Integer> op = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            ip.add(nums[i]);
        }
        
        solFunc(wrapList, ip, op);
        return wrapList;
    }

    public List<List<Integer>> solFunc(List<List<Integer>> wrapList, ArrayList<Integer> ip, ArrayList<Integer> op){
        //base condition
        if(ip.size() == 0){
            wrapList.add(op);
            return wrapList;
        }

        ArrayList<Integer> ip1 = new ArrayList<Integer>(ip);
        ArrayList<Integer> op1 = new ArrayList<Integer>(op);
        ip1.remove(0);
        solFunc(wrapList, ip1, op1);
        
        ArrayList<Integer> ip2 = new ArrayList<Integer>(ip);
        ArrayList<Integer> op2 = new ArrayList<Integer>(op);
        op2.add(ip2.get(0));
        ip2.remove(0);
        solFunc(wrapList, ip2, op2);

        return wrapList;
    }
}