
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] massiv1 = {2, 7, 11, 15};
        int[] massiv2 = {3, 2, 4};
        int[] massiv3 = {3, 3};
        System.out.println(Arrays.toString(main.twoSum(massiv1, 9)));
        System.out.println(Arrays.toString(main.twoSum(massiv2, 6)));
        System.out.println(Arrays.toString(main.twoSum(massiv3, 6)));

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (hashMap.containsKey(comp)) return new int[]{hashMap.get(comp), i};
            else hashMap.put(nums[i], i);
        }

        return null;
    }
}
