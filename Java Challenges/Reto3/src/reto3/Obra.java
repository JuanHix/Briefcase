

import java.util.ArrayList;

public class Obra {

    public ArrayList<Integer> clases(ArrayList<Integer> unico) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (Integer i : unico) {
            if (!lista.contains(i)) {
                lista.add(i);
            }
        }
        return lista;
    }

    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> falta, ArrayList<Integer> pertenece, int categoria) {
        ArrayList<Integer> listFalta = new ArrayList<>();
        for (int i = 0; i < falta.size(); i++) {
            if (pertenece.get(falta.get(i)) == categoria) {
                listFalta.add(falta.get(i));

            }
        }

        return listFalta;
    }

    public ArrayList<Integer> noTengo(ArrayList<Integer> tengoA, ArrayList<Integer> tengoB) {
        ArrayList<Integer> listInteres = new ArrayList<>();
        for (int i=0;i < tengoA.size();i++) {
            if (!tengoB.contains(tengoA.get(i))) {
                listInteres.add(tengoA.get(i));
            }

        }

        return listInteres;

    }

    public Integer puedoCambiar(ArrayList<Integer> duplicadosA, ArrayList<Integer> duplicadosB) {
        ArrayList<Integer> dupliA = new ArrayList<>();
        ArrayList<Integer> dupliB = new ArrayList<>();
        ArrayList<Integer> nc = new ArrayList<>();
        
        for(int x = 0; x < duplicadosA.size(); x++) {
            if (!duplicadosB.contains(duplicadosA.get(x))) {
                dupliA.add(duplicadosA.get(x));
            }
        }
        for(int x = 0; x < duplicadosB.size(); x++) {
            if (!duplicadosA.contains(duplicadosB.get(x))) {
                dupliB.add(duplicadosB.get(x));}
            
        } if (dupliA.size() < dupliB.size()){
            nc.add(dupliA.size());
        }else{
            nc.add(dupliB.size());
        }
                     
        return  nc.get(0);

    }

}
