package zarema_lab3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.sound.midi.Instrument;

public class Zarema_Lab3 {

    public static void main(String[] args) {
        List< MyInstrument> listMyInstrument = new ArrayList< MyInstrument>();
        Set< MyInstrument> setInstrument = new LinkedHashSet< MyInstrument>();
        Map<String, MyInstrument> mapMyInstrument = new TreeMap<String, MyInstrument>();

        MyInstrument myInstrument = new MyInstrument();
        myInstrument.setName("guitar");
        myInstrument.setCategory("plucked string");
        myInstrument.setCanplay(true);
        System.out.println(myInstrument);
        myInstrument.getMyInstrument().add(new MyInstrument("drums", "plucked string", true));
        myInstrument.getMyInstrument().add(new MyInstrument("violin", "bow string", true));
        myInstrument.getMyInstrument().add(new MyInstrument("dombra", "plucked string", true));
        myInstrument.remove(0);

        for (int i = 0; i < myInstrument.getMyInstrument().size(); i++) {
            System.out.println(myInstrument.getMyInstrument().get(i));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько инструментов: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Название инструмента: ");
            String name = sc.next();
            System.out.print("Категория: ");
            String category = sc.next();
            System.out.print("Умеешь играть (true/false) ? ");
            boolean canplay = sc.nextBoolean();
            myInstrument.getMyInstrument().add(new MyInstrument(name, category, canplay));
        }
        sc.close();

        if (!listMyInstrument.isEmpty()) {
            listMyInstrument.remove(0);
        }

        if (setInstrument.iterator().hasNext()) {
            setInstrument.remove(setInstrument.iterator().next());
        }

        try {
            mapMyInstrument.remove(mapMyInstrument.keySet().stream().findFirst().get());
        } catch (Exception e) {
        }

        System.out.println("");
        System.out.println(listMyInstrument);
        System.out.println(setInstrument);
        System.out.println(mapMyInstrument);
        System.out.println("");
    }
}
