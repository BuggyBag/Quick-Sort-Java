class Main {
  public static void main(String[] args) {
    Person[] v = {
      new Person("José Andrés", 20, 180.0f),
      new Person("Daniel", 8, 120.0f),
      new Person("Fernando", 78, 170.0f),
      new Person("Manuel", 12, 170.5f),
      new Person("Luis", 25, 177.0f) 
    };

    for(Person e: v) {
      System.out.println(e);
    }

    System.out.println();
    System.out.println();
    
    QuickSort.quickSort(v, 0, v.length-1);

    for(Person e: v) {
      System.out.println(e);
    }
    System.out.println();
  }
}