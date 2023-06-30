package DynamivDriverClass;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import Common_API_Methods.Common_Utility_Methods;

public class Driver_Post {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, 
	SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//TestCase=sheet name, Tc2Execute=column name
		
		ArrayList<String> TestCasetoRun = Common_Utility_Methods.ReadDataExcel( "TestCase", "Tc2Execute"); 
		System.out.println(TestCasetoRun);
		
		int count=TestCasetoRun.size();
		
		for (int i=1; i<count; i++)
		{
			String TestCaseName=TestCasetoRun.get(i);
			
			System.out.println("Test Case to Execute is:"+TestCaseName+".");
			
			//call the testcasecclass on runtime by using java,lang.reflect package
			
			Class<?>testclassname=Class.forName("Test_Classes."+TestCaseName);
			
			//call the execute method belonging to the test class captured in variable testclassname by using java.lang.reflect.method class
			
			Method executemethod=testclassname.getDeclaredMethod("extractor");
			
			//set the accessibility of method true
			
			executemethod.setAccessible(true);
			
			//create the instance of testclass captured in variable name testclassname
			
			Object instanceoftestclass=testclassname.getDeclaredConstructor().newInstance();
			
			executemethod.invoke(instanceoftestclass);
		}
		
	}
}



