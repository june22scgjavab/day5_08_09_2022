package com.infosys.arrays;
public class Greetings{
     public static void main(String[] args){
          System.out.println("Hello "+args[0]);
          System.out.println(args.length);
          for(String name : args) {
        	  System.out.println(name);
          }
     }
}
