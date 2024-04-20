package gr.codelearn.rentbnb.service.impl;

import gr.codelearn.rentbnb.domain.Host;
import gr.codelearn.rentbnb.exception.InvalidObjectValuesException;
import gr.codelearn.rentbnb.service.DataRepositoryService;
import gr.codelearn.rentbnb.service.GuestService;
import gr.codelearn.rentbnb.service.HostService;
import org.junit.jupiter.api.*;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A host")
class DataRepositoryServiceImplTest {

 private DataRepositoryService dataRepositoryService;
 private GuestService guestService;
 @BeforeEach
 void beforeEach(){
     this.dataRepositoryService = new DataRepositoryServiceImpl();
    }


//    @Test
//    @DisplayName("successfully adds a correct item")
//    @Tag("development")
//    void addCorrectlyItem() throws InvalidObjectValuesException {
//        DataRepositoryService dataRepositoryService = DataRepositoryService.save(Guest guest);
//        boolean result = DataRepositoryService.register(dataRepositoryService);
//        assertTrue(result);
//    }

//    @Test
//    @DisplayName("does not add with null fields")
//    void doesNotAddItemWithNullFieldsToHost() throws InvalidObjectValuesException {
//        Host host = Host.builder(null, null, null).dateOfBirth(new Date("00/00/0000"))
//                .build();
//        boolean result = hostService.register(host);
//        assertFalse(result);
//    }

//    @Nested
//    @DisplayName(" (when item is incorrect) ")
//    class WhenIncorrect {
//        @Test
//        @DisplayName("does not add with zero quantity")
//        void addCorrectlyItemToHost() throws InvalidObjectValuesException {
//            Host host = Host.builder("test@test.gr", "Dimitra", "Talekoglou").dateOfBirth(new Date("06/08/1955"))
//                    .build();
//            boolean result = hostService.register(host);
//            assertFalse(result);
//        }
//
//        @Test
//        @DisplayName("does not add with null fields")
//        void doesNotAddItemWithNullFieldsToHost() throws InvalidObjectValuesException {
//            Host host = Host.builder(null, null, null).dateOfBirth(new Date("00/00/0000"))
//                    .build();
//            boolean result = hostService.register(host);
//            assertFalse(result);
//        }
//    }
//
//    @Test
//    @DisplayName("does not add when item is null")
//    void doesNotAddNullToHost() {
//        assertThrows(IllegalArgumentException.class, () -> hostService.register(null));
//    }
//
//    @Test
//    @DisplayName("adds and retrieves items in insertion order")
//    void addItemsToCartAndReturnedItemsAreSortedAccordingToInsertionOrder() throws InvalidObjectValuesException {
//        Host host1 = Host.builder("test@test.gr", "Dimitra", "Talekoglou").dateOfBirth(new Date("06/08/1955")).build();
//        Host host2 = Host.builder("test1@test.gr", "Angeliki", "Tale").dateOfBirth(new Date("06/08/1955")).build();
//        hostService.register(host1);
//        hostService.register(host2);
//        assertIterableEquals(List.of(host1, host2), hostService.getHosts(), "Hosts are not in correct order  or not same hosts");
//    }
}


