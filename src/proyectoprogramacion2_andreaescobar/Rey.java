
package proyectoprogramacion2_andreaescobar;

public class Rey extends Pieza{
    char tecla;

    public Rey(char tecla) {
        super();
        this.tecla = tecla;
    }

    public Rey() {
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
    public boolean mover(Pieza[][] matriz,int posx, int posy, int moverx, int movery) {
        boolean move;
        if (matriz[moverx][movery] instanceof EspacioBlanco) {
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
