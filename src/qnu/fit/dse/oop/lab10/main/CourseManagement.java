package qnu.fit.dse.oop.lab10.main;

import qnu.fit.dse.oop.lab10.models.Course;
import qnu.fit.dse.oop.lab10.services.CourseService;
import qnu.fit.dse.oop.lab10.utils.Constant;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CourseManagement {

    private static List<Course> listNewCourse;
    private static List<Course> listCourse;

    public static void main(String[] args) {
        String choice, status, studentId, courseId;
        List<Course> courseByStudent;
        CourseService courseService = new CourseService();
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("---------------------MENU--------------------");
                System.out.println("""
                        1. Create new Course\

                        2. Save to File\

                        3. Sort by Id
                        4. Find by Student\

                        5. Remove course\

                        6. Course Statistic
                        7. Exit\s""");

                System.out.print("Select: ");
                choice = scanner.nextLine();
                choice = choice.trim();
                switch (choice) {
                    // Create new Course
                    case Constant.INPUT:
                        if (listNewCourse != null) {
                            listNewCourse.clear();
                        }
                        listNewCourse = courseService.createCourse(scanner);
                        System.out.println("Input done!");
                        break;
                    // Save to file
                    case Constant.SAVE:
                        try {
                            if (listNewCourse == null) {
                                throw new Exception();
                            }
                            status = courseService.save(listNewCourse);
                            System.out.println("Save: " + status);
                        } catch (Exception e) {
                            System.out.println("Save Fail!");
                        }
                        break;
                    // Sort from file
                    case Constant.SORT:
                        if (listCourse != null) {
                            listCourse.clear();
                        }
                        try {
                            listCourse = courseService.getAll();
                            if (listCourse == null) {
                                throw new IOException();
                            }
                            courseService.sortAndDisplay(listCourse);
                        } catch (IOException e) {
                            System.out.println("No data");
                        }
                        break;
                    // Search all the courses that a student has taken
                    case Constant.SEARCH:
                        try {
                            System.out.println("Enter student id: ");
                            studentId = scanner.nextLine();
                            courseByStudent = courseService.getByStudent(studentId);
                            if (courseByStudent == null) {
                                throw new IOException();
                            }
                            System.out.println("---List of Students---");
                            for (Course course : courseByStudent) {
                                System.out.println(course.getId() + "\t"
                                        + course.getTitle() + "\t"
                                        + course.getCredit()
                                        + "\t" + course.getEnrollment());
                            }
                        } catch (IOException e) {
                            System.out.println("No Data!");
                        }
                        break;
                    // Remove a course from list courses
                    case Constant.REMOVE:
                        System.out.println("Enter course id to remove: ");
                        courseId = scanner.nextLine();
                        try {
                            status = courseService.remove(courseId);
                            System.out.println("Remove: " + status);
                        } catch (Exception e) {
                            System.out.println("Remove Fail!");
                        }
                        break;
                    // Course statistic
                    case Constant.STATS:
                        if (listCourse != null) {
                            listCourse.clear();
                        }
                        try {
                            listCourse = courseService.getAll();
                            if (listCourse == null) {
                                throw new IOException();
                            }
                            for (Course course : listCourse) {
                                System.out.println("---" + course.getId() + "----");
                                for (Map.Entry<String, Integer> entry : course.getStatistic()
                                        .entrySet()) {
                                    System.out.println(entry.getKey()
                                            + " " + entry.getValue());
                                }
                            }
                        } catch (IOException e) {
                            System.out.println("No data");
                        }
                        break;
                    default:
                        choice = Constant.EXIT;
                        break;
                }
            } while (!choice.equalsIgnoreCase(Constant.EXIT));
        }
    }

}