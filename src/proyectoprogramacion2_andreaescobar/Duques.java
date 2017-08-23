package proyectoprogramacion2_andreaescobar;


public class Duques extends Pieza{
    char tecla;

    public Duques(char tecla, int x, int y, int moverx, int movery) {
        super(x, y, moverx, movery);
        this.tecla = tecla;
    }

    public Duques() {
        super();
    }

    public char getTecla() {
        return tecla;
    }

    public void setTecla(char tecla) {
        this.tecla = tecla;
    }

    @Override
    public String toString() {
        return "" + tecla;
    }
}
