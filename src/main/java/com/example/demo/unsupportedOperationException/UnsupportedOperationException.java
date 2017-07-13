package com.example.demo.unsupportedOperationException;

import com.example.demo.entity.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jet.chen on 2017/7/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnsupportedOperationException {

    @Test
    public void test() {
        People james = new People("James", 18);
        People skye = new People("Skye", 18);

        //List<People> peoples = Arrays.asList(james);
        //peoples.add(skye);

        //List<People> peoples = new ArrayList<>();
        //peoples.addAll(Arrays.asList(james, skye));
        //System.out.println(peoples);

        List<People> p1 = new ArrayList<>();
        List<People> p2 = Arrays.asList(james);
        System.out.println(p1.getClass());
        System.out.println(p2.getClass());

    }
}

