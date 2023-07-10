package person;

import dataproviders.TestDataProvider;
import models.Persons;
import org.testng.Assert;
import org.testng.annotations.*;

import static utils.CsvReader.getListPersonsFromCsv;

public class IsRetiredTests {
//    @BeforeClass
//    public void init(){
//        createPersons();
//    }
private static final String PATH = "src\\test\\resources\\inputpersons.csv";

    @Test(dataProvider = "dppersons", dataProviderClass = TestDataProvider.class)
    public void testManShouldNotBeRetired(String firstName, String lastName, int age, String gender){
        System.out.println(firstName+ lastName + age + gender);



 //       Assert.assertFalse(men1.isRetired(), "Men's age >= 65");
    }

//    @Test
//    public void testMenShouldBeRetired(Object[][] objects){
//        Assert.assertTrue(retired,"Men's age < 65");
//    }
//    @Test
//    public void testWomenShouldNotBeRetired(){
//        Assert.assertFalse(women1.isRetired(), "Women's age >= 60");
//    }
//    @Test
//    public void testWomanShouldBeRetired(){
//        Assert.assertTrue(women2.isRetired(),"Women's age < 60");
//    }
}
