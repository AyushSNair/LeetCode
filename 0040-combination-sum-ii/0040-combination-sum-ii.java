class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ip = new ArrayList<>();
        for(int i = 0; i < candidates.length; i++){
            ip.add(candidates[i]);
        }

        ArrayList<Integer> op = new ArrayList<>();
        solve(ip, op, target, result);
        return result;
    }

    public List<List<Integer>> solve(ArrayList<Integer> ip, ArrayList<Integer> op, int target, List<List<Integer>> result){
        if(target == 0){
            if(result.contains(new ArrayList<>(op))){
                return result;
            }
            result.add(new ArrayList<>(op));
            return result;
        }

        if(target < 0 || ip.size() == 0){
            return result;
        }

        for (int i = 0; i < ip.size(); i++) {
            if (i > 0 && ip.get(i).equals(ip.get(i - 1))) continue; // Skip duplicates

            int current = ip.get(i);
            if (current > target) break;

            ArrayList<Integer> newOp = new ArrayList<>(op);
            newOp.add(current);

            // create a new list excluding the current element and everything before it
            ArrayList<Integer> newIp = new ArrayList<>(ip.subList(i + 1, ip.size()));

            solve(newIp, newOp, target - current, result);
        }

        return result;
    }
}