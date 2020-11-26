public interface CourseService {

    public void saveCourse(Course course);

    public Course[] fetchCourses();

    public Course fetchCourseById(long courseId) throws CourseNotFoundException;

    public void deleteCourseById(long courseId);
}
