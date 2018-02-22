package com.chewychiyu.random_test;
import java.util.ArrayList;
import java.util.Arrays;

import com.chewychiyu.random.Random;
public class TestClass {

	public static void main(String[] args){
		new TestClass();
	}
	
	TestClass(){
		
	   String[] str = new String[]{"Test","ues","testsadfasdf"};
	   while(true)
		System.out.println(Random._element_of_array(str));
		
	}
	
}

class Stuff{
	
	double i;
	
	public Stuff(){
		i = Math.random();
	}
	
	public String toString(){
		return ""+i;
	}
}