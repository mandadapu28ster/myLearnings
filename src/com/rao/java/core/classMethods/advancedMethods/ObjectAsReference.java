package com.rao.java.core.classMethods.advancedMethods;

public class ObjectAsReference {
    public static void main(String args[]) {

        //call by value, constructor called by value

        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
        Test ob4 = new Test(2);
        Test ob5;
        ob5 = ob4.incrByTen();                  //incrByTen return type is object
        System.out.println("ob4.a: " + ob4.a);
        System.out.println("ob5.a: " + ob5.a);
        ob5 = ob5.incrByTen();                  //incrByTen return type is object
        System.out.println("ob5 after second increment " + ob5.a);

        //call by reference
        System.out.println("ob1.a and ob1.b before call: " +
                ob1.a + " " + ob1.b);
        ob1.meth(ob1);
        System.out.println("ob1.a and ob1.b after call: " +
                ob1.a + " " + ob1.b);
    }
}


// Objects may be passed to methods and returned.
class Test {
    int a, b;
    Test(int i, int j) {
        a = i;
        b = j;
    }
    Test(int i) {
        a = i;
    }
    // return true if o is equal to the invoking object
    //object passed to metrhod
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }

    //object returned from method
    Test incrByTen() {
        Test temp = new Test(a+10);
        return temp;
    }

    // pass an object .... pass by reference
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2; }

}