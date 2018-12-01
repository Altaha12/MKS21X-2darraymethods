public class ArrayMethods{

   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
     if(!(x<ary.length))return 0;
     int sum=0;
     for(int i:ary[x]){sum+=i;}
     return sum;
   }
    //returns the sum of the elements in Row x of ary.
    //When x is past the last row count it as a zero. (NO indexOutOfBounds should ever occur)

   public static int columnSum(int[][] ary, int x){
     int sum=0;
     for(int i=0;i<ary.length;){
       if(x<ary[i].length)sum+=ary[i][x];
     }
     return sum;
   }
    //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)

   /*
   *PART 2 - use prior methods where appropriate
   */
   public static int[] allRowSums(int[][] ary){
     int[] sums = new int[ary.length];
     for(int i=0;i<ary.length;i++){sums[i]=rowSum(ary,i);}
     return sums;
   }
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.

    public static int[] allColSums(int[][] ary){
      int greatest=0;
      for(int i=0;i<ary.length;i++){if(ary[i].length>greatest)greatest=ary[i].length;}
      int[] sums = new int[greatest];
      for(int i=0;i<sums.length;i++){sums[i]=columnSum(ary,i);}
      return sums;
    }
    //Returns an array with the column sum of each column of ary.
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    //The length of the returned array should be the length of the LONGEST array in ary.


   /*
   *PART 3 - use prior methods where appropriate
   */
   public static boolean isRowMagic(int[][] ary){
     for(int i=1;i<ary.length;i++){if(!(rowSum(ary,i-1)==rowSum(ary,i)))return false;}
     return true;
   }
     //checks if the array is row-magic (this means that every row has the same row sum).

   public static boolean isColumnMagic(int[][] ary){
     for(int i=1;i<ary.length;i++){if(!(columnSum(ary,i-1)==columnSum(ary,i)))return false;}
     return true;
   }
    //checks if the array is column-magic (this means that every column has the same column sum).

}
