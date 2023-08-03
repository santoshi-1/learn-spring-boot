package com.santoshi.learnspringboot;

import com.santoshi.learnspringboot.game.GameRunner;
import com.santoshi.learnspringboot.game.MarioGame;
import com.santoshi.learnspringboot.game.PacmanGame;
import com.santoshi.learnspringboot.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String args[]) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }
}
