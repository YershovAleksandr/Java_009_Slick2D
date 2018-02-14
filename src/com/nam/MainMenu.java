package com.nam;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class MainMenu extends BasicGameState{
    public static int ID = 0;

    private static Logger log = LoggerFactory.getLogger(MainMenu.class);

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        //
        log.info("Init");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        //
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        //
    }

    @Override
    public int getID(){
        return ID;
    }
}
