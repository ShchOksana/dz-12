package dataproviders;

import com.rd.person.Man;
import models.Persons;
import org.testng.annotations.DataProvider;
import static utils.CsvReader.getListPersonsFromCsv;

public class TestDataProvider {
    private static final String PATH = "src\\test\\resources\\inputpersons.csv";
        @DataProvider(name = "dppersons")
        public static Object[] createPersons() {
            return getListPersonsFromCsv(PATH, Persons.class).stream().map(persons -> new Man(persons.getFirstName(),persons.getLastName(),persons.getAge())
                    .toArray(Object[] ::new);
        }
    }