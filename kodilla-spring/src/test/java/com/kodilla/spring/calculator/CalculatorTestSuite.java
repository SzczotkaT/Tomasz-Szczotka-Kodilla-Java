package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double res = calculator.add(5,5);
        //Then
        Assert.assertEquals(10,res,0.001);
    }

    @Test
    public void testSub(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double res = calculator.sub(5,5);
        //Then
        Assert.assertEquals(0,res,0.001);
    }

    @Test
    public void testMul(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double res = calculator.mul(5,5);
        //Then
        Assert.assertEquals(25,res,0.001);
    }

    @Test
    public void testDiv(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double res = calculator.div(5,5);
        //Then
        Assert.assertEquals(1,res,0.001);
    }
}
