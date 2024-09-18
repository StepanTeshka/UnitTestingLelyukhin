package third.task;

import java.util.HashMap;
import java.util.Map;

public class AdressBook {
    static Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }


    public String getPhone(String name) {
        return contacts.get(name);
    }

    public static void removeContact(String name) {
        contacts.remove(name);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Контакты:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("Имя: " + entry.getKey() + ", Телефон: " + entry.getValue());
            }
        }
    }
}
