public class Player
{
    String name;
    int score;

    public Player(String name, int score)
    {
        this.name = name;
        this.score = 0;
    }

    private void increaseScore()
    {
        score++;
    }

    private int resetScore()
    {
        score = 0;
        return score;

    }
    public String toString()
    {
        return "Player: " + name + ", has a score of " + score;
    }
}
