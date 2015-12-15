package com.moneyforward.reversi;

/**
 * Created by kuroda02 on 2015/12/15.
 */
public class Koma {

    public static final int BLACK = 0;
    public static final int WHITE = 1;
    public int v;
    public int h;
    public int color;

    public Koma(int v, int h, boolean isBlack) {
        this.v = v;
        this.h = h;
        this.color = isBlack ? BLACK : WHITE;
    }

}
