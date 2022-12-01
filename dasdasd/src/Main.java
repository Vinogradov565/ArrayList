import jdk.jfr.DataAmount;
import jdk.jfr.Name;

import java.util.ArrayList;
@Name("Vladimir Putin"
)
@DataAmount("10/27/1952")
@SuppressWarnings("uncheled")
public class Main {
    public static void main(String[] args) {
        ArrayList <String> rocket = new ArrayList<String>();
        rocket.add ("Сармат");
        rocket.add ("Пойседон");
        rocket.add("Гвоздика");
        for (int i = 0; i <rocket.size(); i++) {
        }
        ArrayList<String>mame = new ArrayList<String>();
     mame.add("3000000");
     mame.add("10000000");
     mame.add("99999999");
     for (int i=0; i<mame.size();i++){

     }
     ArrayList<String> name = new ArrayList<String>();
     name.add("chel");
     name.add("CHELIK");
     name.add("CHELisHE");
     for (int i=0; i < name.size(); i++){
         System.out.println(name.get(i) + "" +rocket.get(i) + "" +mame.get(i));
     }
    }
}