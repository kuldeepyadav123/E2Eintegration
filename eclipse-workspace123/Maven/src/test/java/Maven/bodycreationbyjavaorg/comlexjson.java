package Maven.bodycreationbyjavaorg;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class comlexjson 
{

	public static void main(String[] args) 
	{
		
		JSONObject basicinformation = new JSONObject();
		basicinformation.put("firstname", "kuldeep");
		basicinformation.put("lastname", "singh");
		basicinformation.put("age", "27");
		
		basicinformation.put("desg", "QA");
		
		basicinformation.put("id", "12350");
		
		
		
		JSONObject address = new JSONObject();
		address.put("sector", "25");
		address.put("ward no", "15");
		address.put("Location", "india");
		basicinformation.put("Address", address);
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
