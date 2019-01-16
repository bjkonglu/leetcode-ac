package com.github.nadal.easy.array;

/**
 * Author: lukong
 * Date: 2019/1/17
 * Description:
 */
public class CountPrimes {
    /**
     *
     * Count the number of prime numbers less than a non-negative number, n.
     * Example:
     *   Input: 10
     *   Output: 4
     *   Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     *
     * 思路：
     *   前提：Primes number指质数/素数，1不是质数。
     *   当当前的数字为质数时，它与它之后的数字的乘积就不是质数了；而当当前的数字不为质数时，它与任何数的乘积都不为质数。
     *
     * */

    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count=0;
        for(int i=2; i<n; i++) {
            if(!notPrimes[i]) {
                count++;
                for(int j=2; i*j<n; j++) {
                    notPrimes[i*j] = true;
                }
            }
        }
        return count;
    }
}
