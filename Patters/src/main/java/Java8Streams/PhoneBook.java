package Java8Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> pbook=new HashMap();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {

            String name=in.nextLine();

            int phone=in.nextInt();
            in.nextLine();
            pbook.put(name,phone);

        }
        while(in.hasNext())
        {
            String s=in.nextLine();

                if(pbook.containsKey(s)){
                    System.out.println(s+"="+pbook.get(s));
                }else{
                    System.out.println("Not found");
                }

        }

    }
}
