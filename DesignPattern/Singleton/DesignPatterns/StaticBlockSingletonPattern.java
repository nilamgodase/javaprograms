package com.bridgelabz.Singleton.DesignPatterns;

public class StaticBlockSingletonPattern {
	private static final StaticBlockSingletonPattern instance;
	private StaticBlockSingletonPattern(){}
	static{
		instance= new StaticBlockSingletonPattern();
	}
	public static StaticBlockSingletonPattern getInstance() {
		return instance;
	}
}
