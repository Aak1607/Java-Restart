import java.util.*;

public class Subset {
    public static void findSubsets(List<Integer> nums, List<Integer> current, int index) {
        if (index == nums.size()) {
            System.out.println(current);
            return;
        }

        // Include current element
        current.add(nums.get(index));
        findSubsets(nums, current, index + 1);

        // Exclude current element
        current.remove(current.size() - 1);
        findSubsets(nums, current, index + 1);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        findSubsets(nums, new ArrayList<>(), 0);
    }
}