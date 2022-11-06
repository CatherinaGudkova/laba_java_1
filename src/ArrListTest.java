import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrListTest {

    @Test
    void add() {
        ArrList<Integer> intArrList = new ArrList<> ();

        intArrList.add(1);
        intArrList.add(8);
        intArrList.add(2);
        intArrList.add(5);
        intArrList.add(6);

        assertEquals(8,intArrList.getByIndex(1));
    }

    @Test
    void capacity() {
        ArrList<Integer> intArrList = new ArrList<> ();

        intArrList.add(1);
        intArrList.add(8);
        intArrList.add(2);
        intArrList.add(5);
        intArrList.add(6);

        assertEquals(4,intArrList.capacity());
    }

    @Test
    void getByIndex() {
        ArrList<Integer> intArrList = new ArrList<> ();

        intArrList.add(1);
        intArrList.add(8);
        intArrList.add(2);
        intArrList.add(5);
        intArrList.add(6);

        assertEquals(2,intArrList.getByIndex(2));
    }

    @Test
    void remove() {
        ArrList<Integer> intArrList = new ArrList<> ();

        intArrList.add(1);
        intArrList.add(8);
        intArrList.add(2);
        intArrList.add(5);
        intArrList.add(6);

        intArrList.remove(0);
        assertEquals(8,intArrList.getByIndex(0));
    }
}