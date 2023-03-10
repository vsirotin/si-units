package eu.sirotin.kotunil.app.java;

import static java.lang.System.exit;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome in KotUniL console test!");
        try {
            testAll();
        } catch (Throwable e) {
            System.err.println("Test failed with Throwable e=" + e.getMessage());
            e.printStackTrace(System.err);
            exit(1);
        }
        System.out.println("Test successfully completed!");
        System.out.println("A total of " + TestStatistics.numberTestedObjects
                + " KotUniL's objects tested with " + TestStatistics.numberTests + " tests. ");
    }

    private static void testAll() {
        new TutorialTest().testTutorial();
    }

}
