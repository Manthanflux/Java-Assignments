public class Course {

    private String courseCode;
    private String title;
    private int capacity;
    private int enrolled;

    public Course(String courseCode, String title, int capacity) {

        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public boolean enroll() {

        if (enrolled < capacity) {
            enrolled++;
            return true;
        }

        return false;
    }

    public boolean withdraw() {

        if (enrolled > 0) {
            enrolled--;
            return true;
        }

        return false;
    }

    public boolean isFull() {
        return enrolled == capacity;
    }

    public int getAvailableSeats() {
        return capacity - enrolled;
    }

    public String toString() {
        return "Course Code: " + courseCode +
               ", Title: " + title +
               ", Capacity: " + capacity +
               ", Enrolled: " + enrolled +
               ", Available Seats: " + getAvailableSeats();
    }
}