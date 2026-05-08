class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> wrapList = new ArrayList<>();

        ArrayList<Integer> ip = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> op = new ArrayList<Integer>();

        

        solFunc(wrapList, ip, op, k, n);
        return wrapList;
    }

    public List<List<Integer>> solFunc(List<List<Integer>> wrapList, ArrayList<Integer> ip,ArrayList<Integer> op, int k, int n ){
        //base condition
        if(n == 0 && op.size() == k){
            wrapList.add(op);
            return wrapList;
        }

        if(n < 0){
            return wrapList;
        }

        if(op.size() == k && n != 0){
            return wrapList;
        }

        if(ip.size() == 0){
            return wrapList;
        }

        ArrayList<Integer> ip1 = new ArrayList<>(ip);
        ArrayList<Integer> op1 = new ArrayList<>(op);

        ip1.remove(0);

        solFunc(wrapList, ip1, op1, k, n);

        ArrayList<Integer> ip2 = new ArrayList<>(ip);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        op2.add(ip2.get(0));
        n = n - ip2.get(0);
        ip2.remove(0);

        solFunc(wrapList, ip2, op2, k, n);
        return wrapList;
    }
}