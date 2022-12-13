package OOP_Seminar5_Calculator.Controller;

import OOP_Seminar5_Calculator.Model.Calc;
import OOP_Seminar5_Calculator.Model.Complex;

public class UserController {

    private Calc calc;
    
    public UserController(Calc calc) {
        this.calc = calc;
    }

    public Complex sum(Complex complex1, Complex complex2){
        return calc.Sum(complex1, complex2);   
    }

    public Complex minus(Complex complex1, Complex complex2){
        return calc.Diff(complex1, complex2);   
    }

    public Complex multi(Complex complex1, Complex complex2){
        return calc.Mult(complex1, complex2);   
    }

    public Complex div(Complex complex1, Complex complex2){
        return calc.Div(complex1, complex2);   
    }

}
