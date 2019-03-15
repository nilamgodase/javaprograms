/******************************************************************************
 *  Compilation:  javac -d bi  StockDetails.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   14-02-2019
 *
 ******************************************************************************/

package com.Bridgelabz.ObjectOrientedPrograms;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.Bridgelabz.ObjectOrientedPrograms.Stock;;
//import com.fasterxml.jackson.core.JsonParseException;

	public class StockDetails implements Serializable
	{
	public static void main(String[] args) throws JsonParseException, JsonMappingException,IOException  {
			String path="Stockwrite.json";
			Scanner sc=new Scanner(System.in);
			
			File file = new File(path);
			
			
		    String StockWritepath = ("/home/admin1/eclipse-workspace/bridgelabz/Stock.json");
		   
		   
		  ObjectMapper object=new ObjectMapper(); 
		  List<Stock> stockList = object.readValue(file, new TypeReference<List<Stock>>() {});
		  int i;
		  for( i=0;i<stockList.size();i++)
		   {
				System.out.println("Stockname"+" "+stockList.get(i).getShare_name());
				System.out.println("No_of_Shares"+" "+stockList.get(i).getNumber_of_share());
				System.out.println("Price"+" "+stockList.get(i).getShare_price());
				System.out.println("*****************************************************");
			}
			
			
			boolean flag=false;
			while(flag==false){
			Utility u=new Utility();
			System.out.println("Enter youe choice");
			System.out.println("1.Stock Name \t 2.total price \t 3.Exit");
			int choice=u.inputInteger();
			switch(choice) 
			{
			case 1:
					Stock st=new Stock();
					
					System.out.println("Enter the Name of Stock");
					String name = sc.nextLine();
					
					//st.setShare_name(Utility.inputString());
					//System.out.println("**************************************************");
					
					System.out.println("Enter the Nunmber of Shares");
					int number= sc.nextInt();
					//st.setNumber_of_share(Utility.inputInteger());
					//System.out.println("**************************************************");
					
					System.out.println("Enter the price of Shares");
					Double price = sc.nextDouble();
					//st.setShare_price(Utility.inputDouble());
					//System.out.println("**************************************************");
					stockList.add(st);
					String jsonstock=object.writeValueAsString(st);
					Utility.writeToJson(jsonstock, StockWritepath);
                    break;
			case 2:
				for(i=0;i<stockList.size();i++)
				{
				Stock st1  = stockList.get(i);
				double totalStock= st1.getNumber_of_share()*st1.getShare_price();
				System.out.println("Stock name"+st1.getShare_name()+"total price"+totalStock);
					
				}
				break;
					
				case 3:
					
				System.exit(0);	
				}	
			}		
	    }
	}
	
