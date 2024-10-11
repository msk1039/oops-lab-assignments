public class Main {
    public static void main(String[] args) {

        Complex o1 = new Complex(5,7);
        Complex o2 = new Complex(6,9);

        Complex sum = Complex.sum(o1,o2);
        Complex sub = Complex.sub(o1,o2);
        Complex mul = Complex.mul(o1,o2);

        System.out.println("sum = "+sum.real + " + "+sum.img+"i");
        System.out.println("sub = "+sub.real + " + "+sub.img+"i");
        System.out.println("mul = "+mul.real + " + "+mul.img+"i");

    }
}

class Complex{

    double real;
    double img;


    Complex(double r , double i){
        this.real = r;
        this.img = i;
    }

    public static Complex sum(Complex a, Complex b){
        Complex temp =  new Complex(0,0);
        temp.real = a.real + b.real;
        temp.img = a.img + b.img;
        return temp;
    }

    public static Complex sub(Complex a, Complex b){
        Complex temp =  new Complex(0,0);
        temp.real = a.real + b.real;
        temp.img = a.img - b.img;
        return temp;
    }

    public static Complex mul(Complex a, Complex b){
        Complex temp =  new Complex(0,0);
        temp.real = a.real*b.real - a.img*b.img;
        temp.img = a.real*b.img + a.img*b.real;
        return temp;
    }
}
