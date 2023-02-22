package Exception_Seminar3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Controller {

    public String inputFromUser() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            scanner.close();
        }
        return input;
    }

    public User checkData(String input) {
        int lenght = 6;
        String[] result = input.trim().replaceAll(" +", " ").split(" ");
        if (result.length > lenght) {
            throw new ExeptionMoreInput();
        }
        if (result.length < lenght) {
            throw new ExeptionLessInput();
        }
        return map(result);
    }

    public void checkName(String data) {
            if (!data.matches("^[a-zA-Z-]*$")) {
                throw new ExceptionIncorrectName();
            }
            if (data.charAt(0) == '-' || data.charAt(data.length()-1) == '-'){
                throw new ExceptionIncorrectName();
            }
    }

    public void checkBirthday(String data) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
        LocalDate dateNow = LocalDate.now();
        if (LocalDate.parse(data, formatter).isAfter(dateNow)){
            throw new ExceptionFutureDate();
        }
        LocalDate.parse(data, formatter);
    }

    public void checkTelephone(String data) throws NumberFormatException {
        Long.parseLong(data);
    }

    public void checkGender(String data) {
        if (!data.equals("f") && !data.equals("m")) {
            throw new ExceptionIncorrectGender();
        }
    }

    public User map(String[] result) {
        return new User(result[0], result[1], result[2], result[3], result[4], result[5]);
    }

    public String map(User user) {
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\n", user.getSurname(), user.getName(), user.getPatronymic(),
                user.getBirthday(), user.getTelephone(), user.getGender());
    }

    public void fileWriter(User user) {
        try (FileWriter writer = new FileWriter(String.format("Exception_Seminar3/%s.txt", user.getSurname()), true)) {
            writer.append(map(user));
            System.out.printf("Данные проверены и записаны в файл %s.txt", user.getSurname());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
