package proyectoprogramacion2_andreaescobar;

//
public class Rebeldes extends Pieza {

    char tecla;

    public Rebeldes(char tecla, int x, int y, int moverx, int movery) {
        super(x, y, moverx, movery);
        this.tecla = tecla;
    }

    public Rebeldes() {
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

    @Override
    public boolean mover(Pieza[][] matriz) {
        EspacioBlanco e = new EspacioBlanco();
        boolean move;
        if (matriz[x][y] instanceof EspacioBlanco) {
            move = true;
        } else {
            move = false;
        }
        return move;
    }

    @Override
    public boolean comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
