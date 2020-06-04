package com.company;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        try {
            Service.getInstance().save(new Entity().setId(++x).setName("diazpam").setPrice("500000").setCategory("sleeping"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("clonazpam").setPrice("3000000").setCategory("sleeping"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("estaminofen").setPrice("4000000").setCategory("sleeping"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("zhelofen").setPrice("5000000").setCategory("sleeping"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("estaminofen coodeen").setPrice("7000000").setCategory("sleeping"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("penisilin").setPrice("100000").setCategory("catching cold"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("adult cold").setPrice("600000").setCategory("catching cold"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("diffen hidramin").setPrice("700000").setCategory("catching cold"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("633").setPrice("800000").setCategory("catching cold"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("amoxi clov").setPrice("900000").setCategory("catching cold"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("b complex").setPrice("70000").setCategory("beauty"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("botax").setPrice("80000").setCategory("beauty"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("perimidion").setPrice("900000").setCategory("beauty"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("b perazin").setPrice("90000").setCategory("beauty"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("peroxicam").setPrice("900000").setCategory("beauty"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("prednisolone").setPrice("700000").setCategory("steriods"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("methylprednisolone").setPrice("800000").setCategory("steriods"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("hydrocortisone").setPrice("20000").setCategory("steriods"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("Methylprednisolone").setPrice("400000").setCategory("steriods"));
            Thread.sleep(10);
            Service.getInstance().save(new Entity().setId(++x).setName("Betamethasone").setPrice("50000").setCategory("steriods"));
            Thread.sleep(10);

            // write your code here
        } catch (Exception e) {
            System.out.println("couldnt save" + e.getMessage());
        }
        while (true){
            System.out.println("\n menu:\n1\tshow categories\n2\tshow drugs\n3\tAdd new Drugs\n4\tEdit drugs info\n5\t remove drugs\n6\t Exit\n ");
            switch (input.nextInt()){
                case 1:
                    System.out.println("\n 1\t sleeping \n2\t catching cold \n3\t beauty \n4\t steriods\n");
                    break;
                case 2:
                    try{
                        List<Entity> entityList=Service.getInstance().report();
                        for(Entity entity:entityList){
                            System.out.println(entity.getId()+"\t"+entity.getName()+"\t"+entity.getPrice()+"\t"+entity.getCategory());
                        }
                    }catch (Exception e){
                        System.out.println("couldnt report"+e.getMessage());
                    }
                    break;
                case 3:
                    Entity entity=new Entity();
                    entity.setId(++x);
                    System.out.println("enter name");
                    entity.setName(input.next());
                    System.out.println("enter price");
                    entity.setPrice(input.next());
                    System.out.println("category");
                    entity.setCategory(input.next());
                    try{
                        Service.getInstance().save(entity);
                    }catch (Exception f){
                        System.out.println("failed to save"+f.getMessage());
                    }
                    break;
                case 4:
                    entity=new Entity();
                    System.out.println("enter id");
                    entity.setId(input.nextInt());
                    System.out.println("enter new name");
                    entity.setName(input.next());
                    System.out.println("enter new price");
                    entity.setPrice(input.next());
                    System.out.println("enter new category");
                    entity.setCategory(input.next());
                    try{
                        Service.getInstance().edit(entity);
                    }catch (Exception g){
                        System.out.println("couldnt edit"+g.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("enter id");
                    try{
                        Service.getInstance().remove(input.nextInt());
                    }catch (Exception h){
                        System.out.println("couldnt remove"+h.getMessage());
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }
    }
	// write your code here
    }

