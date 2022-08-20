package com.kang.myspring.main;

import com.kang.myspring.comparator.OrderA;
import com.kang.myspring.comparator.OrderB;
import com.kang.myspring.comparator.OrderC;
import com.kang.myspring.comparator.OrderD;
import org.springframework.core.OrderComparator;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * User:
 * Description:
 * Date: 2022-08-16
 * Time: 23:24
 */
public class ComparatorMain {

    public static void main(String[] args) {
        //Ordered接口实现比较器
        OrderA a = new OrderA(); // order=3
        OrderB b = new OrderB(); // order=1
        OrderComparator comparator = new OrderComparator();
        System.out.println(comparator.compare(a, b));  // 1
        List list = new ArrayList<>();
        list.add(a);
        list.add(b);
        // 按order值升序排序
        list.sort(comparator);
        System.out.println(list);  // B，A

        OrderC c = new OrderC(); // order=3
        OrderD d = new OrderD(); // order=1
        AnnotationAwareOrderComparator comparator2 = new AnnotationAwareOrderComparator();
        System.out.println(comparator2.compare(c, d));  // 0
        List listCD = new ArrayList<>();
        listCD.add(c);
        listCD.add(d);
        // 按order值升序排序
        listCD.sort(comparator2);
        System.out.println(listCD);  //d c
    }


}
