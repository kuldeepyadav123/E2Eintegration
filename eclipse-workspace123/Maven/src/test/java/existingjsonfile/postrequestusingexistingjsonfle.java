package existingjsonfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;



public class postrequestusingexistingjsonfle
{
	public static void main(String[] args) throws FileNotFoundException {

		
	
	File f = new File ("C:\\Users\\Kuldeep Yadav\\eclipse-workspace123\\Maven\\body.darajson");
  FileReader fr = new FileReader(f);
   JSONTokener js = new JSONTokener(fr);
    JSONObject j = new JSONObject(js);
	
    
    Response res =
    given()
    .contentType(ContentType.JSON)
    .body(j.toString())
     .when()
     .post(" http://localhost:3000/friends");
    
    
    System.out.println("status code is"   + res.statusCode());
    System.out.println("data is");
    System.out.println(res.asString());
    
 
  
   
   
}
}