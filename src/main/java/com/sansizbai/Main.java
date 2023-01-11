package com.sansizbai;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        PostgreDude pgGuy = new PostgreDude();
        pgGuy.connectToDb("asdfg");

        String query = null;

        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            query = br.readLine();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }

        pgGuy.makeQuery(query);


    }
}