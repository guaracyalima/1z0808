class E2{

  void addTwo( int value ){
    System.out.println(value);
    value += 2;
    System.out.println(value);
  }

  public static void main(String[] args) {

      int i = 1;

      System.out.println(i);

      new E2().addTwo(i);

      System.out.println(i);
  }
}
