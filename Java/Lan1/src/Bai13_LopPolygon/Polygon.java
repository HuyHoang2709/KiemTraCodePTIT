package Bai13_LopPolygon;

public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    public String getArea() {
        double dienTich = 0.0;
        for (int i = 0; i < points.length; i++) {
            int j = (i + 1) % points.length;
            dienTich += 0.5 * (points[i].getX() * points[j].getY() - points[j].getX() * points[i].getY());
        }
        return String.format("%.3f", dienTich);
    }
}
