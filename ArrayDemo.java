public class ArrayDemo{
  public static void printArray(int[]ary){
    System.out.print("[");
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
}
