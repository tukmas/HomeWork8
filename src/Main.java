public class Main {
    public static void main(String[] args) {
// Домащнее задание №1
        System.out.println("Домащнее задание №1");
// Задание 1
        System.out.println("Задание 1");
int [] weight = new int [] {1, 2, 3,};
double [] weight1 = new double[3];
weight1[0] = 1.57;
weight1[1] = 7.654;
weight1[2] = 9.986;
int [] weight3 = new int [] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
// Задание 2
        System.out.println("Задание 2");
int [] weight4 = new int [] {1, 2, 3,};
        System.out.println(weight4[0] +", " + weight4[1] + ", " + weight4[2]);
double [] weight5 = new double[3];
weight5[0] = 1.57;
weight5[1] = 7.654;
weight5[2] = 9.986;
        System.out.println(weight5[0] +", " + weight5[1] + ", " + weight5[2]);
int [] weight6 = new int [] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        System.out.println(weight6[0] +", " + weight6[1] + ", " + weight6[2]);
// Задание 3
System.out.println("Задание 3");
int [] weight14 = new int [] {1, 2, 3,};
System.out.println(weight14[2] +", " + weight14[1] + ", " + weight14[0]);
double [] weight15 = new double[3];
weight15[0] = 1.57;
weight15[1] = 7.654;
weight15[2] = 9.986;
System.out.println(weight15[2] +", " + weight15[1] + ", " + weight15[0]);
int [] weight16 = new int [] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
System.out.println(weight16[2] +", " + weight16[1] + ", " + weight16[0]);
// Задание 4
System.out.println("Задание 4");
int [] weight24 = new int [] {1, 2, 3,};
        for (int i = 0; i < 3; i++) {
        if (i % 2 == 0) {
        weight24[i]++;}
        }
System.out.println(weight24[0] +", " + weight24[1] + ", " + weight24[2]);
    }
}