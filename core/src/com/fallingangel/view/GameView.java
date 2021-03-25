package com.fallingangel.view;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.fallingangel.game.FallingAngel;
import com.fallingangel.model.World;
import com.fallingangel.controller.system.AngelSystem;

public class GameView{

    //Tar i bruk assets for å hente bilder

    private OrthographicCamera gameCam;
    private Viewport viewPort; //Viewport manages a Camera's viewportWidth and viewportHeight
    public FallingAngel game;
    private World world;


    private Stage stage;
    private Stage settingsStage;

    //ASHLEY
    private Engine engine;
    private AngelSystem angelSystem;
    private ImmutableArray players;
    private Entity physicsEntity;

    public void GameView(FallingAngel game) {

    }



}