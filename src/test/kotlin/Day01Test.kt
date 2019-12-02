import com.kennydemetter.adventofcode.Day01
import junit.framework.TestCase
import org.junit.Test

class Day01Test:TestCase() {

    @Test
    fun testCalculateFuel() {
        assertEquals(2,Day01.calculateFuel(12))
        assertEquals(2,Day01.calculateFuel(14))
        assertEquals(654,Day01.calculateFuel(1969))
        assertEquals(33583,Day01.calculateFuel(100756))
    }

    @Test
    fun testCalcWithAdditionalFuel() {
        assertEquals(12-14,  Day01.calcWithAdditionalFuel(Day01.calculateFuel(14)))
        assertEquals(2929-1969, Day01.calcWithAdditionalFuel(Day01.calculateFuel(1969)))

    }


}