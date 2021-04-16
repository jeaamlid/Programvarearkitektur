package com.fallingangel.model.component;

import com.badlogic.ashley.core.Component;
import com.fallingangel.model.Asset;

public class PlaneComponent implements Component {

    public static final float WIDTH = Asset.planeTexture.getRegionWidth();
    public static final float HEIGHT = Asset.planeTexture.getRegionHeight();

    public float VELOCITY = 3f;
    public float SPEED;

    public static final int STATE_NORMAL = 0;

    public boolean IS_FLIPPED = false;


}
