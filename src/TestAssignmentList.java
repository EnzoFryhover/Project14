import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestAssignmentList 
{

	public static void main(String[] args)
	{
		// Make sure nothing is added to the list before the file is read.
		AssignmentList al = new AssignmentList();
		if (!al.toString().equals("The list is empty"))
		{
			System.out.println("Either the constructor or the toString method failed");
		}
		
		// This is how you give an error message for a missing file--you'll learn this kind of trick in CS 2334!
		try
		{
			al.readFile("TestData.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("The Test.Data.txt file was not found in the Project 14 main directory");
		}
		
		// If we get here the file was found
		// Now make sure everything was read correctly by looking for the data using findAssignmentsByID
		ArrayList<String> result = al.findAssignmentsByID("1");
		if (result.size() != 1 || !result.contains("P1"))
		{
			System.out.println("Either the file was read incorrectly, or findAssignmentsByID is not working for ID 1");
		}
		result = al.findAssignmentsByID("2");
		if (result.size() != 2 || !result.contains("P1") || !result.contains("P2"))
		{
			System.out.println("Either the file was read incorrectly, or findAssignmentsByID is not working for ID 2");
		}
		result = al.findAssignmentsByID("3");
		if (result.size() != 2 || !result.contains("P1") || !result.contains("P3"))
		{
			System.out.println("Either the file was read incorrectly, or findAssignmentsByID is not working for ID 3");
		}
		
		//Now make sure everything was read correctly by looking for data using findNamesByAssignment
		result = al.findNamesByAssignment("P1");
		if (result.size() != 3 || !result.contains("APerson") || !result.contains("BPerson") || !result.contains("CPerson"))
		{
			System.out.println("Either the file was read incorrectly or findNamesByAssignment is not working for P1");
		}
		result = al.findNamesByAssignment("P2");
		if (result.size() != 1 || !result.contains("BPerson"))
		{
			System.out.println("Either the file was read incorrectly or findNamesByAssignment is not working for P2");
		}
		result = al.findNamesByAssignment("P3");
		if (result.size() != 1 || !result.contains("CPerson"))
		{
			System.out.println("Either the file was read incorrectly or findNamesByAssignment is not working for P3");
		}
		result = al.findNamesByAssignment("P4");
		if (result.size() != 1 || !result.contains("DPerson"))
		{
			System.out.println("Either the file was read incorrectly or findNamesByAssignment is not working for P4");
		}
		result = al.findNamesByAssignment("");
		if (result.size() != 0)
		{
			System.out.println("Either the file was read incorrectly or findNamesByAssignment is not working for an empty String");
		}
		result = al.findNamesByAssignment("P5"); // there is no P5
		if (result.size() != 0)
		{
			System.out.println("Either the file was read incorrectly or findNamesByAssignment is not working for an element not in the file");
		}
		
		// Confirm that everything is OK
		System.out.println("If you get this message alone, your code passed all of the tests");
	}

}
