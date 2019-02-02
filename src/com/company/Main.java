package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Account> citizen = new LinkedList<>();
       citizen.add(new Account("Jurek","Marek",122323,3232,3232) {
       });

        System.out.println(citizen.get(0));
    }
}
