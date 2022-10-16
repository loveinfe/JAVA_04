import java.util.Scanner;
public class Year {
public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        System.out.println("請輸入年份");
        int year = s.nextInt();

        if((0==year%4&&year%100!=0)||year%400==0)
            System.out.println(year+"是閏年");
        else
            System.out.println(year+"不是閏年");
    }
    }
}