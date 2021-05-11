package src;

import java.io.PipedReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/4 11:16
 */
public class ListTest {
    public static void main(String[] args) {
        //底层创建了长度是 10 的 Object[] elementData
        ArrayList list = new ArrayList();
        //elementData[0] = new Integer(123);
        //若此次添加导致底层数组容量不够，则扩容
        list.add(123);

    }

}
