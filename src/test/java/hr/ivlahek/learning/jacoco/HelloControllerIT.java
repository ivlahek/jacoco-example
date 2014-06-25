package hr.ivlahek.learning.jacoco;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Igor on 22.04.14..
 */
public class HelloControllerIT {

    @Test
    public void should_ping() throws InterruptedException {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForEntity("http://localhost:8080/app/helloworld", Void.class);
    }
}
