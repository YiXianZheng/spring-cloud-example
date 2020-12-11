package com.biz.a.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CSVUtils {

    public static void csvParse(int startRow) throws IOException {
        InputStream is = new FileInputStream("D:/csv/test.csv");
        InputStreamReader isr = new InputStreamReader(is, "UTF-16");
        Reader reader = new BufferedReader(isr);

        CSVParser parser = CSVFormat.INFORMIX_UNLOAD_CSV.withHeader("title", "cid", "seller_cids", "stuff_status", "location_state", "location_city").parse(reader);


        ArrayList<Map> arraylist = new ArrayList<Map>();
        List<CSVRecord> list = parser.getRecords();
        for (int i = startRow; i < list.size(); i ++) {
            CSVRecord record = list.get(i);
            String value = record.get(0);
            String[] arr = value.split("\t");
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
            System.out.println(arr[5]);
        }

        parser.close();
    }

    public static void main(String[] args) throws Exception {
        csvParse(3);
    }
}
