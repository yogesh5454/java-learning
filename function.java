import java.util.Scanner;

public class function {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String name=sc.nextLine();
    //     printMyName(name);//function call
    // }


// public static int calculateSumm(int a,int b){
//     int sum=a+b;
//     return sum;
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int  a=sc.nextInt();
//         int b=sc.nextInt();

//         int sum=calculateSumm(a, b);
//         System.out.println("the sum is"+sum);
//         // System.out.println(sum);
//     }

public static int mulNum(int a,int b){
    int mul =a*b;
    return mul;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int  a=sc.nextInt();
    int  b=sc.nextInt();

    int mul=mulNum(a, b);
    System.out.println("product of 2 numbers is:" +mul );
}


//we can write this code like this as  well

// public static int mulNum(int a,int b){
//   return  a*b;
// }
// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();

//     System.out.println("The product of two numers is:"+ mulNum(a, b));
// }
}
