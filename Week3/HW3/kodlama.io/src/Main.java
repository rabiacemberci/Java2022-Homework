import kodlama.io.business.CategoryManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.HibernateCategoryDao;
import kodlama.io.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Logger[] loggers= {new DatabaseLogger()};


        List<Category> categories = new ArrayList<Category>();
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        Category category1 = new Category(1,"Java ");

        categoryManager.add(category1,categories);


        //...
    }
}
