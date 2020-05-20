package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Things t = new Things();
        System.out.println("welcome to the shop");
        System.out.println("what are You gonna Buy?");
        int i, j, x, z, a;
        long k, y, b;
        System.out.println("enter your prefrence");
        i = input.nextInt();

        if (i == 1) {
            System.out.println("you chose the tv s ");
            System.out.println("which one? ");
            j = input.nextInt();
            if (j == 1) {
                System.out.println("you chose samsung ");
                System.out.println("enter the price");
                k = input.nextInt();
                System.out.println("enter the Cardnumber");
                y = input.nextInt();
                System.out.println("enter the Code");
                z = input.nextInt();
                System.out.println("enter your money");
                b = input.nextInt();
                System.out.println("checking the exsistace of this ...........");
                a = input.nextInt();
                if (a == 0) {
                    System.out.println("it exists");
                } else if (a == 1) {
                    try {
                        System.out.println("it dosent exsist");
                    } catch (Exception f) {
                        System.out.println("it doesn t exsist");
                        System.out.println(f.getClass());
                        System.out.println(f.getMessage());
                    }
                }


                try {
                    if (k > b) {
                        System.out.println(" money");
                    }
                } catch (Exception e) {
                    System.out.println("you dont have enough money");
                    System.out.println(e.getMessage());
                    System.out.println(e.getClass());
                }
            } else if (j == 2) {
                System.out.println("you chose LG  ");
                System.out.println("enter the price");
                k = input.nextInt();
                System.out.println("enter the Cardnumber");
                y = input.nextInt();
                System.out.println("enter the Code");
                z = input.nextInt();
                System.out.println("enter your money");
                b = input.nextInt();
                System.out.println("checking the exsistace of this ...........");
                a = input.nextInt();
                if (a == 0) {
                    System.out.println("it exists");
                } else if (a == 1) {
                    try {
                        System.out.println("it dosent exsist");
                    } catch (Exception f) {
                        System.out.println("it doesn t exsist");
                        System.out.println(f.getClass());
                        System.out.println(f.getMessage());
                    }
                }
                try {
                    if (k > b) {
                        System.out.println("no money");
                    }
                } catch (Exception e) {
                    System.out.println("you dont have enough money");
                    System.out.println(e.getMessage());
                    System.out.println(e.getClass());
                }


            }
        } else if (i == 2) {
            System.out.println("you chose the cell phones ");
            System.out.println("which one ?");
            j = input.nextInt();
            if (j == 1) {
                System.out.println("you chose the Iphone");
                System.out.println("enter the price");
                k = input.nextInt();
                System.out.println("enter the Cardnumber");
                y = input.nextInt();
                System.out.println("enter the Code");
                z = input.nextInt();
                System.out.println("enter your money");
                b = input.nextInt();
                System.out.println("checking the exsistace of this ...........");
                a = input.nextInt();
                if (a == 0) {
                    System.out.println("it exists");
                } else if (a == 1) {
                    try {
                        System.out.println("it dosent exsist");
                    } catch (Exception f) {
                        System.out.println("it doesn t exsist");
                        System.out.println(f.getClass());
                        System.out.println(f.getMessage());
                    }
                }
                try {
                    if (k > b) {
                        System.out.println("no money");
                    }
                } catch (Exception e) {
                    System.out.println("you dont have enough money");
                    System.out.println(e.getMessage());
                    System.out.println(e.getClass());
                }

            } else if (j == 2) {
                System.out.println("you chose the black berry ");
                System.out.println("enter the price");
                k = input.nextInt();
                System.out.println("enter the Cardnumber");
                y = input.nextInt();
                System.out.println("enter the Code");
                z = input.nextInt();
                System.out.println("enter your money");
                b = input.nextInt();
                System.out.println("checking the exsistace of this ...........");
                a = input.nextInt();
                if (a == 0) {
                    System.out.println("it exists");
                } else if (a == 1) {
                    try {
                        System.out.println("it dosent exsist");
                    } catch (Exception f) {
                        System.out.println("it doesn t exsist");
                        System.out.println(f.getClass());
                        System.out.println(f.getMessage());
                    }
                }
                try {
                    if (k > b) {
                        System.out.println("no money");
                    }
                } catch (Exception e) {
                    System.out.println("you dont have enough money");
                    System.out.println(e.getMessage());
                    System.out.println(e.getClass());
                }
            }

        } else if (i == 3) {
            System.out.println("you chose other stuff");
            System.out.println("which one?");
            j = input.nextInt();
            if (j == 1) {
                System.out.println("you chose a headset");
                System.out.println("enter the price");
                k = input.nextInt();
                System.out.println("enter the Cardnumber");
                y = input.nextInt();
                System.out.println("enter the Code");
                z = input.nextInt();
                System.out.println("enter your money");
                b = input.nextInt();
                System.out.println("checking the exsistace of this ...........");
                a = input.nextInt();
                if (a == 0) {
                    System.out.println("it exists");
                } else if (a == 1) {
                    try {
                        System.out.println("it dosent exsist");
                    } catch (Exception f) {
                        System.out.println("it doesn t exsist");
                        System.out.println(f.getClass());
                        System.out.println(f.getMessage());
                    }
                }
                try {
                    if (k > b) {
                        System.out.println("no money");
                    }
                } catch (Exception e) {
                    System.out.println("you dont have enough money");
                    System.out.println(e.getMessage());
                    System.out.println(e.getClass());
                }

            } else if (j == 2) {
                System.out.println("you chose a Mp3");
                System.out.println("enter the price");
                k = input.nextInt();
                System.out.println("enter the Cardnumber");
                y = input.nextInt();
                System.out.println("enter the Code");
                z = input.nextInt();
                System.out.println("enter your money");
                b = input.nextInt();
                System.out.println("checking the exsistace of this ...........");
                a = input.nextInt();
                if (a == 0) {
                    System.out.println("it exists");
                } else if (a == 1) {
                    try {
                        System.out.println("it dosent exsist");
                    } catch (Exception f) {
                        System.out.println("it doesn t exsist");
                        System.out.println(f.getClass());
                        System.out.println(f.getMessage());
                    }
                }
                try {
                    if (k > b) {
                        System.out.println("no money");
                    }
                } catch (Exception e) {
                    System.out.println("you dont have enough money");
                    System.out.println(e.getMessage());
                    System.out.println(e.getClass());
                }
            }
            // write your code here
        }
    }
}
