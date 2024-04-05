package com.mycompany.practicaltask1_12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название растения: ");
        String name = scanner.nextLine();
        System.out.print("Введите тип растения: ");
        String type = scanner.nextLine();
        System.out.print("Введите цвет растения: ");
        String color = scanner.nextLine();
        System.out.print("Введите высоту растения(см): ");
        double height = scanner.nextDouble();
        System.out.print("Растение съедобное? (true/false): ");
        boolean isEdible = scanner.nextBoolean();

        Plant plant = new Plant(name, type, color, height, isEdible);

        try (PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:\\plant.txt"), "UTF-8"))) {
            printWriter.print(plant.toString());
            System.out.println("Результат сохранен в файл: C:\\plant.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
