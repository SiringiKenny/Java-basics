import java.util.Scanner;
public class CourseClient {

    static CourseService courseService = new CourseServiceImpl();

    public static void coursesMain() {
        Scanner sc1 = new Scanner(System.in);
        

        Course angular = new Course(1, "Angular", 2, 1234, 4.5);
        Course java = new Course(2, "Java", 1, 2321, 3.4);
        Course python = new Course(3, "python", 1.5,3444,4.5);
        Course cPlus = new Course(4, "c++", 2.5,3344,3.5);

        System.out.println("Please select the option");
        System.out.println("1 -> Save");
        System.out.println("2 -> List");
        System.out.println("3 -> Fetch Course by id");
        System.out.println("4 -> Delete Course by id");


        int option = sc1.nextInt();
        switch (option) {
            case 1:
                courseService.saveCourse(angular);
                courseService.saveCourse(java);
                courseService.saveCourse(python);
                courseService.saveCourse(cPlus);

                break;

            case 2:
                Course[] allCourses = courseService.fetchCourses();
                System.out.println("Courses \t Course Id");
                for (Course i : allCourses) {
                    if (i != null) {
                        System.out.println(i.getCourseId()  +"\t\t  " + i.getName());
                    }
                }

                break;

            case 3:
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter id");
                int id = sc.nextInt();
                try {
                    Course fetchedCourse = courseService.fetchCourseById(id);
                    if (fetchedCourse != null)
                        System.out.println("Fetched Course by id : " + fetchedCourse.getName());
                } catch (CourseNotFoundException exception) {
                    System.out.println("Course with given id is not present");
                    System.out.println(exception.getMessage());
                }

                break;

            case 4:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Enter id");
                int id1 = sc2.nextInt();
                courseService.deleteCourseById(id1);

                break;
            default:
                courseService.saveCourse(angular);

        }
        System.out.println("Press 1 to continue");
        System.out.println("Press 0 to exit");
        int input = sc1.nextInt();
        if(input == 1){
        coursesMain();
        }
        
        sc1.close();

    }
    public static void main(String args[]) {

        coursesMain();

    }
}
