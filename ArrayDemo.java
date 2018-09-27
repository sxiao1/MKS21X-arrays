public class ArrayDemo{
  public static void main(String[] args){
    int[] ary1;
    ary1 = new int [10];
    for (int x = 0; x < ary1.length; x++){
      ary1[x] = 100 + x * 10;
    }
    printArray(ary1);

    int[][] ary2;
    ary2 = new int[3][4];
    for (int x = 0; x < ary2.length; x++){
      for (int y = 0; y < ary2[x].length; y++){
        ary2[x][y] = (x * 2) - (y + 3);
      }
    }
    printArray(ary2);
    fill2D(ary2);

    int[][] ary3;
    ary3 = new int [3][4];
    for(int x = 0; x < ary3.length; x++){
      for(int y = 0; y < ary3[x].length; y++){
        ary3[x][y] = (x * 2) - 2;
      }
    }
    System.out.println("there are " + countZeros2D(ary3) + " zeros in this array");
    fill2DCopy(ary3);
  }
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
    System.out.print("] \n");
  }
  public static void printArray(int[][]ary){
    for(int x = 0; x < ary.length; x++){
      for (int y = 0; y < ary[x].length; y++){
        if (y == 0){
          System.out.print("[");
          System.out.print(ary[x][y] + ",");
        }
        if(y == ary[x].length - 1){
          System.out.print(ary[x][y] + "] \n");
        }
        else{
          System.out.print(ary[x][y] + ",");
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
  printArray (vals);
}
  public static int[][] fill2DCopy(int[][] vals){
    int [][] newvals = new int [vals.length][vals[0].length];
    for (int x = 0; x < newvals.length; x++){
      for (int y = 0; y < newvals[x].length; y++){
        if(vals[x][y] < 0){
          newvals[x][y] = 3;
        }
        else{
          newvals[x][y] = 1;
        }
      }
    }
    printArray(newvals);
    return newvals;
}


}
