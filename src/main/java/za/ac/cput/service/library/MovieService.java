/**
 * MovieService.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.library;

import za.ac.cput.entity.library.Movie;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieService.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement service using singleton with a link to your repository.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *
 */

//@Service -- remember to uncomment this when you are done with your Controllers
public class MovieService implements IMovieService {
    @Override
    public Movie create(Movie movie) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Movie read(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Movie update(Movie movie) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException();
    }

    // missing method(s)
}
