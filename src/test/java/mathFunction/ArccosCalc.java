//package mathFunction;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class ArccosCalcTest {
//
//    private ArccosCalc arccosCalc;
//
//    @BeforeEach
//    void setSinCalc() {
//        arccosCalc = new ArccosCalc();
//    }
//
//    @ParameterizedTest(name = "First test")
//    @ValueSource(doubles = {1.0, 2.0})
//    void calculateSinus(double x) {
//        assertEquals(1.0, arccosCalc.calculateArccos(x));
//    }
//}