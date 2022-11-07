package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Utilities to input/output player data for a command line game
 *
 *  See:
 *  - UseAConstructor
 *  - ObjectArrMeth
 *
 */
public class Ex4ReadPlayers 
{
    public static void main(String[] args) 
    {
        new Ex4ReadPlayers().program();
    }

    final Scanner sc = new Scanner(in);

    void program()
    {
        Player[] players = inputPlayers();
        outPlayers(players);
    }

    // This class captures the concept of a Player
    class Player 
    {
        String name;   // A Player has a name and...
        int points;    // ... and points

        Player(String name, int points)
        {
            this.name = name;
            this.points = points;
        }
    }

    // ---------- Methods -------------------

     Player[] inputPlayers() 
    {
        out.println("How many players? >");
        int number_of_players = sc.nextInt();
        sc.nextLine();
        Player[] playerList = new Player[number_of_players];

        for (int i = 0; i < playerList.length; i++)
        {
            out.println("Name for player " + (i+1) + " >");
            String playerName = sc.nextLine();
            playerList[i] = new Player(playerName, 0);
            
        }
        return playerList;   
    }

    void outPlayers(Player[] players)
    {
        for(Player p: players)
        {
            out.println("Player is " + p.name + " Points are " + p.points);
        }

    }


}
