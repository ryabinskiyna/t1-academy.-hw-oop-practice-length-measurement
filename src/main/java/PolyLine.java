class PolyLine implements Measurable {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    @Override
    public double getLength() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double lenX = points[i + 1].x - points[i].x;
            double lenY = points[i + 1].y - points[i].y;
            sum += Math.sqrt(lenX * lenX + lenY * lenY);
        }
        return sum;
    }
}