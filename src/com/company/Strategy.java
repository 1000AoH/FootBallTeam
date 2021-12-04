package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Strategy {
    public ArrayList<Player> selectedTeam = new ArrayList<>();
    public int gateKeeperSize = 0;
    public int defenderSize = 0;
    public int midFieldSize = 0;
    public int forwaderSize = 0;

    public void Strategy1442() {
        System.out.println("List of the 1-4-4-2 team: ");
        getSelectedTeam(1, 4, 4, 2);
        printSelectedTeam();
    }

    public void Strategy1433() {
        System.out.println("List of the 1-4-3-3 team: ");
        getSelectedTeam(1, 4, 3, 3);
        printSelectedTeam();
    }

    public void Strategy1352() {
        System.out.println("List of the 1-3-5-2 team: ");
        getSelectedTeam(1, 3, 5, 2);
        printSelectedTeam();
    }

    public void getSelectedTeam(int GK, int DF, int MF, int FW) {
        Random general = new Random();
        ArrayList<Player> listOfTeam = Main.player.listOfTeam;

        // GK
        while (gateKeeperSize < GK) {
            int rdGateKeeper = general.nextInt(22);
            if (listOfTeam.get(rdGateKeeper).getPosition().equals(Player.Position.Gk)) {
                selectedTeam.add(listOfTeam.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }
        // DF
        while (defenderSize < DF) {
            int rdDefender = general.nextInt(22);
            if (listOfTeam.get(rdDefender).getPosition().equals(Player.Position.DF) && !selectedTeam.contains(listOfTeam.get(rdDefender))) {
                selectedTeam.add(listOfTeam.get(rdDefender));
                defenderSize++;
            }

        }
        // MF
        while (midFieldSize < MF) {
            int rdMidFielder = general.nextInt(22);
            if (listOfTeam.get(rdMidFielder).getPosition().equals(Player.Position.MF) && !selectedTeam.contains(listOfTeam.get(rdMidFielder))) {
                selectedTeam.add(listOfTeam.get(rdMidFielder));
                midFieldSize++;
            }
        }
        // FW
        while (forwaderSize < FW) {
            int rdForwader = general.nextInt(22);
            if (listOfTeam.get(rdForwader).getPosition().equals(Player.Position.FW) && !selectedTeam.contains(listOfTeam.get(rdForwader))) {
                selectedTeam.add(listOfTeam.get(rdForwader));
                forwaderSize++;
            }
        }
        resetSize();
    }

    public void printSelectedTeam() {

        for (Player i : selectedTeam) {
            System.out.println(i);
        }
    }

    public void clearSelectedTeam() {
        selectedTeam.clear();
    }

    public void resetSize() {
        gateKeeperSize = 0;
        defenderSize = 0;
        midFieldSize = 0;
        forwaderSize = 0;
    }

}
