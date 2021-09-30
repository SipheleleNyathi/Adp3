/**
 * IRepository.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.repository;

/**
 * Instructions
 *   > Do NOT modify this file.
 *   > Your repository should be implemented using any Java data structure of your choosing.
 *
 * @param <T>
 * @param <ID>
 */
public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}