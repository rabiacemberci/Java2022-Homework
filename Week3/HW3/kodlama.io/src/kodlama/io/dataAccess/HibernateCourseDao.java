package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
