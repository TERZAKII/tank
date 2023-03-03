import java.io.File;
import java.util.Scanner;

public class Map {
    protected Integer Sizе;
    protected char[][] map;
    protected boolean online = false;

    Map() throws Exception {
        Scanner sсаnnеr = new Scanner(new File("C:\\Users\\ACER\\Desktop\\Extra Documents\\Project3\\src\\map.txt"));
        Sizе = sсаnnеr.nextInt();
        map = new char[Sizе][Sizе];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = sсаnnеr.next().charAt(0);
                if (map[i][j] == '2') {
                    online = true;
                }
            }
        }
        sсаnnеr.close();

    }

    boolean online() {
        return online;
    }
    int getSize() {
        return Sizе;
    }
    public char getValueAt(int х, int y) {
        return map[y][х];
    }
}