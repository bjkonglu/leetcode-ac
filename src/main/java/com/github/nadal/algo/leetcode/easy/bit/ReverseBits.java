package com.github.nadal.algo.leetcode.easy.bit;

/**
 * Author: lukong
 * Date: 2019/1/14
 * Description:
 */
public class ReverseBits {
    /**
     *
     * Reverse bits of a given 32 bits unsigned integer.
     *
     * Example 1:
     *  Input: 00000010100101000001111010011100
     *  Output: 00111001011110000010100101000000
     *  Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
     *  so return 964176192 which its binary representation is 00111001011110000010100101000000.
     *
     * 解题思路：
     *  每次取最后一位的值，然后无符号的向左移动一位，这样现在最后一位上的值是原来的倒数第二值，
     *  然后将得到的值*2，依次类推，循环处理32次。
     * */

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;
        for(int i = 0; i < 32; i++) {
            ret += n & 1;
            n >>>= 1;
            if(i < 31) {
                ret <<= 1; //ret*2
            }
        }
        return ret;
    }
}
