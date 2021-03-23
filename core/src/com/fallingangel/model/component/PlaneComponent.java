package com.fallingangel.model.component;

import com.badlogic.ashley.core.Component;

public class PlaneComponent implements Component {

    public static final float WIDTH = 1;
    public static final float HEIGHT = 0.6f;

    //A Plane should only move in x-direction
    public static final float VELOCITY = 3f;

    public static final int STATE_NORMAL = 0;


}
