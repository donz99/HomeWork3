package HomeWork3;
/*
Домашняя работа 3 Логические выражения, логические функции Красько Денис 10.07.2022
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Boolean17◦
        //. Дано целое положительное число. Проверить истинность высказывания:
        // «Данное число является нечетным трехзначным».
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        boolean res=(a%2 !=0)&&(a>99&&a<1000);
//        System.out.println(res);

        //Boolean18◦
        //. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара совпадающих».
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = (a==b)||(b==c)||(a==c);
//        System.out.println(res);

        //Boolean19◦
        //. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара взаимно противоположных».
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = (a==-b)||(b==-c)||(a==-c);
//        System.out.println(res);

        //Boolean20◦
        //. Дано трехзначное число. Проверить истинность высказывания:
        //«Все цифры данного числа различны».

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int ed = a % 10;
//        int sot = a / 100;
//        int des = (a / 10) % 10; //(a%100)/10;
//        boolean res = (sot != des) && (des != ed) && (sot != ed);
//        System.out.println(res);

        //Boolean21◦
        //. Дано трехзначное число. Проверить истинность высказывания:
        //«Цифры данного числа образуют возрастающую последовательность».
        // от сотен к еденицам (слева на право)
//        Scanner in=new Scanner(System.in);
//        int a= in.nextInt();
//        int ed=a%10;
//        int sot=a/100;
//        int des=(a/10)%10;
//        boolean res=(ed>des)&&(des>sot);
//        System.out.println(res);

        //Boolean22◦
        //. Дано трехзначное число. Проверить истинность высказывания:
        //«Цифры данного числа образуют возрастающую или убывающую последовательность».
//        Scanner in=new Scanner(System.in);
//        int a= in.nextInt();
//        int ed=a%10;
//        int sot=a/100;
//        int des=(a/10)%10;
//        boolean res=((ed>des)&&(des>sot))||((sot>des)&&(des>ed));
//        System.out.println(res);

        //Boolean23◦
        //. Дано четырехзначное число. Проверить истинность высказывания:
        // «Данное число читается одинаково слева направо и справа налево».
//        Scanner in=new Scanner(System.in);
//        int a= in.nextInt();
//        int ed=a%10;
//        int tis=a/1000;
//        int sot=(a/100)%10;
//        int des=(a%100)/10;
//        boolean res=(tis==ed)&&(sot==des);
//        System.out.println(res);

        //Boolean24◦
        //. Даны числа A, B, C (число A не равно 0). Рассмотрев дискрими-
        //нант D = B
        //2 − 4·A·C, проверить истинность высказывания: «Квадратное
        //уравнение A·x
        //2 + B·x + C = 0 имеет вещественные корни».
//        Scanner in=new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int d = b*b-4*a*c;
//        boolean res=(d>=0);
//        System.out.println("Квадратное уравнение A*x^2+B*x+C=0 имеет вещественные корни? " + res);

        //Boolean25◦
        //. Даны числа x, y. Проверить истинность высказывания: «Точка с
        //координатами (x, y) лежит во второй координатной четверти».
//        Scanner in=new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        boolean res=x<0&&y>0;
//        System.out.println("Точка c координатами (x, y) лежит во второй координатной четверти? " + res);

        //Boolean26◦
        //. Даны числа x, y. Проверить истинность высказывания: «Точка с
        //координатами (x, y) лежит в четвертой координатной четверти»
//        Scanner in=new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        boolean res=x>0&&y<0;
//        System.out.println("Точка c координатами (x, y) лежит во второй координатной четверти? " + res);

        //Boolean27◦
        //. Даны числа x, y. Проверить истинность высказывания: «Точка с
        //координатами (x, y) лежит во второй или третьей координатной четверти».
//        Scanner in=new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        boolean res=(x<0&&y>0)||(x<0&&y<0);
//        System.out.println("Точка c координатами (x, y) лежит во второй или третьей координатной четверти? " + res);

        //Boolean28◦
        //. Даны числа x, y. Проверить истинность высказывания: «Точка с
        //координатами (x, y) лежит в первой или третьей координатной четверти»
//        Scanner in=new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        boolean res=(x>0&&y>0)||(x<0&&y<0);
//        System.out.println(res);

        //Boolean29◦
        //. Даны числа x, y, x1, y1, x2, y2. Проверить истинность высказывания:
        // «Точка с координатами (x, y) лежит внутри прямоугольника, левая
        //верхняя вершина которого имеет координаты (x1, y1), правая нижняя —
        //(x2, y2), а стороны параллельны координатным осям».
//        Scanner in=new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int x1 = in.nextInt();
//        int y1 = in.nextInt();
//        int x2 = in.nextInt();
//        int y2 = in.nextInt();
//        boolean res=(x>x1&&x<x2)&&(y<y1&&y>y2);
//        System.out.println(res);

        //Boolean30◦
        //. Даны целые числа a, b, c, являющиеся сторонами некоторого треугольника.
        // Проверить истинность высказывания: «Треугольник со сторонами a, b, c является равносторонним».
//        Scanner in=new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res=(a==b&&b==c);
//        System.out.println(res);

        //Boolean31◦
        //. Даны целые числа a, b, c, являющиеся сторонами некоторого треугольника.
        // Проверить истинность высказывания: «Треугольник со сторонами a, b, c является равнобедренным».
//        Scanner in=new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res=(a==b||b==c||a==c);
//        System.out.println(res);

        //Boolean32◦
        //. Даны целые числа a, b, c, являющиеся сторонами некоторого треугольника.
        // Проверить истинность высказывания: «Треугольник со сторонами a, b, c является прямоугольным»
//        Scanner in=new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res=((a*a==(b*b+c*c))||(b*b==(a*a+c*c))||(c*c==(a*a+b*b)));
//        System.out.println(res);



    }
}
