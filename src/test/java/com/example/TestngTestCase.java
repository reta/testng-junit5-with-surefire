package com.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestngTestCase {
    private UploadDestination destination;

    @BeforeMethod
    void setUp() {
        destination = new UploadDestination();
    }
    
    @DataProvider(name = "locations")
    public static Object[] locations() {
        return new Object[] { "s3://test", "http://host:9000", "sftp://host/tmp" };
    }

    @Test(dataProvider = "locations")
    public void testLocationIsSupported(String location) {
        assertTrue(destination.supports(location));
    }
}