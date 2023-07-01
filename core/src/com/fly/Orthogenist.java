package com.fly;

import com.badlogic.gdx.math.Vector3;

public class Orthogenist {
    private static Vector3 position = new Vector3(0,0,0);
    private static Vector3 view_directions = new Vector3(1,0,0);



    public static Vector3 getPosition() {
        return position;
    }

    public static Vector3 getView_directions() {
        return view_directions;
    }
}
