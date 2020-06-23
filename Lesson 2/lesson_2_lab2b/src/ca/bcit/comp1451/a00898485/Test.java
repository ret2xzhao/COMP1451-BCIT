package ca.bcit.comp1451.a00898485;

/**
 * class Test
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Test
{
    public static void main(String[] args)
    {
        new Test().test();
    }

    public void test()
    {
        Game game = new Game();
        game.guessTheDate();
        game.guessTheBirthdateDay();
    }
}