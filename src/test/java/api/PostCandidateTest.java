package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class PostCandidateTest {

    @Test
    public void testCandidatePostStatusCode() {
        CandidatePayload payload = new CandidatePayload();

        Response response = RestAssured.given()
                .baseUri("https://opensource-demo.orangehrmlive.com")
                .basePath("/web/index.php/api/v2/recruitment/candidates")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Origin", "https://opensource-demo.orangehrmlive.com")
                .header("Referer", "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/addCandidate")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36")
                .header("Cookie", "orangehrm=5lha6k73qdl3vbl4ie3nukpth4; orangehrm=8t90uitphhf4mjj6gbvv1mfijt")
                .header("Connection", "keep-alive")
                .header("Accept-Language", "en-US,en;q=0.9")
                .header("Accept-Encoding", "gzip, deflate, br")
                .body(payload)
                .when().log().all()
                .post();
        assertEquals(response.getStatusCode(), 200);
        CandidateResponse resp = response.as(CandidateResponse.class);
        assertEquals(resp.getData().getEmail(), "omar@test.com");
        System.out.println("Candidate ID: " + resp.getData().getId());
    }
}
