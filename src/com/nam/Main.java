package com.nam;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main extends StateBasedGame{

    public static final int SPLASHSCREEN    = 0;
    public static final int MAINMENU        = 1;
    public static final int GAME            = 2;

    public static final int WIDTH   = 1024;
    public static final int HEIGHT  = 768;
    public static final int FPS     = 60;
    public static final double VERSION = 1.0;

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public Main(String appName){
        super(appName);
    }

    public void initStatesList(GameContainer gc) throws SlickException{
        //
        this.addState(new MainMenu());
    }

    public static void main(String[] args) {
	// write your code here

        log.info("Info");

        try{
            //AppGameContainer app = new AppGameContainer(new GameApp("Fuck Fucker Motherfucka"));
            AppGameContainer app = new AppGameContainer(new Main("Fuck Fucker Motherfucka v" + VERSION));
            app.setDisplayMode(WIDTH,HEIGHT, false);
            app.setTargetFrameRate(FPS);
            app.setShowFPS(true);
            app.start();
        }
        catch (SlickException ex){
            log.error("Wtf", ex);
        }
    }
}
