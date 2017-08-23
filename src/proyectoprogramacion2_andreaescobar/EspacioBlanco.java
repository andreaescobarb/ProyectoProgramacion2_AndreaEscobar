package proyectoprogramacion2_andreaescobar;

public class EspacioBlanco extends Pieza{
    char tecla;

    public EspacioBlanco(char tecla, int x, int y, int moverx, int movery) {
        super(x, y, moverx, movery);
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
    
}
