public class Teacher {
    private String name;
    private String subject;
    private String teacherId;

    public Teacher(String name, String subject, String teacherId) {
        this.name = name;
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{name='" + name + "', subject='" + subject + "', teacherId='" + teacherId + "'}";
    }
}