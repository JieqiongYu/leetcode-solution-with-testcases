package TwoPointer;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // 将非0数字向前挪
        int curt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[curt++] = nums[i];
            }
        }

        // 将后面的元素全部补0
        for (int i = curt; i < nums.length; i++) {
            nums[curt++] = 0;
        }
    }
}
