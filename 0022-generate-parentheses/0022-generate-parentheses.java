class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        StringBuilder op = new StringBuilder();
        int open = n;
        int close = n;
        

        solutionFunc(result, op, open, close);

        return result;
    }

    public void solutionFunc(List<String> result, StringBuilder op, int open, int close){
        if(open == 0 && close == 0){
            result.add(op.toString());
            return;
        }

        if(open > 0){
            op.append('(');
            solutionFunc(result, op, open - 1, close);

            if(op.charAt(op.length() - 1) == '('){
                op.deleteCharAt(op.length() - 1);
            }
            else{
                op.deleteCharAt(op.length() - 1);
            }

        }

        if(open < close){
            op.append(')');
            solutionFunc(result,op,open, close - 1);

            if(op.charAt(op.length() - 1) == ')'){
                op.deleteCharAt(op.length() - 1);
            }
            else{
                op.deleteCharAt(op.length() - 1);
            }

        }

        
    }
}