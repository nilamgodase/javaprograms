package AddressBook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.Bridgelabz.AlgorithmPrograms.Utility;

public class AddressBookMethods 
{
	Utility utility =new Utility();
	Scanner scanner = new Scanner(System.in);
	private String filePath = "/home/admin1/eclipse-workspace/bridgelabz/BookAddress.json";
	private JSONObject addrArrayContainObj;
	private JSONArray addressArray ;
	@SuppressWarnings("unused")
	private String array = "Address Book";
	public AddressBookMethods()
	{
		addrArrayContainObj = new JSONObject();
		addressArray = new JSONArray();
	}
	public void addAddress() throws ParseException, IOException  
	{
		File file = new File(filePath);
		if(filePath.length()==0)
		{
			getAddress(addressArray);
		}
		else
		{
			addressArray = getAvailableAddress();
			getAddress(addressArray);
		}
	}
	
	public void getAddress(JSONArray addressArray) throws ParseException, IOException  
	{		
		System.out.println("Enter a name :");
		String name = scanner.nextLine();
		System.out.println("Enter last name :");
		String lastName = scanner.nextLine();
		System.out.println("Enter address :");
		String address = scanner.nextLine();
		System.out.println("Enter city :");
		String city = scanner.nextLine();
		System.out.println("Enter a state :");
		String state = scanner.nextLine();
		System.out.println("Enter zip code :");
		String zip = scanner.nextLine();
		System.out.println("Enter phone number :");
		String phoneNum = scanner.nextLine();
		AddressBookPojo pojo = new AddressBookPojo(name,lastName,address,city,state,zip,phoneNum);
		try {
			createJsonObj(pojo , addressArray);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public void createJsonObj(AddressBookPojo pojo ,JSONArray addressArray)throws ParseException, IOException 
	{
		JSONObject addObj = new JSONObject();
		addObj.put("First Name", pojo.getFirstName());
		addObj.put("Last Name", pojo.getLastName());
		addObj.put("Address", pojo.getAddress());
		addObj.put("City", pojo.getCity());
		addObj.put("State", pojo.getState());
		addObj.put("Zip Code", pojo.getZipCode());
		addObj.put("Phone no.", pojo.getPhnno());
		addressArray.add(addObj);
		addrArrayContainObj.put("AddressBook", addressArray);
		System.out.println(addrArrayContainObj.toString());
		try {
			writeIntoFile(addrArrayContainObj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeIntoFile(JSONObject object) throws ParseException, IOException 
	{
		File file = new File(filePath);  
		FileWriter writer = new FileWriter(file);
		writer.write(object.toString());
		writer.flush();
	}
	public JSONArray getAvailableAddress() throws FileNotFoundException, IOException, ParseException 
	{
		JSONParser parser = new JSONParser();
		File file = new File(filePath);
		JSONObject obj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray fileArray = (JSONArray)obj.get("AddressBook");		
		return fileArray;
	}
	public void editInfo() throws ParseException, IOException 
	{
		System.out.println("Enter the name of the person : ");
		String personName = utility.inputString();
		boolean isAvailable = checkDetails(personName);
		if(isAvailable)
		{
			String[] searchArray = {"","First Name","Last Name","Address","City","State","Zip Code","Phone no."};
			System.out.println("1.First Name 2.Last Name 3.Address 4.City 5.State 6.Zip Code 7.Phone no.");
			int key = utility.inputInteger();
			String parameter = searchArray[key];
			System.out.println("Enter new "+parameter);
			String newParameter = utility.inputString();
			try {
				updateInfo(personName,parameter,newParameter);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Want to enter once again :(Y/N)");
			char ch=scanner.next().charAt(0);
			if(ch=='Y'||ch=='y')
			{
				editInfo();
			}
		}
	}
	public boolean checkDetails(String name) throws FileNotFoundException, IOException, ParseException
	{
		boolean isAvailable = false;
		JSONParser parser = new JSONParser();
		File file = new File(filePath);
		JSONObject obj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray array = (JSONArray)obj.get("AddressBook");
		JSONObject compareObj ;
		for(int i = 0 ; i < array.size();i++)
		{
			compareObj = (JSONObject)array.get(i);
			if(compareObj.get("First Name").equals(name))
			{
				isAvailable = true;
			}
		}
		return isAvailable;
	}
	@SuppressWarnings("unchecked")
	public void updateInfo(String personName ,String parameterTobeReplace, String newParameter) throws ParseException, IOException 
	{
		addressArray = getAvailableAddress();
		JSONObject compareObj ;
		for(int i = 0 ; i < addressArray.size();i++)
		{
			compareObj = (JSONObject)addressArray.get(i);
			if(compareObj.get("First Name").equals(personName))
			{
				compareObj.put(parameterTobeReplace,newParameter);
				System.out.println("New Updation");
			}
		}
		addrArrayContainObj.put("AddressBook",addressArray);
		writeIntoFile(addrArrayContainObj);
	}	
	public void sortData() throws Exception
	{
		System.out.println("1.Sort by Name  2.Sort by Zip");
		int ch = scanner.nextInt();
		switch(ch)
		{
		case 1:
			sortByName();
			System.out.println("Sorted by Name");
			break;
		case 2:
			sortByZip();
			System.out.println("Sorted By zip code");
			break;			
		default:
			System.out.println("Invalid choice..!!!");
		}
	}
	@SuppressWarnings("unchecked")
	public void sortByName() throws ParseException, IOException 
	{
		JSONParser parser = new JSONParser();
		File file = new File(filePath);
		JSONObject obj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray array = (JSONArray)obj.get("AddressBook");
		JSONObject obj1=null ;
		JSONObject obj2= null;
		JSONObject temp = null;
		for(int i = 0 ; i < array.size()-1;i++)
		{
			for(int j=0;j<array.size()-1;j++)
			{
				obj1 = (JSONObject)array.get(j);
				obj2 = (JSONObject)array.get(j+1);
				String n1 = (String)obj1.get("First Name");
				String n2 = (String)obj2.get("First Name");
				String name1 = n1.toLowerCase();
				String name2 = n2.toLowerCase();
				if((name1.compareTo(name2))>0)
				{
					temp=(JSONObject) array.get(j);
					array.remove(j);
					array.add(j, obj2);
					array.remove(j+1);
					array.add(j+1, temp);
				}
			}
		}
		addrArrayContainObj.put("AddressBook",array);
		writeIntoFile(addrArrayContainObj);
	}
	@SuppressWarnings("unchecked")
	public void sortByZip() throws ParseException, IOException 
	{
		JSONParser parser = new JSONParser();
		File file = new File(filePath);
		JSONObject obj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray array = (JSONArray)obj.get("AddressBook");
		JSONObject obj1=null ;
		JSONObject obj2= null;
		JSONObject temp = null;
		for(int i = 0 ; i < array.size()-1;i++)
		{
			for(int j=0;j<array.size()-1;j++)
			{
				obj1 = (JSONObject)array.get(j);
				obj2 = (JSONObject)array.get(j+1);
				String zip1 = (String)obj1.get("Zip Code");
				String zip2 = (String)obj2.get("Zip Code");
				if((zip1.compareTo(zip2))>0)
				{
					temp=(JSONObject) array.get(j);
					array.remove(j);
					array.add(j, obj2);
					array.remove(j+1);
					array.add(j+1, temp);
				}
			}
		}
		addrArrayContainObj.put("AddressBook",array);
		writeIntoFile(addrArrayContainObj);
	}
	public void removeData() throws ParseException, IOException 
	{
		System.out.println("Enter persons first name whose data you wants to delete");
		String firstname = utility.inputString();
		System.out.println("Enter persons last name whose data you wants to delete");
		String lastname = utility.inputString();
		boolean isAvailable = validatePerson(firstname,lastname);
		if(isAvailable)
		{
			try {
				removePerson(firstname,lastname);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Person Info successfully removed");
		}
		else
		{
			System.out.println("Data not found...\nDo u want to enter another data(Y/N)");
			char ch = scanner.next().charAt(0);
			if(ch=='Y'||ch=='y')
				removeData();
		}
	}
	public boolean validatePerson(String firstname , String lastname) throws FileNotFoundException, IOException, ParseException
	{
		boolean isPresent = false;
		JSONParser parser = new JSONParser();
		File file = new File(filePath);
		JSONObject obj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray array = (JSONArray)obj.get("AddressBook");
		JSONObject compareObj ;
		for(int i=0;i<array.size();i++)
		{
			compareObj = (JSONObject)array.get(i);
			if((compareObj.get("First Name").equals(firstname)) && (compareObj.get("Last Name").equals(lastname)))
			{
				isPresent = true;
			}
		}
		return isPresent;
	}
	@SuppressWarnings("unchecked")
	public void removePerson(String firstname , String lastname) throws ParseException, IOException 
	{
		boolean isPresent = false;
		JSONParser parser = new JSONParser();
		File file = new File(filePath);
		JSONObject obj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray array = (JSONArray)obj.get("AddressBook");
		JSONObject compareObj ;
		for(int i=0;i<array.size();i++)
		{
			compareObj = (JSONObject)array.get(i);
			if((compareObj.get("First Name").equals(firstname)) && (compareObj.get("Last Name").equals(lastname)))
			{
				array.remove(compareObj);
				addrArrayContainObj.put("AddressBook", array);
				break;
			}
		}
		writeIntoFile(addrArrayContainObj);
	}
}