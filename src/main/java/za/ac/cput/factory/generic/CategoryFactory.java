/**
 * CategoryFactory.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.factory.generic;

import za.ac.cput.entity.generic.MovieCategory;
import za.ac.cput.helper.GenericHelper;

public class CategoryFactory {
    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > generate a unique key for the id of the category
     *  > genre parameter must not be empty, null or "null".
     *
     * Tasks:
     *  > Replace the throw exception (line 25) with your attempt of the factory method.
     *
     * @param genre
     * @return
     */
    public static MovieCategory createCategory(String genre) { // DO NOT MODIFY THIS LINE

        if(GenericHelper.isNullorEmpty(genre));
            return new MovieCategory.Builder().build();

        String id = GenericHelper.generateId();

       return new MovieCategory.Builder()
               .setGenre(genre)
               .setId(id)
               .build();

        }



    }
}