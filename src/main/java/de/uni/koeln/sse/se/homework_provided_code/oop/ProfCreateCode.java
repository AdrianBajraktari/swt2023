package de.uni.koeln.sse.se.homework_provided_code.oop;

import java.util.ArrayList;

public class ProfCreateCode {
    public static void main(String[] args) {
        Person myProf = new Professor("Andreas", "Vogelsang",
                "Software & Systems Engineering", 39,
                new ArrayList<Lecture>(),
                new ArrayList<Publication>(),
                new ArrayList<Student>());
    }


    /** The below classes are only stubs so that the above code is not marked as erroneous. **/

    private static class Professor extends Person {
        Thread t;

        public Professor(String andreas, String vogelsang, String s, int i, ArrayList<Lecture> lectures, ArrayList<Publication> publications, ArrayList<Student> students) {
        }
    }
    private static class Lecture {}
    private static class Person {}
    private static class Publication {}
}
