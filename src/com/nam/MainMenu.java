package com.nam;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class MainMenu extends BasicGameState{
    public static int ID = 1;

    private static Logger log = LoggerFactory.getLogger(MainMenu.class);

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        //
        log.info("Init");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        //
        g.drawString("Main Menu", 100, 100);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        //
        if (gc.getInput().isKeyPressed(Input.KEY_1)){
            log.info("Hack");
            sbg.enterState(Main.GAME, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
        }
        if (gc.getInput().isKeyPressed(Input.KEY_ESCAPE)) {
            System.exit(0);
        }
    }

    @Override
    public int getID(){
        return ID;
    }
}
