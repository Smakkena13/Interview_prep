package CoreJava;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random rm=new Random();
        System.out.println(rm.nextInt(10));

        System.out.println(Math.random());

        RandomStringUtils r=new RandomStringUtils();
        String num=r.randomNumeric(10);
        String alp=r.randomAlphabetic(10);
        System.out.println(num+" "+alp);
    }
}
