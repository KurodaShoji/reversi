package com.moneyforward.reversi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kuroda02 on 2015/12/15.
 */
public class Ban {

    private boolean finish;
    private Map<String, Koma> komas = new HashMap<>();
    private boolean different;

    public void add(Koma koma) {
        int putColor = komas.get(koma.v + "," + koma.h).color;
        if (isDifferent(koma, -1, -1, putColor)) {

        }
        if (isDifferent(koma, -1, 0, putColor)) {

        }
        if (isDifferent(koma, -1, 1, putColor)) {

        }
        if (isDifferent(koma, 0, -1, putColor)) {

        }
        if (isDifferent(koma, 0, 1, putColor)) {

        }
        if (isDifferent(koma, 1, -1, putColor)) {

        }
        if (isDifferent(koma, 1, 0, putColor)) {

        }
        if (isDifferent(koma, 1, 1, putColor)) {

        }
    }

    public boolean isFinish() {

        return finish;
    }

    public void clear() {

    }

    public String getResult() {
        return "";
    }

    public boolean isDifferent(Koma koma, int diffV, int diffH, int putColor) {
        int myColor = komas.get(koma.v + "," + koma.h).color;
        if (komas.get((koma.v - diffV) + ", " + (koma.h - diffH)).color != myColor) {
            return isDifferent(komaputColor)
        }
        return false;
    }
}
