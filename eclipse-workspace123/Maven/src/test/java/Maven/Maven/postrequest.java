package Maven.Maven;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
public class postrequest 
{
	public static void main(String[] args)
{
	
	bodydata  body = new bodydata();
	body.setId("");
	body.setFirstname("kuldeep");
	body.setAge("27");
	body.setLastname("yadav");
	body.setDesignation("QA");
	
	Response res=
	given()             
	.contentType(ContentType.JSON)
	.body(body)
	.when()
	.post("http://localhost:3000/friends");
	System.out.println("status code is"  +  res.statusCode());
	System.out.println("data is");
	System.out.println(res.asString());
	
}

}
