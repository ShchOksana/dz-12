package utils;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Persons;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {
    public static <T> List<T> getListPersonsFromCsv(String path, Class<? extends T> type){
        try{
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            CsvToBean<T> csvObjectBuilder = new CsvToBeanBuilder<T>(reader)
                    .withType(type)
                    .build();
            return csvObjectBuilder.parse();
        }catch (IOException ex){
            throw new RuntimeException("Please check if file exists by the following path: " + path + ex);
        }

    }
}
