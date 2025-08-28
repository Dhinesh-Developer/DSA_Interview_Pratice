package Array_Easy;

import java.util.LinkedHashMap;
import java.util.Map;

// Majority Element 1 -> n/2


public class program1 {
	
	private static int majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<n;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		int k = n/2;
		int ans = -1;
		for(Map.Entry<Integer, Integer> x : map.entrySet()) {
			if(x.getValue() >= k) {
				ans = x.getKey();
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		
		int[] nums = {1,1,2,3,4,5,5,5,5,5};
		int ans = majorityElement(nums);
		System.out.println("Majority Element: "+ans);
	}
}
