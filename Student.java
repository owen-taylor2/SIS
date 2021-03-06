import java.util.ArrayList;

public class Student {
    private String name; // String containing the name of the student.
    private ArrayList<Course> transcript = new ArrayList<>(); // Arraylist holding each course.

    //////////////////
    // Constructors //
    //////////////////

    public Student(String name) {
        setName(name);
    }

    ///////////////////////
    // GETTERS & SETTERS //
    ///////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getTranscript() {
        return transcript;
    }

    public void setTranscript(ArrayList<Course> transcript) {
        this.transcript = transcript;
    }

    public Course getCourse(int index) {
        return getTranscript().get(index);
    }

    public Course getCourse(Course c) { // Overidden Method to return instead based off given Course c
        return getTranscript().get(getTranscript().indexOf(c));
    }

    public void setCourse(Course c) {
        getTranscript().add(c);
    }

    public void setCourse(Course c, int index) { // Overidden Method to add new Course c at given index
        getTranscript().add(index, c);
    }

    //////////////
    // METHODS //
    /////////////

}
