package com.JavaCore.Collection;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(123);
        HeavyBox box2 = new HeavyBox(890);
        HeavyBox box3 = new HeavyBox(321);
        HeavyBox box4 = new HeavyBox(100);
        HeavyBox box5 = new HeavyBox(200);

        List<HeavyBox> first_list = new ArrayList<>();
        first_list.add(box1);
        first_list.add(box2);
        first_list.add(box3);
        first_list.add(box4);
        first_list.add(box5);

        List<HeavyBox> second_list = new ArrayList<>();
        for (HeavyBox box : first_list) {
            if(box.getWeight() > 300){
                second_list.add(box);
            }
        }
        for (HeavyBox box : second_list) {
            first_list.remove(box);
        }
        System.out.println(first_list);
        System.out.println(second_list);
    }
}
