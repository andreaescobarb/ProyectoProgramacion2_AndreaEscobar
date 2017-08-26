package proyectoprogramacion2_andreaescobar;

import java.util.Scanner;

public class ProyectoProgramacion2_AndreaEscobar {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int comerx, comery;
        int x, y, moverx, movery;
        Pieza[][] tablero = new Pieza[19][19];
        Pieza r = new Rebeldes();
        Pieza d = new Duques();
        Pieza e = new EspacioBlanco();
        Pieza rey = new Rey();
        tablero = matriz(19, 19);

        System.out.println("                    NEW GAME");
        System.out.println("");
        System.out.println("Ingrese username de jugador 1 (Controla los rebeldes)");
        String player1 = sc.next();
        System.out.println("Ingrese username de jugador 2 (Controla los duques)");
        String player2 = sc.next();
        System.out.println("");

        boolean gamer1 = true;
        boolean gamer2 = false;
        boolean win = false;

        while (win != true) {
            while (gamer1 != false) { //aqui controlo los turnos de los jugadores (Rebeldes)
                System.out.println("JUGADOR 1:" + player1);
                ImprimeMatriz(tablero, 0, 0);
                System.out.println("");

                System.out.println("Ingrese POSICION X de la pieza que desea mover");
                x = sc.nextInt();
                System.out.println("Ingrese POSICION Y de la pieza que desea mover");
                y = sc.nextInt();
                System.out.println("Ingrese POSICION X donde desea mover pieza");
                moverx = sc.nextInt();
                System.out.println("Ingrese POSICION Y donde desea mover pieza");
                movery = sc.nextInt();
                try {
                    if (tablero[x][y] instanceof Rebeldes) {
                        if (r.mover(tablero, x, y, moverx, movery) == true) {
                            r.mover(tablero, x, y, moverx, movery);
                            tablero[x][y] = new EspacioBlanco(' ');
                            tablero[moverx][movery] = new Rebeldes('•');
                            System.out.println("");
                            System.out.println("Movimiento completado");
                            gamer1 = false;
                            gamer2 = true;
                        } else {
                            System.out.println("");
                            System.out.println("Movimiento invalido");
                        }
                    } else {
                        System.out.println("La posicion que ingreso no es PIEZA REBELDE INTENTE DE NUEVO");
                    }
                } catch (Exception ex) {
                    System.out.println("");
                    System.out.println("POSICIONES FUERA DEL TABLERO");
                    System.out.println("");
                }

            }
            while (gamer2 != false) {
                System.out.println("JUGADOR 2:" + player2);
                ImprimeMatriz(tablero, 0, 0);
                System.out.println("");

                System.out.println("Ingrese POSICION X de la pieza que desea mover");
                x = sc.nextInt();
                System.out.println("Ingrese POSICION Y de la pieza que desea mover");
                y = sc.nextInt();
                System.out.println("Ingrese POSICION X donde desea mover pieza");
                moverx = sc.nextInt();
                System.out.println("Ingrese POSICION Y donde desea mover pieza");
                movery = sc.nextInt();
                try {
                    if (tablero[x][y] instanceof Duques) {
                        if (d.mover(tablero, x, y, moverx, movery) == true) {
                            System.out.println(moverx+" " +movery);
                            tablero[x][y] = new EspacioBlanco(' ');
                            tablero[moverx][movery] = new Duques('O');
                            System.out.println("Movimiento completado");
                            tablero = d.comer(moverx, movery, tablero);
                            gamer1 = true;
                            gamer2 = false;
                        } else {
                            System.out.println("Movimiento invalido");
                        }
                    } else if (tablero[x][y] instanceof Rey) {
                        if (rey.mover(tablero, x, y, moverx, movery) == true) {

                            tablero[x][y] = new EspacioBlanco(' ');
                            tablero[moverx][movery] = new Rey('R');
                            System.out.println("Movimiento completado");
                            tablero = rey.comer(moverx, movery, tablero);
                            gamer1 = true;
                            gamer2 = false;
                        } else {
                            System.out.println("Movimiento invalido");
                        }
                    } else {
                        {
                            System.out.println("La posicion que ingreso no es PIEZA DUQUE INTENTE DE NUEVO");
                        }
                    }
                } catch (Exception ex) {
                    System.out.println("");
                    System.out.println("POSICIONES FUERA DEL TABLERO");
                    System.out.println("");
                }

            }
        }

    }

    public static Pieza[][] matriz(int row, int column) {
        Pieza[][] tablero = new Pieza[19][19];
        //tablero row 1
        tablero[0][0] = new EspacioBlanco('X');
        tablero[0][1] = new EspacioBlanco('X');
        tablero[0][2] = new Rebeldes('•');
        tablero[0][3] = new EspacioBlanco(' ');
        tablero[0][4] = new EspacioBlanco(' ');
        tablero[0][5] = new Rebeldes('•');
        tablero[0][6] = new EspacioBlanco(' ');
        tablero[0][7] = new EspacioBlanco(' ');
        tablero[0][8] = new EspacioBlanco(' ');
        tablero[0][9] = new EspacioBlanco(' ');
        tablero[0][10] = new EspacioBlanco(' ');
        tablero[0][11] = new EspacioBlanco(' ');
        tablero[0][12] = new EspacioBlanco(' ');
        tablero[0][13] = new Rebeldes('•');
        tablero[0][14] = new EspacioBlanco(' ');
        tablero[0][15] = new EspacioBlanco(' ');
        tablero[0][16] = new Rebeldes('•');
        tablero[0][17] = new EspacioBlanco('X');
        tablero[0][18] = new EspacioBlanco('X');

        //tablero row 2
        tablero[1][0] = new EspacioBlanco('X');
        tablero[1][1] = new EspacioBlanco('X');
        tablero[1][2] = new EspacioBlanco(' ');
        tablero[1][3] = new EspacioBlanco(' ');
        tablero[1][4] = new EspacioBlanco(' ');
        tablero[1][5] = new EspacioBlanco(' ');
        tablero[1][6] = new EspacioBlanco(' ');
        tablero[1][7] = new EspacioBlanco(' ');
        tablero[1][8] = new EspacioBlanco(' ');
        tablero[1][9] = new EspacioBlanco(' ');
        tablero[1][10] = new EspacioBlanco(' ');
        tablero[1][11] = new EspacioBlanco(' ');
        tablero[1][12] = new EspacioBlanco(' ');
        tablero[1][13] = new EspacioBlanco(' ');
        tablero[1][14] = new EspacioBlanco(' ');
        tablero[1][15] = new EspacioBlanco(' ');
        tablero[1][16] = new EspacioBlanco(' ');
        tablero[1][17] = new EspacioBlanco('X');
        tablero[1][18] = new EspacioBlanco('X');

        //tablero row 3
        tablero[2][0] = new Rebeldes('•');
        tablero[2][1] = new EspacioBlanco(' ');
        tablero[2][2] = new EspacioBlanco(' ');
        tablero[2][3] = new EspacioBlanco(' ');
        tablero[2][4] = new EspacioBlanco(' ');
        tablero[2][5] = new Rebeldes('•');
        tablero[2][6] = new EspacioBlanco(' ');
        tablero[2][7] = new EspacioBlanco(' ');
        tablero[2][8] = new EspacioBlanco(' ');
        tablero[2][9] = new EspacioBlanco(' ');
        tablero[2][10] = new EspacioBlanco(' ');
        tablero[2][11] = new EspacioBlanco(' ');
        tablero[2][12] = new EspacioBlanco(' ');
        tablero[2][13] = new Rebeldes('•');
        tablero[2][14] = new EspacioBlanco(' ');
        tablero[2][15] = new EspacioBlanco(' ');
        tablero[2][16] = new EspacioBlanco(' ');
        tablero[2][17] = new EspacioBlanco(' ');
        tablero[2][18] = new Rebeldes('•');

        //tablero row 4
        tablero[3][0] = new EspacioBlanco(' ');
        tablero[3][1] = new EspacioBlanco(' ');
        tablero[3][2] = new EspacioBlanco(' ');
        tablero[3][3] = new EspacioBlanco(' ');
        tablero[3][4] = new EspacioBlanco(' ');
        tablero[3][5] = new EspacioBlanco(' ');
        tablero[3][5] = new EspacioBlanco(' ');
        tablero[3][6] = new EspacioBlanco(' ');
        tablero[3][7] = new Rebeldes('•');
        tablero[3][8] = new EspacioBlanco(' ');
        tablero[3][9] = new Rebeldes('•');
        tablero[3][10] = new EspacioBlanco(' ');
        tablero[3][11] = new Rebeldes('•');
        tablero[3][12] = new EspacioBlanco(' ');
        tablero[3][13] = new EspacioBlanco(' ');
        tablero[3][14] = new EspacioBlanco(' ');
        tablero[3][15] = new EspacioBlanco(' ');
        tablero[3][16] = new EspacioBlanco(' ');
        tablero[3][17] = new EspacioBlanco(' ');
        tablero[3][18] = new EspacioBlanco(' ');

        //tablero row 5
        tablero[4][0] = new EspacioBlanco(' ');
        tablero[4][1] = new EspacioBlanco(' ');
        tablero[4][2] = new EspacioBlanco(' ');
        tablero[4][3] = new EspacioBlanco(' ');
        tablero[4][4] = new EspacioBlanco(' ');
        tablero[4][5] = new EspacioBlanco(' ');
        tablero[4][6] = new Rebeldes('•');
        tablero[4][7] = new EspacioBlanco(' ');
        tablero[4][8] = new Duques('O');
        tablero[4][9] = new EspacioBlanco(' ');
        tablero[4][10] = new Duques('O');
        tablero[4][11] = new EspacioBlanco(' ');
        tablero[4][12] = new Rebeldes('•');
        tablero[4][13] = new EspacioBlanco(' ');
        tablero[4][14] = new EspacioBlanco(' ');
        tablero[4][15] = new EspacioBlanco(' ');
        tablero[4][16] = new EspacioBlanco(' ');
        tablero[4][17] = new EspacioBlanco(' ');
        tablero[4][18] = new EspacioBlanco(' ');

        //tablero row 6
        tablero[5][0] = new Rebeldes('•');
        tablero[5][1] = new EspacioBlanco(' ');
        tablero[5][2] = new Rebeldes('•');
        tablero[5][3] = new EspacioBlanco(' ');
        tablero[5][4] = new EspacioBlanco(' ');
        tablero[5][5] = new Rebeldes('•');
        tablero[5][6] = new EspacioBlanco(' ');
        tablero[5][7] = new EspacioBlanco(' ');
        tablero[5][8] = new EspacioBlanco(' ');
        tablero[5][9] = new EspacioBlanco(' ');
        tablero[5][10] = new EspacioBlanco(' ');
        tablero[5][11] = new EspacioBlanco(' ');
        tablero[5][12] = new EspacioBlanco(' ');
        tablero[5][13] = new Rebeldes('•');
        tablero[5][14] = new EspacioBlanco(' ');
        tablero[5][15] = new EspacioBlanco(' ');
        tablero[5][16] = new Rebeldes('•');
        tablero[5][17] = new EspacioBlanco(' ');
        tablero[5][18] = new Rebeldes('•');

        //tablero row 7
        tablero[6][0] = new EspacioBlanco(' ');
        tablero[6][1] = new EspacioBlanco(' ');
        tablero[6][2] = new EspacioBlanco(' ');
        tablero[6][3] = new EspacioBlanco(' ');
        tablero[6][4] = new Rebeldes('•');
        tablero[6][5] = new EspacioBlanco(' ');
        tablero[6][6] = new EspacioBlanco(' ');
        tablero[6][7] = new EspacioBlanco(' ');
        tablero[6][8] = new EspacioBlanco(' ');
        tablero[6][9] = new Duques('O');
        tablero[6][10] = new EspacioBlanco(' ');
        tablero[6][11] = new EspacioBlanco(' ');
        tablero[6][12] = new EspacioBlanco(' ');
        tablero[6][13] = new EspacioBlanco(' ');
        tablero[6][14] = new Rebeldes('•');
        tablero[6][15] = new EspacioBlanco(' ');
        tablero[6][16] = new EspacioBlanco(' ');
        tablero[6][17] = new EspacioBlanco(' ');
        tablero[6][18] = new EspacioBlanco(' ');

        //tablero row 8
        tablero[7][0] = new EspacioBlanco(' ');
        tablero[7][1] = new EspacioBlanco(' ');
        tablero[7][2] = new EspacioBlanco(' ');
        tablero[7][3] = new Rebeldes('•');
        tablero[7][4] = new EspacioBlanco(' ');
        tablero[7][5] = new EspacioBlanco(' ');
        tablero[7][6] = new EspacioBlanco(' ');
        tablero[7][7] = new EspacioBlanco(' ');
        tablero[7][8] = new Duques('O');
        tablero[7][9] = new EspacioBlanco(' ');
        tablero[7][10] = new Duques('O');
        tablero[7][11] = new EspacioBlanco(' ');
        tablero[7][12] = new EspacioBlanco(' ');
        tablero[7][13] = new EspacioBlanco(' ');
        tablero[7][14] = new EspacioBlanco(' ');
        tablero[7][15] = new Rebeldes('•');
        tablero[7][16] = new EspacioBlanco(' ');
        tablero[7][17] = new EspacioBlanco(' ');
        tablero[7][18] = new EspacioBlanco(' ');

        //tablero row 9
        tablero[8][0] = new EspacioBlanco(' ');
        tablero[8][1] = new EspacioBlanco(' ');
        tablero[8][2] = new EspacioBlanco(' ');
        tablero[8][3] = new EspacioBlanco(' ');
        tablero[8][4] = new Duques('O');
        tablero[8][5] = new EspacioBlanco(' ');
        tablero[8][6] = new EspacioBlanco(' ');
        tablero[8][7] = new Duques('O');
        tablero[8][8] = new EspacioBlanco(' ');
        tablero[8][9] = new Duques('O');
        tablero[8][10] = new EspacioBlanco(' ');
        tablero[8][11] = new Duques('O');
        tablero[8][12] = new EspacioBlanco(' ');
        tablero[8][13] = new EspacioBlanco(' ');
        tablero[8][14] = new Duques('O');
        tablero[8][15] = new EspacioBlanco(' ');
        tablero[8][16] = new EspacioBlanco(' ');
        tablero[8][17] = new EspacioBlanco(' ');
        tablero[8][18] = new EspacioBlanco(' ');

        //tablero row 10
        tablero[9][0] = new EspacioBlanco(' ');
        tablero[9][1] = new EspacioBlanco(' ');
        tablero[9][2] = new EspacioBlanco(' ');
        tablero[9][3] = new Rebeldes('•');
        tablero[9][4] = new EspacioBlanco(' ');
        tablero[9][5] = new EspacioBlanco(' ');
        tablero[9][6] = new Duques('O');
        tablero[9][7] = new EspacioBlanco(' ');
        tablero[9][8] = new Duques('O');
        tablero[9][9] = new Rey('R');
        tablero[9][10] = new Duques('O');
        tablero[9][11] = new EspacioBlanco(' ');
        tablero[9][12] = new Duques('O');
        tablero[9][13] = new EspacioBlanco(' ');
        tablero[9][14] = new EspacioBlanco(' ');
        tablero[9][15] = new Rebeldes('•');
        tablero[9][16] = new EspacioBlanco(' ');
        tablero[9][17] = new EspacioBlanco(' ');
        tablero[9][18] = new EspacioBlanco(' ');

        //tablero row 11
        tablero[10][0] = new EspacioBlanco(' ');
        tablero[10][1] = new EspacioBlanco(' ');
        tablero[10][2] = new EspacioBlanco(' ');
        tablero[10][3] = new EspacioBlanco(' ');
        tablero[10][4] = new Duques('O');
        tablero[10][5] = new EspacioBlanco(' ');
        tablero[10][6] = new EspacioBlanco(' ');
        tablero[10][7] = new Duques('O');
        tablero[10][8] = new EspacioBlanco(' ');
        tablero[10][9] = new Duques('O');
        tablero[10][10] = new EspacioBlanco(' ');
        tablero[10][11] = new Duques('O');
        tablero[10][12] = new EspacioBlanco(' ');
        tablero[10][13] = new EspacioBlanco(' ');
        tablero[10][14] = new Duques('O');
        tablero[10][15] = new EspacioBlanco(' ');
        tablero[10][16] = new EspacioBlanco(' ');
        tablero[10][17] = new EspacioBlanco(' ');
        tablero[10][18] = new EspacioBlanco(' ');

        //tablero row 12
        tablero[11][0] = new EspacioBlanco(' ');
        tablero[11][1] = new EspacioBlanco(' ');
        tablero[11][2] = new EspacioBlanco(' ');
        tablero[11][3] = new Rebeldes('•');
        tablero[11][4] = new EspacioBlanco(' ');
        tablero[11][5] = new EspacioBlanco(' ');
        tablero[11][6] = new EspacioBlanco(' ');
        tablero[11][7] = new EspacioBlanco(' ');
        tablero[11][8] = new Duques('O');
        tablero[11][9] = new EspacioBlanco(' ');
        tablero[11][10] = new Duques('O');
        tablero[11][11] = new EspacioBlanco(' ');
        tablero[11][12] = new EspacioBlanco(' ');
        tablero[11][13] = new EspacioBlanco(' ');
        tablero[11][14] = new EspacioBlanco(' ');
        tablero[11][15] = new Rebeldes('•');
        tablero[11][16] = new EspacioBlanco(' ');
        tablero[11][17] = new EspacioBlanco(' ');
        tablero[11][18] = new EspacioBlanco(' ');

        //tablero row 13
        tablero[12][0] = new EspacioBlanco(' ');
        tablero[12][1] = new EspacioBlanco(' ');
        tablero[12][2] = new EspacioBlanco(' ');
        tablero[12][3] = new EspacioBlanco(' ');
        tablero[12][4] = new Rebeldes('•');
        tablero[12][5] = new EspacioBlanco(' ');
        tablero[12][6] = new EspacioBlanco(' ');
        tablero[12][7] = new EspacioBlanco(' ');
        tablero[12][8] = new EspacioBlanco(' ');
        tablero[12][9] = new Duques('O');
        tablero[12][10] = new EspacioBlanco(' ');
        tablero[12][11] = new EspacioBlanco(' ');
        tablero[12][12] = new EspacioBlanco(' ');
        tablero[12][13] = new EspacioBlanco(' ');
        tablero[12][14] = new Rebeldes('•');
        tablero[12][15] = new EspacioBlanco(' ');
        tablero[12][16] = new EspacioBlanco(' ');
        tablero[12][17] = new EspacioBlanco(' ');
        tablero[12][18] = new EspacioBlanco(' ');

        //tablero row 14
        tablero[13][0] = new Rebeldes('•');
        tablero[13][1] = new EspacioBlanco(' ');
        tablero[13][2] = new Rebeldes('•');
        tablero[13][3] = new EspacioBlanco(' ');
        tablero[13][4] = new EspacioBlanco(' ');
        tablero[13][5] = new Rebeldes('•');
        tablero[13][6] = new EspacioBlanco(' ');
        tablero[13][7] = new EspacioBlanco(' ');
        tablero[13][8] = new EspacioBlanco(' ');
        tablero[13][9] = new EspacioBlanco(' ');
        tablero[13][10] = new EspacioBlanco(' ');
        tablero[13][11] = new EspacioBlanco(' ');
        tablero[13][12] = new EspacioBlanco(' ');
        tablero[13][13] = new Rebeldes('•');
        tablero[13][14] = new EspacioBlanco(' ');
        tablero[13][15] = new EspacioBlanco(' ');
        tablero[13][16] = new Rebeldes('•');
        tablero[13][17] = new EspacioBlanco(' ');
        tablero[13][18] = new Rebeldes('•');

        //tablero row 15
        tablero[14][0] = new EspacioBlanco(' ');
        tablero[14][1] = new EspacioBlanco(' ');
        tablero[14][2] = new EspacioBlanco(' ');
        tablero[14][3] = new EspacioBlanco(' ');
        tablero[14][4] = new EspacioBlanco(' ');
        tablero[14][5] = new EspacioBlanco(' ');
        tablero[14][6] = new Rebeldes('•');
        tablero[14][7] = new EspacioBlanco(' ');
        tablero[14][8] = new Duques('O');
        tablero[14][9] = new EspacioBlanco(' ');
        tablero[14][10] = new Duques('O');
        tablero[14][11] = new EspacioBlanco(' ');
        tablero[14][12] = new Rebeldes('•');
        tablero[14][13] = new EspacioBlanco(' ');
        tablero[14][14] = new EspacioBlanco(' ');
        tablero[14][15] = new EspacioBlanco(' ');
        tablero[14][16] = new EspacioBlanco(' ');
        tablero[14][17] = new EspacioBlanco(' ');
        tablero[14][18] = new EspacioBlanco(' ');

        //tablero row 16
        tablero[15][0] = new EspacioBlanco(' ');
        tablero[15][1] = new EspacioBlanco(' ');
        tablero[15][2] = new EspacioBlanco(' ');
        tablero[15][3] = new EspacioBlanco(' ');
        tablero[15][4] = new EspacioBlanco(' ');
        tablero[15][5] = new EspacioBlanco(' ');
        tablero[15][5] = new EspacioBlanco(' ');
        tablero[15][6] = new EspacioBlanco(' ');
        tablero[15][7] = new Rebeldes('•');
        tablero[15][8] = new EspacioBlanco(' ');
        tablero[15][9] = new Rebeldes('•');
        tablero[15][10] = new EspacioBlanco(' ');
        tablero[15][11] = new Rebeldes('•');
        tablero[15][12] = new EspacioBlanco(' ');
        tablero[15][13] = new EspacioBlanco(' ');
        tablero[15][14] = new EspacioBlanco(' ');
        tablero[15][15] = new EspacioBlanco(' ');
        tablero[15][16] = new EspacioBlanco(' ');
        tablero[15][17] = new EspacioBlanco(' ');
        tablero[15][18] = new EspacioBlanco(' ');

        //tablero row 17
        tablero[16][0] = new Rebeldes('•');
        tablero[16][1] = new EspacioBlanco(' ');
        tablero[16][2] = new EspacioBlanco(' ');
        tablero[16][3] = new EspacioBlanco(' ');
        tablero[16][4] = new EspacioBlanco(' ');
        tablero[16][5] = new Rebeldes('•');
        tablero[16][6] = new EspacioBlanco(' ');
        tablero[16][7] = new EspacioBlanco(' ');
        tablero[16][8] = new EspacioBlanco(' ');
        tablero[16][9] = new EspacioBlanco(' ');
        tablero[16][10] = new EspacioBlanco(' ');
        tablero[16][11] = new EspacioBlanco(' ');
        tablero[16][12] = new EspacioBlanco(' ');
        tablero[16][13] = new Rebeldes('•');
        tablero[16][14] = new EspacioBlanco(' ');
        tablero[16][15] = new EspacioBlanco(' ');
        tablero[16][16] = new EspacioBlanco(' ');
        tablero[16][17] = new EspacioBlanco(' ');
        tablero[16][18] = new Rebeldes('•');

        //tablero row 18
        tablero[17][0] = new EspacioBlanco('X');
        tablero[17][1] = new EspacioBlanco('X');
        tablero[17][2] = new EspacioBlanco(' ');
        tablero[17][3] = new EspacioBlanco(' ');
        tablero[17][4] = new EspacioBlanco(' ');
        tablero[17][5] = new EspacioBlanco(' ');
        tablero[17][6] = new EspacioBlanco(' ');
        tablero[17][7] = new EspacioBlanco(' ');
        tablero[17][8] = new EspacioBlanco(' ');
        tablero[17][9] = new EspacioBlanco(' ');
        tablero[17][10] = new EspacioBlanco(' ');
        tablero[17][11] = new EspacioBlanco(' ');
        tablero[17][12] = new EspacioBlanco(' ');
        tablero[17][13] = new EspacioBlanco(' ');
        tablero[17][14] = new EspacioBlanco(' ');
        tablero[17][15] = new EspacioBlanco(' ');
        tablero[17][16] = new EspacioBlanco(' ');
        tablero[17][17] = new EspacioBlanco('X');
        tablero[17][18] = new EspacioBlanco('X');

        //tablero row 19
        tablero[18][0] = new EspacioBlanco('X');
        tablero[18][1] = new EspacioBlanco('X');
        tablero[18][2] = new Rebeldes('•');
        tablero[18][3] = new EspacioBlanco(' ');
        tablero[18][4] = new EspacioBlanco(' ');
        tablero[18][5] = new Rebeldes('•');
        tablero[18][6] = new EspacioBlanco(' ');
        tablero[18][7] = new EspacioBlanco(' ');
        tablero[18][8] = new EspacioBlanco(' ');
        tablero[18][9] = new EspacioBlanco(' ');
        tablero[18][10] = new EspacioBlanco(' ');
        tablero[18][11] = new EspacioBlanco(' ');
        tablero[18][12] = new EspacioBlanco(' ');
        tablero[18][13] = new Rebeldes('•');
        tablero[18][14] = new EspacioBlanco(' ');
        tablero[18][15] = new EspacioBlanco(' ');
        tablero[18][16] = new Rebeldes('•');
        tablero[18][17] = new EspacioBlanco('X');
        tablero[18][18] = new EspacioBlanco('X');

        return tablero;
    }

    public static void ImprimeMatriz(Pieza matriz[][], int filas, int cols) { //Metodo recursivo
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
