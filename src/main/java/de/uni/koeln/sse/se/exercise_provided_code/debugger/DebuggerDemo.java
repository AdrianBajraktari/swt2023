package de.uni.koeln.sse.se.exercise_provided_code.debugger;

public class DebuggerDemo {
    private static float[] values;

    public static void main(String[] args) {
        for(int i = 0; i < values.length - 1; i++) {
            values[i] = i;
        }

        System.out.println(myAddMethod(values[0], values[1]));
        System.out.println(myDivMethod(values[values.length-2], values[values.length-1]));
    }

    public static float myAddMethod(float a, float b) {
        return a + b;
    }

    public static float myDivMethod(float a, float b) {
        return a / b;
    }


    public class Inner {

    }
}
