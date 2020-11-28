package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class JUnit5TestCase {
    private UploadDestination destination;

    @BeforeEach
    void setUp() {
        destination = new UploadDestination();
    }

    @ParameterizedTest(name = "{index}: location {0} is supported")
    @ValueSource(strings = { "s3a://test", "https://host:9000", "ftp://host/tmp" } )
    public void testLocationIsNotSupported(String location) {
        assertFalse(destination.supports(location));
    }
}