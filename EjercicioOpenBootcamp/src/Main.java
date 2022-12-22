public class Main {
    public static void main(String[] args)
    {
        Coche oCoche=new Coche();
        oCoche.IncrementarPuertas();
        int pvalor1=50;
        int pvalor2=100;
        int pvalor3=10;

        int resultado=Suma(pvalor1,pvalor2,pvalor3);
        System.out.println(resultado);
        System.out.println(oCoche.Puertas);

    }

    public static int Suma (int valor1,int valor2, int valor3)
    {
        return valor1+valor2+valor3;
    }
}

class Coche{
    public int Puertas=0;


    public void IncrementarPuertas(){
        Puertas++;
    }
}