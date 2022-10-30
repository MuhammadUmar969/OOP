package exception;

public class Exception {

    public static void main(String[] args) {
//        int []a ={1,8,4,5};
//       //System.out.println(a[4]);
//   try{
//        System.out.println(a[4]);   
//   }catch(Exception e) {
//       System.out.println("Something went wrong"+e);
//   }
        try {
            int[] a = {1, 2, 2};
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
