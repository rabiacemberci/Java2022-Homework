package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
