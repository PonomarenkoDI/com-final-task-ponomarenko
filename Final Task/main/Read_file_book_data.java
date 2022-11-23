package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read_file_book_data {
    List<String> bookMagazin = new ArrayList<>();
    String line;

    public List file_reader() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\Final Task\\resources\\file_book_data.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                bookMagazin.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookMagazin;
    }

    public List fileWriter(){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"\\Final Task\\resources\\file_book_data.txt"));
            for (String str1 : bookMagazin
            ) {
                bufferedWriter.write(str1);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return bookMagazin;
    }
}

