package org.pirola.maven.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.pirola.maven.example.MavenExample;

public class TestGreeting {

    @Test
    public void testGetGreeting() {
        assertEquals("Hello World!!!", MavenExample.getGreeting());
    }
}
