package com.trasodeveloper.javaforbeginners.readingfilesfilereader;

import java.io.*;

public class ReadingFilesFileReader {

    public void mainFilesReader() {
        File file = new File("src//com//trasodeveloper//javaforbeginners//readingfilesfilereader//test-filereader.txt");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            } catch (NullPointerException e) {
                //File was probably never finded
            }
        }

    }
}
