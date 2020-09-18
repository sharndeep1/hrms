package com.training.javarest.training;


import com.sun.xml.internal.bind.v2.model.core.EnumConstant;
import com.training.javarest.entity.Employee;
import com.training.javarest.entity.Employer;
import com.training.javarest.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Day1 {

    public static void main(String args[]) {

        // list of person
        // person 2 obj add

        // generics
        // DataType
        List<Long> personList = new ArrayList<>();
        Person person = new Person(1L, "asd", "ert");
        Person person1 = new Person(2l, "dfg", "hjk");

        // list add, ....... set remove clear size
        personList.add(person.getId());
        personList.add(person1.getId());
        System.out.println(personList);

        List<Long> employerList = new ArrayList<>();
        Employer employer = new Employer(2L, "john", "it", 102L);
        Employer employer1 = new Employer(3L, "efg", "hr", 104L);
        employerList.add(employer.getCode());


        // String class
        String str = "rajneesh";

        // oops concept ---- most important --- studytonight website


    }
}

// DATATYPE
// int float long double char
// Integer Float Long Double String
// KEYWORDS -- final, STATIC
// List refernce geeksforgeeks
//https://www.geeksforgeeks.org/list-interface-java-examples/#:~:text=Methods%20of%20the%20List%20Interface%20%20%20,the%20el%20...%20%2012%20more%20rows%20
