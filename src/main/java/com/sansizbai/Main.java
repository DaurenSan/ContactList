package com.sansizbai;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        PostgreDude pg = new PostgreDude();

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

        pg.makeQuery(query);


    }
}