import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(classOf[MockitoJUnitRunner.Silent])
class SimpleTest {
  @Test def test1(): Unit = {
    assertEquals(true,true)
  }
}
