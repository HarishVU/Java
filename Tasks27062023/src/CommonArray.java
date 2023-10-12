public class CommonArray{
    public static void main(String[] args){
        
        int[] a = {1,2,4,4};
        int[] b = {5,6,7,4};
        System.out.print("same element is ");
		/* this for common element in two array */
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<b.length;j++){
//                if(a[i] == b[j]){
//                    System.out.print(" " + a[i]);
//                }
//            }
//        }
        
		/* this is for common element in an array */
        if(a[0]==a[1]) {
        	System.out.println(a[0]);
        }
        else if(a[1]==a[2]){
        	System.out.println(a[1]);
        }
        else if(a[2]==a[3]) {
        	System.out.println(a[2]);
        }
        else {
        	System.out.println("not same");
        }
//      for(int i=0;i<a.length;i++){
//      for(int j=i+1;j<a.length;j++){
//          if(a[i] == b[j]){
//              System.out.print(" " + a[i]);
//          }
//      }
//  }
    }
}