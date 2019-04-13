/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author José
 */
public class Round {
    int roundNum;
    int playersNum;
    String[] playersNomes;
    int[] playersPontos;
    int tempo;

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(int roundNum) {
        this.roundNum = roundNum;
    }

    public int getPlayersNum() {
        return playersNum;
    }

    public void setPlayersNum(int playersNum) {
        this.playersNum = playersNum;
    }

    public String[] getPlayersNomes() {
        return playersNomes;
    }

    public void setPlayersNomes(String[] playersNomes) {
        this.playersNomes = playersNomes;
    }

    public int[] getPlayersPontos() {
        return playersPontos;
    }

    public void setPlayersPontos(int[] playersPontos) {
        this.playersPontos = playersPontos;
    }
}