package com.patterns.flyweight;

import com.patterns.flyweight.models.LightWeightUser;
import com.patterns.flyweight.models.User;
import org.openjdk.jol.info.GraphLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        List<User> users = new ArrayList<>();
        List<LightWeightUser> lightWeightUsers = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            User user = new User("H-K");
            LightWeightUser user2 = new LightWeightUser("H-K");

            users.add(user);
            lightWeightUsers.add(user2);
        }

        System.out.println(GraphLayout.parseInstance(users).toFootprint());
        System.out.println(GraphLayout.parseInstance(lightWeightUsers).toFootprint());
    }

    /*
        Flyweight design pattern have optimization philosophy.

        Aim of it, preventing to create the unnecessary fields in RAM.

        More: https://refactoring.guru/design-patterns/flyweight
     */
}
