import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    

    public static void main(String[] args) {
     int[][]  matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}} ;
     List<Integer> spiralOrder = spiralOrder(matrix);
     System.out.println(spiralOrder);
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> list = new ArrayList();
     
     int m = matrix.length;
     int n = matrix[0].length;
 
     int rs,re,cs,ce;
 
     rs = m-m;
     cs = n-n;
     re = m-1;
     ce = n-1;
 
     while(rs <= re && cs <= ce){
    
     //print row left to right
     for(int i=cs;i<=ce;i++){
         list.add(matrix[rs][i]);
     }
     rs++;
    
     //print col top to bottom
     for(int i=rs;i<=re;i++){
         list.add(matrix[i][ce]);
     }
     ce--;
 
 
     //print row right to left
     if(rs<=re){
     for(int i=ce;i>=cs;i--){
         list.add(matrix[re][i]);
     }
     re--;
     }
     
     // print col bottom to top
     if(cs <= ce){
     for(int i=re;i>=rs ;i--){
         list.add(matrix[i][cs]);
     }
     cs++;
     }
     }
 
 
 
     return list; 
     }
}
