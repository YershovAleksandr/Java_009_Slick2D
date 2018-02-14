package com.nam;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Game extends BasicGameState {
    public static int ID = 2;

    private static Logger log = LoggerFactory.getLogger(Game.class);

    private StateBasedGame game;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        //
        log.info("Init");


        game = sbg;
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        //
        g.drawString("Game", 100, 100);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        //
        if (gc.getInput().isKeyPressed(Input.KEY_ESCAPE)){
            //game.enterState(1);
            game.enterState(Main.MAINMENU, new FadeOutTransition(Color.blue), new FadeInTransition(Color.blue));
        }
    }

    @Override
    public int getID() {
        return ID;
    }
}

