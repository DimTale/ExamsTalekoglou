package gr.codelearn.rentbnb.service.impl;

import gr.codelearn.rentbnb.domain.Guest;
import gr.codelearn.rentbnb.exception.InvalidObjectValuesException;
import gr.codelearn.rentbnb.service.DataRepositoryService;
import gr.codelearn.rentbnb.service.GuestService;
import gr.codelearn.rentbnb.service.HostService;
import org.junit.jupiter.api.*;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A Guest")
class GuestServiceImplTest {
 private GuestService guestService;
 private HostService hostService;
 private DataRepositoryService dataRepositoryService;
 @BeforeEach
 void beforeEach(){
     this.guestService = new GuestServiceImpl(dataRepositoryService);
    }


    @Test
    @DisplayName("successfully adds a correct item")
    @Tag("development")
    void addCorrectlyGuest() throws InvalidObjectValuesException {
        Guest guest = Guest.builder("test@test.gr", new Date("06/08/1955")).build();
        boolean result = guestService.register(guest);
        assertTrue(result);
    }



    @Test
    @DisplayName("does not add with null fields")
    void doesNotAddGuestsWithNullFields() throws InvalidObjectValuesException {
        Guest guest = Guest.builder(null, new Date("00/00/0000")).build();
        boolean result = guestService.register(guest);
        assertFalse(result);
    }

    @Nested
    @DisplayName(" (when guest is incorrect) ")
    class WhenIncorrect {
        @Test
        @DisplayName("does not add with zero quantity")
        void doesNotAddItemWithNullFields() throws InvalidObjectValuesException {
            Guest guest =  Guest.builder("test@test.gr", new Date("06/08/1955")).build();
            boolean result = guestService.register(guest);
            assertFalse(result);
        }

        @Test
        @DisplayName("does not add with null fields")
        void doesNotGuestsWithNullFields() throws InvalidObjectValuesException {
            Guest guest =  Guest.builder(null, new Date("00/00/0000")).build();
            boolean result = guestService.register(guest);
            assertFalse(result);
        }
    }

    @Test
    @DisplayName("does not add when guest is null")
    void doesNotAddNullToGuest() {
        assertThrows(IllegalArgumentException.class, () -> guestService.register(null));
    }

    @Test
    @DisplayName("adds and retrieves items in insertion order")
    void addItemsToCartAndReturnedItemsAreSortedAccordingToInsertionOrder() throws InvalidObjectValuesException {
        Guest guest1 =  Guest.builder("test@test.gr", new Date("06/08/1955")).build();
        Guest guest2 =  Guest.builder("test1@test.gr", new Date("07/08/1955")).build();
        guestService.register(guest1);
        guestService.register(guest2);
        assertIterableEquals(List.of(guest1, guest2), guestService.getGuests(), "Guest are not in correct order  or not same Guests");
    }
}


