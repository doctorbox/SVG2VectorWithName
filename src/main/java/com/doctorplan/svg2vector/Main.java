package com.doctorplan.svg2vector;


import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            String result = Svg2Vector.parseSvgToXml(new File(args[0]), new FileOutputStream(args[1]));
            System.out.println(result);
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
