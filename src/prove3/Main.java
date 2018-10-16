package prove3;

public class Main {

    public static void main(String[] args) {
//        dichiaro una stringa s 
//        alla quale viene assegnato il risultato del metodo
//        con il numero di argomenti che si vuole
        String s = concatena("come", "sono", "bello.", "Forse.");
        String s1 = get(2,"come", "sono", "bello.", "Forse.");

//        stampo la stringa
        System.out.println(s);

//        dichiaro un double somma
//        al quale viene assegnato il risultato del metodo
//        con il numero di argomenti che si vuole 
        double somma = somma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        stampo la somma
        System.out.println(somma);

        double so = somma(1, 2);
        System.out.println(so);
        System.out.println(s1);
    }

//    String ... lista --> elenco di stringhe
//    Il numero di argomenti in questo metodo è variabile
//    posso dichiarare altri argomenti mettendoli prima della lista
//    public static String concatena(double a, String... lista)
    public static String concatena(String... lista) {
//        dichiaro una stringa vuota
        String s = "";

//        faccio un ciclo per ogni e appartenente a lista
        for (String e : lista) {
//            metto nella stringa tutti gli e contenuti in lista
            s += " " + e; // s= s + e;
        }
//        ritorno la stringa
        return s;
    }

//    estrarre l'elemento di indice index dalla lista
//    variabile dei parametri
    public static String get(int index, String... list) {
////        se l'indice è >= della lunghezza della lista
//        if (index >= list.length) {
////            ritorno la stringa vuota
//            return "";
//        } else {
////            altrimenti dichiaro un vettore di stringhe della lunghezza di list
//            String[] tmp = new String[list.length];
////            dichiaro un indice
//            int i = 0;
////            faccio un ciclo per ogni e contenuto in list
//            for (String e : list) {
//                tmp[i] = e;
////                incremento l'indice
//                i++;
//            }
//            return tmp[index];
//        }

//        OPPURE:
        return list[index];
    }

//    double ... n --> elenco di double
//    metodo con numero di argomenti variabili
//    posso dichiarare altri argomenti mettendoli prima della lista
//    public static String concatena(double a, double... n)
    public static double somma(double... numeri) {
//        dichiaro una variabile somma e la pongo = 0
        double somma = 0;
//        faccio un ciclo per ogni e appartenente a n
        for (double e : numeri) {
//            sommo tutti gli e contenuti in n
            somma += e;
        }
//        ritorno la somma
        return somma;
    }

    public static double somma(double a, double b) {
        return 2 * (a + b);
    }

}
