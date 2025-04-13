package Interview;

public class CombinationArray {
    public static void main(String[] args) {
        int array[] =  {1,2,3,4};
       /* output : 1,2
        1,3
        1,4
        2,3
        2,4
        3,4 */
        for(int i=0;i<array.length; i++){
            for(int j=i+1;j<array.length;j++){
                System.out.println(array[i]+","+array[j]);
            }
        }
    }
}
