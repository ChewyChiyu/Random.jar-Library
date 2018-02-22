# Random.jar-Library
Java Library for Randomness

## Installation
   Drag and drop package ( com.chewychiyu.random ) into project
```java
   import com.chewychiyu.random.Random;
```
## Usage
   Get random integer 
```java
   int _rand_int = Random._integer_inclusive(_min,_max);
   int _rand_int = Random._integer_exclusive(_min,_max;
```
   Get random double
```java
   double _rand_double = Random._double_exclusive(_min,_max);
```
   Get random ascii string
```java
   String _rand_ascii_string = Random._ascii_string(_length);
```
   Pull random element of array (primitives and objects)
```java
   Object _o = Random._element_of_array(_object_array);
   int _i = Random.element_of_array(_int_array);
```
   Pull random element of list
```java
   Object _o = Random_element_of_list(_object_list);
```
   Random index with weighted probability
```java
   int _index = Random._pick_weighted(_index_array,_weight_array);
```
   Random dice roll of n facets
```java
   int _roll = Random._dice_roll(_facets);
```
   Random binary array of n length
```java
   byte[] _binary_array = Random._binary_array(_length);
```
