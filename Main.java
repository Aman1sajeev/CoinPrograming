
import java.util.*;
public class Main{
    public static void main(String []args){

        int [][] test1 = {{0,3,1,1},{2,0,0,4},{1,5,3,1}};
        for(int [] temp:test1) System.out.println(Arrays.toString(temp));
        System.out.println(counter(test1));

        int[][] test2  = {{1,2,3,4,5},{4,5,6,7,8},{9,8,7,6,5},{3,6,9,2,5},{7,4,1,2,4}};
        for(int [] temp:test2) System.out.println(Arrays.toString(temp));
        System.out.println(counter(test2));
    }
    public static int counter(int [][] matrix){
        int [] max = {0};
        count(matrix,max,0,0,0);
        return max[0];
    }
    public static void count(int [][] matrix, int[] max, int y, int x, int value){
        value += matrix[y][x];
        if(y < matrix.length-1) count(matrix,max,y+1,x,value);
        if( x < matrix[0].length-1) count(matrix,max,y,x+1,value);
        if(y == matrix.length-1 && x == matrix[0].length-1){
            if(value > max[0]) max[0] = value;
        }

        public static void count1(int [][] matrix, int[] max, int y, int x, int value){
            value += matrix[y][x];
            if(y < matrix.length-1) count(matrix,max,y+1,x,value);
            if( x < matrix[0].length-1) count(matrix,max,y,x+1,value);
            if(y == matrix.length-1 && x == matrix[0].length-1){
                if(value > max[0]) max[0] = value;
            }
    }

    // I am adding a comment for this code

}