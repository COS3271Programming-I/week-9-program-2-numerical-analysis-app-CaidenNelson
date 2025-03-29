import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class test {

    public static void main(String[] args) throws FileNotFoundException {
        File fileText = new File("/Users/caidennelson/IdeaProjects/UNWSP Java Class/week 9/src/numbers.txt");
        Scanner s = new Scanner(fileText);

        int num1 = 0;
        int tolalNums = 0;
        int total = 0;
        int counter = 0;
        double average = 0;
        int range = 0;
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();


        while (s.hasNextInt()) {

            num1 = s.nextInt();
            list.add(num1);

            list2.add(num1);

            tolalNums++;

        }

        for ( int i = 0; i < tolalNums; i ++){

            total = total + list.get(0+counter);
            counter++;
        }

        Collections.sort(list);
        Collections.sort(list2);
        Collections.reverse(list2);

        range = list2.get(0) - list.get(0);
        average = total/tolalNums;

        System.out.println("The file has " + total + " numbers, the average is " + average + ", the largest number is " + list2.get(0) +
                ", the smallest is " + list.get(0) + ", and the range is " + range);


        s.close();

    }

}


