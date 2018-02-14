package com.nam;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class SplashScreen extends BasicGameState {
    public static int ID = 0;

    private static Logger log = LoggerFactory.getLogger(SplashScreen.class);

    private int loading = 0;
    private int maxloading = 50;

    private StateBasedGame game;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        //
        log.info("Init");

        loading = 0;

        game = sbg;
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        //

        g.drawString("Splash Screen", 100, 100);
        if (loading <= maxloading) {
            g.drawString("Loading... " + loading, 100, 200);
        }
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        //
        if (loading++ >= maxloading){
            //game.enterState(1);
            game.enterState(Main.MAINMENU, new FadeOutTransition(Color.blue), new FadeInTransition(Color.blue));
        }
    }

    @Override
    public int getID() {
        return ID;
    }
}

