public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 7, 9};
        int k = 3;

        int newLength = removeElement(nums, k);
        System.out.println("New length: " + newLength);
        System.out.println("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.println(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int k) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != k) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
