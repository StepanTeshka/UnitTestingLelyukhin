import first.task.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdressBook {
    @Test
    void test1 () {
        third.task.AdressBook addressBook = new third.task.AdressBook();

        addressBook.addContact("Тема", "123321");
        assertNotNull(addressBook.getPhone("Тема"));
    }

    @Test
    void test2(){
        third.task.AdressBook addressBook = new third.task.AdressBook();

        addressBook.addContact("Тема", "123321");

        assertEquals(addressBook.getPhone("Тема"), "123321");
    }

    @Test
    void test3(){
        third.task.AdressBook addressBook = new third.task.AdressBook();

        addressBook.addContact("Тема", "123321");
        addressBook.addContact("Никита", "123321");


        third.task.AdressBook.removeContact("Никита");

        assertNull(addressBook.getPhone("Никита"));
    }
}
