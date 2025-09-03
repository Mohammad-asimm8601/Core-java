package basics;

import java.util.Scanner;

public class VolumeofSphere {
    public static void main(String[] args) {
        double rad, vol;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius :");
        rad = sc.nextDouble();
        vol = (4*3.14*rad*rad*rad)/4;
        System.out.println("The volume of sphere is : "+vol);
        sc.close();
    }
}
