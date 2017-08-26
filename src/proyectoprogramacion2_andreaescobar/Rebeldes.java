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
        int cont = 0, contespacios = 0;
        if (posx == moverx) {
            if (posy < movery) {
                contespacios = 0;
                cont = posy + 1;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        if (i == posx && ((cont > posy) && (cont < movery))) {
                            if (matriz[posx][cont] instanceof Rebeldes || matriz[posx][cont] instanceof Duques || matriz[posx][cont] instanceof Rey) {
                                contespacios += 1;
                            }
                            cont++;
                        }
                    }
                }
            } else {
                cont = movery + 1;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        if (i == posx && ((cont < posy) && (cont > movery))) {
                            if (matriz[posx][cont] instanceof Rebeldes || matriz[posx][cont] instanceof Duques || matriz[posx][cont] instanceof Rey) {
                                contespacios += 1;
                            }
                            cont++;
                        }
                    }
                }
            }
        } else if (posy == movery) {
            contespacios = 0;
            if (posx < moverx) {
                cont = posx + 1;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        if (j == posy && ((cont > posx) && (cont < moverx))) {
                            if (matriz[cont][posy] instanceof Rebeldes || matriz[cont][posy] instanceof Duques || matriz[cont][posy] instanceof Rey) {
                                contespacios += 1;
                            }
                            cont++;
                        }

                    }
                }
            } else {
                cont = moverx + 1;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        if (j == posy && ((cont < posx) && (cont > moverx))) {
                            if (matriz[posy][cont] instanceof Rebeldes || matriz[posy][cont] instanceof Duques || matriz[posy][cont] instanceof Rey) {
                                contespacios += 1;
                            }
                            cont++;
                        }
                    }
                }

            }
        }

        if (contespacios == 0) {
            if (matriz[moverx][movery] != matriz[9][9]) {
                if (posx == moverx || posy == movery) {
                    if (matriz[moverx][movery].toString().equals('X')) {

                        move = false;
                    } else if (matriz[moverx][movery] instanceof EspacioBlanco) {

                        move = true;
                    } else {
                        move = false;
                    }
                } else {
                    move = false;
                }
            } else {
                move = false;
            }

        } else {
            move = false;
        }

        return move;
    }

    @Override
    public Pieza[][] comer(int moverx, int movery, Pieza[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (moverx == 0) {                                      //verificar el borde con el rey
                    if (matriz[moverx][movery - 1] instanceof Rey) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery - 1] instanceof Rebeldes) {
                                matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx][movery + 1] instanceof Rey) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx][movery - 1] instanceof Duques) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Duques) {      //verificar el borde con los duques
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery + 1] instanceof Duques) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                        }
                    }
                } else if (moverx == 1) {
                    if (matriz[moverx - 1][movery] instanceof Rey) {
                        if (matriz[moverx - 1][movery - 1] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                            }
                        }
                    } /*else if (matriz[moverx][movery + 1] instanceof Rey) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                            }
                        }
                    }*/ else if (matriz[moverx + 1][movery] instanceof Duques) {      //verificar el borde con los duques
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery + 1] instanceof Duques) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery - 1] instanceof Duques) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                        }
                    }
                } else if (movery == 0) {                               //Verificar el borde con el rey
                    if (matriz[moverx - 1][movery] instanceof Rey) {
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Rey) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx][movery + 1] instanceof Duques) {      //verificar el borde con los duques
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Duques) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx - 1][movery] instanceof Duques) {
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                        }
                    }
                } else if (movery == 1) {
                    if (matriz[moverx][movery - 1] instanceof Rey) {
                        if (matriz[moverx - 1][movery - 1] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery - 1] instanceof Rebeldes) {
                                matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                            }
                        }
                    } /*else if (matriz[moverx + 1][movery] instanceof Rey) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                            }
                        }
                    }*/ else if (matriz[moverx][movery + 1] instanceof Duques) {      //verificar el borde con los duques
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Duques) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx - 1][movery] instanceof Duques) {
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                        }
                    }
                } else if (moverx == 18) {
                    if (matriz[moverx][movery - 1] instanceof Rey) {            //Verificar borde con rey
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery - 1] instanceof Rebeldes) {
                                matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx][movery + 1] instanceof Rey) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx - 1][movery] instanceof Duques) {      //verificar el borde con los duques
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery + 1] instanceof Duques) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery - 1] instanceof Duques) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                        }
                    }
                } else if (moverx == 17) {
                    if (matriz[moverx + 1][movery] instanceof Rey) {
                        if (matriz[moverx + 1][movery - 1] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                            }
                        }
                    } /*else if (matriz[moverx][movery + 1] instanceof Rey) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                            }
                        }
                    }*/ else if (matriz[moverx - 1][movery] instanceof Duques) {      //verificar el borde con los duques
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery + 1] instanceof Duques) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery - 1] instanceof Duques) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                        }
                    }
                } else if (movery == 18) {
                    if (matriz[moverx - 1][movery] instanceof Rey) {            //Verificar borde con rey
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery - 1] instanceof Rebeldes) {
                                matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Rey) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery - 1] instanceof Rebeldes) {
                                matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx - 1][movery] instanceof Duques) {      //verificar el borde con los duques
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Duques) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery - 1] instanceof Duques) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                        }
                    }
                } else if (movery == 17) {
                    if (matriz[moverx][movery + 1] instanceof Rey) {
                        if (matriz[moverx - 1][movery + 1] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery + 1] instanceof Rebeldes) {
                                matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Rey) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery - 1] instanceof Rebeldes) {
                                matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                            }
                        }
                    } else if (matriz[moverx - 1][movery] instanceof Duques) {      //verificar el borde con los duques
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Duques) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery - 1] instanceof Duques) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                        }
                    }
                } else {
                    if (matriz[moverx - 1][movery] instanceof Rey) {
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery - 1] instanceof Rebeldes) {
                                if (matriz[moverx - 1][movery + 1] instanceof Rebeldes) {
                                    matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                                }
                            }
                        }
                    } else if (matriz[moverx][movery - 1] instanceof Rey) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery - 1] instanceof Rebeldes) {
                                if (matriz[moverx + 1][movery - 1] instanceof Rebeldes) {
                                    matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                                }
                            }
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Rey) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            if (matriz[moverx + 1][movery - 1] instanceof Rebeldes) {
                                if (matriz[moverx + 1][movery + 1] instanceof Rebeldes) {
                                    matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                                }
                            }
                        }

                    } else if (matriz[moverx][movery + 1] instanceof Rey) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            if (matriz[moverx - 1][movery + 1] instanceof Rebeldes) {
                                if (matriz[moverx + 1][movery + 1] instanceof Rebeldes) {
                                    matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                                }
                            }
                        }
                    } else if (matriz[moverx - 1][movery] instanceof Duques) {
                        if (matriz[moverx - 2][movery] instanceof Rebeldes) {
                            matriz[moverx - 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery - 1] instanceof Duques) {
                        if (matriz[moverx][movery - 2] instanceof Rebeldes) {
                            matriz[moverx][movery - 1] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx + 1][movery] instanceof Duques) {
                        if (matriz[moverx + 2][movery] instanceof Rebeldes) {
                            matriz[moverx + 1][movery] = new EspacioBlanco(' ');
                        }
                    } else if (matriz[moverx][movery + 1] instanceof Duques) {
                        if (matriz[moverx][movery + 2] instanceof Rebeldes) {
                            matriz[moverx][movery + 1] = new EspacioBlanco(' ');
                        }
                    }
                }

            }
        }
        return matriz;
    }
}
