/******************************************************************************
 *  Compilation:  javac -d bi  DataJson.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg. 
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
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

//import com.fasterxml.jackson.core.JsonParseException;

	public class DataJson implements Serializable{
	public static void main(String[] args) throws JsonParseException, JsonMappingException,IOException  {
			String path="Rice.json";
			String path1="Wheat.json";
			String path2="Pulses.json";
			
			File file = new File(path);
			File file1 = new File(path1);
			File file2 = new File(path2);
			
		    String RiceWritepath = ("/home/admin1/eclipse-workspace/bridgelabz/Ricewrite.json");
		    String WheatesWritepath=("/home/admin1/eclipse-workspace/bridgelabz/Wheatwrite.json");
		    String PulsesWritepath=("/home/admin1/eclipse-workspace/bridgelabz/Pulseswrite.json");
		   
		  ObjectMapper object=new ObjectMapper(); 
		  List<Rice> riceList = object.readValue(file, new TypeReference<List<Rice>>() {});
		  int i;
		  for( i=0;i<riceList.size();i++)
		 
		{
				System.out.println("name"+" "+riceList.get(i).getName());
				System.out.println("weight"+" "+riceList.get(i).getWeight());
				System.out.println("price"+" "+riceList.get(i).getPrice());
				System.out.println("*************************************");
			}
			List< Wheat>  WheatList = object.readValue(file1, new TypeReference<List< Wheat>>() {});
			for(i=0;i<WheatList.size();i++)
			{
					System.out.println("Name"+" "+WheatList.get(i).getName());
					System.out.println("Weight"+" "+WheatList.get(i).getWeight());
					System.out.println("Price"+" "+WheatList.get(i).getPrice());
					System.out.println("*************************************");
			}
			List<Pulses> pulseList = object.readValue(file2, new TypeReference<List<Pulses>>() {});
			for( i=0;i<WheatList.size();i++)
			{
					System.out.println("Name"+" "+pulseList.get(i).getName());
					System.out.println("Weight"+" "+pulseList.get(i).getWeight());
					System.out.println("Price"+" "+pulseList.get(i).getPrice());
					System.out.println("*************************************");
			}
			boolean flag=false;
			while(flag==false){
			Utility u=new Utility();
			System.out.println("Enter youe choice");
			System.out.println("1.inventory \t 2.total price \t 3.exit");
			int choice=u.inputInteger();
			switch(choice) 
			{
			case 1:
					System.out.println("select inventory name \t 1.Rice \t 2.pulses \t 3.wheats");
					int name=u.inputInteger();
					switch(name) 
					{
						case 1:
							Rice rice=new Rice();
							System.out.println("Enter the name");
							rice.setName(u.inputString());
							System.out.println("Enter teh weight");
							rice.setWeight(u.inputInteger());
							System.out.println("Enter the price");
							rice.setPrice(u.inputDouble());
					
							riceList.add(rice);
							System.out.println("Rice added");
							String jsonRice=object.writeValueAsString(rice);
							Utility.writeToJson(jsonRice, RiceWritepath);
							System.out.println(jsonRice);
							System.out.println("susseful");
							break;
						
						case 2:
							Pulses pulse=new Pulses();
							System.out.println("Enter the name");
							pulse.setName(u.inputString());
							System.out.println("Enter the weight");
							pulse.setWeight(u.inputInteger());
							System.out.println("Enter the price");
							pulse.setPrice(u.inputDouble());
							
							pulseList.add(pulse);
							System.out.println("Pulse added");
							String jsonPulses=object.writeValueAsString(pulse);
							Utility.writeToJson(jsonPulses, PulsesWritepath);  //for java to json
							System.out.println(jsonPulses);
							System.out.println("susseful");
							break;
							
						case 3:
							Wheat wheat=new Wheat();
							System.out.println("Enter the name");
							wheat.setName(u.inputString());
							System.out.println("Enter the weight");
							wheat.setWeight(u.inputInteger());
							System.out.println("Enter the price");
							wheat.setPrice(u.inputDouble());
							
							WheatList.add(wheat);
							System.out.println("wheats added");
							String jsonWheates=object.writeValueAsString(wheat);
							Utility.writeToJson(jsonWheates,WheatesWritepath); //for java to json
							System.out.println(jsonWheates);
							System.out.println("susseful");
							break;
					}
				case 2:
					for( i=0;i<riceList.size();i++){
					Rice rice = riceList.get(i);
					double ricePrice = rice.getWeight() * rice.getPrice();
					System.out.println("rice name" +rice.getName()+"total price"+rice.getPrice());
					}
					
					for(i=0;i<pulseList.size();i++){
					Pulses pulse = pulseList.get(i);
					double pulsePrice = pulse.getWeight() * pulse.getPrice();
					System.out.println("pulse name"  +pulse.getName()+"total price"+pulse.getPrice());
					}	
					
					for(i=0;i<WheatList.size();i++){
					Wheat wheat = WheatList.get(i);
					double wheatPrice = wheat.getWeight() * wheat.getPrice();
					System.out.println("wheat name" +wheat.getName()+"total price"+wheat.getPrice());
					}	
					break;
				case 3:
					System.exit(0);
				}	
			}		
	}
	}

