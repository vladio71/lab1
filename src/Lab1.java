

import java.util.*;

public class Lab1
{
//  Створіть метод, який підраховує кількість однакових чисел
//  у будь якому масиві int[] . Приклад [1,7,3,9,34,3,7]
//  Результат :  1- 1раз, 7 - 2 рази,3-2 рази….
    public static void Count_number_of_each_element( int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for (int el1 : arr) {
            map.put(el1, 0);
        }

        for (int el1 : arr) {
            int temp = map.get(el1);
            temp++;
            map.put(el1, temp);
        }
        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            System.out.print(me.getKey() + " - ");
            System.out.println(me.getValue() + "раз");
        }
    }




//        Створіть метод, який приймає будь яку кількість елементів int[]
//        та повертає масив, який складається тільки з  елементів,
//        які є в одному екземплярі серед усіх масивів.
    public static int[] Find_Single_number(int[] ...arr)
    {
        int Size = 0;
        for (int[]el0 : arr)
        {
            Size +=el0.length;
        }
        int [] Ultimate_arr = new int [Size];
        int i = 0;
        for (int[] el:arr){
            System.arraycopy(el,0,Ultimate_arr,i,el.length);
            i += el.length;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int el1 : Ultimate_arr) {
            map.put(el1, 0);
        }

        for (int el1 : Ultimate_arr) {
            int temp = map.get(el1);
            temp++;
            map.put(el1, temp);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            if (me.getValue() == 1){
                list.add(me.getKey());
            }
        }
        Ultimate_arr = new int[list.size()];
        int k = 0;
        for (int element:list) {
            Ultimate_arr[k] = element;
            k++;
        }
        System.out.println(Arrays.toString(Ultimate_arr));
        return Ultimate_arr;
    }


//    Створіть метод, який приймає на вхід рядок
//    та на виході змінює регістри букв на протилежні.
//    Приклад - на вході "рУматРОн" на виході "РуМАТроН"


    public static String ChangeLetterCase (String s)
    {
        String s2 = s.toLowerCase();
        char[] ch2 = s2.toCharArray();



        for (int i = 0; i < ch2.length; i++) {
            if(s.charAt(i) == ch2[i]){
                ch2[i] = Character.toUpperCase(ch2[i]);
            }
        }
       s2 = new String(ch2);
        System.out.println(s2);
        return s2;


    }


//    Створіть метод, який знаходить суму цифр будь якого числа int
    public static int Sum_of_digits (int value)
    {
        int sum=0;
        while (value!= 0)
        {
            sum += value%10;
            value/=10;
        }
        System.out.println(sum);
        return sum;

    }
//    Створіть метод, який приймає параметр int та конвертує його з
//    десятичної у шістнадцятирічну систему обчислення та
//    повертає у вигляді String. Приклад- приймає 11, повертає =0xb=

    public static String From_10_to_16(int value)
    {
        String number = "0x";
        String number2="";
        int temp=0;
         while (true)
         {
             if (value<16 || value == 16) {
                 switch (value) {
                     case 0:
                         number2 += "1";
                         break;
                     case 10:
                         number2 += "A";
                         break;
                     case 11:
                         number2 += "B";
                         break;
                     case 12:
                         number2 += "C";
                         break;
                     case 13:
                         number2 += "D";
                         break;
                     case 14:
                         number2 += "E";
                         break;
                     case 15:
                         number2 += "F";
                         break;
                     default:
                         number2 += value;
                 }
                 StringBuilder input1 = new StringBuilder();
                 input1.append(number2);
                 input1.reverse();
                 number += input1.toString();
                 break;

             }
             temp = value%16;
             value/=16;
             switch (temp){
                 case 0:
                     number2 += "1";
                     break;
                 case 10:
                     number2 += "A";
                     break;
                 case 11:
                     number2 += "B";
                     break;
                 case 12:
                     number2 += "C";
                     break;
                 case 13:
                     number2 += "D";
                     break;
                 case 14:
                     number2 += "E";
                     break;
                 case 15:
                     number2 += "F";
                     break;
                 default:
                     number2 += temp;
             }
         }
        System.out.println(number);
         return number;
    }


    public static void main(String[] args) {
        //[ 8,30,17,11,28 ]


        int[] arr = {2, 32, 4, 2, 3, 2};
        int[] arr2 = {2, 3, 5, 2, 5, 2};
        int[] arr3 = {2, 35, 7, 2, 3, 2};
        String a = "рУматРОн";




        Count_number_of_each_element(arr);

        Find_Single_number(arr,arr2,arr3);

        ChangeLetterCase(a);

        Sum_of_digits(123);

        From_10_to_16(125);

    }


}