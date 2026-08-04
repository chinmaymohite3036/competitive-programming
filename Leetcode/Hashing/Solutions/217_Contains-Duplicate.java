import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If current value already exists
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }
}
