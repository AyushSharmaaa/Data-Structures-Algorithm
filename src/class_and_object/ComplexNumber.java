package class_and_object;

import temp.ComplexNumbers;

public class ComplexNumber
{
    private int real;
    private int imaginary;

    public ComplexNumber(int real , int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary()
    {
        return imaginary;
    }

    public int getReal()
    {
        return real;
    }

    public void  setReal(int real)
    {
        this.real = real;
    }

    public void setImaginary(int imaginary)
    {
        this.imaginary = imaginary;
    }

    public void print()
    {
        System.out.println(real + "+" + imaginary + "i");
    }

    public void add(ComplexNumber c2)
    {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }
    public void multiply(ComplexNumber c2)
    {
        int x = this.real;
        int y = this.imaginary;

        this.real =   (this.real * c2.real) - (this.imaginary * c2.imaginary);
        this.imaginary = (x * c2.imaginary) + (y * c2.real);
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c3)
    {
        int newReal = c1.real + c3.real;
        int newImaginary = c1.imaginary + c3.imaginary;

        ComplexNumber c = new ComplexNumber(newReal , newImaginary);
        return c;
    }
}
class ComplexNumberUse
{
    public static void main (String args[])
    {
        ComplexNumber c1 = new ComplexNumber(2,3);
        c1.print();

        c1.setReal(10);
        c1.setImaginary(30);
        c1.print();

        ComplexNumber c2 = new ComplexNumber(1,5);
        c1.add(c2);
        c1.print();
        c2.print();

        ComplexNumber c3 = new ComplexNumber(3,2);
        c3.multiply(c2);
        c3.print();
        c2.print();

        //   ComplexNumber c4 = new ComplexNumber.add(c1,c3);




    }
}
