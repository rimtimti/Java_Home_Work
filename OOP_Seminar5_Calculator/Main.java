package OOP_Seminar5_Calculator;

import OOP_Seminar5_Calculator.Controller.UserController;
import OOP_Seminar5_Calculator.Model.Calc;
import OOP_Seminar5_Calculator.Model.CalcImpl;
import OOP_Seminar5_Calculator.Model.LogManager;
import OOP_Seminar5_Calculator.Views.ViewCalc;

public class Main {
    public static void main(String[] args) {
        Calc calculator = new CalcImpl();
        UserController userController = new UserController(calculator);
        LogManager logger = new LogManager("OOP_Seminar5_Calculator/Calculator.log");
        ViewCalc viewCalc = new ViewCalc(userController, logger);
        viewCalc.run();
    }
}