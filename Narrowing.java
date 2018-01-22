
public class Narrowing {

  public static void main(String[] args) {
    long a = 10;
    int b = (int) a; // narrowing conversion

    System.out.println(a);
    System.out.println(b);
  }

}
