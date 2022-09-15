package view.tm;

public class CourseTm {
    private String courseId;
    private String courseName;
    private String duration;

    public CourseTm() {
    }

    public CourseTm(String courseId, String courseName, String duration) {
        this.setCourseId(courseId);
        this.setCourseName(courseName);
        this.setDuration(duration);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "CourseTm{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
