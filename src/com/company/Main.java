package com.company;

import java.util.Random;

public class Main {
    public static Player player = new Player();
    public static Strategy strategy = new Strategy();
    public static void main(String[] args) {

        addTeamMember();

        //Print team member
        System.out.println(player.listOfTeam.size() + " Foot ball players was imported");
        player.printMember();

        //1GK - 4DF - 4MF - 2FW
        strategy.Strategy1442();
        strategy.clearSelectedTeam();

        //1GK - 4DF - 3MF - 3FW
        strategy.Strategy1433();
        strategy.clearSelectedTeam();

        //1GK - 3DF - 5MF - 2FW
        strategy.Strategy1352();
        strategy.clearSelectedTeam();

    }

    public static void addTeamMember(){
        player.addTeamMember(new Player(10,"Joe Hart", Player.Position.Gk));
        player.addTeamMember(new Player(7,"Iker Casillas", Player.Position.Gk));
        player.addTeamMember(new Player(12,"Sergio Aguero", Player.Position.DF));
        player.addTeamMember(new Player(13,"Andrea Pirlo", Player.Position.DF));
        player.addTeamMember(new Player(1,"Angel Di Maria", Player.Position.DF));
        player.addTeamMember(new Player(2,"Daniele De Rossi", Player.Position.DF));
        player.addTeamMember(new Player(3,"Gareth Bale", Player.Position.DF));
        player.addTeamMember(new Player(5,"Patrice Evra", Player.Position.DF));
        player.addTeamMember(new Player(12,"David Luiz", Player.Position.DF));
        player.addTeamMember(new Player(33,"Moussa Dembele", Player.Position.MF));
        player.addTeamMember(new Player(22,"Wesley Sneijder", Player.Position.MF));
        player.addTeamMember(new Player(21,"Marek Hamsik", Player.Position.MF));
        player.addTeamMember(new Player(23,"Paulinho", Player.Position.MF));
        player.addTeamMember(new Player(24,"Marouane Fellaini", Player.Position.MF));
        player.addTeamMember(new Player(27,"James Rodriguez", Player.Position.MF));
        player.addTeamMember(new Player(30,"Marco Reus", Player.Position.FW));
        player.addTeamMember(new Player(99,"Robin van Persie", Player.Position.FW));
        player.addTeamMember(new Player(77,"Karim Benzema", Player.Position.FW));
        player.addTeamMember(new Player(55,"Carlos Tevez", Player.Position.FW));
        player.addTeamMember(new Player(66,"Didier Drogba", Player.Position.FW));
        player.addTeamMember(new Player(33,"Samuel Eto’o", Player.Position.FW));
        player.addTeamMember(new Player(37,"Arturo Vidal", Player.Position.MF));

    }



}
