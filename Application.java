import java.util.Scanner;

public class Application {
        
        public static void main(String[] arg){
                
                System.out.println("Entre os lados do 1º triangulo:");
                Triangle x = new Triangle();
                Scanner sc = new Scanner(System.in);
                x.ladoA = sc.nextDouble();
                x.ladoB = sc.nextDouble();
                x.ladoC = sc.nextDouble();
                double area = x.area();
                System.out.println("A área do Triangulo é de: "+ area);
                sc.close();
        }

}