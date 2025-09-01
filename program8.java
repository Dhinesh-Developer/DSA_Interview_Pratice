package com.dk;
// Container With Most Water

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container
 * */
public class program8 {
	
	private static int maxArea(int[] height) {
		 int left = 0,right = height.length-1;
	        int max = 0;
	        while(left < right){
	            int w = right-left;
	            int h = Math.min(height[left],height[right]);
	            int area = h*w;
	            max = Math.max(area,max);
	            if(height[left] <= height[right]) left++;
	            else if(height[left] > height[right]) right--;
	            else{
	                left++;
	                right--;
	            }
	        }
	        return max;
	}
	
	public static void main(String[] args) {
		
		int[] water = {1,8,6,2,5,4,8,3,7};
		int res = maxArea(water);
		System.out.println(res); // 49
	}
}
