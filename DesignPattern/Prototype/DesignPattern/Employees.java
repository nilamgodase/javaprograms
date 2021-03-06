 package com.bridgelabz.Prototype.DesignPattern;
import java.util.ArrayList;
import java.util.List;


public class Employees implements Cloneable{
private List<String> empList;
	
	public Employees(){
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Jessica");
		empList.add("Rinku");
		empList.add("Romil");
		empList.add("Mayra");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}
}