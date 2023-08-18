package com.patterns.singleton.monostate;

public class App {

    public static void main(String[] args) {
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();

        ceo.setName("Huseyin");
        ceo.setAge(2);

        ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();

        System.out.println(ceo);
        System.out.println(ceo2);
    }

    /*
        We can create multiple object. But parameters will be one. Because they are static.
        Therefore, Every instances connects with same reference.
     */
}
