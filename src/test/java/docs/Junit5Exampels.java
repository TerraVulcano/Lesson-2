package docs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Junit5Exampels {

    @BeforeAll
    static void setup (){
        System.out.println("setup here");
    }

    @Test
    void someTest() {
        System.out.println("someTest here");
    }

    @Test
    void anotherTest() {
        System.out.println("anotherTest here");
    }
}
