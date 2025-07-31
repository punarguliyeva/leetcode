import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        mergeSortArray(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSortArray(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> mergedList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            mergedList.add(nums1[i]);
        }

        for (int i = 0; i < n; i++) {
            mergedList.add(nums2[i]);
        }

        Collections.sort(mergedList);

        for (int i = 0; i < mergedList.size(); i++) {
            nums1[i] = mergedList.get(i);
        }
    }


}

