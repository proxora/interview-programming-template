package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class DemoApplicationTests {

    @Test
    void contextLoads() {
        // nothing to assert, just verifying that spring context loads
        assertTrue(true);
    }

}
