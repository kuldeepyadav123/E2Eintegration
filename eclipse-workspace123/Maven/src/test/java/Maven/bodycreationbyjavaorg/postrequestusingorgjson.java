package Maven.bodycreationbyjavaorg;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class postrequestusingorgjson 

{
	public static void main(String[] args) {
		
		JSONObject data = new JSONObject();
				data.put("firstname", "kuldeep"); 
				data.put("lastname", "yadav");
				data.put("desg", "software engineer");
				data.put("id", "123");
				data.put("age", "27");
				
				Response res =
					       given()
					       .contentType(ContentType.JSON)
					       .body(data.toString())
					       .when()
					       .post("http://localhost:3000/friends");
					       System.out.println("status code is" + res.statusCode());
					       System.out.println(" data is ");
					       System.out.println(res.asString());
					       
				
	}

}
