package com.chewychiyu.random_test;
import java.util.ArrayList;
import java.util.Arrays;

import com.chewychiyu.random.Random;
public class TestClass {

	public static void main(String[] args){
		new TestClass();
	}
	
	TestClass(){
		
	    int[] _input = new int[]{1,2,3,4,5};
	    double[] _weight = new double[]{.1,.1,.5,.1,.9};
		System.out.println(Random._pick_weighted(_input, _weight));
		
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