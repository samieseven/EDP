import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by Sam Faint on 2016-01-08.
 */

public class Main {

    public static void main(String[] args) {new Main().program();}


    void program() {

        Scanner scanInt = new Scanner(in);
        Scanner scanName = new Scanner(in);
        //Dice dice = new Dice();
        boolean done = false;                // Game over
        boolean aborted = false;             // Game aborted
        int turns = 0;
        int choice;
        String name;
        Race race = Race.NONE;
        Prof prof = Prof.NONE;

        out.print("What is your name young one? > I am ");
        name = scanName.nextLine();
        out.println("Hi " + name + ". My eyes are bad these days. You're....");
        out.println("-----Race-----");
        out.println("1. Human   - Str:+1 Dex:+1 Int:+1 End:+1 Will:+1");
        out.println("2. Elf     - Str:+3 Dex:+0 Int:+0 End:+2 Will:+0");
        out.println("3. Dwarf   - Str:+0 Dex:+1 Int:+3 End:+0 Will:+1");
        out.println("4. Orc     - Str:+0 Dex:+3 Int:+2 End:+1 Will:+0");

        while(!done) {
            choice = scanName.nextInt();
            if(0<choice && choice<5){
                switch (choice) {
                    case 1:
                        race = Race.HUMAN;
                        done = true;
                        break;
                    case 2:
                        race = Race.ELF;
                        done = true;
                        break;
                    case 3:
                        race = Race.DWARF;
                        done = true;
                        break;
                    case 4:
                        race = Race.ORC;
                        done = true;
                        break;
                }
            }
        }
        done = false;

        out.println("-----Class-----");
        out.println("1. WARRIOR");
        out.println("2. MAGE");
        out.println("3. THIEF");
        out.println("4. PRIEST");

        while(!done) {
            choice = scanName.nextInt();
            if(0<choice && choice<5){
                switch (choice) {
                    case 1:
                        prof = Prof.WARRIOR;
                        done = true;
                        break;
                    case 2:
                        prof = Prof.MAGE;
                        done = true;
                        break;
                    case 3:
                        prof = Prof.THIEF;
                        done = true;
                        break;
                    case 4:
                        prof = Prof.PRIEST;
                        done = true;
                        break;
                }
            }
        }

        Player hPlayer = new Player(name,race,prof);

        //toString.... out.print(hPlayer)
        System.out.println("Is that right?");
        System.out.println("Name: " + hPlayer.getName());
        System.out.println("Level: " + hPlayer.getLevel());
        System.out.println("Race: " + hPlayer.getRace());
        System.out.println("Class: " + hPlayer.getProf());
        System.out.println("Exp to next Lvl: " + (hPlayer.getNextLvl() - hPlayer.getExp()));
        System.out.println("--------Stats ---------");
        System.out.println("Str: " + hPlayer.getStrAtt());
        System.out.println("Dex: " + hPlayer.getDexAtt());
        System.out.println("Int: " + hPlayer.getIntAtt());
        System.out.println("End: " + hPlayer.getEndAtt());
        System.out.println("Wil: " + hPlayer.getWilAtt());

    }


}
