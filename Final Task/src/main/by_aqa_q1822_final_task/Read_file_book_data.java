package by_aqa_q1822_final_task;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read_file_book_data {

    public List file_reader() {
        List<String> bookMagazin = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\DZ\\com-final-task-ponomarenko\\Final Task\\src\\resources\\file_book_data.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                bookMagazin.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String str : bookMagazin) {
            System.out.println(str);
        }
        return bookMagazin;
    }
}

