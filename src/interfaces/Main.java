package interfaces;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        EducationCenter university = new University("KNU", "Bishkek", LocalDate.of(2021, 5, 6));
        EducationCenter school = new School("BGU", "Bishkek", LocalDate.of(2020, 5, 4));
        EducationCenter college = new College("AUCA", "Bshkek", LocalDate.of(2022, 3, 2));

        Student[] students = {
                new Student("Saikal", "Kasmaalieva", "Female", LocalDate.of(2021, 9, 1), university),
                new Student("Aiana", "Urmatova", "Female", LocalDate.of(2015, 9, 1), school),
                new Student("Aizat", "Duisheeva", "Female", LocalDate.of(2021, 9, 1), university),
                new Student("Adelina", "Akunova", "Female", LocalDate.of(2021, 9, 1), university),
                new Student("Adilmyrza", "Satymbekov", "Male", LocalDate.of(2010, 9, 1), school),
                new Student("Shabdan", "Jalilov", "Male", LocalDate.of(2010, 9, 1), school),
                new Student("Sanjar", "Orozbekov", "Male", LocalDate.of(2013, 9, 1), school),
                new Student("Symbat", "Salyamov", "Male", LocalDate.of(2013, 9, 1), school),
                new Student("Aijamal", "Jamalidinova", "Female", LocalDate.of(2021, 9, 1), university)
        };

        for (Student student : students) {
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
        }

    }
}
