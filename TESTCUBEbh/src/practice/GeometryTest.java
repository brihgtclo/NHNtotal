package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GeometryTest {
    @Test
    @DisplayName("정사각형 입력 에러 테스트")
    void squareErrorTest(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Geometry.square(2.0,1.0));
    }
    @Test
    @DisplayName("정사각형 인자 2개 테스트")
    void squareTest(){
        Assertions.assertEquals(4.0, Geometry.square(2.0, 2.0));
        Assertions.assertEquals(16.0, Geometry.square(4.0, 4.0));
        Assertions.assertEquals(81.0, Geometry.square(9.0, 9.0));
        Assertions.assertEquals(25.0, Geometry.square(5.0, 5.0));
        Assertions.assertEquals(36.0, Geometry.square(6.0, 6.0));
    }
    @Test
    @DisplayName("정육면채 테스트")
    void cubeSurfaceAreaTest(){
        Assertions.assertEquals(24.0, Geometry.cubeSurfaceArea(2.0));
    }
    @Test
    @DisplayName("직육면채 테스트")
    void boxTest(){
        Assertions.assertEquals(16.0, Geometry.box(1.0,2.0,2.0));
    }
    @Test 
    @DisplayName("정사각형 인자 1개 테스트")
    void quareTest2(){
        Assertions.assertEquals(4.0, Geometry.square(2.0));
        Assertions.assertEquals(16.0, Geometry.square(4.0));
        Assertions.assertEquals(81.0, Geometry.square(9.0));
        Assertions.assertEquals(25.0, Geometry.square(5.0));
        Assertions.assertEquals(36.0, Geometry.square(6.0));
    }
    @Test
    @DisplayName("직사각형 테스트")
    void rectangleTest(){
        Assertions.assertEquals(16.0, Geometry.rectangle(4.0, 4.0));
        Assertions.assertEquals(16.0, Geometry.rectangle(2.0, 8.0));
        Assertions.assertEquals(26.0, Geometry.rectangle(2.0, 13.0));
        Assertions.assertEquals(6.0, Geometry.rectangle(2.0, 3.0));
        
    }
}
