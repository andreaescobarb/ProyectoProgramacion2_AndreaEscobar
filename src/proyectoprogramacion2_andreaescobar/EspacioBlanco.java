package proyectoprogramacion2_andreaescobar;

public class EspacioBlanco extends Pieza{
    char tecla;

    public EspacioBlanco(char tecla) {
        super();
        this.tecla = tecla;
    }

    public EspacioBlanco() {
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
        return false;
    }

    @Override
    public Pieza[][] comer(int moverx, int movery, Pieza [][] matriz) {
        return matriz;
    }
    
}
