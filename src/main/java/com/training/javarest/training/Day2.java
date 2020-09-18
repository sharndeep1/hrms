package com.training.javarest.training;

import com.training.javarest.entity.Employer;

import java.util.ArrayList;
import java.util.List;

public class Day2 {
    public static void main(String args[]) {
        {
            // list add, ....... set remove clear size

            List employerList = new ArrayList<>();
            Employer employer = new Employer(2L, "john", "it", 102L);
            Employer employer1 = new Employer(3L, "efg", "hr", 104L);
            //employer.setCode(12L);

            employerList.add(employer.getId());
            employerList.add(employer.getName());
            employerList.add(employer.getCode());
            employerList.add(employer.getId());
            employerList.add(employer1.getCode());

            System.out.println(employerList);
            System.out.println("list size : " + employerList.size());
            System.out.println(employerList.contains("hkhkj"));
            employerList.clear();
            System.out.println(employerList);


            // HashMap


        }
    }
}
