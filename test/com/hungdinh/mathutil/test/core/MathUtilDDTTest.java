package com.hungdinh.mathutil.test.core;

import com.hungdinh.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//câu lệnh này là của JUnit báo hiệu rằng sẽ cần loop qua tập data để lấy
//cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected|Input
    @Parameterized.Parameters   ///JUnit sẽ ngầm chạy loop qua từng dòng của mảng
    //để lấy ra đc cặp data input/expected
    //Tên hàm ko quan trọng quan trọng là @
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {6, 720},
        };
    }
    //giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột 
    //vào biến tương ứng input, expected để lát hồi feed cho hàm

    @Parameterized.Parameter(value = 0)
    public int n; //biến mapping với value của cột 0 của mảng

    @Parameterized.Parameter(value = 1)
    public long expected; //biến mapping với value của cột 0 của mảng 
                          //kiểu long vì giá trị trả về của hàm getF() là long

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
    //Clean and Built nghĩa là người kiến sẽ đc gọi để biên dịch và đóng gói lại thành file .jar (Bất chấp code đỏ hay k đỏ)
}
