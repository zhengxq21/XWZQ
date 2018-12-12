package com.java.algorithm;

/**
 * 递归算法知识
 */
public class Recursion
{

    /**
     * 求一个数的阶乘:n! = n * (n-1) * (n-2) * ... * 1
     * for循环算出
     * 0! = 1,1! = 1,复数没有阶乘
     * @param n
     * @return
     */
    public static int getFactorialFor(int n){
        int temp = 1;
        if (n>=0){
            for (int i = 1;i<=n;i++){
                temp = i * temp;
            }
        }else{
            return -1;   //复数没有阶乘返回-1
        }
        return temp;
    }


    /**
     * 求 n! = n * (n-1)
     * @param n
     * @return
     */
    public static int getFactorial(int n){
        return 0;
    }



    public static void main(String args[]){
        int a = Recursion.getFactorialFor(5);
        System.out.println(a);
    }
}
