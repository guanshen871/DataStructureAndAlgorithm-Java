import com.algorithm.SelectSortDemo;
import com.utils.PrintLog;

/**
 * @author chenguansheng
 */
public class Main {

    private static final int[] intArr = {1, 5, 2, 29, 4, 11};

    public static void main(String[] args) {
        SelectSortDemo selectSortDemo =new SelectSortDemo();
        PrintLog.PrintBeforeLog(intArr);
        selectSortDemo.SelectSort(intArr);
        PrintLog.PrintAfterLog(intArr);


    }
}
