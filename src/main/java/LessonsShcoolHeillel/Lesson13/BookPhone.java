package LessonsShcoolHeillel.Lesson13;

import java.util.Arrays;

public class BookPhone {
    Recording[] recordings = {};

    public void add(String name, String numberPhone) {

        if (name == null || numberPhone == null) {
            throw new IllegalArgumentException("Имя и номер телефона не могут быть пустыми");
        }

        for (Recording r : recordings) {
            if (r.getName().equals(name) && r.getNumberPhone().equals(numberPhone)) {
                System.out.println("Такой контакт уже существует в справочнике");
                return;
            }
        }
        Recording newRecord = new Recording(name, numberPhone);
        Recording[] newRecordings = Arrays.copyOf(recordings, recordings.length + 1);
        newRecordings[newRecordings.length - 1] = newRecord;
        recordings = newRecordings;
    }

    public Recording find(String name) {
        for (int i = 0; i < recordings.length; i++) {
            if (recordings[i].getName().equals(name)) {
                return recordings[i];
            }
        }
        return null;
    }

    public void showInformation() {
        for (int i = 0; i < recordings.length; i++) {
            System.out.println((
                    "Имя: " + recordings[i].getName() +
                            " Номер телефона: " + recordings[i].getNumberPhone()));
        }
    }

}
