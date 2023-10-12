package com.java8;
//note - please execute in online compiler. then it work correctly. don't know why it can't running in eclipse
interface B{
    void show(); // void show(int i);
}
// class B implements A{
//     public void show(){
//         System.out.println("hello");
//     }
// }
class LambdaDemo{
    public static void main(String[] args){
        B obj;
        // obj = new A(){
        //     public void show(){
        //     System.out.println("hemml");
        // }};
        // obj.show();
        obj = ()->System.out.println("asdfadsf");
        //i->System.out.println("aslkdjf " + i);
        //obj.show(5);
        obj.show();
    }
}
