
public class type_casting {
    public static void main(String[] args) {
 //Widening Casting (automatically) - converting a smaller type to a larger type size
        int IntegerNumber = 20;                     //output: 20
        double DoubleNumber = IntegerNumber;        //output: 20.0

        System.out.println(IntegerNumber);
        System.out.println(DoubleNumber);

//Narrowing Casting (manually) - converting a larger type to a smaller size type
        double MyDouble = 25;           //output: 25.0
        int MyInt = (int) MyDouble;    //output: 25

        System.out.println(MyDouble);
        System.out.println(MyInt);

    }

}