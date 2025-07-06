class Solution {
    public int calculate(char a){
        if(a == 'I'){
            return 1;
        }
        else if(a == 'V'){
            return 5;
        }
        else if(a == 'X'){
            return 10;
        }
        else if(a == 'L'){
            return 50;
        }
        else if(a == 'C'){
            return 100;
        }
        else if(a == 'D'){
            return 500;
        }
        else{
            return 1000;
        }
    }

    public int romanToInt(String s) {
        int var1 = 0;
        int var2 = 0;
        int ans = 0;
        int i = 0;
        char[] arr = s.toCharArray();
        for(i = 0; i<arr.length-1; i++){
            int val1 = calculate(arr[i]);
            int val2 = calculate(arr[i+1]);

            if(val1 < val2){
                ans = ans - val1;
            }
            else{
                ans = ans + val1;
            }
        }
        ans = ans + calculate(arr[i]);
        return ans;
    }

    public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int result = romanToInt(str);
        System.out.print(result);
    }
}