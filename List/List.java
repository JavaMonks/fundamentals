package com.javamonks.fundamentals.commandline.lists;

public interface List{
	
	public int add(String value);
	public String remove(int index);
	public String remove(String value);
	public String get(int index);
	
	
}