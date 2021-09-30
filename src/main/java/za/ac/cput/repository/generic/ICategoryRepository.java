/**
 * ICategoryRepository.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.repository.generic;

import za.ac.cput.entity.generic.MovieCategory;
import za.ac.cput.repository.IRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Declare a getall method suitable for your choice of data structure.
 */
public interface ICategoryRepository extends IRepository<MovieCategory, String> {
    Set<MovieCategory> getAll();
}