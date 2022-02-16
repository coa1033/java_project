class Main {
  public static void main(String[] args) {

    int age = 29 ;
    if (age>0 && age <7){
      System.out.println("아동 입니다.");
    }
    if (age>=8 && age <19){
      System.out.println("청소년 입니다.");
    }
    if (age>=19 && age <40){
      System.out.println("청년 입니다.");
    }
    if (age>=40 && age <60){
      System.out.println("중년 입니다.");
    }
    if (age>=60){
      System.out.println("노년 입니다.");
    }
  }
}