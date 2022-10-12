package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

public class JdbcCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
