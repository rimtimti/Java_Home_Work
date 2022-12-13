package OOP_Seminar5_Calculator.Model;

public class CalcImpl implements Calc {

    @Override
    public Complex Sum(Complex complex1, Complex complex2) {
        double real = complex1.getRe() + complex2.getRe();
        double imag = complex1.getIm() + complex2.getIm();
        return new Complex(real, imag);

    }

    @Override
    public Complex Diff(Complex complex1, Complex complex2) {
        double real = complex1.getRe() - complex2.getRe();
        double imag = complex1.getIm() - complex2.getIm();
        return new Complex(real, imag);
    }

    @Override
    public Complex Mult(Complex complex1, Complex complex2) {
        double real = complex1.getRe() * complex2.getRe() - complex1.getIm() * complex2.getIm();
        double imag = complex1.getIm() * complex2.getRe() + complex1.getRe() * complex2.getIm();
        return new Complex(real, imag);
    }

    @Override
    public Complex Div(Complex complex1, Complex complex2) {
        double real = (complex1.getRe() * complex2.getRe() + complex1.getIm() * complex2.getIm())
                / (complex1.getRe() * complex2.getRe() + complex1.getIm() * complex2.getIm());
        double imag = (complex1.getIm() * complex2.getRe() - complex1.getRe() * complex2.getIm())
                / (complex2.getRe() * complex2.getRe() + complex2.getIm() * complex2.getIm());
        return new Complex(real, imag);

    }

}