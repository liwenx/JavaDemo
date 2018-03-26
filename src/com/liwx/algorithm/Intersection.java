package com.liwx.algorithm;

import java.util.Arrays;

/**
 *
 *
 * @author liwenxing
 * @date 2018/3/15 9:27
 */
public class Intersection {
    /*
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int[] temp = new int[nums1.length];
        int index = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                if(index == 0 || temp[index -1] != nums1[i]){
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[index];
        for (int k = 0; k < index; k ++) {
            result[k] = temp[k];
        }

        return result;
    }
}
