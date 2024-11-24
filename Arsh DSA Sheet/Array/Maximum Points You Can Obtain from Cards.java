/*There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array 
  cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can obtain*/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }
        
        int maxScore = currentSum;
        
        for (int i = 0; i < k; i++) {
            currentSum = currentSum - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            maxScore = Math.max(maxScore, currentSum);
        }
        
        return maxScore;
    }
}

/*cardPoints = [11, 49, 100, 20, 86, 29, 72], k = 4.

Step 1: Initial Sum of First k Cards:

First, we pick the first 4 cards: [11, 49, 100, 20].
currentSum = 11 + 49 + 100 + 20 = 180.
Sliding Window: Replacing Cards:

Now we slide the window, removing cards from the front and adding cards from the back:

First Slide (i = 0):

Remove the first card (11), and add the last card (72).
currentSum = 180 - 11 + 72 = 241.
Second Slide (i = 1):

Remove the second card (49), and add the second-last card (29).
currentSum = 241 - 49 + 29 = 221.
Third Slide (i = 2):

Remove the third card (100), and add the third-last card (86).
currentSum = 221 - 100 + 86 = 207.
Fourth Slide (i = 3):

Remove the fourth card (20), and add the fourth-last card (86).
currentSum = 207 - 20 + 86 = 273.
Final Result: After sliding, the maximum sum encountered is 241, which is the answer.*/
