package enumm;

public enum JumaKundor {

    DUISHOMBU,
    SHEISHEMBI,
    SHARSHEMBI,
    BEISHEMBI,
    JUMA,
    ISHEMBI,
    ZHEKSHEMBI;


    public static void jumaKundor() {

        for (JumaKundor juma : JumaKundor.values()) {
            System.out.println(juma);

            switch (juma) {
                case DUISHOMBU:
                    System.out.println("Duishombu: Java kurs");
                    break;
                case SHEISHEMBI:
                    System.out.println("Sheishembi: English kurs");
                    break;
                case SHARSHEMBI:
                    System.out.println("Sharshembi: Dance");
                    break;
                case BEISHEMBI:
                    System.out.println("Beishembi: Deutch kurs");
                    break;
                case JUMA:
                    System.out.println("Juma: Fitness");
                    break;
                case ISHEMBI:
                    System.out.println("Ishembi: Relax");
                    break;
                case ZHEKSHEMBI:
                    System.out.println("Zhekshembi: Relax");
                    break;
                default:
                    System.out.println("Mynday kun jok");

            }
            System.out.println("-------------------------------------------------------");
        }
    }
}