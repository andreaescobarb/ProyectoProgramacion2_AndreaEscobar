package proyectoprogramacion2_andreaescobar;

public class EspacioBlanco extends Pieza{
    char tecla;

    public EspacioBlanco(char tecla) {
        this.tecla = tecla;
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
