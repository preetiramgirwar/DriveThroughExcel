package ReuestRepository;

import java.util.ArrayList;
import java.io.IOException;
import Common_API_Methods.Common_Utility_Methods;

public class Post_CreateUser{

	public static String baseURI() {
	String baseURI="https://reqres.in/";
	return baseURI;
	}
	
	public static String Post_Resource() {
		String Resource="api/users";
		return Resource;
	}
	
	public static String Post_TC1() throws IOException {
		ArrayList<String> Req_Data = Common_Utility_Methods.ReadDataExcel("PostCreateUser","TC1");
		System.out.println(Req_Data);
		String Req_name = Req_Data.get(1);
		String Req_job = Req_Data.get(2);
		String Req_salary= Req_Data.get(3);
		String Req_city= Req_Data.get(4);
		
		String RequestBody="{\r\n"
				+ "    \"name\": \""+Req_name+"\",\r\n"
				+ "    \"job\": \""+Req_job+"\",\r\n"
				+ "    \"salary\": \""+Req_salary+"\",\r\n"
				+ "    \"city\": \""+Req_city+"\"\r\n"
				+ "}";
		return RequestBody;
	}
}
		
		
		
		
		
		


