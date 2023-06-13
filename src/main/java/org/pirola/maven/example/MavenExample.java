package org.pirola.maven.example;

import java.io.IOException;

public final class MavenExample {
    private static final String CLASS_NAME = MavenExample.class.getName();

    private MavenExample() {

    }

    public static void main(final String[] args) throws IOException {
        System.out.println("Begin "
            + ReadManifest.getBuildInfo(CLASS_NAME));
        System.out.println(getGreeting());
        ReadManifest.printAllAttributes();
        int sum = addNumbers(2, 3);
        System.out.println("Sum: " + sum);
    }

    public static String getGreeting() {
        return "Hello World!!!";
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
