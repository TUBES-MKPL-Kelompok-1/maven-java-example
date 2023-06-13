package org.pirola.maven.example;

import org.junit.Assert;
import org.junit.Test;

public class MavenExampleTest {
    
    @Test
    public void testGetGreeting() {
        String greeting = MavenExample.getGreeting();
        Assert.assertEquals("Hello World!!!", greeting);
    }
}
