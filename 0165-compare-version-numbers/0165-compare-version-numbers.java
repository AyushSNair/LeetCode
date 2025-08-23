class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i < ver1.length; i++){
            int n = Integer.parseInt(ver1[i]);
            arr1.add(n);
        }

        for(int i = 0; i < ver2.length; i++){
            int m = Integer.parseInt(ver2[i]);
            arr2.add(m);
        }

        if(arr1.size() < arr2.size()){
            while(arr1.size() != arr2.size()){
                arr1.add(0);
            }
        }
        if(arr2.size() < arr1.size()){
            while(arr1.size() != arr2.size()){
                arr2.add(0);
            }
        }

        for(int i = 0; i < arr1.size(); i++){
            if(arr1.get(i) > arr2.get(i)){
                return 1;
            }
            if(arr2.get(i) > arr1.get(i)){
                return -1;
            }
        }
        return 0;
    }
}