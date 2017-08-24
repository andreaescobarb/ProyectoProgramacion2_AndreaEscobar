package proyectoprogramacion2_andreaescobar;

//
public class Rebeldes extends Pieza {

    char tecla;

    public Rebeldes(char tecla) {
        super();
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
    public boolean mover(Pieza[][] matriz, int posx, int posy, int moverx, int movery) {
        boolean move;
        if ( posx == moverx || posy == movery ) {
            if (matriz[moverx][movery].toString().equals('X')) {
            System.out.println(matriz[moverx][movery]);
            move = false;
        } else if (matriz[moverx][movery] instanceof EspacioBlanco) {
            System.out.println(matriz[moverx][movery]);
            move = true;
        } else{
            move = false;
        }
        } else {
            move = false;
        }
        return move;
    }

    @Override
    public boolean comer() {
        return true;
    }
}
