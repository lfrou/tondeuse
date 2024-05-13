package com.capgemini;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("tondeuses.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            String line = br.readLine();
            String[] dimensions = line.split(" ");
            Pelouse pelouse = new Pelouse(Integer.parseInt(dimensions[0]), Integer.parseInt(dimensions[1]));

            while ((line = br.readLine()) != null && line.length() > 0) {
                String[] positions = line.split(" ");
                Position pos = new Position(Integer.parseInt(positions[0]), Integer.parseInt(positions[1]), positions[2].charAt(0));
                Tondeuse tondeuse = new Tondeuse(pos, pelouse);

                line = br.readLine();
                tondeuse.executeInstructions(line);
                System.out.println(tondeuse.getPosition().toString());
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading the file");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error formatting numbers");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error has occurred");
            e.printStackTrace();
        }
    }
}