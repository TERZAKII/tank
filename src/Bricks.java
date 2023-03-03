import javafx.scene.shape.Polygon;
import java.util.ArrayList;
import java.util.TreeMap;

public class Bricks extends Polygon {
    protected TreeMap<Position, Integer> briсksВrеаk = new TreeMap<Position, Integer>();
    protected ArrayList<Position> Coordinate = new ArrayList<Position>();

    TreeMap<Position, Integer> getMap() {
        return briсksВrеаk;
    }
    ArrayList<Position> getList() {
        return Coordinate;
    }
}
