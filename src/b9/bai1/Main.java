
/*
Sử dụng Collection trong Java để đếm và list số lượng từ giống nhau trong inputBai1.txt
 */

package b9.bai1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //luu inputBai1
        List<String> input = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\STUDY\\BE\\BTVN-k1\\src\\b9\\bai1\\inputBai1.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                input.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //word trong input
        List<String> listWords = new ArrayList<>();
        for(int i = 0; i < input.size(); i++) {
            //tach tu => add vao listWords
            StringTokenizer st = new StringTokenizer(input.get(i));
            while(st.hasMoreTokens()) {
                listWords.add(st.nextToken());
            }
        }

        //map luu tan suat xuat hien
        Map<String, Integer> freqMap = new LinkedHashMap<>();

        //put<word, tan suat> vao map
        for(int i = 0; i < listWords.size(); i++) {
            String word = listWords.get(i);
            if(freqMap.containsKey(word)) {
                Integer freqVal = freqMap.get(word);
                freqVal++;
                freqMap.put(word, freqVal);
            } else{
                freqMap.put(word, 1);
            }
        }

        System.out.println("Cac tu lap lai giong nhau: ");
        Set<Map.Entry<String, Integer>> entrySet = freqMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
           if(entry.getValue() >= 2) {
               System.out.println(entry.getKey() + " - xuat hien " + entry.getValue() + " lan");
           }
        }



    }
}
