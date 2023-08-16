package com.patterns.builder.faceted;

import com.patterns.builder.faceted.models.Person;
import com.patterns.builder.faceted.models.PersonBuilder;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args ) {
        PersonBuilder builder = new PersonBuilder();

        Person person = builder
                            .job()
                                .companyName("arcelik global")
                                .position("Software Developer")
                                .annualIncome(2)
                            .address()
                                .streetAddress("London Road")
                                .city("London")
                                .postCode("34563")
                            .build();
        System.out.println(person);
    }
}
