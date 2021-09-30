/**
 * GenericHelper.java
 * @Author: Siphelele (218334028)
 * Date: 30 September 2021
 */

package za.ac.cput.helper;

import java.util.UUID;

public class GenericHelper {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static boolean isNullorEmpty(String str) {
        if(str.isEmpty()) return true;
        if(str.equalsIgnoreCase("null")) return true;
        if(str == null) return true;
        return false;
    }
}