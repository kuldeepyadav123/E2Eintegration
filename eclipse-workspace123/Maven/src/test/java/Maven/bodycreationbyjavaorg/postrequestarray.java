package Maven.bodycreationbyjavaorg;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class postrequestarray 
{
  public static void main(String[] args) 
  {
	  JSONObject basicinformation = new JSONObject();
		basicinformation.put("firstname", "kuldeep");
		basicinformation.put("lastname", "singh");
		basicinformation.put("age", "27");
		 
		
		
		JSONObject secondaryaddress = new JSONObject();
		secondaryaddress.put("secctor", "primary_ sector");
		secondaryaddress.put("wardno", "1");
		secondaryaddress.put("landmark", "noida");
		
		JSONObject primaryaddress = new JSONObject();
		primaryaddress.put("house no ", "12");
		primaryaddress.put("place", "noida");
		
		basicinformation.put("Address", primaryaddress);
		basicinformation.put("Address2", secondaryaddress);
		Response res =
			       given()
			       .contentType(ContentType.JSON)
			       .body(basicinformation.toString())
			       .when()
			       .post("http://localhost:3000/friends");
			       System.out.println("status code is" + res.statusCode());
			       System.out.println(" data is ");
			       System.out.println(res.asString());
			       
		
		
		
		
	  
	
}

}
