package inandout.RandomAccessFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class RAFDemo_3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("cost.txt");
        RandomAccessFile raf = new RandomAccessFile(file,"r");
        List<Person> personList = new ArrayList<>();
        
    }
}
