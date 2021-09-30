/**
 * CategoryFactoryTest.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.factory.generic;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.generic.MovieCategory;

/**
 * Do NOT implement this code
 */
class CategoryFactoryTest {

    //Don't have to do!!!
    @Test
    void createCategory() {
        MovieCategory category = CategoryFactory.createCategory("Horror");
        assertNotNull(category);
        System.out.println(category);
    }
}