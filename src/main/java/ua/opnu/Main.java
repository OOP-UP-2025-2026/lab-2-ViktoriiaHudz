package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Вікторія Гудз", 2);

        s1.addCourse("Об'єктно орієнтоване програмування");
        s1.addCourse("Засоби ШІ");
        s1.addCourse("Теорія алгоритмів");
        s1.addCourse("Теорія ймовірності");
        s1.addCourse("Українська мова");
        s1.addCourse("Організація баз даних");

        System.out.println(s1.getName() + ": кількість вивчаємих дисциплін - " + s1.getCourseCount());
        System.out.println(s1.getName() + ": рік навчання - " + s1.getYear());
        System.out.println(s1.getName() + ": заплатив за навчання - " + s1.getTuition() + " грн");
    }
}
