package by.tms.myproject.lessons09.homework09.util;

import by.tms.myproject.lessons09.homework09.polygon.triangle.Triangle;

public final class TriangleUtils {

    private TriangleUtils() {
    }

    public static boolean isTriangle(Triangle triangle) {

        if ((triangle.getFistSideTriangle() + triangle.getOtherSideTriangle()) > triangle.getBaseLine()) {
            return true;
        } else
        return false;
    }


}
