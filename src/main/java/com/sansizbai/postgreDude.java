package com.sansizbai;

import java.sql.*;


class PostgreDude {

    private Connection conn;


    public void connectToDb (String password){
        try {
            String url = "jdbc:postgresql://127.0.0.1:5432/mydb";
            String user = "postgres";
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeQuery(String query) {
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String country = rs.getString("country");
                String area = rs.getString("area");
                String number = rs.getString("number");

                System.out.println(name + " " + surname + " " + country + " " + area + " " + number);
            }
            st.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
