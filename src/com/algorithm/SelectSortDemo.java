package com.algorithm;

/**
 * @author chenguansheng
 * @ClassName com.algorithm.SelectSortDemo
 * @date 2019/7/31
 * @Version 1.0
 * @Description 选择排序
 **/
public class SelectSortDemo {

    /**
     * 选择排序
     */
    public void SelectSort(int [] intArr){
        for (int i=0;i<intArr.length-1;i++){
            int small =intArr[i];
            int index =i;
            // 查找未排序的最小值和对应的索引
            for (int j =i+1;j<intArr.length;j++){
                if(small>intArr[j]){
                    small=intArr[j];
                    index=j;
                }
            }
            int temp =intArr[i];
            //将最小值和当前的值进行交换
            intArr[i]=intArr[index];
            intArr[index]=temp;

        }
    }
}
