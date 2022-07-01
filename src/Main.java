import forms.CylindricalShape;
import forms.FlatForm;
import forms.RoundForm;

import java.util.ArrayList;

public class Main {
    static ArrayList<Object> backpack1 = new ArrayList<>();
    static ArrayList<Object> backpack2 = new ArrayList<>();
    static ArrayList<Object> backpack3 = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("First backpack: ");
        addToFirstBackpack();
        System.out.println("-------------");
        System.out.println("Second backpack: ");
        addToSecondBackpack();
        System.out.println("-------------");
        System.out.println("Third backpack: ");
        addToThirdBackpack();
        System.out.println("-------------");


    }

    public static void addToFirstBackpack() {
        for (int j = 0; j<=21;j++) {
            for (int i = 1; i <= 20; i++) {
                backpack1.add(new RoundForm("Apple - " + i).getName());
            }

            backpack1.add(new FlatForm("Book - " + 1).getName());
            backpack1.add(new CylindricalShape("Coca-cola").getName());
            System.out.println(backpack1.get(j).toString());
        }
    }

    public static void addToSecondBackpack() {
        for (int j = 0;j<=51;j++) {
            for (int i = 1; i <= 50; i++) {
                backpack2.add(new RoundForm("Tennis balls - " + i).getName());
            }

            backpack2.add(new CylindricalShape("Bottle of water").getName());
            backpack2.add(new FlatForm("Folder").getName());
            System.out.println(backpack2.get(j).toString());
        }
    }
    public static void addToThirdBackpack() {
        for (int i = 0; i<=14;i++) {
            for (int j = 1; j <= 10; j++) {
                backpack3.add(new RoundForm("Apple - " + j).getName());
            }
            for (int g = 1; g <= 3; g++) {
                backpack3.add(new RoundForm("Tennis balls - " + g).getName());
            }

            backpack3.add(new FlatForm("Folder").getName());
            backpack3.add(new CylindricalShape("Coca-cola").getName());
            System.out.println(backpack3.get(i).toString());


        }
    }
}


