package com.fallingangel.backend;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.utils.ImmutableArray;

public class CoreInterfaceClass implements FireBaseInterface{

    @Override
    public void createUser(String mail, String username, String password) {

    }

    @Override
    public void updateScore(int score) {

    }

    @Override
    public void connectToRoom(String roomName, MultiPlayerData mpd) {

    }

    @Override
    public int opponentScore() {
        return 0;
    }
/*
    @Override
    public void createWorldInDB(ImmutableArray<Entity> entities) {

    }
*/
}
