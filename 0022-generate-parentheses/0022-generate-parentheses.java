class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> listString = new ArrayList<>();

        int open = n;
        int close = n;
        String op = "";

        solve(open,close,op,listString);
        return listString;
    }

    public List<String> solve(int open, int close, String op, List<String> listString){
        if(open == 0 && close == 0){
            listString.add(op);
            return listString;
        }

        if(open != 0){
            String op1 = op;
            op1 = op1 + "(";
            solve(open-1,close, op1, listString);
        }

        if(close > open){
            String op2 = op;
            op2 = op2 + ")";
            solve(open, close-1, op2, listString);
        }

        return listString;
    }
}