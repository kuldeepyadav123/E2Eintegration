package Maven.Maven;
import org.testng.*;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class getdata {
	
	public static void main(String[] args) 
	
	{
	  Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(" http://localhost:3000/friends");
		System.out.println("status code is"  +res.statusCode());
		System.out.println("data is");
		System.out.println(res.asString());
	
		
		
	}

}
