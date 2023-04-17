/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4 {

    public static void main(String[] args) {
        //zadanie1
        System.out.println("zadanie1");
        justUselessInterface jui = (a,b)->a+b;
        int result = jui.calc(3, 11);
        System.out.println(result); // Output: 14
       
        //zadanie2
        System.out.println("zadanie2");
        List<Integer> numbers = Arrays.asList
        (1, 2, 3,4);

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        
        //zadanie3
        List<Integer> numbers2 = Arrays.asList
        (123,124,435,654,456,45643,1);
        Collections.sort(numbers2);
        System.out.println("zadanie3");
        if(!numbers2.isEmpty())
            {
                for (int number : numbers2) {
                if (number % 2 == 0) {
                System.out.println(number);
                break;
                }
            }
        }
        
        //zadanie4
        System.out.println("zadanie4");
        List<Integer> numbers3 = Arrays.asList(23,43,12,45,12,43);
        int min = 20; // dolna granica zakresu
        int max = 40; // górna granica zakresu

        for (int number : numbers3) {
            if (number >= min && number <= max) {
                System.out.println(number);
            }
        }
        
        //zadanie5
        System.out.println("zadanie5");
       
         ArrayList<Osoba> lista_osob;
        lista_osob = new ArrayList<>();
        lista_osob.add(new Osoba("Jan","Kowalski", 1950, Osoba.Plec.M));
        lista_osob.add(new Osoba("Janina","Kowalska", 1951, Osoba.Plec.K));
        lista_osob.add(new Osoba("Anna","Nowak", 2000, Osoba.Plec.K));
        lista_osob.add(new Osoba("Zofia","Kowalska", 2004, Osoba.Plec.K));
        
        System.out.println("podaj rok do sortowania ludzi");
        //Scanner scan(System.in);
        //int rok = scan.nextInt()
        
        int rok =1952;
         for (Osoba osoba : lista_osob) {
            {
                if(osoba.getRok()>rok)
                osoba.wypisz();
            }
        }
         
        //zadanie6
        System.out.println("zadanie6");
        
        String namefirstchar = "Ja";
        
        lista_osob.stream()
        .filter(Osoba -> Osoba.getImie().startsWith(namefirstchar))
        .sorted(Comparator.comparing(Osoba::getNazwisko))
        .forEach(Osoba::wypisz);
        
        //zadanie7
        int licznik = 0;
        System.out.println("zadanie7");
        
        
        long count = lista_osob.stream()
        .filter(Osoba -> Osoba.getImie().startsWith(namefirstchar))
        .sorted(Comparator.comparing(Osoba::getNazwisko))
        .count();
        
        System.out.println(count);
        
        //zadanie8
        System.out.println("zadanie8");
         
        List<Integer> numberstorm1 = Arrays.asList
        (123,124,435,654,456,45643,1);
        List<Integer> numberstorm2 = Arrays.asList
        (123,124,435,654,426,45643);
        
        ArrayList<Integer> merge = new ArrayList<>();
                
        int maxi=0;//wskaznik na najwieksza tablice
        int maxi1=0;//wskaznik na mniejsze tablice
        int ws;//wskaznik na wieksze tablice
        
        if(numberstorm1.size()>numberstorm2.size())
        {
            maxi=numberstorm1.size();
            maxi1=numberstorm2.size();
            ws=1;
        }
        else
        {
            maxi=numberstorm2.size();
            maxi1=numberstorm1.size();
            ws=2;
        }
        for(int i=0;i<maxi;i++)
        {
            if(i<maxi1)
            {
                 merge.add(numberstorm1.get(i)+ numberstorm2.get(i) );
            }
            else if(ws==1)
            {
                 merge.add(numberstorm1.get(i));
            }
            
            else if(ws==2)
            {
                merge.add(numberstorm2.get(i));
            }
        }
        
        for(int i=0;i<merge.size();i++)
        {
            System.out.println(merge.get(i));
        }
        //zadanie9
         System.out.println("zadanie9");
         
        ArrayList<Osoba> lista_osob2;
        lista_osob2 = new ArrayList<>();
        lista_osob2.add(new Osoba("Jan","Kowalski", 1950, Osoba.Plec.M));
        lista_osob2.add(new Osoba("Janina","Kowalska", 1951, Osoba.Plec.K));
        lista_osob2.add(new Osoba("Anna","Nowak", 2000, Osoba.Plec.K));
        lista_osob2.add(new Osoba("Zofia","Kowalska", 2004, Osoba.Plec.K));
        
        lista_osob2.stream()
        .sorted(Comparator.comparing(Osoba::getNazwisko).thenComparing(Osoba::getImie))
        .forEach(Osoba::wypisz);
        
         
        
     
    }}