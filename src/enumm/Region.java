package enumm;

public enum Region {

    CHUI, NARYN, BATKEN, YSYK_KUL, JALAL_ABAD, OSH, TALAS;


    public static void regionInfo() {


        for (Region region : Region.values()) {
            System.out.println(region);

            switch (region) {
                case CHUI:
                    System.out.println("Столица КР");
                    break;
                case NARYN:
                    System.out.println("Высокогорный область");
                    break;
                case BATKEN:
                    System.out.println("Граничит с Таджикистаном и Узбекистаном");
                    break;
                case YSYK_KUL:
                    System.out.println("Жемчужина страны");
                    break;
                case JALAL_ABAD:
                    System.out.println("Известна своими орехами");
                    break;
                case OSH:
                    System.out.println("Южная столица");
                    break;
                case TALAS:
                    System.out.println("Граниит с Казакстаном");
                    break;
                default:
                    System.out.println("No region");
            }

            System.out.println();
        }
    }
}