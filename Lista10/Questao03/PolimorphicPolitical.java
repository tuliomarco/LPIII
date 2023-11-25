package Lista10.Questao03;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PolimorphicPolitical {
    public static void main(String[] args) {
        List<Politico> politicos = new ArrayList<>();
        
        politicos.add(new Politico("Político1", 1, new Date(), "ABC", 123));
        politicos.add(new Prefeito("Político2", 2, new Date(), "XYZ", 456, "Cidade A"));
        politicos.add(new Governador("Político3", 3, new Date(), "DEF", 789, "Estado B"));

        for (Politico politico : politicos) {
            System.out.println(politico);
            System.out.println("---------------");
        }
    }
}

