public enum GameState {

    PREGAME("Lobby"),
    INGAME("Im Spiel"),
    AFTERGAME("Spiel vorbei");

    private final String translation;

    GameState(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

}
