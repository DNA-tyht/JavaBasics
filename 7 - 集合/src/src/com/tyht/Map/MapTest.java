package src.com.tyht.Map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/12 9:38
 */
public class MapTest {
    @Test
    public void test1() {
        Map map = new HashMap();
//        map = new Hashtable();
        map.put(null, 123);
    }
}
