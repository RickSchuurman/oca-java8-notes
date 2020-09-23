package exam;

class Voertuig {

    private String getEdge() {
        return "";
    }
}

class Auto extends Voertuig {
    protected String getEdge() {
        return "";
    }
}

class Fiets extends Voertuig {}

class Testclass {

    public static void main(String[] args) {
        Voertuig eenVoertuig = null;
//        Auto eenAuto = null;
//
//        eenVoertuig = (Auto) eenAuto;   // Compiles, want een auto is een voertuig, cast is overbodig.
//        eenVoertuig = new Auto();       // Compiles, want instantie van een auto is-a Voertuig.
//        eenAuto = (Auto) eenVoertuig;   // Compiles, want een voertuig kan-een auto zijn.
//                                        // Maar dit kan leiden tot een classcast exception als het voertuig runtime geen auto is
//                                        // Cast is nodig
//        eenAuto = eenVoertuig;          // Zonder cast werkt het niet, want je gaat van een wide (voertuig) naar narrow (auto). Dit heet narrowing, hiervoer is cast verplicht
//        eenVoertuig = eenAuto;          // Dit mag zonder cast, want narrow -> wide (Widening) gaat automatisch, cast is optioneel.
//
//        eenAuto = new Voertuig()        // does not compile, een Voertuig is niet altijd een auto, het kan ook een Fiets zijn
//

    }
}
