package com.doctorplan.svg2vector;


import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            String result = Svg2Vector.parseSvgToXml(new File("body_map_rash.svg"), new FileOutputStream("body_map_rash.xml"));
            System.out.println(result);
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
