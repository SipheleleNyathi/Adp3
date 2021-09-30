/**
 * MovieRepositoryTest.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.repository.library;

import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import static org.apache.logging.log4j.util.LambdaUtil.getAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.library.Movie;
import za.ac.cput.factory.generic.CategoryFactory;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in MovieRepository.java before attempting tasks below.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 *
 * Tasks:
 *  > Replace the throw exception with test case for the create method.
 *  > Replace the throw exception with test case for the read method.
 *  > Replace the throw exception with test case for the update method.
 *  > Replace the throw exception with test case for the delete method.
 *  > Write a test case for the getall method.
 *  > Ensure your tests run in a right order (Hint: method name ascending).
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class MovieRepositoryTest {

    private static Category category = CategoryFactory.createCategory("Comedy");
            private MovieRepository repository = IMovieRepository.getRepository();

            @Before
            public void setUp(){
                System.out.println("Category: " + category );
            }

    @Test
    void a_create() {
        Category inserted = repository.create(category);
        assertEquals(inserted.getId(), category.getId());
        System.out.println("Inserted: " + inserted);
    }

    @Test
    void b_read() {
                Category read = repository.read(category.getId());
                assertNotNull(read);
        System.out.println("Read: " + read);
    } 

    @Test
    void c_update() {
                Category updated = new Category.builder().copy(category)
                        .genre("Action").build();
                updated = repository.update(updated);
                assertEquals(updated.getId(), category.getid());
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
                repository.delete(category.getId());
    }
    @Test
    public void d_getAll(){
                Set<Category> categories = repository.getAll();
                assertEquals(1, categories.size());
        System.out.println("Categories");
    }

}