class Line implements Measurable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public double getLength() {
        double lenX = end.x - start.x;
        double lenY = end.y - start.y;
        return Math.sqrt(lenX * lenX + lenY * lenY);
    }
}