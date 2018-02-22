package com.chewychiyu.random;

import java.util.List;

/*	Java Library where random elements and collections can be called and created
 *  with specifications on parameters and weights. All methods that are accessible by 
 *  public scope will be defined with the tags of static and public.
 */

public class Random {

	/*  Pick a integer randomly from _min to _max inclusive */
	public static int _integer_inclusive(int _min, int _max) {
		return _min + (int)(Math.random()*((_max-_min)+1));
	}

	/*  Pick a integer randomly from _min to _max exclusive */
	public static int _integer_exclusive(int _min, int _max){
		return _min + 1 + (int)(Math.random()*((_max-_min)-1));
	}

	/* Pick a double randomly from _min to _max exclusive */
	public static double _double_exclusive(int _min, int _max) {
		return _min + (Math.random()*(_max-_min));
	}

	/*
	 *  Builds a random string of ascii characters using StringBuilder class
	 *  to append random primitives casted into char. _integer_inclusive is used to
	 *  get random index 33-127 ascii values
	 */
	public static String _ascii_string(int _length){
		StringBuilder _ascii = new StringBuilder();
		for(int _index = 0; _index < _length; _index++){
			_ascii.append((char) _integer_inclusive(33,127));
		}
		return _ascii.toString();
	}
	
	/*
	 * Getting random element of an array. Seperate overloaded functions for primitives
	 * and generic function for objects
	 */
	
	/* char array selection */
	public static char _element_of_array(char[] _array){
		return _array[_integer_exclusive(0,_array.length)];
	}
	/* int array selection */
	public static int _element_of_array(int[] _array){
		return _array[_integer_exclusive(0,_array.length)];
	}
	/* double array selection */
	public static double _element_of_array(double[] _array){
		return _array[_integer_exclusive(0,_array.length)];
	}
	/* float array selection */
	public static float _element_of_array(float[] _array){
		return _array[_integer_exclusive(0,_array.length)];
	}
	/* long array selection */
	public static long _element_of_array(long[] _array){
		return _array[_integer_exclusive(0,_array.length)];
	}
	/* boolean array selection */
	public static boolean _element_of_array(boolean[] _array){
		return _array[_integer_exclusive(0,_array.length)];
	}
	/* char array selection */
	public static short _element_of_array(short[] _array){
		return _array[_integer_exclusive(0,_array.length)];
	}
	/* generic object array selection */
	public static <T> T _element_of_array(T[] _array){
		return _array[_integer_exclusive(0,_array.length)];
	}
	
	/* Get random element of a generic list */
	public static <T> T _element_of_list(List<T> _list){
		return _list.get(_integer_exclusive(0,_list.size()));
	}
	
	/* 
	 * Get random index with specific weights of probability 
	 * (i.e) {1,2,3,4} , {.20,.50,.10,.20}
	 * pick random element , must pass weigh pick as well to pass 0-.99
	 */
	public static int _pick_weighted(int[] _items, double[] _prob){
		int _rand_index = _integer_inclusive(0,_items.length-1);
		int _pick = _items[_rand_index];
		if(_prob[_rand_index] > Math.random()){
			return _pick;
		}else{
			return _pick_weighted(_items,_prob);
		}
	}
}

