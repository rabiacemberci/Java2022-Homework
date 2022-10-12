package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
