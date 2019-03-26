package com.bridgelabz.Singleton.DesignPatterns;

public class ThreadSafeSingletonPattern {
	private static ThreadSafeSingletonPattern instance;
	private ThreadSafeSingletonPattern(){}
	public static synchronized ThreadSafeSingletonPattern getInstance()
	{
		if(instance==null)
			return instance =new ThreadSafeSingletonPattern();
		return instance;
	}
}
