
/*
Sử dụng Collection trong Java để đếm và list số lượng email
ra thành 1 tập hợp Map<địa chỉ email, số lượng email bị lặp>

 */

package b9.bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //luu inputBai2
        List<String> emails = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\STUDY\\BE\\BTVN-k1\\src\\b9\\bai2\\inputBai2.txt"));
            String line = "";
            while((line = reader.readLine()) != null){
                emails.add(line);
            }
            reader.close();
        } catch (Exception e) {
           e.printStackTrace();
        }

        //map dem tan suat
        Map<String, Integer> freqMap = new LinkedHashMap<>();

        for(int i = 0 ; i < emails.size() ; i++){
            String mail = emails.get(i);
            if(freqMap.containsKey(mail)){
                Integer freqVal = freqMap.get(mail);
                freqVal++;
                freqMap.put(mail, freqVal);
            }
            else{
                freqMap.put(mail, 1);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = freqMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
