package tiwari.io.baseapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import tiwari.io.baseapi.dto.DisplayNameResponse;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DisplayNameControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void returnsDefaultDisplayName() {
        String url = "http://localhost:" + port + "/api/display-name";
        ResponseEntity<DisplayNameResponse> resp = restTemplate.getForEntity(url, DisplayNameResponse.class);
        assertEquals(200, resp.getStatusCodeValue());
        assertEquals("GitHub Copilot", resp.getBody().getDisplayName());
    }
}
