package theme4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class ApiTests {

    @Test
    public void getTest() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        given()
                .header("accept", "application/json")
                .log().all()
                .when()
                .get("/pet/1")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void postTest() {
        Pet myPost = new Pet("John", "available", 1);

        Pet responsePet = given()
                .baseUri("https://petstore.swagger.io/v2")
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .body(myPost)
                .log().all()
                .when()
                .post("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(Pet.class);

        System.out.println("Iм'я з відповіді: " + responsePet.name);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Pet {
        public String name;
        public String status;
        public long id;

        public Pet() {}

        public Pet(String name, String status, long id) {
            this.name = name;
            this.status = status;
            this.id = id;
        }


    }

}