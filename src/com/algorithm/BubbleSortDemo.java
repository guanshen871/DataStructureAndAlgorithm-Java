package com.algorithm;

/**
 * @author chenguansheng
 * @ClassName com.algorithm.BubbleDemo
 * @date 2019/7/31
 * @Version 1.0
 * @Description 冒泡算法-java实现
 **/
public class BubbleSortDemo {
    /**
     * 冒泡排序
     * 两层循环，外层控制某个元素的位置
     * 内存循环控制两两比较
     * 复杂度O(n*n)
     */
    public void BubbleSort(int[] intArr){
        // 核心算法，相邻比较，不满足条件，交换
        for (int i=0;i<intArr.length-1;i++){
            for (int j=0;j<intArr.length-1;j++){
                if(intArr[j]>intArr[j+1]){
                    int temp =intArr[j];
                    intArr[j]=intArr[j+1];
                    intArr[j+1]=temp;
                }
            }
        }
    }
}
