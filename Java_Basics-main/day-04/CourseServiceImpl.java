import java.util.Arrays;

public class CourseServiceImpl implements CourseService {

    private Course[] courses = new Course[10];
    private static int counter = 0;
    private int noOfCourses = this.courses.length;

    public void saveCourse(Course course) {

        if (counter < noOfCourses) {
            courses[counter++] = course;
        } else {
            System.out.print("No more course can be added...");
        }
    }

    public Course[] fetchCourses() {
        return this.courses;
    }

    public Course fetchCourseById(long courseId) throws CourseNotFoundException {
        for (int index = 0; index < counter; index++) {
            if (this.courses[index].getCourseId() == courseId)

                return this.courses[index];
        }
        throw new CourseNotFoundException("Course with given id not present");
    }

    public void deleteCourseById(long courseId) {
        int tempCounter = counter;
        Course[] temp = new Course[noOfCourses];
        for (int index = 0; index < tempCounter; index++) {
            temp[index] = this.courses[index];
        }
        counter = 0;

        for (int index = 0; index < tempCounter; index++) {
            courses[index] = null;
        }

        for (int index = 0; index < tempCounter && temp[index] != null; index++) {
            if (temp[index].getCourseId() != courseId) {
                this.saveCourse(temp[index]);
            }
        }
        System.out.println("Deleted Successfully");
    }

}
