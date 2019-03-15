package com.Bridgelabz.ObjectOrientedPrograms;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Utility {
	public static Scanner sc=new Scanner(System.in);
	public static int inputInteger()  //taking input integer
	{
		return (sc.nextInt());
	}
	public static String inputString() //taking input string
	{
		return (sc.nextLine());
	}
	public static double inputDouble() 
	{
		return (sc.nextDouble());
	}
	public void InsertInt(int arr[]) // Insert interger
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public void InsertString(String arr[]) //insert string
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
	}
	public void printIntArr(int arr[]) //print interger
	{
		int n=arr.length;
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j]);
		}
	}
	public void printIntString(String arr[]) //print string
	{
		int n=arr.length;
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j]);
		}
	}

public static String readFile(String filename) throws IOException{
		
		//Creating FileReader Object
		
		FileReader fileReader = new FileReader(filename);
		
		//Creating BufferedReader Object
		
		BufferedReader bufferedreader = new BufferedReader(fileReader);
		String line;
		
		//Creating StringBuilder Object
		
		StringBuilder sb = new StringBuilder();
		while ((line = bufferedreader.readLine()) != null){
			
			//Appending line by line 
			
			sb.append(line);
		}
		System.out.println(sb);
		
		//closing the FileReader object
		
		fileReader.close();
		
		//closing the BufferedReader object
		
		bufferedreader.close();
		
		//Returning the String 
		
		return sb.toString();
	}
	
	public static String readFromJson(String path) throws IOException {
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String fullString = "";
		String line = "";
		while ((line = bufferedReader.readLine()) != null) {
			fullString += line;
		}
		bufferedReader.close();
		return fullString;
	}
	
	public static void writeToJson(String jsonString, String path) throws IOException {
		FileWriter fileWriter = new FileWriter(path);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(jsonString);
		bufferedWriter.close();
	}
	public static void writeToJsonFileWithOutOverWriting(String jsonString, String path) throws IOException {
		FileWriter fileWriter = new FileWriter(path,true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(jsonString);
		bufferedWriter.close();
	}
	
	public static void writeObjectJson(java.util.List lists , String path) throws JsonGenerationException, JsonMappingException, IOException {
		Object[] arr = lists.toArray();
		ObjectMapper object = new ObjectMapper();
		object.writeValue(new File(path), arr);
	}
	public static Object inputSingleString() {
		// TODO Auto-generated method stub
		return null;
	}
	static  Pattern pattern = null;
	public static boolean validateName(String txt)
	{
		String regex ="[a-zA-Z]+\\.?";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(txt);
		return matcher.find();
    }
	public static boolean validatemobileNumber(String mobileNo)
	{
		String regex ="[0-9]{10}$";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(mobileNo);
		return matcher.find();
    }
	
	
	public static boolean validatefullName(String fullName)
	{
		String regex ="[0-9]{10}$";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(fullName);
		return matcher.find();
    }
	public static boolean validateDate(String Date)
	{
		String regex ="\\d{2}/\\d{2}/\\d{4}";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(Date);
		return matcher.find();
	}
}
//	public static <T> T jsonToJava(String jsonString,Class<T>  cls) {
//		T result=null;
//		try {
//			result=mapper.readValue(jsonString,cls);
//		} catch (JsonParseException e) {
//			//System.out.println("Exception while converting json to java object  "+e.getMessage());
//		} catch (JsonMappingException e) {
//			System.out.println("Exception while converting json to java object  "+e.getMessage());
//		} catch (IOException e) {
//			System.out.println("Exception while converting json to java object  "+e.getMessage());
//		}
//		return result;
//	}
	
	



