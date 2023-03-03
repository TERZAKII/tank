public class Bot extends Player {
    protected Bullet bullet;
    protected Tank tank;

    void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
    Bullet getBullet() {
        return bullet;
    }
    void setTank(Tank tank) {
        this.tank = tank;
    }
    Tank getTank() {
        return tank;
    }

}