/**
 * MovieCategoryRepository.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.repository.library;

import za.ac.cput.entity.generic.MovieCategory;

import java.util.HashSet;
import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieCategoryRepository.java before attempting the tasks below.
 *  > Note that no Update operation is needed here.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *  > Write an implementation of the method you declared in the interface that returns all
 *      moviecategory entities given movieid.
 *  > Write an implementation of the method you declared in the interface that returns all
 *      moviecategory entities given categoryid.
 *
 */

public class MovieCategoryRepository implements IMovieCategoryRepository {

    private Set<MovieCategory> categories;

    private static IMovieRepository repository = null;

    private MovieCategoryRepository(){
        this.categories = new HashSet<>();
    }

    public static IMovieCategoryRepository getRepository(){
        if (repository == null)
            repository = new MovieCategoryRepository();
        return repository;
    }



    @Override
    public MovieCategory create(MovieCategory movieCategory) {
       this.categories.add(movieCategory);
       return movieCategory;
    }

    @Override
    public MovieCategory read(String movieId, String categoryId) {

        for(MovieCategory movieCategory : this.categories){
            if(movieCategory.getMovieId().equalsIgnoreCase(movieId) && movieCategory.getCategoryId().equalsIgnoreCase(categoryId))
            return movieCategory;
        }
        return null;
    }


    @Override
    public boolean delete(String movieId, String categoryId) {

        MovieCategory movieCategory = read(movieId,categoryId);
        if(movieCategory != null)
            this.categories.remove(movieCategory);
    }

    @Override
    public Set<MovieCategory> getAll() {
        return this.categories;
    }

    @Override
    public Set<MovieCategory> getMovieId(String movieId) {
     Set<MovieCategory> categories = new HashSet<>();
     for(MovieCategory movieCategory : this.categoryList){
         if(movieCategory.getMovieId().equalsIgnoreCase(movieId)){
             categories.add(movieCategory);
         }
     }
     return categories;
    }

    @Override
    public Set<MovieCategory> getMovieCategory(String categoryId) {
        Set<MovieCategory> categories = new HashSet<>();
        for(MovieCategory movieCategory: this.categories){
            if(movieCategory.getCategoryId().equalsIgnoreCase(categoryId)){
                categories.add(movieCategory);

            }
        }
        return categories;
    }
}