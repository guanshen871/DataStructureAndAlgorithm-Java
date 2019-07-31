package com.utils;

/**
 * @author chenguansheng
 * @ClassName com.utils.PrintLog
 * @date 2019/7/31
 * @Version 1.0
 * @Description
 **/
public class PrintLog {
    /**
     * 输出排序之前内容
     *
     * @param intArr
     */
    public static void PrintBeforeLog(int[] intArr) {
        System.out.print("排序之前：");
        for (int i : intArr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    /**
     * 输出排序之后内容
     *
     * @param intArr
     */
    public static void PrintAfterLog(int[] intArr) {
        System.out.print("排序之后：");
        for (int i : intArr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
