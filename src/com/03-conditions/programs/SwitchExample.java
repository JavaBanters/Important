class SwitchExample {
    public static void main(String[] args) {

        String lang = "fr";
        //String lang = "en";
        //String lang = "de";
        //String lang = "np";
        switch (lang) {
            case "en":
                System.out.println("English");
                break;
            case "fr":
                System.out.println("French");
                break;
            case "de":
                System.out.println("Deutsch");
                break;
            default:
                System.out.println("Language not supported");
        }

    }
}