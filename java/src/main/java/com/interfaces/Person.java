package com.interfaces;

public class Person  implements Runner, Jumper, Diver {
    @Override
    public void run () {
        System.out.println("Running");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void jump () {
        System.out.println("Jumping");
    }

    @Override
    public void dive () {
        System.out.println("Diving");
    }
}
