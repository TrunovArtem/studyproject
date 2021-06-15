package symbolsystems.apitest;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class LoginPageApi {
    @Test
    public void getMainPage() {
        String response =
                given()
                        .baseUri("http://www.symbolsystems.com.ua")
                        .basePath("/auth")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .and()
                        .extract()
                        .body()
                        .asPrettyString();
        System.out.println(response);
    }

    @Test
    public void postIncorrectLogin() {
        String login = "121%40gmail.com";
        String password = "supersecretpass";
        given()
                .baseUri("http://www.symbolsystems.com.ua/")
                .basePath("/auth")
                .body("enter=1&user_login="+login+"&user_pw="+password)
                .when()
                .post()
                .then()
                .statusCode(200);
    }


}
