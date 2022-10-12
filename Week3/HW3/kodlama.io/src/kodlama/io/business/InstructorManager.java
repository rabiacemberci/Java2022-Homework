package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {

        this.instructorDao.add(instructor);
        System.out.println(instructor.getName() + " " + instructor.getSurname() + "eklendi.");

        for (Logger logger :loggers){
            logger.log(instructor.getName()+ " " + instructor.getSurname() + "eklendi.");
        }

    }

    public void delete(Instructor instructor) {

        this.instructorDao.delete(instructor);
        System.out.println(instructor.getName() + " " + instructor.getSurname() + "silindi.");

        for (Logger logger :loggers){
            logger.log(instructor.getName()+ " " + instructor.getSurname() + "silindi.");
        }
    }
    public void update(Instructor instructor) {

        this.instructorDao.update(instructor);
        System.out.println(instructor.getName() + " " + instructor.getSurname() + "güncellendi.");

        for (Logger logger :loggers){
            logger.log(instructor.getName()+ " " +instructor.getSurname() + "güncellendi.");
        }
    }
}
