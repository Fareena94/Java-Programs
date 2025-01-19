package com.example.ControllerDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Base64Encoder {
    public static String encodeImageToBase64(String imagePath) throws IOException {
        byte[] fileContent = Files.readAllBytes(Paths.get(imagePath));
        return Base64.getEncoder().encodeToString(fileContent);
    }

    public static void main(String[] args) {
        try {
            String base64String = encodeImageToBase64("path/to/screenshot.png");
            System.out.println(base64String); // You can use this in your report.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
