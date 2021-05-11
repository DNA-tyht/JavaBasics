package src.com.tyht.Collec;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/4 10:18
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();

        coll.add(1);
        coll.add(2);
        coll.add(new String("tom"));
        coll.add(new String("jerry"));
        coll.add(new Person("tom", 20));
        coll.add(new Person("jerry", 18));

        Iterator iterator = coll.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        for (int i = 0; i < coll.size(); i++) {
//
//        }
        //判断是否有下一个元素
        while(iterator.hasNext()) {
            //指针下移
            //将下移后集合位置上的元素返回
            System.out.println(iterator.next());
        }

        //新迭代器回到集合起点
        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            //删除集合中的 tom
            if ("tom".equals(obj)) {
                iterator1.remove();
            }
        }
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

        //集合对象将值赋给局部变量
        //输出局部变量
        for (Object obj:coll) {
            System.out.println(obj);
        }
    }
}
