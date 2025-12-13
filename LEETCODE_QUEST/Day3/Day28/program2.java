package LEETCODE_QUEST.Day28;
import java.util.*;
/*
Q4. Bus Routes
You are given an array routes representing bus routes where routes[i] is a bus route that the ith bus repeats forever.
For example, if routes[0] = [1, 5, 7], this means that the 0th bus travels in the sequence 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... forever.
You will start at the bus stop source (You are not on any bus initially), and you want to go to the bus stop target. You can travel between bus stops by buses only.
Return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.

Example 1:
Input: routes = [[1,2,7],[3,6,7]], source = 1, target = 6
Output: 2
Explanation: The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.
Example 2:

Input: routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12
Output: -1
 
Constraints:

1 <= routes.length <= 500.
1 <= routes[i].length <= 105
All the values of routes[i] are unique.
sum(routes[i].length) <= 105
0 <= routes[i][j] < 106
0 <= source, target < 106
* */
public class program2 {


    class Solution {
        public int numBusesToDestination(int[][] routes, int source, int target) {
            if (source == target) return 0;
            Map<Integer, List<Integer>> stopToBus = new HashMap<>();

            for (int i = 0; i < routes.length; i++) {
                for (int stop : routes[i]) {
                    stopToBus.computeIfAbsent(stop, k -> new ArrayList<>()).add(i);
                }
            }

            Queue<Integer> q = new LinkedList<>();
            boolean[] visitedBus = new boolean[routes.length];
            if (!stopToBus.containsKey(source)) return -1;

            for (int bus : stopToBus.get(source)) {
                q.add(bus);
                visitedBus[bus] = true;
            }

            int busesTaken = 1;
            while (!q.isEmpty()) {
                int size = q.size();

                for (int i = 0; i < size; i++) {
                    int bus = q.poll();
                    for (int stop : routes[bus]) {
                        if (stop == target) {
                            return busesTaken;
                        }
                        for (int nextBus : stopToBus.get(stop)) {
                            if (!visitedBus[nextBus]) {
                                visitedBus[nextBus] = true;
                                q.add(nextBus);
                            }
                        }
                    }
                }
                busesTaken++;
            }

            return -1;
        }
    }

}
