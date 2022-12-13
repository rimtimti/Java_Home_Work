package OOP_Seminar5_Calculator.Model;

public interface Calc {
    Complex Sum(Complex complex1, Complex complex2);
    Complex Diff(Complex complex1, Complex complex2);
    Complex Mult (Complex complex1, Complex complex2);
    Complex Div(Complex complex1, Complex complex2);
}