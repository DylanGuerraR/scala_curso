import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatest.matchers.should.Matchers.be

class CalculatorTest extends AnyFlatSpec{
  "El metodo add" should "return the correct sum of two values" in {
    val result = Calculator.add(2,3)
    val expect = 5

    result should be(expect)
  }
}
