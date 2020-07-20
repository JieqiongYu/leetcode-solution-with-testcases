package Array;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if (len1 > len2) {
            return findMedianSortedArrays(nums2, nums1);
        }

        if (len1 == 0) {
            return (nums2[(len2 - 1) / 2] + nums2[len2 / 2]) / 2.0;
        }

        int len = len1 + len2;
        int start1 = 0, end1 = len1;
        int cut1, cut2; // cut1 是A数组分割线左边的元素个数，cut2是B数组分割线左边的元素个数
        // binary search for nums1
        while (start1 <= end1) {
            cut1 = (start1 + end1) / 2;
            cut2 = (len + 1) / 2 - cut1; // len+1 merge 元素个数为奇数时直接返回左半边元素，所以需要开始设置左边元素个数多一个
            double L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            double L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            double R1 = (cut1 == len1) ? Integer.MAX_VALUE : nums1[cut1];
            double R2 = (cut2 == len2) ? Integer.MAX_VALUE : nums2[cut2];
            if (L1 > R2) {
                end1 = cut1 - 1;
            } else if (L2 > R1) {
                start1 = cut1 + 1;
            } else {
                if (len % 2 == 0) {
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
                } else {
                    return Math.max(L1, L2);
                }
            }
        }
        return -1;
    }
}
