package src.com.tyht.Collec;

import com.sun.javafx.css.CssError;
import org.junit.Test;

import javax.swing.text.html.CSS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/1 8:49
 */
public class CollectionTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("abc");

        System.out.println(collection.size());
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();

        coll.add(1);
        coll.add(2);
        coll.add(new String("tom"));
        coll.add(new String("jerry"));
        coll.add(new Person("tom", 20));
        coll.add(new Person("jerry", 18));

        System.out.println(coll);
        System.out.println(coll.contains(1));
        System.out.println(coll.contains("tom"));
        System.out.println(coll.contains(new Person("jerry", 18)));

        coll.remove(1);
        coll.remove("tom");
        coll.remove(new Person("jerry", 18));
        System.out.println(coll);

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        List<String> list =  Arrays.asList(new String[] {"AA", "BB", "CC"});
        System.out.println(list);
    }
}
