package com.pluralsight;

public class NameFormatter {
    private NameFormatter(){

    }
    public static String format(String firstName, String lastName){
        return lastName+","+" "+firstName;

    }
    public static String format(String prefix,String firstName, String middleName, String lastName,String suffix){
        return lastName+","+" "+prefix+" "+firstName+" "+ middleName+","+" "+ suffix;

    }
    public static String format(String fullName){
        String [] parts = fullName.split(" ");


        if (parts.length ==2){
           return format(parts[0],parts[1].replace(",",""));
        }
        else if (parts.length ==5) {
           return format(parts[0],parts[1],parts[2],parts[3].replace(",",""),parts[4]);

        }
        else if (parts.length==4){
            return parts[2].replace(",","")+","+" "+parts[0]+" "+parts[1]+","+" "+ parts[3];

        }
        return "";


    }

}

