package lvlUp7.second;

class Rectangle {

    private final Point topLeft;
    private final Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean isOverLapping(Rectangle other) {
        if (this.topLeft.getX() > other.bottomRight.getX()
                || this.bottomRight.getX() < other.topLeft.getX()
                || this.topLeft.getY() < other.bottomRight.getY()
                || this.bottomRight.getY() > other.topLeft.getY()) {
            return false;
        }
        return true;
    }
}
