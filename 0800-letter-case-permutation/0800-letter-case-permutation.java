class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> arr = new ArrayList<>();

        String ip = new String(s);
        String op = new String("");

        solve(arr, ip, op);

        return arr;
    }

    public List<String> solve(List<String> arr, String ip, String op){
        if(ip.length() == 0){
            arr.add(op);
            return arr;
        }

        char ch = ip.charAt(0); 
        String newIp = ip.substring(1);
        if(Character.isDigit(ch)){
            String op1 = op + ch;
            solve(arr, newIp, op1);
        }
        else{
            String op1 = op + Character.toLowerCase(ch);
            String op2 = op + Character.toUpperCase(ch); 
            solve(arr, newIp, op1);
            solve(arr, newIp, op2);
        }

        return arr;
    }


}