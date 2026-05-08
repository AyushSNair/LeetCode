class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> wrapList = new ArrayList<>();

        ArrayList<Integer> ip = new ArrayList<Integer>();
        ArrayList<Integer> op = new ArrayList<Integer>();

        for(int i = 0; i < candidates.length; i++){
            ip.add(candidates[i]);
        }

        solFunc(wrapList, ip, op, target);

        return wrapList;
    }

    public List<List<Integer>> solFunc(List<List<Integer>> wrapList, ArrayList<Integer> ip, ArrayList<Integer> op, int target){
        //base condition
        //accceptance
        if(target == 0){
            wrapList.add(op);
            return wrapList;
        }

        //rejection
        if(target < 0 || ip.size() == 0){
            return wrapList;
        }

        ArrayList<Integer> ip1 = new ArrayList<>(ip);
        ArrayList<Integer> op1 = new ArrayList<>(op);

        ip1.remove(0);

        solFunc(wrapList, ip1, op1, target);

        ArrayList<Integer> ip2 = new ArrayList<>(ip);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        op2.add(ip2.get(0));
        target = target - ip2.get(0);

        solFunc(wrapList, ip2, op2, target);

        return wrapList;
    }
}