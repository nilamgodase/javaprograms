package com.bridgelabz.Visitor.DesignPattern;

public interface ItemElement 
{
	public int accept(ShoppingCartVisitor visitor);
}