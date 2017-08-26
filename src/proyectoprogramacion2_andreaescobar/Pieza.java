package proyectoprogramacion2_andreaescobar;

public abstract class Pieza {

    public Pieza() {
    }

    @Override
    public String toString() {
        return "Pieza";
    }
    public abstract boolean mover(Pieza[][] matriz,int posx, int posy, int moverx, int movery);
    public abstract Pieza[][] comer(int moverx, int movery, Pieza [][] matriz);
}
