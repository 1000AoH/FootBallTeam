package com.company;

import java.util.ArrayList;

public class Player {
    private int number;
    private String fullName;
    private Position position;
    public ArrayList<Player> listOfTeam = new ArrayList<>();

    public Player() {
    }

    public Player(int number, String fullName, Position position) {
        this.number = number;
        this.fullName = fullName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", fullName='" + fullName + '\'' +
                ", position=" + position +
                '}';
    }

    public void addTeamMember(Player x) {
        listOfTeam.add(x);
    }

    public void printMember() {
        for (Player i : listOfTeam) {
            System.out.println(i);
        }
    }

    public Position getPosition() {
        return position;
    }

    public enum Position {
        Gk,
        DF,
        MF,
        FW
    }
}
