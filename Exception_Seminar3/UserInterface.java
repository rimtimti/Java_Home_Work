package Exception_Seminar3;

import java.time.format.DateTimeParseException;

public class UserInterface {
    private Controller controller;

    public UserInterface(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        System.out.println("\nПеред Вами программа 'Визитка': получает данные от пользователя, проверяет и записывает их в файл с названием по его фамилии. Работает только в латинице!");
        while (true) {
            System.out.println("Введите данные через ПРОБЕЛ (возможно любое число пробелов между данными) в следующем формате:\nФамилия Имя Отчество(строки, допускается дефис, но не сначала и на конце)\nДата рождения(в формате dd.mm.yyyy)\nНомер телефона(только цифры)\nПол(m - муж или f - жен.)");
            try {
                User user = controller.checkData(controller.inputFromUser());
                controller.checkName(user.getSurname());
                controller.checkName(user.getName());
                controller.checkName(user.getPatronymic());
                controller.checkBirthday(user.getBirthday());
                controller.checkTelephone(user.getTelephone());
                controller.checkGender(user.getGender());
                controller.fileWriter(user);
                break;

            } catch (ExeptionMoreInput e) {
                System.out.println("Введено больше данных чем нужно!");
                continue;
            } catch (ExeptionLessInput e) {
                System.out.println("Введено меньше данных чем нужно!");
                continue;
            } catch (ExceptionIncorrectName e) {
                System.out.println("Некорректно введены поля фамилии, имени или отчества!");
                continue;
            } catch (DateTimeParseException e) {
                System.out.println("Введен некорректный формат дня рождения!");
                continue;
            } catch (ExceptionFutureDate e) {
                System.out.println("Введена дата позднее текущей! Вы из будущего?");
                continue;
            } catch (NumberFormatException e) {
                System.out.println("Введен некорректный формат номера телефона!");
                continue;
            } catch (ExceptionIncorrectGender e) {
                System.out.println("Введен некорректный формат пола!");
                continue;
            }
        }
    }
}
