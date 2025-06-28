class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                five = five + 1;
            }
            else if(bills[i] == 10){
                five = five - 1;
                ten = ten + 1;
                
                if(five < 0){
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(ten == 0){
                    if(five < 3){
                        return false;
                    }
                    else{
                        five = five - 3;
                    }
                }
                else{
                    if(five == 0){
                        return false;
                    }
                    else{
                        five = five - 1;
                        ten = ten - 1;
                    }
                }
            }   
        }
        return true;
    }
}