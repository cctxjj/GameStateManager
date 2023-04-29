public class GameStateManager {

    private GameState gameState;

    public GameStateManager() {
        gameState = GameState.PREGAME;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
