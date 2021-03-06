package com.fallingangel.model;

public class MultiPlayerData {

    public boolean isGameOver = false;
    public int score = 0;
    public String username = "username not defined";
    public int numberOfUsersInRoom = 0;

    public MultiPlayerData(){
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean isGameOver) {
        this.isGameOver = isGameOver;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setNumberOfUsersInRoom(int numberOfUsersInRoom){
        this.numberOfUsersInRoom = numberOfUsersInRoom;
    }

    public int getNumberOfUsersInRoom(){
        return numberOfUsersInRoom;
    }
    public MultiPlayerData(boolean isGameOver, int score, String username){
        this.isGameOver = isGameOver;
        this.score = score;
        this.username = username;
    }
}
