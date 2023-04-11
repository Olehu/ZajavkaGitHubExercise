package pl.zajavka.case2;

record Person(String name, String surname) {

    public String whatIsYourJob() {
        return "Sodfsdftware developer!";
    }

    public String whatDoYouLike() {
        return "Strawberries";
    }
}
