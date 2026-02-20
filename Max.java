public class Max {
    static int maxregion(int n){
        return ((n*(n+1)))/2+1;
    }
    static int minregion(int n){
        return ((n*(n+1)))/2+1;
    }
    public static void main(String[] args) {
        int n = 5;
               System.out.println("Maximum number of regions: " + maxregion(n));       
    
}
}