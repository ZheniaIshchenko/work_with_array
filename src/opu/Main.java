package opu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        3Task30();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Task55();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Task80();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Task105();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Task130();
    }

    /**
     * Дана последовательность натуральных чисел а1, а2, ..., an.
     * Создать массив из четных чисел этой последовательности.
     * Если таких чисел нет, то вывести сообщение об этом факте.
     */
    public static void Task30() {
        System.out.println("Дана последовательность натуральных чисел а1, а2, ..., an." + System.lineSeparator() + "Создать массив из четных чисел этой последовательности." + System.lineSeparator() + "Если таких чисел нет, то вывести сообщение об этом факте.");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a count of elements:");
        int count = in.nextInt();
        System.out.println("Enter a1:");
        int first_element = in.nextInt();
        System.out.println("Enter a2:");
        int second_element = in.nextInt();
        int defferens = second_element - first_element;
        int one_element = first_element;
        int[] evens = new int[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            one_element = one_element + defferens;
            if (one_element % 2 == 0) {
                evens[index] = one_element;
                index++;
            }
        }
        if (index == 0) {
            System.out.println("Not found any evens numbers");
        } else {
            System.out.println("Even elements:");
            for (int i = 0; i < count - index; i++) {
                System.out.println(evens[i]);
            }
        }

    }

    /**
     * Сформировать массив простых множителей заданного числа.
     */
    public static void Task55() {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int chek = number;
        int index = 0;
        int[] prime_numbers = new int[number];
        for (; chek % 2 == 0; chek = chek / 2) {
            prime_numbers[index] = 2;
            index++;
        }
        for (; chek % 3 == 0; chek = chek / 3) {
            prime_numbers[index] = 3;
            index++;
        }
        for (; chek % 5 == 0; chek = chek / 5) {
            prime_numbers[index] = 5;
            index++;
        }
        for (; chek % 7 == 0; chek = chek / 7) {
            prime_numbers[index] = 7;
            index++;
        }
        if(chek!=0){
            prime_numbers[index] = chek;
        }
        for (int i = 0; i <= index; i++){
            if (prime_numbers[i]!=1) {
                System.out.println(prime_numbers[i]);
            }
        }
    }

    /**
     * Известны данные о мощности двигателя 30 моделей легковых автомобилей.
     * Выяснить, есть ли среди них модель, мощность двигателя которой превышает 200 л. с.
     */
    public static void Task80(){
        int max = 300;
        int min = 100;
        int[] cars_hp = new int[30];
        int count = 0;
        for (int i = 1; i <= cars_hp.length ;i++){
            cars_hp[i-1] = (int)(Math.random() * (max-min)) + min;
            if (cars_hp[i-1] > 200){
                System.out.println("Car №" + i + " have " + cars_hp[i-1] + " horses power");
                count++;
            }
        }
        System.out.println("Count cars with >200 horses power: " + count);
    }

    /**
     * Удалить первый элемент одномерного массива целых чисел.
     */
    public static void Task105(){
        int count_elements = (int) (Math.random() * (50)); // Создаю переменную в диапазоне от 0 до 100
        int[] array_numbers = new int[count_elements];
        System.out.println("First array: ");
        for(int i = 0; i < count_elements; i++){
            array_numbers[i] = (int) (Math.random() * (50)); // Создаю массив с элементами в диапазоне от 0 до 100
            System.out.print(array_numbers[i] + ", ");
        }
        System.out.println();
        int[] array_deleted_first = new int[count_elements];
        System.arraycopy(array_numbers, 1, array_deleted_first, 1, count_elements-1);
        System.out.println("Array with deleted first element: ");
        for (int i = 0; i < count_elements; i++){
            System.out.print(array_deleted_first[i] + ", ");
        }
        System.out.println();
    }

    /**
     * Даны целые положительные числа а1, а2, ..., an. Найти среди них те, которые являются квадратами некоторого числа m.
     */
    public static void Task130(){
        System.out.println("Enter a count of elements: ");
        Scanner in = new Scanner(System.in);
        int count_elements = in.nextInt();
        System.out.println("Enter a first element: ");
        int first_element = in.nextInt();
        System.out.println("Enter a second element: ");
        int second_element = in.nextInt();
        System.out.println("Enter some number: ");
        int sqrt_number = in.nextInt();
        int one_element = 0;
        int chek = 0;
        int[] array_elements = new int[count_elements];
        for(int i = 0; i < count_elements; i++){
            one_element = one_element + (second_element-first_element);
            array_elements[i] = one_element;
            if(array_elements[i]*array_elements[i] == sqrt_number){
                System.out.println(array_elements[i] + "^2 = " + sqrt_number);
                chek = 1;
            }
        }
        if(chek == 0){
            System.out.println("Not found any numbers");
        }
    }
}



