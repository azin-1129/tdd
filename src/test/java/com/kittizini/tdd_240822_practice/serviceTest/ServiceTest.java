package com.kittizini.tdd_240822_practice.serviceTest;

import com.kittizini.tdd_240822_practice.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@Slf4j
public class ServiceTest {
    @Autowired
    private TestService testService;

    @BeforeEach
    public void before(){
        log.info("테스트 이전에 실행됩니다. 🐈");
    }

    @AfterEach
    public void after(){
        log.info("테스트 이후에 실행됩니다. ⚽");
    }

    @Test
    @DisplayName("두 수가 일치하면 성공입니다.")
    public void test() throws Exception{
        // Given
        int number=0;
        log.info("Given");

        // When
        int generateNumber=testService.generate();
        log.info("When");

        // Then
        assertThat(generateNumber).isEqualTo(number);
        log.info("Then");
    }

    @Test
    @DisplayName("두 수가 일치하지 않아야 성공입니다.")
    public void test2() throws Exception{
        // Given
        int number=0;
        log.info("Given");

        // When
        int generateNumber=testService.generate();
        log.info("When");

        // Then
        assertThat(generateNumber).isNotEqualTo(number);
        log.info("Then");
    }
}