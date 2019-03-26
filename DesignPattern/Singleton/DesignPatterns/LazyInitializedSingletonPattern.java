package com.bridgelabz.Singleton.DesignPatterns;

public class LazyInitializedSingletonPattern {
	private static LazyInitializedSingletonPattern instance;
	private LazyInitializedSingletonPattern(){}
	public static LazyInitializedSingletonPattern getInstance() {
		if(instance==null)
			return new LazyInitializedSingletonPattern();
		return instance;
	}
}

