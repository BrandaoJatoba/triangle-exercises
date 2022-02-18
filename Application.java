import java.util.Scanner;

public class Application {
        
        public static void main(String[] arg){
                
                System.out.println("Entre os lados do 1º triangulo:");
                Triangle x = new Triangle();
                Triangle y = new Triangle();
                Scanner sc = new Scanner(System.in);
                x.ladoA = sc.nextDouble();
                x.ladoB = sc.nextDouble();
                x.ladoC = sc.nextDouble();
                System.out.println("Entre os lados do 2º Triangulo:");
                y.ladoA = sc.nextDouble();
                y.ladoB = sc.nextDouble();
                y.ladoC = sc.nextDouble();
                double areaX = x.area();
                double areaY = y.area();
                System.out.println("A área do 1º Triangulo é de: "+ areaX);
                System.out.println("A área do 2º Triangulo é de: "+ areaY);
                if (areaX>areaY){
                        System.out.println("O 1º Triangulo é maior.");
                } else if (areaX<areaY){
                        System.out.println("A área do 2º Triangulo é maior");
                } else if (areaX==areaY){
                        System.out.println("Os triangulos tem a mesma área.");
                }
                sc.close();
        }

}