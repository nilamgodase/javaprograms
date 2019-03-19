/******************************************************************************
 *  Compilation:  javac -d bi Clinique.java
 *  Execution:    java -cp bin CliniqueManagement
 *  
 *  Purpose: Clinique Management Program
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   15-03-2019
 *
 ******************************************************************************/

package CliniqueManagement;
import java.sql.Date;
import java.text.ParseException;
import com.Bridgelabz.ObjectOrientedPrograms.Utility;
public class Clinique {
        
	static Date date;
	public static void main(String[] args) throws ParseException {
		int choice = 0;
		do {
			System.out.println(
					"\n1. Add Doctor or Patient or fix an Appointment\n2. Search doctor\n3. Display details\n4. Close");
			choice = Utility.getInt();
			switch (choice) {
			case 1:
				new DoctorPatientImplementation().operation(); // to add doctor or patients details or to fix appointment
				break;
			case 2:
				new SearchingImplementation().operation(); // to search doctor details
				break;
			case 3:
				new InformationDisplayImplementation().operation(); 	// to display information
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (choice != 4);
	}
}

