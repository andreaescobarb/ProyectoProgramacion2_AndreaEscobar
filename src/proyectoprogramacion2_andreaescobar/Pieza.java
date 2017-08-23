package proyectoprogramacion2_andreaescobar;

public abstract class Pieza {
    int x;
    int y;
    int moverx;
    int movery;

    public Pieza() {
    }

    public Pieza(int x, int y, int moverx, int movery) {
        this.x = x;
        this.y = y;
        this.moverx = moverx;
        this.movery = movery;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMoverx() {
        return moverx;
    }

    public void setMoverx(int moverx) {
        this.moverx = moverx;
    }

    public int getMovery() {
        return movery;
    }

    public void setMovery(int movery) {
        this.movery = movery;
    }

    @Override
    public String toString() {
        return "Pieza{" + "x=" + x + ", y=" + y + ", moverx=" + moverx + ", movery=" + movery + '}';
    }
    
}
