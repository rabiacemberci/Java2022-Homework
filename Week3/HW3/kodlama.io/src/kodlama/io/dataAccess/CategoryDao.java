package kodlama.io.dataAccess;

import kodlama.io.entities.Category;
import kodlama.io.entities.Instructor;

public interface CategoryDao {
    void add(Category category);

    void update(Category category);

    void delete(Category category);
}
