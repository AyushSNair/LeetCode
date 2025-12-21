class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> ip = new ArrayList<>();
        Arrays.sort(candidates);

        for(int i = 0; i < candidates.length; i++){
            ip.add(candidates[i]);
        }

        ArrayList<Integer> op = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;

        solutionFunc(result, ip, op, sum, target);

        return result;

    }

    public void solutionFunc(List<List<Integer>> result, ArrayList<Integer> ip, ArrayList<Integer> op, int sum, int target){
        if(sum == target){
            
            result.add(new ArrayList<>(op));
            return;
        }

        if(sum > target || ip.size() == 0){
            return;
        }

        ArrayList<Integer> ip1 = new ArrayList<>(ip);
        
        ArrayList<Integer> ip2 = new ArrayList<>(ip);
        
        ArrayList<Integer> op1 = new ArrayList<>(op);
        
        ArrayList<Integer> op2 = new ArrayList<>(op);

        int sum1 = sum;
        int sum2 = sum;

        ip1.remove(0);
        while (ip1.size() > 0 && ip1.get(0).equals(ip.get(0))) {
            ip1.remove(0);
        }

        solutionFunc(result, ip1, op1, sum1, target);

        op2.add(ip2.get(0));
        ip2.remove(0);
        

        sum2 = sum2 + op2.get(op2.size() - 1);
        solutionFunc(result, ip2, op2, sum2, target);

    }
}