
public class TestExcusedAssignment 
{

	public static void main(String[] args) 
	{
		
		// Try the first constructor and all of the accessors--there are no mutators
		ExcusedAssignment ea = new ExcusedAssignment("Student1", "111", "First");
		
		if (!ea.getName().equals("Student1"))
		{
			System.out.println("Test failed for getName or for 3 String constructor");
		}
		
		if (!ea.getID().equals("111"))
		{
			System.out.println("Test failed for getID or for 3 String constructor");
		}
		
		if (!ea.getAssignment().equals("First"))
		{
			System.out.println("Test failed for getAssignment or for 3 String constructor");
		}
		
		String s = ea.toString(); // get this String back
		
		if (!s.contains("Student1") || !s.contains("111") || !s.contains("First"))
		{
			System.out.println("Test failed for toString or for 3 String constructor");
		}
		
		// Now test the second constructor and all of the accessors
		ea = new ExcusedAssignment("Student2,222,Second");
		
		if (!ea.getName().equals("Student2"))
		{
			System.out.println("Test failed for getName or for 1 String constructor");
		}
		
		if (!ea.getID().equals("222"))
		{
			System.out.println("Test failed for getID or for 1 String constructor");
		}
		
		if (!ea.getAssignment().equals("Second"))
		{
			System.out.println("Test failed for getAssignment or for 1 String constructor");
		}
		
		s = ea.toString(); // get this String back
		
		if (!s.contains("Student2") || !s.contains("222") || !s.contains("Second"))
		{
			System.out.println("Test failed for toString or for 1 String constructor");
		}
		
		System.out.println("If you see this message with nothing else on top, the code passed all tests");
	}

}
