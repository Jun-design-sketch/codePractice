package Generic;

interface Comparable<T> {
    int compareTo(T other);
}
public class Student implements Comparable<Student>{
    private int id;

    public Student(int id) {
        this.id = id;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}
