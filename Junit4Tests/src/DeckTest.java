import com.company.Card;
import com.company.Deck;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeckTest {
    Deck deck = null;
    @Before
    public void setUp(){
        deck = new Deck(1);
    }
    @After
    public void tearDown(){
        deck = null;
    }
    @Test
    public void testGetFirstCard(){
        assertEquals(deck.getFirstCard(), new Card(2,0));
    }
    @Test
    public void testGetAllCards(){
        assertEquals(deck.getAllCards().toString(), "[Card{cardFigure=Two, Suit=Spade}, Card{cardFigure=Two, Suit=Heart}, Card{cardFigure=Two, Suit=Diamond}, Card{cardFigure=Two, Suit=Club}, Card{cardFigure=Three, Suit=Spade}, Card{cardFigure=Three, Suit=Heart}, Card{cardFigure=Three, Suit=Diamond}, Card{cardFigure=Three, Suit=Club}, Card{cardFigure=Four, Suit=Spade}, Card{cardFigure=Four, Suit=Heart}, Card{cardFigure=Four, Suit=Diamond}, Card{cardFigure=Four, Suit=Club}, Card{cardFigure=Five, Suit=Spade}, Card{cardFigure=Five, Suit=Heart}, Card{cardFigure=Five, Suit=Diamond}, Card{cardFigure=Five, Suit=Club}, Card{cardFigure=Six, Suit=Spade}, Card{cardFigure=Six, Suit=Heart}, Card{cardFigure=Six, Suit=Diamond}, Card{cardFigure=Six, Suit=Club}, Card{cardFigure=Seven, Suit=Spade}, Card{cardFigure=Seven, Suit=Heart}, Card{cardFigure=Seven, Suit=Diamond}, Card{cardFigure=Seven, Suit=Club}, Card{cardFigure=Eight, Suit=Spade}, Card{cardFigure=Eight, Suit=Heart}, Card{cardFigure=Eight, Suit=Diamond}, Card{cardFigure=Eight, Suit=Club}, Card{cardFigure=Nine, Suit=Spade}, Card{cardFigure=Nine, Suit=Heart}, Card{cardFigure=Nine, Suit=Diamond}, Card{cardFigure=Nine, Suit=Club}, Card{cardFigure=Ten, Suit=Spade}, Card{cardFigure=Ten, Suit=Heart}, Card{cardFigure=Ten, Suit=Diamond}, Card{cardFigure=Ten, Suit=Club}, Card{cardFigure=Jack, Suit=Spade}, Card{cardFigure=Jack, Suit=Heart}, Card{cardFigure=Jack, Suit=Diamond}, Card{cardFigure=Jack, Suit=Club}, Card{cardFigure=Queen, Suit=Spade}, Card{cardFigure=Queen, Suit=Heart}, Card{cardFigure=Queen, Suit=Diamond}, Card{cardFigure=Queen, Suit=Club}, Card{cardFigure=King, Suit=Spade}, Card{cardFigure=King, Suit=Heart}, Card{cardFigure=King, Suit=Diamond}, Card{cardFigure=King, Suit=Club}, Card{cardFigure=Joker, Suit=Black}]");
    }
    @Ignore
    @Test(timeout = 200)
    public void testSortCards(){
        deck.shuffleCards();
        deck.sortCards();
        assertEquals(deck.getAllCards().toString(), "[Card{cardFigure=Two, Suit=Spade}, Card{cardFigure=Two, Suit=Heart}, Card{cardFigure=Two, Suit=Diamond}, Card{cardFigure=Two, Suit=Club}, Card{cardFigure=Three, Suit=Spade}, Card{cardFigure=Three, Suit=Heart}, Card{cardFigure=Three, Suit=Diamond}, Card{cardFigure=Three, Suit=Club}, Card{cardFigure=Four, Suit=Spade}, Card{cardFigure=Four, Suit=Heart}, Card{cardFigure=Four, Suit=Diamond}, Card{cardFigure=Four, Suit=Club}, Card{cardFigure=Five, Suit=Spade}, Card{cardFigure=Five, Suit=Heart}, Card{cardFigure=Five, Suit=Diamond}, Card{cardFigure=Five, Suit=Club}, Card{cardFigure=Six, Suit=Spade}, Card{cardFigure=Six, Suit=Heart}, Card{cardFigure=Six, Suit=Diamond}, Card{cardFigure=Six, Suit=Club}, Card{cardFigure=Seven, Suit=Spade}, Card{cardFigure=Seven, Suit=Heart}, Card{cardFigure=Seven, Suit=Diamond}, Card{cardFigure=Seven, Suit=Club}, Card{cardFigure=Eight, Suit=Spade}, Card{cardFigure=Eight, Suit=Heart}, Card{cardFigure=Eight, Suit=Diamond}, Card{cardFigure=Eight, Suit=Club}, Card{cardFigure=Nine, Suit=Spade}, Card{cardFigure=Nine, Suit=Heart}, Card{cardFigure=Nine, Suit=Diamond}, Card{cardFigure=Nine, Suit=Club}, Card{cardFigure=Ten, Suit=Spade}, Card{cardFigure=Ten, Suit=Heart}, Card{cardFigure=Ten, Suit=Diamond}, Card{cardFigure=Ten, Suit=Club}, Card{cardFigure=Jack, Suit=Spade}, Card{cardFigure=Jack, Suit=Heart}, Card{cardFigure=Jack, Suit=Diamond}, Card{cardFigure=Jack, Suit=Club}, Card{cardFigure=Queen, Suit=Spade}, Card{cardFigure=Queen, Suit=Heart}, Card{cardFigure=Queen, Suit=Diamond}, Card{cardFigure=Queen, Suit=Club}, Card{cardFigure=King, Suit=Spade}, Card{cardFigure=King, Suit=Heart}, Card{cardFigure=King, Suit=Diamond}, Card{cardFigure=King, Suit=Club}, Card{cardFigure=Joker, Suit=Black}]");
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testException(){
        List a = new ArrayList();
        a.get(-1);
    }

}