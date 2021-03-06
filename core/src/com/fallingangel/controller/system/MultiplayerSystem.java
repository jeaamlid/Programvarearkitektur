package com.fallingangel.controller.system;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntityListener;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IntervalSystem;
import com.fallingangel.controller.MultiplayerController;
import com.fallingangel.model.MultiPlayerData;
import com.fallingangel.game.FallingAngel;
import com.fallingangel.model.component.AngelComponent;
import com.fallingangel.model.component.StateComponent;
import com.fallingangel.model.component.TransformComponent;

import java.util.ArrayList;

public class MultiplayerSystem extends IntervalSystem {
    // System used to update the score in the database while playing a multiplayer game
    private FallingAngel game;
    public MultiplayerController multiplayerController;
    public static String roomNumber = "";
    public Engine engine;

    private ArrayList<Entity> playerEntities = new ArrayList<>();

    private ComponentMapper<AngelComponent> angelMapper = ComponentMapper.getFor(AngelComponent.class);
    private ComponentMapper<TransformComponent> transformMapper = ComponentMapper.getFor(TransformComponent.class);
    private ComponentMapper<StateComponent> stateMapper = ComponentMapper.getFor(StateComponent.class);

    public MultiplayerSystem(int priority){
        super(0.5f, priority);
    }

    @Override
    public void addedToEngine(final Engine engine) {
        this.game = FallingAngel.getInstance();
        this.engine = engine;
        //this.multiplayerController = game.mc.gameActionsController.multiplayerController;
        Family family = Family.all(AngelComponent.class).get();
        for (Entity entity : engine.getEntitiesFor(family)){
            playerEntities.add(entity);
        }

        // Adds an entitylistener so that it gets notified when an entity is removed
        engine.addEntityListener(family, new EntityListener() {
            @Override
            public void entityAdded(Entity entity) {
                playerEntities.add(entity);

            }

            @Override
            public void entityRemoved(Entity entity) {
                playerEntities.remove(entity);
            }
        });
    }

    @Override
    protected void updateInterval () {
        for (Entity entity : playerEntities){
            AngelComponent angelComponent = angelMapper.get(entity);
            TransformComponent transformComponent = transformMapper.get(entity);
            StateComponent stateComponent = stateMapper.get(entity);
            this.multiplayerController = game.mc.gameActionsController.multiplayerController;
            MultiPlayerData mpd = game.mc.gameActionsController.multiplayerController.multiPlayerData;
            mpd.setScore((int) (angelComponent.SCORE));
            game.FBI.updateScore(mpd);
            game.FBI.setOpponentScore();
        }
    }
    /*
    @Override
    protected void updateInterval () {
        for (Entity entity : playerEntities){
            AngelComponent angelComponent = angelMapper.get(entity);
            TransformComponent transformComponent = transformMapper.get(entity);
            StateComponent stateComponent = stateMapper.get(entity);

            MultiPlayerData player1 = game.mc.multiplayerController.multiPlayerData;
            player1.setScore((int) (angelComponent.SCORE));
            game.FBI.update(player1);
        }
    }
     */
}
