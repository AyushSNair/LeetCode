import java.util.*;
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal = 0;
        double dlength = 0;
        int area = 0;
        int arect = 0;
        
        for(int i = 0; i < dimensions.length; i++){
            int side1 = dimensions[i][0];
            int side2 = dimensions[i][1];

            dlength = Math.sqrt(((side1 * side1) + (side2 * side2)));
            arect = side1 * side2;
            
            if(dlength > diagonal){
                diagonal = dlength;
                area = arect;
            }
            else if(dlength == diagonal && arect > area){
                area = arect;
            }

        }
        return area;
    }
}