package org.example.module10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Module10_1 {
    private static final String FILE_NAME = "input_10_1_1.txt";
    private static final String EMPTY_FILE_NAME = "input_10_1_2.txt";
    private static final String INCORRECT_FILE_NAME = "input1.txt";

    private static void readFile(String path) {
        File file = new File("./src/main/resources/" + path);
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream);
        ) {
            if (!scanner.hasNextLine()) {
                throw new EmptyFileException("Empty file:", file.getPath());
            }
            String fileLine = scanner.nextLine();
            System.out.printf("'%s' read from file '%s'%n", fileLine, path);
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFound exception '" + path + "'");
        } catch (IOException ex) {
            System.out.println("I/O exception for '" + path + "'");
        } catch (EmptyFileException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally method for '" + path + "'");
        }
    }

    public static void main(String[] args) {
        readFile(INCORRECT_FILE_NAME);
        readFile(EMPTY_FILE_NAME);
        readFile(FILE_NAME);
    }
}
