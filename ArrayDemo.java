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
      for (int y = 0; y < ary[x].length; y++){
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
public static int countZeros2D(int[][] nums){
  int count = 0;
  for(int x = 0; x < nums.length; x++){
    for (int y = 0; y < nums[x].length; y++){
      if(nums[x][y] == 0){
        count ++;
      }
    }
  }
  return count;
}
public static void fill2D(int[][] vals){
  for(int x = 0; x < vals.length; x++){
    for (int y = 0; y < vals[x].length; y++){
      if (x == y){
        vals[x][y] = 3;
      }
      else{
        vals[x][y] = 1;
      }
    }
  }
}

}
