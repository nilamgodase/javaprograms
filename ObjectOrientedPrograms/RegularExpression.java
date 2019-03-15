package com.Bridgelabz.ObjectOrientedPrograms;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
public class RegularExpression
{
public static void main (String args[], String mobileNo)
{
	
	String name=null,fullName=null,date=null;
	String msg="Hello <<name>>, We have your full \n" +
	"name as <<full name>> in our system. your contact number is 91-XXXXXXXXXX.\n"+
     "Please,let us know in case of any clarification Thank you BridgeLabz XX/XX/XXXX";
	
	System.out.println("Enter user name:");
	name=Utility.inputString();
	
	System.out.println("Enter full name:");
	name=Utility.inputString();
	
	System.out.println("Enter mobile:");
	name=Utility.inputString();
	
	System.out.println("Enter the date:");
	name=Utility.inputString();
	
	System.out.println("String before replacement");
	System.out.println(msg);
	System.out.println("-----------------------------");
	
	if(Utility.validateName(name))
	{
		msg=msg.replaceAll("<<name>>", name);
	}
	if(Utility.validatefullName(fullName))
	{
		msg=msg.replaceAll("<<full name>>", fullName);
	}
	
	if(Utility.validatemobileNumber(mobileNo))
	{
		msg=msg.replaceAll("XXXXXXXXXX", mobileNo);
	}

	if(Utility.validateDate(msg))
	{
		msg=msg.replaceAll("XX/XX/XXXX", fullName);

    }
}
}
