/*interface Methods {
  int Addd();
  //int Subtract();
}*/
class Implementer{
  static void Text(){
    System.out.println("No two equal numbers should be added");
  }
  int Addd(int a, int b){
    if (a == b) {
      System.out.println("The numbers are equal");
    }
    return (a + b);
  }
  int Subtract(int c, int d){
      return (c-d);
  }
}
public class Add extends Implementer{
  public static void main(String[] args) {
    Implementer add = new Implementer();
    Text();
    add.Addd(10, 25);
    add.Subtract(10, 18);
  }
}
