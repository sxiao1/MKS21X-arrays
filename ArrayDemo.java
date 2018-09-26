public class ArrayDemo{
  public static void printArray(int[]ary){
    System.out.println("[");
    for (int x = 0; x < ary.length; x++){
      if (x != ary.length - 1){
        System.out.print(ary[x] + ",");
      }
      else{
        System.out.print(ary[x]);
      }
    }
    System.out.print("]");
  }
  public static void printArray(int[][]ary){
    for(int x = 0; x < ary.length; x++){
      for (int y = 0; x < ary[y].length; y++){
        if (y == 0){
          System.out.println("[");
          System.out.print(ary[y] + ",");
        }
        if(y == ary[y].length - 1){
          System.out.print(ary[y] + "]");
        }
        else{
          System.out.print(ary[y] + ",");
        }
      }
  }
}

}
