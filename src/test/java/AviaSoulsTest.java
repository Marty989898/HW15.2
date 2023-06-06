import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AviaSoulsTest {

    @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("UFA", "EKB", 200, 10, 12);
        Ticket ticket2 = new Ticket("UFA", "EKB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "SBP", 200, 10, 16);
        Ticket ticket4 = new Ticket("UFA", "EKB", 400, 7, 7);
        Ticket ticket5 = new Ticket("MSK", "NY", 800, 4, 9);
        Ticket ticket6 = new Ticket("UFA", "EKB", 200, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SBP", 300, 15, 18);
        Ticket ticket8 = new Ticket("UFA", "EKB", 500, 17, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};
        Ticket[] actual = manager.search("UFA","EKB");

        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void testSortOneTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("UFA", "EKB", 200, 10, 12);
        Ticket ticket2 = new Ticket("UFA", "EKB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "SBP", 200, 10, 16);
        Ticket ticket4 = new Ticket("UFA", "EKB", 400, 7, 7);
        Ticket ticket5 = new Ticket("MSK", "NY", 800, 4, 9);
        Ticket ticket6 = new Ticket("UFA", "EKB", 200, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SBP", 300, 15, 18);
        Ticket ticket8 = new Ticket("UFA", "EKB", 500, 17, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.search("MSK","NY");

        Assertions.assertArrayEquals(expected,actual);

    }
    @Test
    public void testSortNoTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("UFA", "EKB", 200, 10, 12);
        Ticket ticket2 = new Ticket("UFA", "EKB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "SBP", 200, 10, 16);
        Ticket ticket4 = new Ticket("UFA", "EKB", 400, 7, 7);
        Ticket ticket5 = new Ticket("MSK", "NY", 800, 4, 9);
        Ticket ticket6 = new Ticket("UFA", "EKB", 200, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SBP", 300, 15, 18);
        Ticket ticket8 = new Ticket("UFA", "EKB", 500, 17, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("LA","NW");

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void testSortTime() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("UFA", "EKB", 200, 10, 12);
        Ticket ticket2 = new Ticket("UFA", "EKB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "SBP", 200, 10, 16);
        Ticket ticket4 = new Ticket("UFA", "EKB", 400, 7, 17);
        Ticket ticket5 = new Ticket("MSK", "NY", 800, 4, 9);
        Ticket ticket6 = new Ticket("UFA", "EKB", 200, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SBP", 300, 15, 18);
        Ticket ticket8 = new Ticket("UFA", "EKB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket8, ticket1, ticket2, ticket6, ticket4};
        Ticket[] actual = manager.search("UFA", "EKB", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortOneTime() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("UFA", "EKB", 200, 10, 12);
        Ticket ticket2 = new Ticket("UFA", "EKB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "SBP", 200, 10, 16);
        Ticket ticket4 = new Ticket("UFA", "EKB", 400, 7, 17);
        Ticket ticket5 = new Ticket("MSK", "NY", 800, 4, 9);
        Ticket ticket6 = new Ticket("UFA", "EKB", 200, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SBP", 300, 15, 18);
        Ticket ticket8 = new Ticket("UFA", "EKB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.search("MSK", "NY", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortNoTime() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("UFA", "EKB", 200, 10, 12);
        Ticket ticket2 = new Ticket("UFA", "EKB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "SBP", 200, 10, 16);
        Ticket ticket4 = new Ticket("UFA", "EKB", 400, 7, 17);
        Ticket ticket5 = new Ticket("MSK", "NY", 800, 4, 9);
        Ticket ticket6 = new Ticket("UFA", "EKB", 200, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SBP", 300, 15, 18);
        Ticket ticket8 = new Ticket("UFA", "EKB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.search("LA","NW", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

}
