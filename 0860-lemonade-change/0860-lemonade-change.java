class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        int count20 = 0;

        boolean flag = true;

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                count5++;
            }

            if(bills[i] == 10){
                count10++;
                if(count5 > 0){
                    count5--;
                }
                else{
                    flag = false;
                }
            }

            if(bills[i] == 20){
                if(count10 > 0 && count5 > 0){
                    count20++;
                    count10--;
                    count5--;
                }
                else if(count5 >= 3){
                    count20++;
                    count5 = count5 - 3;
                }
                else{
                    flag = false;
                }
                
            }

            if(flag == false){
                break;
            }
        }

        return flag;
    }
}