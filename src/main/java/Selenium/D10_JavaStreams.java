package Selenium;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D10_JavaStreams {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("anam");
        al.add("zamadfd");
        al.add("alima");
        al.add("ramaaaa");
        al.add("kite");
//        normal flow without streams
//        for(int i=0;i<al.size();i++){
//            String rs=al.get(i);
//            System.out.println(rs);
//        }

        //print all
        al.stream().forEach(s-> System.out.print(s+" "));
        System.out.println();

        //print those who starts with "a"
        long count=al.stream().filter(s->s.startsWith("a")).count();
        System.out.println("count of names starting with a:- "+count);

        //direct creating stream compatable
        Stream.of("koni","loni","book","toni").filter(s->s.contains("ni")).forEach(s-> System.out.println(s));

        //print those whose length is greater than 4
        al.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s));

        //print only 1st one whose length is greater than 4
        al.stream().filter(s->s.length()>4).limit(1).forEach(s-> System.out.println(s));

        //Manipulate- use map()
        //print those whose length is greater than 4 in upper case
        al.stream().filter(s->s.length()>5).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        //print data in sorted order
        al.stream().sorted().forEach(s-> System.out.println(s));

        //concat 2 lists
        List<String> l1= Arrays.asList("kolo","bolo","alma");
        List<String> l2= Arrays.asList("koni","boni","book");

        Stream<String> newstream=Stream.concat(l1.stream(),l2.stream());
        //to match any value
        boolean b=newstream.anyMatch(s->s.equalsIgnoreCase("kolo"));
        Assert.assertEquals(b,true);

        //using collect
        List<String> al1=al.stream().filter(s->s.length()>4).sorted().collect(Collectors.toList());
        System.out.println(al1.get(1));

        //Assignment
        List<Integer> val=Arrays.asList(30,5,17,5,30,9,11,13);

        //print distinct
        val.stream().distinct().forEach(s-> System.out.print(s+" "));
        System.out.println(); // Add newline before next output
        //print in sorted- 3rd index
        List<Integer> sortedval=val.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedval.get(2));
    }
}
