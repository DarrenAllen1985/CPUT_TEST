package com.chapterTwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        //Question 1
        List TestList = new ArrayList();
        TestList.add("Number 1");
        TestList.add("Number 2");
        TestList.add("Number 3");

        TestList.add(3,"Resplace this element");


        for(int Indx =0;Indx < TestList.size();Indx++)
        {
            System.out.println(TestList.get(Indx));
        }

        Set SetAdd = new HashSet();
        SetAdd.add("Element 1");
        SetAdd.add("Element 2");
        SetAdd.add("Element 3");

        System.out.println("Contains Name Element 2 :" + SetAdd.contains("Element 2"));

        //Searches through the list to find key then brings back the element name
        Map mapA = new HashMap();
        mapA.put("key1", "Element world 1");
        mapA.put("key2", "Element world 51");
        mapA.put("key3", "Element world 71");
        String element1 = (String) mapA.get("key3");
        System.out.println("Get the element number :"+element1);
        ;

        //Question 2
        //Ask arinze if theres a certain pattern you must follow when it comes to spring frameworks

        CalculatorServiceImpl Calc = new CalculatorServiceImpl();
        int result = Calc.add(20,50);

        System.out.println("The result is : " + result);
        Assert.assertEquals("Adding the numbers ", 70 ,result);
    }
}


