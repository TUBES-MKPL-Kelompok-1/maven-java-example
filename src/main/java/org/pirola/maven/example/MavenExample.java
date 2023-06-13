package org.pirola.maven.example;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public final class MavenExample {
    private static final String CLASS_NAME = MavenExample.class.getName();

    private MavenExample() {

    }

    public static void main(final String[] args) throws IOException {
        System.out.println("Begin " + ReadManifest.getBuildInfo(CLASS_NAME));
        System.out.println(getGreeting());
        ReadManifest.printAllAttributes();
    }

    public static String getGreeting() {
        return "Hello World!!!";
    }

    @Test
    public void testGetGreeting() {
        String greeting = getGreeting();
        assertEquals("Hello dunia!!!", greeting);
    }
}
