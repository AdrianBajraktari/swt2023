package de.uni.koeln.sse.se.object_identity;

import java.util.Arrays;

public class OID {
    private static Object[] copy(Object[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static void main(String[] args) {
        Student[] students = new Student[] {new Student("Tom"), new Student("Alice")};
        Student[] students2 = (Student[]) copy(students);

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(students2));
        students[0].name = "Tim";
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(students2));
    }

    private static class Student {
        String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
