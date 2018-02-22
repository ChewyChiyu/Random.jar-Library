package com.chewychiyu.random_test;

import com.chewychiyu.random.Random;
public class TestClass {

	public static void main(String[] args){
		new TestClass();
	}
	
	TestClass(){
	   String[] str = new String[]{"Test","ues","testsadfasdf"};
	   	for(int _i = 0; _i < 100; _i++)
		System.out.println(Random._dice_roll(10));
		
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