package com.sa.clientmanagement.db;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {

    public static void main(String[] args) {

        String path = "ClientManagement/src/com/sa/clientmanagement/db/database.csv";

        //Todo: fix to not be in a main method
        String[] dataRow = {"55", "temp", "test", "n", "200.00"};
        // this sort of works, however it needs to be optimized
        /*  currently it re-writes the file every time, it needs to skip the header
        and only write on new lines
         */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write("ID,Name,Industry,Contact Person,Revenue");
            writer.newLine();
            writeData(writer, dataRow);
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeData(BufferedWriter writer, String[] data) throws IOException {
        writer.write(String.join(",", data));
        writer.newLine();
    }
}
