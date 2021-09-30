/**
 * MovieRepository.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.repository.library;

import za.ac.cput.entity.generic.MovieCategory;
import za.ac.cput.repository.generic.CategoryRepository;
import za.ac.cput.repository.generic.ICategoryRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *
 */
public class MovieRepository implements IMovieRepository {
    private Set<MovieCategory> categories;
    private static IMovieRepository repository = null;

    private MovieRepository(){
        this.categories = new HashSet<>();
    }

    public static ICategoryRepository getRepository(){
        if (repository == null)
            repository = new MovieRepository();
        return repository;
    }


    @Override
    public MovieCategory create(MovieCategory category) {
        this.categories.add(category);
        return category;
    }

    @Override
    public MovieCategory read(String categoryId) {

        for(MovieCategory category: this.categories){
            if(category.getId().equalsIgnoreCase(categoryId))
                return category;
        }
        return null;
    }

    @Override
    public MovieCategory update(MovieCategory category) {
        MovieCategory read = read(category.getId());

        if(read != null){
            this.categories.remove(read);
            this.categories.add(category);
            return category;
        }
        return null;
    }

    @Override
    public boolean delete(String categoryId) {
        MovieCategory category = read(categoryId);
        if(category != null)
            this.categories.remove(category);
    }

    public Set<MovieCategory> getAll() {
        return this.categories;
    }
}
