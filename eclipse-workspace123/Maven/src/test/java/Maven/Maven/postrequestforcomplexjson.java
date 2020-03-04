package Maven.Maven;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class postrequestforcomplexjson 
{
	public static void main(String[] args) 
	{
		
		Adressdetail address = new Adressdetail();
		address.setHouseno("23");
		address.setSector("23");
		address.setLandmark("ABC");
		
		Basicinformation basic = new Basicinformation();
       basic.setFirstname("kuldeep");
       basic.setLastname("yadav");
       basic.setAge("28");
       basic.setDesignation("software engineer");
       basic.setAddress(address);
		
       Response res =
       given()
       .contentType(ContentType.JSON)
       .body(basic)
       .when()
       .post("http://localhost:3000/friends");
       System.out.println("status code is" + res.statusCode());
       System.out.println(" data is ");
       System.out.println(res.asString());
       
		
	}

}
