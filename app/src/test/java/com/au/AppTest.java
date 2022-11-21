/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.au;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.lang.WordUtils;

class AppTest {
    @Test void appHasAGreeting(){
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void appCapitalises() {
        String test_str1 = "test case";
        App classUnderTest = new App();
        String result = "";
        try {
            result = classUnderTest.capitaliseMessage(test_str1);
        }
        catch(Exception e){
            System.out.println("Test Failed");
        }
        assertEquals(result, "Test Case");
    }
}
