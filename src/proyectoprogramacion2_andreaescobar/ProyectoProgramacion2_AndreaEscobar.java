package proyectoprogramacion2_andreaescobar;

public class ProyectoProgramacion2_AndreaEscobar {

    public static void main(String[] args) {
        Pieza[][] tablero = new Pieza[19][19];
        //tablero row 1
        tablero[0][0] = new EspacioBlanco('X', 0, 0, 0, 0);
        tablero[0][1] = new EspacioBlanco('X', 0, 0, 0, 0);
        tablero[0][2] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[0][3] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][4] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][5] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[0][6] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][7] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][8] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][9] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][10] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][11] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][12] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][13] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[0][14] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][15] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[0][16] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[0][17] = new EspacioBlanco('X', 0, 0, 0, 0);
        tablero[0][18] = new EspacioBlanco('X', 0, 0, 0, 0);

        //tablero row 2
        tablero[1][0] = new EspacioBlanco('X', 0, 0, 0, 0);
        tablero[1][1] = new EspacioBlanco('X', 0, 0, 0, 0);
        tablero[1][2] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][3] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][4] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][5] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][6] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][7] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][8] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][9] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][10] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][11] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][12] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][13] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][14] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][15] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][16] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[1][17] = new EspacioBlanco('X', 0, 0, 0, 0);
        tablero[1][18] = new EspacioBlanco('X', 0, 0, 0, 0);

        //tablero row 3
        tablero[2][0] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[2][1] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][2] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][3] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][4] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][5] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[2][6] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][7] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][8] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][9] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][10] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][11] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][12] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][13] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[2][14] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][15] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][16] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][17] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[2][18] = new Rebeldes('•', 0, 0, 0, 0);

        //tablero row 4
        tablero[3][0] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][1] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][2] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][3] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][4] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][5] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][5] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][6] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][7] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[3][8] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][9] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[3][10] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][11] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[3][12] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][13] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][14] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][15] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][16] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][17] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[3][18] = new EspacioBlanco(' ', 0, 0, 0, 0);

        //tablero row 5
        tablero[4][0] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[4][1] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[4][2] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[4][3] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[4][4] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[4][5] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[4][6] = new Rebeldes('•', 0, 0, 0, 0);
        tablero[4][7] = new EspacioBlanco(' ', 0, 0, 0, 0);
        tablero[4][8] = new Duques('o',0,0,0,0);

        ImprimeMatriz(tablero, 0, 0);
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
