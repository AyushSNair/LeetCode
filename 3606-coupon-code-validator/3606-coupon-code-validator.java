class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        

        HashMap<String, ArrayList<String>> hmap = new HashMap<>();
        hmap.put("electronics", new ArrayList<>());
        hmap.put("grocery", new ArrayList<>());
        hmap.put("pharmacy", new ArrayList<>());
        hmap.put("restaurant", new ArrayList<>());

        

        for(int i = 0; i < code.length; i++){
            boolean flag = true;
            if(code[i] == null || code[i].isEmpty()) {
                flag = false;
            }

            if(flag && !code[i].matches("^[a-zA-Z0-9_]+$")){
                flag = false;
            }

            if(flag && !hmap.containsKey(businessLine[i])){
                flag = false;
            }

            if(flag && !isActive[i]){
                flag = false;
            }

            if(flag == true){
                hmap.get(businessLine[i]).add(code[i]);
            }
        }
        
        List<String> result = new ArrayList<>();
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        for(String b : order){
            List<String> ans = hmap.get(b);
            Collections.sort(ans);
            result.addAll(ans);
        }

        return result;
    }
}