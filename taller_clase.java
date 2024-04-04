import java.util.Scanner;

public class taller_clase {

    //persona
    public void persona(int dia_nacimiento,int mes_nacimiento,int año_nacimiento,int dia_actual,int mes_actual,int año_actual){

        //calcular edad en años , meses, dias
        int edad_años = año_actual - año_nacimiento;
        int edad_meses = mes_actual - mes_nacimiento;
        int edad_dias = dia_actual - dia_nacimiento;

        if (edad_dias < 0) {
            edad_meses--;
            edad_dias += 30;
        }
        
        if (edad_meses < 0) {
            edad_años--;
            edad_meses += 12;
        }
        
        System.out.println("Edad: " + edad_años + " años, " + edad_meses + " meses y " + edad_dias + " días.");

    }

    //cuadrado

public void cuadrado(int lado){
    
    int perimetro = lado * 4;
    int area = lado * lado;
    
    System.out.println("Perimetro: " + perimetro);
    System.out.println("Area: " + area);


}

    //circulo 

    public void circulo(int radio){


    int perimetro = (int) (2 * 3.14 * radio);
    int area = (int) (3.14 * radio * radio);

    System.out.println("Perimetro: "+perimetro);
    System.out.println("Area: "+ area);


    }

    //triangulo

public void triangulo(int base,int altura){
    
    int perimetro = base * 3;
    int area = (base * altura)/2;
    int hipotenusa = (int) Math.sqrt(base * base + altura * altura);
    
    System.out.println("Perimetro: "+perimetro);
    System.out.println("Area: "+area);
    System.out.println("Hipotenusa: "+hipotenusa);


}

public static void main(String[] args) {
    
    Scanner teclado=new Scanner(System.in);
    taller_clase metodo=new taller_clase();

    System.out.println("Seleccione 1 para el metodo Persona");
    System.out.println("");
    System.out.println("Seleccione 2 para el metodo cuadrado");
    System.out.println("");
    System.out.println("Seleccione 3 para el metodo circulo");
    System.out.println("");
    System.out.println("Seleccione 4 para el metodo triangulo");

    byte menu = teclado.nextByte();

    switch (menu) {
        case 1:

        System.out.println("digite el dia de nacimiento: ");
        int dia_nacimiento=teclado.nextInt();
        System.out.println("digite el mes de nacimiento: ");
        int mes_nacimiento=teclado.nextInt();
        System.out.println("digite el año de nacimineto: ");
        int año_nacimiento=teclado.nextInt();

        System.out.println("");

        System.out.println("digite el dia actual: ");
        int dia_actual=teclado.nextInt();
        System.out.println("digite el mes actual: ");
        int mes_actual=teclado.nextInt();
        System.out.println("digite el año actual: ");
        int año_actual=teclado.nextInt();

        metodo.persona(dia_nacimiento, mes_nacimiento, año_nacimiento, dia_actual, mes_actual, año_actual);
            
            break;

        case 2:

        System.out.println("Digite el lado del cuadrado: ");
        int lado=teclado.nextInt();

        metodo.cuadrado(lado);

            break;

        case 3:

        System.out.println("Digite el radio del cuadrado: ");
        int radio=teclado.nextInt();

        metodo.circulo(radio);

            break;

        case 4:

        System.out.println("Digite la base del triangulo: ");
        int base=teclado.nextInt();
        System.out.println("Digite la altura del triangulo: ");
        int altura=teclado.nextInt();

        metodo.triangulo(base, altura);

            break;
    
        default:

        System.out.println("digite un numero del 1 al 4");
            break;
    }





}


}
