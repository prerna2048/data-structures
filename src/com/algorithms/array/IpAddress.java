package com.algorithms.array;

public class IpAddress {

    public static void main(String[] args) {
    }

    public String defangIPaddr(String address) {

       return  address.replace(".","[.]");
    }
}
