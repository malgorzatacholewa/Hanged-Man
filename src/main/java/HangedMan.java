public class HangedMan {
    public void HangedManPicture(int lost) {
        switch (lost) {
            case 1:
                System.out.println("     ");
                System.out.println(" |    ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                break;
            case 2:
                System.out.println(" ____");
                System.out.println(" |    ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                break;
            case 3:
                System.out.println(" ____");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     | ");
                break;

            case 4:
                System.out.println(" ____");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    _|_");
                break;
            case 5:
                System.out.println(" ____");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    _|_");
                break;
            case 6:
                System.out.println(" ____");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println(" |   |");
                System.out.println("    _|_");
                break;
            case 7:
                System.out.println(" ____");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println(" |   |");
                System.out.println("    _|_");
                break;
            case 8:
                System.out.println(" ____");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println(" |   |");
                System.out.println("    _|_");
                break;
            case 9:
                System.out.println(" ____");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println(" |   |");
                System.out.println("/   _|_");
                break;
            case 10:
                System.out.println(" ____");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println(" |   |");
                System.out.println("/ \\ _|_");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lost);
        }
    }
}

