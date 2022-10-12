package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
