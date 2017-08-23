package proyectoprogramacion2_andreaescobar;

public class ProyectoProgramacion2_AndreaEscobar {

    public static void main(String[] args) {
        Pieza [][] tablero = new Pieza[19][19];
        tablero[0][0]= new EspacioBlanco('X');
        tablero[0][1]= new EspacioBlanco('X');
        ImprimeMatriz(tablero, 0,0);
    }
    public static void ImprimeMatriz(Pieza matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            System.out.println("[" + matriz[filas][cols] + "]");
        } else {
            if (cols == matriz[0].length - 1) {
                System.out.println("[" + matriz[filas][cols] + "]");
                ImprimeMatriz(matriz, filas + 1, 0);
            } else {
                System.out.print("[" + matriz[filas][cols] + "]");
                ImprimeMatriz(matriz, filas, cols + 1);
            }
        }
    }
}
