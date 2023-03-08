package eu.sirotin.kotunil.app.java;

import static java.lang.System.exit;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome in KotUniL console test!");
        try {
            testAll();
        } catch (Throwable e) {
            e.printStackTrace(System.out);
            exit(1);
        }
        System.out.println("");
        System.out.println("Test successfully completed!");
        System.out.println("A total of ${TestStatistics.numberTestedObjects} KotUniL's objects tested with ${TestStatistics.numberTests} tests. ");
    }

    private static void testAll() {
        TutorialTest.testTutorial();
    }

}
