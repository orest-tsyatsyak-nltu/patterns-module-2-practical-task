package org.example;

public class OldValonSocketAdapter implements NewSocket {

    private final OldVagonSystem oldVagonSystem;

    public OldValonSocketAdapter(OldVagonSystem oldVagonSystem) {
        this.oldVagonSystem = oldVagonSystem;
    }

    @Override
    public boolean matchSocket() {
        //some logic to adapt old socket to new
        oldVagonSystem.thinSocket();
        return true;
    }
}
