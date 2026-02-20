public class array {
    public static void main(String args[]){
        int[][] nums = {{1,2,3,4,5},
                        {6,7,8},
                        {9}};

        for (int[] n : nums){
            for(int no : n){
                System.out.print(no+" ");
            }
            System.out.println();
        }
}
}
