package by.tms.myproject.lessons09.homework09.polygon.triangle;

public class RightTriangle extends Triangle{

    public RightTriangle(double area, double perimeter, double corner, double midLine, double baseLine, double height, double fistSideTriangle, double otherSideTriangle) {
        super(area, perimeter, corner, midLine, baseLine, height, fistSideTriangle, otherSideTriangle);
    }

    @Override
    public int getAcuteAngle() {
        return 2;
    }
}
