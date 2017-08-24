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

    @Override
    public boolean mover(Pieza[][] matriz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
