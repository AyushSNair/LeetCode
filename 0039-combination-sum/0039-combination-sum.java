class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ip = new ArrayList<>();
        for(int i = 0 ; i < candidates.length; i++){
            ip.add(candidates[i]);
        }

        ArrayList<Integer> op = new ArrayList<>();
        solve(result, ip, op, target);

        return result;
    }

    public List<List<Integer>> solve(List<List<Integer>> result, ArrayList<Integer> ip, ArrayList<Integer> op, int target){
        int target1 = target;
        int target2 = target;
        // Base condition
        if(target1 == 0 || target2 == 0){
            result.add(new ArrayList<>(op));
            return result;
        }
        if(target1 < 0 || ip.isEmpty()){
            return result;
        }

        ArrayList<Integer> op1 = new ArrayList<>(op);
        op1.add(ip.get(0));
        solve(result, ip, op1, target - ip.get(0));


        ArrayList<Integer> newIp = new ArrayList<>(ip);
        newIp.remove(0);
        solve(result, newIp, op, target);

        return result;
    }
}