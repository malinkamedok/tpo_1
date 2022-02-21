package DomenModel;

public enum Mood {

    RAZDRAZHITELEN("Раздражителен"),
    STALOLUCHSE("Стало лучше"),
    JALOBNOSKRIPNUL("Жалобно скрипнул"),
    BROKEN("Сломался");

    private final String text;

    Mood(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Mood{" +
                "text='" + text + '\'' +
                '}';
    }


}
