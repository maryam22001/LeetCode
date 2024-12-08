class Solution {
    public int minOperations(String[] logs) {
        int res = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                // Move up one directory, but not above the root
                if (res > 0) {
                    res--;
                }
            } else if (!log.equals("./")) {
                // Count valid directory change
                res++;
            }
            // `./` does nothing, so no need to handle it explicitly
        }
        return res;
    }
}
