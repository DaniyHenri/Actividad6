package paq1;

public class Rectangle implements Shape {

        public double base;
        public double altura;

        public Rectangle(double base,double altura) {
            this.base = base;
            this.altura = altura;
        }
        //
        public void setAltura(double altura) {
            this.altura = altura;
        }
        public void setBase(double base){
            this.base=base;
        }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimeter() {
        return (base * 2) + (altura *2);
    }




    }



