
import DeveloperCart.DeveloperCart;
import ListResponse.ListResponse;
import Model.Root;
import TesterCart.TestersCart;
import com.google.gson.Gson;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.*;

public class Trello_API {

//    public void loginTrello(){
//        baseURI = "https://api.trello.com/1/boards/";
//    }


    private static String boardID;
    private static String listID;
    private static String developerID;
    private static String testerID;



    @Test(priority = 1)
    public void createBoard() {

        Response post = given()
                .baseUri("https://api.trello.com/1/boards/")
                .queryParam("name", "Testinium")
                .queryParam("key", "9f8e638205cbddaf82112ae70ac9c44e")
                .queryParam("token", "ATTA3f818074767634b7fc9a396c79e3450e8eac4d589f23bf42a3e407aef6f01c60F52F9843")
                .header("Content-Type", "application/json")
                .post()
                .then()
                .statusCode(200)
                .extract().response();
//        ResponseBody body = post.getBody();
//        System.out.println(body.prettyPrint());
        String res = post.asString();
        Root root = new Gson().fromJson(res, Root.class);
        System.out.println("root.getId() = " + root.getId());
        boardID = root.getId();


    }

    @Test(priority = 2)
    public void createList() {

        Response response = given()
                .baseUri("https://api.trello.com/1/lists")
                .queryParam("name", "Check List")
                .queryParam("idBoard", boardID)
                .queryParam("key", "9f8e638205cbddaf82112ae70ac9c44e")
                .queryParam("token", "ATTA3f818074767634b7fc9a396c79e3450e8eac4d589f23bf42a3e407aef6f01c60F52F9843")
                .header("Content-Type", "application/json")
                .post()
                .then()
                .statusCode(200)
                .extract().response();


        String res = response.asString();
        ListResponse listResponse = new Gson().fromJson(res, ListResponse.class);
        System.out.println("listResponse = " + listResponse.getId());
        listID = listResponse.getId();
    }

    @Test(priority = 3)
    public void createDevelopersCart() {

        Response response = given()
                .baseUri("https://api.trello.com/1/cards")
                .queryParam("name", "Developers")
                .queryParam("idList", listID)
                .queryParam("key", "9f8e638205cbddaf82112ae70ac9c44e")
                .queryParam("token", "ATTA3f818074767634b7fc9a396c79e3450e8eac4d589f23bf42a3e407aef6f01c60F52F9843")
                .header("Content-Type", "application/json")
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        String res = response.asString();
        DeveloperCart developerCart = new Gson().fromJson(res, DeveloperCart.class);
        System.out.println("developerCart = " + developerCart.getId());
        developerID = developerCart.getId();
    }

    @Test(priority = 4)
    public void createTestersCart() {

        Response response = given()
                .baseUri("https://api.trello.com/1/cards")
                .queryParam("name", "Testers")
                .queryParam("idList", listID)
                .queryParam("key", "9f8e638205cbddaf82112ae70ac9c44e")
                .queryParam("token", "ATTA3f818074767634b7fc9a396c79e3450e8eac4d589f23bf42a3e407aef6f01c60F52F9843")
                .header("Content-Type", "application/json")
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        String res = response.asString();
        TestersCart testersCart = new Gson().fromJson(res, TestersCart.class);
        System.out.println("testersCart = " + testersCart.getId());
        testerID = testersCart.getId();
    }

    @Test(priority = 5)
    public void randomChoose(){

        String[] ids = new String[]{testerID, developerID};
        int i = new Random().nextInt(ids.length);
        String randomCart = ids[i];

        System.out.println("randomCart="+randomCart);

        Response response = given()
                .baseUri("https://api.trello.com/1/cards/"+randomCart)
                .queryParam("name", "New Tester")
                .queryParam("key", "9f8e638205cbddaf82112ae70ac9c44e")
                .queryParam("token", "ATTA3f818074767634b7fc9a396c79e3450e8eac4d589f23bf42a3e407aef6f01c60F52F9843")
                .header("Content-Type", "application/json")
                .put()
                .then()
                .statusCode(200)
                .extract().response();

    }

    @Test(priority = 6)
    public void deleteDeveloper(){
        Response response = given()
                .baseUri("https://api.trello.com/1/cards/"+developerID)
                .queryParam("key", "9f8e638205cbddaf82112ae70ac9c44e")
                .queryParam("token", "ATTA3f818074767634b7fc9a396c79e3450e8eac4d589f23bf42a3e407aef6f01c60F52F9843")
                .header("Content-Type", "application/json")
                .delete();

    }

    @Test(priority = 7)
    public void deleteTester(){
        Response response = given()
                .baseUri("https://api.trello.com/1/cards/"+testerID)
                .queryParam("key", "9f8e638205cbddaf82112ae70ac9c44e")
                .queryParam("token", "ATTA3f818074767634b7fc9a396c79e3450e8eac4d589f23bf42a3e407aef6f01c60F52F9843")
                .header("Content-Type", "application/json")
                .delete();

    }

    @Test(priority = 8)
    public void deleteBoard(){
        Response response = given()
                .baseUri("https://api.trello.com/1/boards/"+boardID)
                .queryParam("key", "9f8e638205cbddaf82112ae70ac9c44e")
                .queryParam("token", "ATTA3f818074767634b7fc9a396c79e3450e8eac4d589f23bf42a3e407aef6f01c60F52F9843")
                .header("Content-Type", "application/json")
                .delete();
    }




}
