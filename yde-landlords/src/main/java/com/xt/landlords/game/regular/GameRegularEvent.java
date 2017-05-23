package com.xt.landlords.game.regular;

import com.xt.landlords.GameControllerState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leo on 17/4/26.
 */
public enum GameRegularEvent implements GameControllerState {
    Bet("OnBet"), Raise("OnRaise"), Deal("OnDeal"), Dark("OnDark"), Play("OnDark"), GuessSize("OnGuessSize"),
    LuckDraw("OnLuckDraw"), GameOver("OnGameOver");


    /**
     * 描述
     */
    private String value;

    private GameRegularEvent(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public static List<Map<String, Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        GameRegularEvent[] val = GameRegularEvent.values();
        for (GameRegularEvent e : val) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", e.getValue());
            map.put("name", e.name());
            list.add(map);
        }
        return list;
    }

    public static GameRegularEvent getEnum(String name) {
        GameRegularEvent resultEnum = null;
        GameRegularEvent[] enumAry = GameRegularEvent.values();
        for (int i = 0; i < enumAry.length; i++) {
            if (enumAry[i].name().equals(name)) {
                resultEnum = enumAry[i];
                break;
            }
        }
        return resultEnum;
    }

}