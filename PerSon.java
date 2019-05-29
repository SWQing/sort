package com.hiramchatsystem.test;


/**
 * 利用实现comparable进行集合排序
 * colletions.sort();
 */

import java.util.ArrayList;
import java.util.Collections;

;import java.util.List;

public class PerSon implements Comparable<PerSon> {

    public PerSon(String xing, String ming, String age) {
        super();
        this.xing = xing;
        this.ming = ming;
        this.age = age;
    }
    private String xing;
    private String ming;
    private String age;
    public String getXing() {
        return xing;
    }
    public void setXing(String xing) {
        this.xing = xing;
    }
    public String getMing() {
        return ming;
    }
    public void setMing(String ming) {
        this.ming = ming;
    }

    @Override
    public String toString() {
        return "PerSon{" +
                "xing='" + xing + '\'' +
                ", ming='" + ming + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public int compareTo(PerSon o) {
        if (!xing.equals(o.getXing())) {//按姓分组 排序也就分组了
            return xing.compareTo(o.getXing());
        }else if (!ming.equals(o.getMing())) {//按名倒序
            return -ming.compareTo(o.getMing());
        } else if (!age.equals(o.getAge())) {//年龄正序
            return age.compareTo(o.getAge());
        }
        return 0;
    }

    public static void main(String[] args) {
        List<PerSon> list = new ArrayList<PerSon>();
        PerSon p1 = new PerSon("a", "ae", "1");
        PerSon p2 = new PerSon("d", "ue", "2");
        PerSon p3 = new PerSon("e", "be", "5");
        PerSon p4 = new PerSon("b", "ue", "6");
        PerSon p5 = new PerSon("c", "ce", "7");
        PerSon p6 = new PerSon("a", "te", "1");
        PerSon p7 = new PerSon("c", "re", "7");
        PerSon p8 = new PerSon("c", "se", "7");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        //按性分组 按名倒序
        Collections.sort(list);
        for (PerSon p : list) {
            System.out.println(p.toString());
        }
    }
}
