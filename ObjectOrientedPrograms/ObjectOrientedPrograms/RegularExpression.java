/******************************************************************************
 *  Compilation:  javac -d bi RegularExpression.java
 *  Execution:    java -cp bin com.Bridgelabz.ObjectOrientedPrograms;
 *  
 *  Purpose:          Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016. Use Regex to replace name, full name, Mobile#, and Date with proper value.
        b. I/P -> read in the Message
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   15-03-2019
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
import java.util.regex.Pattern;

	public class RegularExpression {

		public static void main(String[] args) {
			String bio = "Hello <<name>>, We have your full\n"
					+ "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n"
					+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
			System.out.println(bio);
			String pattern = "[a-zA-Z]+";
			System.out.println("Enter the name of ");
			String name = Utility.SingleStringInput();
			System.out.println("Enter your fullname:-");
			String fullname = Utility.SingleStringInput();
			Pattern r = Pattern.compile(pattern);
			if (Pattern.matches(pattern, name)) {
				bio = bio.replaceAll("<<name>>", name);
				bio = bio.replaceAll("<<full name>>", fullname);
			}
			System.out.println("Please Enter your Mobile Numbers");
			String numbers = Utility.SingleStringInput();
			if (Pattern.matches("[789][0-9]{9}", numbers)) {
				bio = bio.replaceAll("x{10}", numbers);
			}
			System.out.println("Enter the Date");
			String date = Utility.SingleStringInput();
			if (Pattern.matches("^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$", date)) {
				bio = bio.replaceAll("01/01/2016", date);
			}
			System.out.println(bio);

		}

	}