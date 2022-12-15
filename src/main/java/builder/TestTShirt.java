package builder;

import java.util.ArrayList;
import java.util.List;

public class TestTShirt {

    public static void main(String[] args) {

        var tShirt = TShirt.builder()
                .size('S')
                .Company("Boss")
                .Company("Violetta")
                .build();

        System.out.println(tShirt);



    }
}
