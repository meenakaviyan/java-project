package com.practice;

public class swapping 
{
public static void swap()
{
	int a=10,b=20;
	int t;
	System.out.println("before swap " +a+ " "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swap " +a+ " "+b);
}
public static void main(String[] args) {
	swap();
}
}
