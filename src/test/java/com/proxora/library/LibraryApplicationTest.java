package com.proxora.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LibraryApplicationTest {

    @Test
    void contextLoads() {
        // nothing to assert, just verifying that spring context loads
        assertThat(true).isTrue();
    }

}
