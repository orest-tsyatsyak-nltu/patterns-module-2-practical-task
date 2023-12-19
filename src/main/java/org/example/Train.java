package org.example;

import java.util.LinkedList;
import java.util.List;

public class Train {
    public static void main(String[] args) {
        List<NewSocket> sockets = new LinkedList<>();
        sockets.add(new NewVagonSystem());
        OldVagonSystem oldVagonSystem = new OldVagonSystem();
        sockets.add(new OldValonSocketAdapter(oldVagonSystem));
        System.out.println(
                oldVagonSystem.getClass().getSimpleName() +
                        " Is old vagon system without adapter suitable for laptop charger: "
                        + oldVagonSystem.thinSocket()
        );
        sockets.forEach(s -> System.out.println(
                s.getClass().getSimpleName() + " Is vagon system suitable for laptop charger: "+ s.matchSocket()
        ));

    }
}
