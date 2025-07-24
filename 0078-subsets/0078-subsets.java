class Solution {

    public List<List<Integer>> solve(ArrayList<Integer> ip, ArrayList<Integer> op, List<List<Integer>> arrList){
        if(ip.size() == 0){
            arrList.add(new ArrayList<>(op));
            return arrList;
        }

        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);
    

        op2.add(ip.get(0));
        ArrayList<Integer> newIp = new ArrayList<>(ip);
        newIp.remove(0);

        solve(newIp,op1,arrList);
        solve(newIp,op2,arrList);

        return arrList;
    }

    public List<List<Integer>> subsets(int[] nums) {
        

        List<List<Integer>> arrList = new ArrayList<>();
        if(nums.length == 0){
            return arrList;
        }
        

        ArrayList<Integer> ip = new ArrayList<>();
        for (int num : nums) {
            ip.add(num);
        }
        ArrayList<Integer> op = new ArrayList<>();

        solve(ip,op,arrList);
        return arrList;
    }
}