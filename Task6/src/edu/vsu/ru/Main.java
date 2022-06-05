package edu.vsu.ru;

import edu.vsu.cs.course1.hash.SimpleHashMap;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        try(FileReader reader = new FileReader("C:\\Users\\Сергей\\Desktop\\Учёба\\ТаскиВторойСем\\Task6\\src\\edu\\vsu\\ru\\text.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                s.append((char) c);

            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        SimpleHashMap<String, Integer> map = new SimpleHashMap<>(1000);


        int k = 0;
        String st = s.toString().replaceAll("\\s+","");
        for (int i = 1; i < st.length()-1; i++) {
            if (st.charAt(i)>'A' && st.charAt(i)<'Z' && st.charAt(i-1)!='.' && st.charAt(i-1)!='!' && st.charAt(i-1)!='?') {
                String key = String.valueOf(st.charAt(i));
                map.put(key, 1);
                k+=1;
            }
        }


        System.out.println(map);
        System.out.println(k);
    }
}
