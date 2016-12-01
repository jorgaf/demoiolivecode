class Main {
  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    double c;

    System.out.println("Calcular la hipotenusa de un triángulo rectángulo");
    c = Math.sqrt(Math.pow(a, 2) +  Math.pow(b, 2));
    System.out.printf("%.2f\n", c);
  }
}
