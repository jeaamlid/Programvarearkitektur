package com.fallingangel.model;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Asset {

    //Spillets bakgrunn, bruker samme gjennom hele spillet:
    public static String gameBackground = "/BackgroundSky.png";

    //Alle PNGs for pig-animation
    public static String pigAnimation1 = "characters/pig/pig_animation_1.PNG";
    public static String pigAnimation2 = "characters/pig/pig_animation_2.PNG";
    public static String pigAnimation3 = "characters/pig/pig_animation_3.PNG";
    public static String pigAnimation4 = "characters/pig/pig_animation_4.PNG";
    public static String pigAnimation5 = "characters/pig/pig_animation_5.PNG";
    public static String pigAnimation6 = "characters/pig/pig_animation_6.PNG";
    //Sprite-sheet for pig
    public static String pigSpritesheet = "/characters/pig/pig_animation.png";

    //PNGs for select character siden:
    public static String pig_select_character = "characters/pig/pig_select_character.PNG";

    //Devil obstacles:
    public static String devil1 = "obstacles/devil/devil_1.png";
    public static String devil2 = "obstacles/devil/devil_2.png";
    //spritesheet for devilAnimation
    public static String devilAnimation = "obstacles/devil/devil_animation.png";

    //Cloud-obstacle:
    public static String cloud = "obstacles/cloud.png";

    //Plane obstacle
    public static String plane = "obstacles/plane.png";

    //balloon obstacles
    public static String blueBalloon = "obstacles/balloons/blue_balloon.png";
    public static String greenBalloon = "obstacles/balloons/green_balloon.png";
    public static String redBalloon = "obstacles/balloons/red_balloon.png";
    public static String yellowBalloon = "obstacles/balloons/yellow_balloon.png";

    //power-ups and benefits:
    public static String coin = "coin.png";
    //public static String powerUp = "[path]";


    //importerer assetManager for å håndtere innlasting av filer.
    private static AssetManager assetManager;




    public Asset(){
        this.assetManager = new AssetManager();
    }


    public static void dispose(){
        assetManager.dispose();
    }

    public static void load(String filename){
        //assetManager.load(filename, Texture.class);
    }


    public Texture getTexture(String textureName){
        return assetManager.get(textureName, Texture.class);
    }


    /*
    //TODO: metoder fra tubby for laste-state. Legger metodene her dersom vi skulle få bruk for det.
    public static float getProgress(){
        return assetManager.getProgress();
    }

    public static Texture getTexture(String tex){
        return assetManager.get(tex, Texture.class);
    }
     */


    /*
    //TODO: metode fra tubby for musikk og lyd, dersom vi skulle implementert det senere:
    music = Gdx.audio.newMusic(Gdx.files.internal("data/music.mp3"));
		music.setLooping(true);
		music.setVolume(0.5f);
		if (Settings.soundEnabled) music.play();
		jumpSound = Gdx.audio.newSound(Gdx.files.internal("data/jump.wav"));
		highJumpSound = Gdx.audio.newSound(Gdx.files.internal("data/highjump.wav"));
		hitSound = Gdx.audio.newSound(Gdx.files.internal("data/hit.wav"));
		coinSound = Gdx.audio.newSound(Gdx.files.internal("data/coin.wav"));
		clickSound = Gdx.audio.newSound(Gdx.files.internal("data/click.wav"));
     */




}
