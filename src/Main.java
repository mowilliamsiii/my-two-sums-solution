import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSums(int[] nums, int target){
        //create hash map to hold array values
        Map<Integer, Integer> map = new HashMap<>();

        //create array to return
        int[] arr = new int[2];

        for(int i = 0; i < nums.length; i++){
            //find value you will need from map to compliment target and nums at index i
            int value = target - nums[i];

            //if map does not contain value (we are looking for a compliment to target and nums at index i
            if(!map.containsKey(value)){
                map.put(nums[i], i);
            }else {//if value exist in map, you have found compliment
                arr[0] = map.get(value);
                arr[1] = i;
            }
        }
        return arr;

        //this approach is better than two for loops (brute force) because we got from O(n^2) to O(n) -Time complexity | O(n) space complexity
    }

    //driver code
    public static void main(String[] args) {
        int[] arr1 = {1,3,7};
        int[] ints = twoSums(arr1, 10);
        System.out.println(ints[0] + " " + ints[1]);
    }
}