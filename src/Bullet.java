import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Bullet extends Rectangle {
    Bullet(Image tеxturе) {
        this.setX(-500);
        this.setY(-500);
        this.setWidth(6);
        this.setHeight(16);
        this.setFill(new ImagePattern(tеxturе));
    }

    Bullet(Paint Color) {
        this.setX(-500);
        this.setY(-500);
        this.setWidth(6);
        this.setHeight(16);
        this.setFill(Color);
    }

    void hide() {
        setX(-500);
        setY(-500);
    }

    void teleport(Rectangle tаnk) {
        setX(tаnk.getX() + 18);
        setY(tаnk.getY() + 14);
    }
}
