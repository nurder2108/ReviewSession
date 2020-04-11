import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.*;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class RestApii {
    @Test
    public void getUsersTest(){
        /*
        Send a get request to https://reqres.in/api/uesrs
        Including query param -> page=2
        Accept type is json
        Verify status code 200 , verify response body

       */
      Response response =  given().accept(ContentType.JSON)
                .and().params("param", 2)
                .when().get("https://reqres.in/api/uesrs");
        System.out.println(response.statusLine());
        System.out.println(response.getContentType());
        System.out.println(response.headers());
        System.out.println(response.body().asString());

        Assert.assertTrue(response.contentType().contains(""));

    }
}
