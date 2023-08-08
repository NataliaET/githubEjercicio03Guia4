package ejercicio03guia4;

public class Ejercicio03Guia4 {

    public static void main(String[] args) {
        Circulo cir = new Circulo (36);
        Rectangulo rec = new Rectangulo(10, 18);
        
        double areaCirculo = cir.calcularArea();
        double perimetroCirculo = cir.calcularPerimetro();
        
        double areaRectangulo = rec.calcularArea();
        double perimetroRectangulo = rec.calcularPerimetro();
        
        System.out.println("El area del circulo es: " + areaCirculo);
        System.out.println("El perimetro del circulo es: " + perimetroCirculo);
        System.out.println("El area del rectangulo es: " + areaRectangulo);
        System.out.println("El perimetro del rectangulo es: " + perimetroCirculo);
    }
    
}
