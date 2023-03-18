package eu.sirotin.kotunil.app.java;

import eu.sirotin.kotunil.core.Expression;

import java.util.HashSet;
import java.util.Set;

public class Checker {

    private static final Set<String> objectTypes = new HashSet<>();
    private static final Set<Expression> objects = new HashSet<>();
    public static Integer numberTests = 0;

    public static Integer getNumberTestedObjects() {
        return objects.size();
    }

    public static Integer getNumberTestedObjectTypes() {
        return objectTypes.size();
    }

    public static<T1 extends Expression, T2 extends Expression> void check(T1 a, T2 b) {
        numberTests++;

        tryAddObject(a);
        tryAddObject(b);

        if (a.compareTo(b) == 0) return;
        throw new IllegalArgumentException("Expected '%s' but is '%s'".formatted(a, b));
    }

    private static <T1 extends Expression> void tryAddObject(T1 a) {
        String u = a.unitSymbols();
        objectTypes.add(u);
        objects.add(a);
    }

    public static void check(Double a, Double b) {
        double maxDif = 0.0000001;
        numberTests++;
        if (Math.abs(a - b) < maxDif) return;
        throw new IllegalArgumentException("Expected '%s' but is '%s'".formatted(a, b));
    }

    public static void check(String a, String b) {
        numberTests++;
        if (a.equals(b)) return;
        throw new IllegalArgumentException("Expected '%s' but is '%s'".formatted(a, b));
    }

    public static void check(Boolean a) {
        numberTests++;
        if (a) return;
        throw new IllegalArgumentException("Expected True but is False");
    }


}

