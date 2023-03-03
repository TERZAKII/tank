import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

class Tank extends Rectangle {
    private int hp = 5;
    private double dоwn = 4;
    private double up = 4;
    private double right = 4;
    private double left = 4;

    Tank(Image texture) {
        setHeight(42);
        setFill(new ImagePattern(texture));
        setWidth(42);
    }

    void setHP(int hp) {
        this.hp = hp;
    }

    int getHP() {
        return hp;
    }

    void setRightZero() {
        right = 0;
    }

    double getRight() {
        return right;
    }

    void setLeftZero() {
        left = 0;
    }

    double getLeft() {
        return left;
    }

    void setUpZero() {
        up = 0;
    }

    double getUp() {
        return up;
    }

    void setDownZero() {
        dоwn = 0;
    }

    double getDown() {
        return dоwn;
    }

    public Point2D getPoint2d() {
        return new Point2D(getX(), getY());
    }

    public Point2D MarginPoint(int x, int y) {
        return new Point2D(getX() + x, getY() + y);
    }

    void stop() {
        right = 0;
        left = 0;
        up = 0;
        dоwn = 0;
    }

    public void setDefaultSpeed() {
        right = 4;
        left = 4;
        up = 4;
        dоwn = 4;
    }

}