/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void tally_shouldReturnTheNameHasMaxVotes(){
        Library sut = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String result =sut.tally(votes);
        Assertions.assertEquals("Bush",result);

    }




    @Test void dicesRoll(){
        Library sut= new Library();
        int [] result =sut.roll(4);
        for (int i = 0; i < result.length; i++) {
            assertFalse(result[i]<1 || result[i]>6);
        }


    }
    @Test void testContainsDuplicates(){
        Library sut= new Library();
        Integer[] arr={1,2,3,4,5,5};
        boolean isDublicated=sut.containsDuplicates(arr);
        assertTrue(isDublicated);

    }
    @Test void testCalculatingAverages(){
        Library sut= new Library();
        int[] arr={1,2,3,4,5};
        double result=sut.calculatingAverages(arr);
        System.out.println(result);
        Assertions.assertEquals(3.0,result);
    }
    @Test void testTheLowestAverageArr(){
        Library sut= new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int [] expectedValue={63 ,67 ,68 ,69};
        int [] arrWithLowestAvg=sut.theLowestAverageArr(weeklyMonthTemperatures);
        Assertions.assertArrayEquals(expectedValue,arrWithLowestAvg);
    };
}
