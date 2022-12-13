package OOP_Seminar5_Calculator.Views;

import java.util.Scanner;

import OOP_Seminar5_Calculator.Controller.UserController;
import OOP_Seminar5_Calculator.Model.Complex;
import OOP_Seminar5_Calculator.Model.LogManager;

public class ViewCalc {

    private UserController userController;
    private LogManager logManager;

    public ViewCalc(UserController userController, LogManager logManager ) {
        this.userController = userController;
        this.logManager = logManager;
    }

    public void run() {
        Commands com = Commands.NONE;
        while (true) {
            String command = askForString("Введите команду: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                // System.out.println("Неопознанная команда");
                logManager.WriteLog().warning("Неопознанная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case SUM:
                        Complex complex1 = setComplex("re1: ", "im1: ");
                        Complex complex2 = setComplex("re2: ", "im2: ");
                        Complex result1 = userController.sum(complex1, complex2);
                        System.out.printf("Результат: %s\n", result1);
                        logManager.WriteLog().info(String.format("(%s) + (%s) = %s", complex1, complex2, result1));
                        break;
                    case DIFF:
                        Complex complex3 = setComplex("re1: ", "im1: ");
                        Complex complex4 = setComplex("re2: ", "im2: ");
                        Complex result2 = userController.minus(complex3, complex4);
                        System.out.printf("Результат: %s\n", result2);
                        logManager.WriteLog().info(String.format("(%s) - (%s) = %s", complex3, complex4, result2));
                        break;
                    case MULT:
                        Complex complex5 = setComplex("re1: ", "im1: ");
                        Complex complex6 = setComplex("re2: ", "im2: ");
                        Complex result3 = userController.multi(complex5, complex6);
                        System.out.printf("Результат: %s\n", result3);
                        logManager.WriteLog().info(String.format("(%s) * (%s) = %s", complex5, complex6, result3));
                        break;
                    case DIV:
                        Complex complex7 = setComplex("re1: ", "im1: ");
                        Complex complex8 = setComplex("re2: ", "im2: ");
                        Complex result4 = userController.multi(complex7, complex8);
                        System.out.printf("Результат: %s\n", result4);
                        logManager.WriteLog().info(String.format("(%s) / (%s) = %s", complex7, complex8, result4));
                        break;

                }
            } catch (Exception e) {
                System.out.println("Нужно ввести Double");
                logManager.WriteLog().warning("Нужно ввести Double");
            }
        }
    }

    private Double askForDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextDouble();
    }

    private String askForString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Complex setComplex(String messageRe, String messageIm) {
        double re = askForDouble(messageRe);
        double im = askForDouble(messageIm);
        return new Complex(re, im);
    }
}