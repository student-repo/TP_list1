import com.company.Card;
import junit.framework.TestCase;

public class CardTest extends TestCase {
    public void testTwoSpade(){
        Card card = new Card(2, 0);
        assertEquals(card.toString(), "Card{cardFigure=Two, Suit=Spade}");
    }
    public void testTwoHeart(){
        Card card = new Card(2, 1);
        assertEquals(card.toString(), "Card{cardFigure=Two, Suit=Heart}");
    }
    public void testTwoDiamond(){
        Card card = new Card(2, 2);
        assertEquals(card.toString(), "Card{cardFigure=Two, Suit=Diamond}");
    }
    public void testTwoClub(){
        Card card = new Card(2, 3);
        assertEquals(card.toString(), "Card{cardFigure=Two, Suit=Club}");
    }
    public void testAceSpade(){
        Card card = new Card(14, 0);
        assertEquals(card.toString(), "Card{cardFigure=Ace, Suit=Spade}");
    }
    public void testAceHeart(){
        Card card = new Card(14, 1);
        assertEquals(card.toString(), "Card{cardFigure=Ace, Suit=Heart}");
    }
    public void testAceDiamond(){
        Card card = new Card(14, 2);
        assertEquals(card.toString(), "Card{cardFigure=Ace, Suit=Diamond}");
    }
    public void testAceClub(){
        Card card = new Card(14, 3);
        assertEquals(card.toString(), "Card{cardFigure=Ace, Suit=Club}");
    }
    public void testJokerBlack(){
        Card card = new Card(15, 4);
        assertEquals(card.toString(), "Card{cardFigure=Joker, Suit=Black}");
    }
    public void testJokerRed(){
        Card card = new Card(15, 5);
        assertEquals(card.toString(), "Card{cardFigure=Joker, Suit=Red}");
    }
    public void testJokerBlue(){
        Card card = new Card(15, 6);
        assertEquals(card.toString(), "Card{cardFigure=Joker, Suit=Blue}");
    }
    public void testEquals(){
        Card card = new Card(15, 6);
        assertSame(card.equals(new Card(1, 6)), false);
        assertSame(card.equals(new Card(15, 6)), true);
    }
    public void testGetCardNumber(){
        Card card = new Card(15, 6);
        assertSame(card.getCardNumber(), 15);
    }
    public void testGetSuitNumber(){
        Card card = new Card(15, 6);
        assertSame(card.getSuitNumber(), 6);
    }
    public void testToString(){
        Card card = new Card(15, 6);
        assertEquals(card.toString(), "Card{cardFigure=Joker, Suit=Blue}");
    }
}