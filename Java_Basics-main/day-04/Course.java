public class Course {

    private int courseId;
    private String name;
    private double duration; // months
    private double price;
    private double rating;

    public Course(int courseId, String name, double duration, double price, double rating) {
        this.courseId = courseId;
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.rating = rating;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}