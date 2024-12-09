class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current position is empty
            if (flowerbed[i] == 0) {
                // Check the left and right neighbors
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;  // Place a flower here
                    count++;          // Increment the count of flowers placed
                    
                    if (count >= n) {
                        return true;  // Early exit if enough flowers are placed
                    }
                }
            }
        }

        return count == n;  // Check if we can place at  'n' flowers
    }
}
