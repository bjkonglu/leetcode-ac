package com.github.nadal.algo.easy.math;

/**
 * Author: lukong
 * Date: 2019/2/20
 * Description:
 */
public class PowerOfThree {

    /**
     * Given an integer, write a function to determine if it is a power of three.
     *
     * */

    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        boolean ret = true;
        int carry;
        while(n != 1) {
            carry = n%3;
            if (carry != 0) {
                ret = false;
                break;
            }
            n = n/3;
        }
        return ret;
    }
}
