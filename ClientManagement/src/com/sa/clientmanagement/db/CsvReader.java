package com.sa.clientmanagement.db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {

    public static void main(String[] args) {
        // TODO: remove PSVM and implement method for calling to outside files
        // This isn't a proper execution, just wanted a first test of reader
        String path = "ClientManagement/src/com/sa/clientmanagement/db/database.csv";

        List<String> clients = new ArrayList<>();

        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {

            // TODO: implement a way to skip the first line of the file
            String line = "";

            while ((line = csvReader.readLine()) != null) {
                String[] values = line.split(",");
                clients.add(Arrays.toString(values));
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println(clients);
    }
}
