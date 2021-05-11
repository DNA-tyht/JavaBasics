package com.tyht.java3;

import java.util.*;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/13 21:03
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<String, T>();

    //保存T类型对象到Map中
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    //从Map中获取id对应的对象
    public T get(String id) {
        return map.get(id);
    }

    //修改一条记录
    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);
        }
        return list;
    }

    //删除一条记录
    public void remove(int index) {
        map.remove(index);
    }
}
