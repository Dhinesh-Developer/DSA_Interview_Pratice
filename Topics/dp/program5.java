package com.tuf.dp;

import java.util.Arrays;

/* 2D -> ninja training..
Input: matrix = [[70, 40, 10], [180, 20, 5], [200, 60, 30]]
Output: 290

Explanation:
Day 1: running = 70
Day 2: stealth training = 20
Day 3: running = 200
Total = 70 + 20 + 200 = 290
This gives the optimal points.
 * */
public class program5 {
	public static void main(String[] args) {
		
		int[][] arr = {
				{10,40,70},
				{20,50,80},
				{30,60,90}
		};
		int maxPoints = ninjaTraining(arr);
		System.out.println(maxPoints);
	}
	
	private static int func(int day, int last, int[][] points, int[][] dp) {
        // If the result is already calculated, return it
        if (dp[day][last] != -1) return dp[day][last];
        
        // Base case
        if (day == 0) {
            int maxi = 0;
        
            /* Calculate the maximum points for the first day
            by choosing an activity different from last one*/
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    maxi = Math.max(maxi, points[0][i]);
                }
            }
            // Store the result in dp array and return it
            return dp[day][last] = maxi;
        }

        // Initialize max points for the current day
        int maxi = 0;
        
        // Iterate through activities for the current day
        for (int i = 0; i < 3; i++) {
            if (i != last) {
                /* Calculate the points for the current activity
                and add it to the maximum points obtained so far */
                int activity = points[day][i] + func(day - 1, i, points, dp);
                maxi = Math.max(maxi, activity);
            }
        }

        // Store the result in dp array and return it
        return dp[day][last] = maxi;
    }

    // Function to find the maximum points for ninja training
    public static int ninjaTraining(int[][] points) {
        // Get the number of days
        int days = points.length;
        
        // Initialize a memoization table with -1 values
        int dp[][] = new int[days][4];
        for (int[] row : dp)
            Arrays.fill(row, -1);
            
        // Return the maximum points
        return func(days - 1, 3, points, dp); // 210
    }
	
	
	
	
	
	
	
	
	
	
}
