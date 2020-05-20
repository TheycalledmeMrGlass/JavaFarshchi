package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee e=new Employee();
        for(int i=0;i<10;i++){


            List<String>list=new ArrayList<>();
            System.out.println("enter the employee s name");
            e.name[i+1]=input.next();
            list.add(e.name[i+1]);
            System.out.println("enter the employees father name");
            e.fathername[i+1]=input.next();
            list.add(e.fathername[i+1]);
            System.out.println("enter the employee s nationality");
            e.nationality[i+1]=input.next();
            list.add(e.nationality[i+1]);
            System.out.println("enter the employee s education");
            e.education[i+1]=input.next();
            list.add(e.education[i+1]);
            System.out.println("enter your favourite employee");
            i=input.nextInt();
            if(i==1){
                System.out.println(e.name[i+1]);
                System.out.println(e.fathername[i+1]);
                System.out.println(e.education[i+1]);
                System.out.println(e.nationality[i+1]);
            }
            else if(i==2){
                System.out.println(e.name[i+2]);
                System.out.println(e.fathername[i+2]);
                System.out.println(e.education[i+2]);
                System.out.println(e.nationality[i+2]);
            }
            else if(i==3){
                System.out.println(e.name[i+3]);
                System.out.println(e.fathername[i+3]);
                System.out.println(e.education[i+3]);
                System.out.println(e.nationality[i+3]);
            }
            else if(i==4){
                System.out.println(e.name[i+4]);
                System.out.println(e.fathername[i+4]);
                System.out.println(e.education[i+4]);
                System.out.println(e.nationality[i+4]);
            }
            else if(i==5){
                System.out.println(e.name[i+5]);
                System.out.println(e.fathername[i+5]);
                System.out.println(e.education[i+5]);
                System.out.println(e.nationality[i+5]);
            }
            else if(i==6){
                System.out.println(e.name[i+6]);
                System.out.println(e.fathername[i+6]);
                System.out.println(e.education[i+6]);
                System.out.println(e.nationality[i+6]);
            }
            else if(i==7){
                System.out.println(e.name[i+7]);
                System.out.println(e.fathername[i+7]);
                System.out.println(e.education[i+7]);
                System.out.println(e.nationality[i+7]);
            }
            else if(i==8){
                System.out.println(e.name[i+8]);
                System.out.println(e.fathername[i+8]);
                System.out.println(e.education[i+8]);
                System.out.println(e.nationality[i+8]);
            }
            else if(i==9){
                System.out.println(e.name[i+9]);
                System.out.println(e.fathername[i+9]);
                System.out.println(e.education[i+9]);
                System.out.println(e.nationality[i+9]);
            }
            else if(i==10){
                System.out.println(e.name[i+10]);
                System.out.println(e.fathername[i+10]);
                System.out.println(e.education[i+10]);
                System.out.println(e.nationality[i+10]);
            }
            for(String s: list){
                System.out.println(s);
            }
        }
        List<Integer>list=new ArrayList<>();
        for(int j=0;j<10;j++){
            System.out.println("enter the employee s payment");
            e.payment[j+1]=input.nextInt();
            list.add(e.payment[j+1]);
            System.out.println("enter the employee s hours");
            e.hours[j+1]=input.nextInt();
            list.add(e.hours[j+1]);
            System.out.println("enter your favourite employee");
            j=input.nextInt();
            if(j==1){
                System.out.println(e.payment[j+1]);
                System.out.println(e.hours[j+1]);
            }
            else if(j==2){
                System.out.println(e.payment[j+2]);
                System.out.println(e.hours[j+2]);
            }
            else if(j==3){
                System.out.println(e.payment[j+3]);
                System.out.println(e.hours[j+3]);
            }
            else if(j==4){
                System.out.println(e.payment[j+4]);
                System.out.println(e.hours[j+4]);
            }
            else if(j==5){
                System.out.println(e.payment[j+5]);
                System.out.println(e.hours[j+5]);
            }
            else if(j==6){
                System.out.println(e.payment[j+6]);
                System.out.println(e.hours[j+6]);
            }
            else if(j==7){
                System.out.println(e.payment[j+7]);
                System.out.println(e.hours[j+7]);
            }
            else if(j==8){
                System.out.println(e.payment[j+8]);
                System.out.println(e.hours[j+8]);
            }
            else if(j==9){
                System.out.println(e.payment[j+9]);
                System.out.println(e.hours[j+9]);
            }
            else if(j==10){
                System.out.println(e.payment[j+10]);
                System.out.println(e.hours[j+10]);
            }
            for(Integer p: list){
                System.out.println(p);
            }
        }

	// write your code here
    }
}
