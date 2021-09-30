/**
 * MovieFactory.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.factory.library;

import za.ac.cput.entity.library.Movie;
import za.ac.cput.entity.library.MovieCategory;
import za.ac.cput.helper.GenericHelper;

import java.util.Random;
import java.util.UUID;

public class MovieFactory {
    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > generate a unique key for the id of the movie
     *  > year parameter must be 4 digits.
     *  > year parameter must not be older than 1900 and/or in the future.
     *  > title parameter must not be empty, null or "null".
     *
     * Tasks:
     *  > Replace the throw exception (line 28) with your attempt of the factory method.
     *
     * @param title
     * @param year
     * @return
     */
    public static Movie createMovie(String title, int year) { // DO NOT MODIFY THIS LINE.

        if(year < 1900 && year >= 2021 && !GenericHelper.isNullorEmpty(title))
            String id = GenericHelper.generateId();
           Movie movie = new Movie.Builder()
                    .setId(id)
                    .setTitle(title)
                   .setYear(year)
                   .build();

    }
}