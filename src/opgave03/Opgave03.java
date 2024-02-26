package opgave03;

import examples.models.Chili;
import examples.models.Fruit;
import examples.models.Measurable;
import examples.models.MeasurableArray;
import opgave03.models.ArrayListRing;
import opgave03.models.Ring;

public class Opgave03{
    public static void main(String[] args) {
        ArrayListRing<String> Items = new ArrayListRing<>();
        Items.add("Bjarke");
        Items.add("Daniel");
        Items.add("Mathias");
        Items.add("Nikolaj");
        Items.add("Peter");

        Items.advance();
        System.out.println("----------------------");
        System.out.println(Items.getCurrentItem());
        System.out.println("----------------------");
        System.out.println(Items.removeItem("Bjarke"));
        System.out.println("----------------------");
        System.out.println(Items.getCurrentItem());
        System.out.println("----------------------");
        System.out.println(Items.size());
        System.out.println("----------------------");
        System.out.println(Items.isEmpty());

    }
}
