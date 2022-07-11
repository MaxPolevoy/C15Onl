package by.tms.myproject.lessons09.homework09.polygon.triangle;

public class ObtuseTriangle extends Triangle{

    public ObtuseTriangle(double area, double perimeter, double corner, double midLine, double baseLine, double height, double fistSideTriangle, double otherSideTriangle) {
        super(area, perimeter, corner, midLine, baseLine, height, fistSideTriangle, otherSideTriangle);
    }

    public int getAcuteAngle(){
        return 2;
    }
}
