package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }


    List<Category> categories = new ArrayList<Category>();

    public void add(Category category,List<Category> categories) throws Exception {

        for (Category category1 : categories) {
            if (category1.getCategoryName() == category.getCategoryName()) {
                throw new Exception("Kategori listesinde aynı isimden iki adet olamaz.");
            }
        }
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName() + "kurs eklendi");
        }
    }

    public void update(Category category) {
        categoryDao.update(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName() + "kurs güncellendi.");
        }
    }

    public void delete (Category category) {
        categoryDao.delete(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName()+ "kurs silindi.");
        }
    }
}
