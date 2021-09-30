/**
 * CategoryService.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.service.generic;

import za.ac.cput.entity.generic.MovieCategory;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in ICategoryService.java before attempting the tasks below.
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

public class CategoryService implements ICategoryService {

    @Override
    public MovieCategory create(MovieCategory category) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MovieCategory read(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MovieCategory update(MovieCategory category) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException();
    }

    // missing method(s)
}