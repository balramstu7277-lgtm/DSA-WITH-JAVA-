public class divTwoNum {

    public static  void main(String[] args){
        double num = 5;
        int num1 = 0;
       System.out.println(num/num1); // code ma infinit aa raha hai to Q
        // iska answer hai ki double work karat hai ieee ma work karta hai value approx ma value batata hai
        int[] arr = {10,20,30,40};
        int[] arr2 ={5,2,0,4} ;
          for(int i =0 ;i< arr.length;i++) {
             try {
                System.out.println(arr[i] / arr2[i]);
             } catch (Exception e) {
                System.out.println("code ma maja nahi aa raha hai");
             }
             finally {
                 System.out.println("bekar code ");
             }
        }
    }
}

// important point
// =>
