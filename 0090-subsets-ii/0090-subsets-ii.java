class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arrList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ip = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            ip.add(nums[i]);
        }
        ArrayList<Integer> op = new ArrayList<>();
        solve(arrList, ip,op);

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < arrList.size(); i++){
            if(result.contains(arrList.get(i))){
                continue;
            }

            result.add(arrList.get(i));
        }        

        return result;
    }

    public List<List<Integer>> solve(List<List<Integer>> arrList, ArrayList<Integer> ip,ArrayList<Integer> op){
        if(ip.size() == 0){
            
            arrList.add(op);
            return arrList;
        }

        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        op2.add(ip.get(0));
        ArrayList<Integer> newIp = new ArrayList<>(ip);
        newIp.remove(0);

        solve(arrList, newIp, op1);
        solve(arrList, newIp, op2);

        return arrList;
    }

}