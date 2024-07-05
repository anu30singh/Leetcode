class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum = 0, rightsum = 0, maxsum = 0;
        int n = cardPoints.length;

        // Calculate the initial sum of the first k cards
        for (int i = 0; i < k; i++) {
            leftsum += cardPoints[i];
        }

        maxsum = leftsum;

        // Use a sliding window to move from leftsum to rightsum
        for (int i = 0; i < k; i++) {
            leftsum -= cardPoints[k - 1 - i];
            rightsum += cardPoints[n - 1 - i];
            maxsum = Math.max(maxsum, leftsum + rightsum);
        }

        return maxsum;
    }
}
