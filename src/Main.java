import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrList<Integer> intArrList = new ArrList<> ();
        intArrList.add ( 10 );
        intArrList.add ( 20 );
        intArrList.add ( 30 );
        intArrList.add ( 10733829 );
        intArrList.add ( 8888 );
        intArrList.add ( 0 );
        System.out.println (intArrList.getByIndex ( 0 ) );
        System.out.println (intArrList.getByIndex ( 1 ) );
        System.out.println (intArrList.getByIndex ( 2 ) );

        intArrList.remove ( 2 );
        System.out.println (intArrList.getByIndex ( 2 ) );

        System.out.println (intArrList.getByIndex ( 3 ) );
        System.out.println (intArrList.getByIndex ( 4 ) );


    }

}