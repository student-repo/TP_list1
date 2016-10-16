import com.company.Card;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    @Test
    public void evaluatesExpression(){
        Card card = new Card(2, 0);
        assertEquals(card.toString(), "Card{cardFigure=Two, Suit=Spade}");
    }
    @Test
    public void testTwoHeart(){
        Card card = new Card(2, 1);
        assertEquals(card.toString(), "Card{cardFigure=Two, Suit=Heart}");
    }
    @Test
    public void testTwoDiamond(){
        Card card = new Card(2, 2);
        assertEquals(card.toString(), "Card{cardFigure=Two, Suit=Diamond}");
    }
    @Test
    public void testTwoClub(){
        Card card = new Card(2, 3);
        assertEquals(card.toString(), "Card{cardFigure=Two, Suit=Club}");
    }
    @Test
    public void testAceSpade(){
        Card card = new Card(14, 0);
        assertEquals(card.toString(), "Card{cardFigure=Ace, Suit=Spade}");
    }
    @Test
    public void testAceHeart(){
        Card card = new Card(14, 1);
        assertEquals(card.toString(), "Card{cardFigure=Ace, Suit=Heart}");
    }
    @Test
    public void testAceDiamond(){
        Card card = new Card(14, 2);
        assertEquals(card.toString(), "Card{cardFigure=Ace, Suit=Diamond}");
    }
    @Test
    public void testAceClub(){
        Card card = new Card(14, 3);
        assertEquals(card.toString(), "Card{cardFigure=Ace, Suit=Club}");
    }
    @Test
    public void testJokerBlack(){
        Card card = new Card(15, 4);
        assertEquals(card.toString(), "Card{cardFigure=Joker, Suit=Black}");
    }
    @Test
    public void testJokerRed(){
        Card card = new Card(15, 5);
        assertEquals(card.toString(), "Card{cardFigure=Joker, Suit=Red}");
    }
    @Test
    public void testJokerBlue(){
        Card card = new Card(15, 6);
        assertEquals(card.toString(), "Card{cardFigure=Joker, Suit=Blue}");
    }
    @Test
    public void testEquals(){
        Card card = new Card(15, 6);
        assertSame(card.equals(new Card(1, 6)), false);
        assertSame(card.equals(new Card(15, 6)), true);
    }
    @Test
    public void testGetCardNumber(){
        Card card = new Card(15, 6);
        assertSame(card.getCardNumber(), 15);
    }
    @Test
    public void testGetSuitNumber(){
        Card card = new Card(15, 6);
        assertSame(card.getSuitNumber(), 6);
    }
    @Test
    public void testToString(){
        Card card = new Card(15, 6);
        assertEquals(card.toString(), "Card{cardFigure=Joker, Suit=Blue}");
    }
}

