import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


class BasicTests {

    @Test
    fun testVariableAssignment() {
        val hello = "Hello"
        val world = "World"
        assertEquals("Hello", hello)
        assertEquals("World", world)
    }
}
