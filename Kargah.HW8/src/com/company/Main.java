package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Entity entity=new Entity();
        Scanner input=new Scanner(System.in);
        int i=0;
        while(true){
            System.out.println("\n Menu: \n 1\t submit Product \n2\t show categories \n3\t buying \n4\t exit");
switch (input.nextInt()){
    case 1:

entity.setId(++i);
        System.out.println("enter Name ");
        entity.setName(input.next());
        System.out.println("Price");
        entity.setPrice(input.next());
        System.out.println("Choose Category ( 1 Clothes ,2- Foods)");
        entity.setCategory(input.next());

try{
    Service.getInstance().save(entity);
}catch (Exception e){
    System.out.println("failed to save"+e.getMessage());
}
break;
    case 2:
        System.out.println("which category do you prefer?");
        switch (input.nextInt()){
            case 1:
                System.out.println("Clothes Category");
                System.out.println("clothes");
                System.out.println("Pink trousers");
                System.out.println("Brown Socks");
                System.out.println("Red shirt");
                break;
            case 2:
                System.out.println("Food Category");
                System.out.println("foods");
                System.out.println("Pizza");
                System.out.println("HotDog");
                System.out.println("Kebab");
                break;
        }
        break;
    case 3:
        System.out.println("which category do you prefer?");
        switch (input.nextInt()){
            case 1:
                System.out.println("Clothes Category");
                System.out.println("what clothes do you want ?");

                switch (input.nextInt()){
                    case 1:
                        System.out.println("Pink trousers selected");
                        break;
                    case 2:
                        System.out.println("Brown Socks selected");
                        break;
                    case 3:
                        System.out.println("Red Shirt Selected");
                        break;
                }
                break;
            case 2:
                System.out.println("Foods Category");
                System.out.println("what Food do you want?");
                switch (input.nextInt()){
                    case 1:
                        System.out.println("Pizza selected ");
                        break;
                    case 2:
                        System.out.println("HotDog selected");
                        break;
                    case 3:
                        System.out.println("kebab selected");
                        break;
                }


        }
        break;
    case 4:
        System.exit(0);
}

        }

    }
}
