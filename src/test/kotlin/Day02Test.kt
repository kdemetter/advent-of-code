import com.kennydemetter.adventofcode.Day02
import junit.framework.TestCase
import org.junit.Test

class Day02Test : TestCase() {

    @Test
    fun testProcess() {
        assertEquals(arrayListOf(3500, 9, 10, 70, 2, 3, 11, 0, 99, 30, 40, 50),Day02.process(arrayListOf(1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50)))
        assertEquals(arrayListOf(2,0,0,0,99),Day02.process(arrayListOf(1,0,0,0,99)))
        assertEquals(arrayListOf(2,3,0,6,99),Day02.process(arrayListOf(2,3,0,3,99)))
        assertEquals(arrayListOf(2,4,4,5,99,9801),Day02.process(arrayListOf(2,4,4,5,99,0)))
        assertEquals(arrayListOf(30,1,1,4,2,5,6,0,99),Day02.process(arrayListOf(1,1,1,4,99,5,6,0,99)))
    }

}