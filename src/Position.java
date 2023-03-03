class Position {
    private Double x;
    private Double y;

    Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.toString().equals(toString());
    }

    public String toString() {
        return x + ";" + y;
    }

    @Override
    public int hashCode() {
        return (int) (x + y);
    }

}