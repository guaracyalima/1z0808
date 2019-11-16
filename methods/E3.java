class E3 {
  int number;
  public E3 (int number){
    this.number = number;
  }

  int getNumber(){
    return this.number;
  }

  void setNumber(int number){
    this.number = number;
  }

  void addTree (E3 value){
    System.out.println("Valor incial" + value.getNumber());

    value.setNumber(value.getNumber() + 3);

    System.out.println("Saida inicial " + value.getNumber());
  }

  public static void main(String[] args) {
    E3 e = new E3(1);
    System.out.println("Primeira chamada " + e.getNumber());
    e.addTree(e);
    System.out.println("Segunda chamada " + e.getNumber());
  }
}
