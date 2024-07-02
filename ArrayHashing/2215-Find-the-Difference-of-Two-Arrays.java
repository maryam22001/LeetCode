class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        Set<Integer> uniqueInArray2Set = new HashSet<>();
        Set<Integer> uniqueInArray1Set = new HashSet<>();

        // Populate the map with elements from nums1
        for (int element_1 : nums1) {
            elementCountMap.put(element_1, 0);
        }

        // Check elements from nums2
        for (int element_2 : nums2) {
            if (elementCountMap.containsKey(element_2)) {
                elementCountMap.put(element_2, elementCountMap.get(element_2) + 1);
            } else {
                uniqueInArray2Set.add(element_2);
            }
        }

        // Find elements in nums1 that are not in nums2
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() == 0) {
                uniqueInArray1Set.add(entry.getKey());
            }
        }

        // Remove duplicates and create lists
        List<Integer> uniqueInArray2 = new ArrayList<>(uniqueInArray2Set);
        List<Integer> uniqueInArray1 = new ArrayList<>(uniqueInArray1Set);

        // Combine results
        List<List<Integer>> result = new ArrayList<>();
        result.add(uniqueInArray1); // unique elements in nums1 as ans[0]
        result.add(uniqueInArray2); // unique elements in nums2 as ans[1]

        return result;
    }
}