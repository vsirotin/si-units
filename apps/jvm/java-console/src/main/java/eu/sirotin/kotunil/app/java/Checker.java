package eu.sirotin.kotunil.app.java;

import eu.sirotin.kotunil.core.Expression;

public class Checker {

    public static<T1 extends Expression, T2 extends Expression> void check(T1 a, T2 b) {
        TestStatistics.numberTests++;
        if (a.compareTo(b) == 0) return;
        throw new IllegalArgumentException("Expected '%s' but is '%s'".formatted(a, b));
    }

    public static void check(Double a, Double b) {
        double maxDif = 0.0000001;
        TestStatistics.numberTests++;
        if (Math.abs(a - b) < maxDif) return;
        throw new IllegalArgumentException("Expected '%s' but is '%s'".formatted(a, b));
    }

    public static void check(String a, String b) {
        TestStatistics.numberTests++;
        if (a.equals(b)) return;
        throw new IllegalArgumentException("Expected '%s' but is '%s'".formatted(a, b));
    }

    public static void check(Boolean a) {
        TestStatistics.numberTests++;
        if (a) return;
        throw new IllegalArgumentException("Expected True but is False");
    }
}

