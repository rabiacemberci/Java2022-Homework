package kodlama.io.dataAccess;

import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

public interface CourseDao {
    void add(Course course);

    void update(Course course);

    void delete(Course course);
}
