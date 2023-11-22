package com.raihan.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ServeWithQueue {

    public static void main(String[] args){
//        LinkedList<Customer> queue = new LinkedList<>();
//        queue.add(new Customer("Raihan"));
//        queue.add(new Customer("Hazarika"));
//        queue.add(new Customer("Zeenat"));
//        queue.add(new Customer("Shameem"));
//
//        System.out.println(queue);
//        serveCustomer(queue);
//        System.out.println(queue);

        List<String> list = new ArrayList<>(Arrays.asList("Reg_Comp_E4-2C_Server.01",
                                                          "Reg_Comp_E4_2c_Server_Ortano.01",
                                                          "COM_STD2T_E4-2C_Server.02",
                                                          "COM_STD_E4-2C_Ortano.01",
                                                          "Comp_BigData_E4-2C_Headnode.01",
                                                          "Service_Enclave_E4-2C_Server.01",
                                                          "GPU_X7-2C_Module.01"));

        List<String> list2 = new ArrayList<>();
        list2.add(".*E4[-_]2[Cc].*");

        List<String> list3 = new ArrayList<>();
        list2.forEach(pattern -> {
            List<String> filteredList =  list.stream()
                                              .filter(s -> s.matches(pattern))
                                              .collect(Collectors.toList());
            list3.addAll(filteredList);
        });

        Map<String, List<String>> mp = new HashMap<>();
        mp.put("key1", new ArrayList<>(list3));
        System.out.println(mp.get("key1"));
    }

    public static void serveCustomer(LinkedList<Customer> queue){
        Customer ch = queue.poll();
        ch.serve();
    }
}