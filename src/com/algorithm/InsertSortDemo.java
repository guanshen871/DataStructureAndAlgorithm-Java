package com.algorithm;

/**
 * @author chenguansheng
 * @ClassName com.algorithm.InsertSortDemo
 * @date 2019/7/31
 * @Version 1.0
 * @Description 插入排序
 **/
public class InsertSortDemo {


    /**
     * 插入排序
     * 将排序对象分为两个空间，一个是有序的，一个是无序的。
     * 一般默认第一个元素为基准
     */
    public void InsertSort(int[] intArr){
        for (int i=1;i<intArr.length;i++){
            // 等待插入的元素
            int value =intArr[i];
            // 查找插入的位置，默认数组左边第一个是已经排序的了
            int j=i-1;
            for(;i>0;j--) {
                if (intArr[j] > value) {
                    // 所有比要插入的元素大的的元素都要向后移动
                    intArr[j + 1] = intArr[j];
                } else {
                    break;
                }
            }
            intArr[j+1]=value;
        }
    }
}
