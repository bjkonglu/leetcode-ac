package com.github.nadal.algo.easy.array;

/**
 * Author: lukong
 * Date: 2018/12/15
 * Description:
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int add = 0;
        int length = nums1.length;
        while(i<(m+add) && j<n) {
            if(nums1[i] <= nums2[j]) {
                i++;
            } else {
                for(int k = length -1; k > i; k--) {
                    nums1[k] = nums1[k-1];
                }
                nums1[i] = nums2[j];
                add++;
                j++;
            }
        }
        while(j<n) {
            nums1[i++] = nums2[j++];
        }
    }
}
