package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }


    List<Course> courses=new ArrayList<Course>();
    public void add(Course course, List<Course> courses) throws Exception{

        for(Course course1: courses) {
            if (course1.getCourseName()==course.getCourseName()) {
                throw new Exception("Kategori listesinde aynı isimden iki adet olamaz.");
            }
        }

        if (course.getPrice() < 0){
            throw new Exception("Kurs fiyatı 0 dan küçük olamaz.");
        }

        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + "kurs eklendi");
        }
    }

    public void update(Course course) {
        courseDao.update(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + "kurs güncellendi.");
        }
    }

    public void delete(Course course) {
        courseDao.delete(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName()+ "kurs silindi.");
        }
    }
}
