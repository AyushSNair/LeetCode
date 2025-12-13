class Solution {
    public List<String> validateCoupons(
            String[] code,
            String[] businessLine,
            boolean[] isActive) {

        // Fixed business order
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        // Map to store valid coupons per category
        Map<String, List<String>> map = new HashMap<>();
        for (String b : order) {
            map.put(b, new ArrayList<>());
        }

        for (int i = 0; i < code.length; i++) {

            // Rule 3: active coupon
            if (!isActive[i]) continue;

            // Rule 1: non-empty code
            if (code[i] == null || code[i].isEmpty()) continue;

            // Rule 2: valid characters
            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            // Rule 4: valid business line
            if (!map.containsKey(businessLine[i])) continue;

            map.get(businessLine[i]).add(code[i]);
        }

        // Prepare result
        List<String> result = new ArrayList<>();

        for (String b : order) {
            List<String> list = map.get(b);
            Collections.sort(list); // lexicographical order
            result.addAll(list);
        }

        return result;
    }
}
