class Solution {
    Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);

        List<List<Integer>> result = new ArrayList<>();

        for (Map<Integer, List<Integer>> rows : map.values()) {
            List<Integer> colList = new ArrayList<>();

            for (List<Integer> list : rows.values()) {
                Collections.sort(list); // sort only if needed
                colList.addAll(list);
            }
            result.add(colList);
        }
        return result;
    }

    private void dfs(TreeNode node, int row, int col) {
        if (node == null) return;

        map
            .computeIfAbsent(col, x -> new TreeMap<>())
            .computeIfAbsent(row, x -> new ArrayList<>())
            .add(node.val);

        dfs(node.left, row + 1, col - 1);
        dfs(node.right, row + 1, col + 1);
    }
}
