package com.javalearn.healthmanage;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author king-pan
 * @date 2019/11/17 14:28
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("请输入整数n m:(间隔使用空格，n m 小于100000)");
        Scanner input = new Scanner(System.in);
        String inputStr = input.next();
        if(inputStr == null || inputStr.length()==0){
            System.out.println("请输入非空字符");
            return;
        }
        char[] chars = inputStr.toCharArray();

        code18(chars);

    }

    public static void code18( char[] chars) {
        int countA = 0;
        int countNum =0;
        int countOthor = 0;
        for(int i=0;i<chars.length;i++){
            if(chars[i] == 0){

            }
        }
        System.out.println("a-z字符个数:" + countA);
        System.out.println("0-9数字个数:" + countNum);
        System.out.println("其他符号个数:" + countOthor);
    }

}

/**
 * public static void main(String[] args) {
 * System.out.println("请输入正整数n:");
 * Scanner input=new Scanner(System.in);
 * int n = 0;
 * try {
 * n = input.nextInt();
 * }catch (Exception e){
 * System.out.println("请输入整数");
 * return;
 * }
 * code16(n);
 * }
 * <p>
 * <p>
 * <p>
 * public static void code16(int n) {
 * if (n >= 100000) {
 * System.out.println("请输入小于100000的整数");
 * return;
 * }
 * if (n <= 1) {
 * System.out.println("请输入大于1的正整数");
 * return;
 * }
 * int r = (int) Math.sqrt(n);
 * System.out.println("1到" + n + "之间的平方数的个数为:" + r);
 * }
 */


/**
 * public static void main(String[] args) {
 *         System.out.println("请输入整数n m:(间隔使用空格，n m 小于100000)");
 *         Scanner input = new Scanner(System.in);
 *         int n = 0;
 *         int m = 0;
 *         try {
 *             n = input.nextInt();
 *             m = input.nextInt();
 *         } catch (Exception e) {
 *             e.printStackTrace();
 *             System.out.println("请输入整数n m中间间隔使用空格");
 *             return;
 *         }
 *         if (n >= m) {
 *             System.out.println("请确保输入的n<m");
 *         }
 *         if (m >= 10000 || n >= 100000) {
 *             System.out.println("请确保输入的n,m小于100000");
 *             return;
 *         }
 *         code17(n, m);
 *
 *     }
 *
 *     public static void code17(int n, int m) {
 *         Set<Integer> numSet = new HashSet<>();
 *         for (int i = n; i <= m; i++) {
 *             for (int j = 2; j <= Math.sqrt(i); j++) {
 *                 if (i % j == 0 && i % 2 != 0) {
 *                     numSet.add(i);
 *                 }
 *             }
 *         }
 *         System.out.println("[" + n + "," + m + "]之间的非偶数的合数的个数为:" + numSet.size());
 *
 *     }
 */
