/******************************************************************************
 *  Compilation:  javac -d bi InventaryDataManagement.java
 *  Execution:    java -cp bin com.Bridgelabz.ObjectOrientedPrograms;
 *  
 *  Purpose: Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg. 
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   15-03-2019
 *
 ******************************************************************************/

package com.Bridgelabz.ObjectOrientedPrograms;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class InventaryDataManagement {
	
	public static void main(String[] args) throws IOException  {
		try {
			Scanner sc=new Scanner(System.in);
			ObjectMapper obj=new ObjectMapper();//Maps json file fields to setter getter of POJO class
			File file=new File("/home/admin1/eclipse-workspace/bridgelabz/Inventory.json");
			ProductList productList=obj.readValue(file,ProductList.class);//reads from JSON file
			Product product=new Product();
			System.out.println("Enter the product name ");
			String inputProductName=sc.nextLine();
			inputProductName=inputProductName.toLowerCase();
			if(inputProductName.equals("rice")||inputProductName.equals("pulses")||inputProductName.equals("wheats"))
			{
				product.setProduct(inputProductName);
				ProductProperties input= input();
				List<ProductProperties> properties= new ArrayList<ProductProperties>();
				properties.add(input);//properties added to list
				product.setProperties(properties);
				List<Product> products=productList.getInventory();
				products.add(product);
				productList.setInventory(products);
				obj.writeValue(file, productList);
				System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(productList));
			}
			else 
			{
				System.out.println("InCorrect input please run again...!");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect ");
		}
	

	}
	public static ProductProperties input() {

		ProductProperties productProperty=new ProductProperties();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of product type ");
		String inputPropertyName=sc.nextLine();
		productProperty.setName(inputPropertyName);
		System.out.println("Enter the Weight ");
		double inputPropertyWeight=sc.nextDouble();
		productProperty.setWeight(inputPropertyWeight);
		System.out.println("Enter the Price ");
		double inputPropertyprice=sc.nextDouble();
		productProperty.setPrice(inputPropertyprice);
		System.out.println();
		return productProperty;
	}
}

    