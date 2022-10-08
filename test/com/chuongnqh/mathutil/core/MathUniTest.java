
package com.chuongnqh.mathutil.core;

import com.minhng.mathutil.core.MathUtil;
import org.junit.Test;



public class MathUniTest {
     // Hàm get (F) được thiết kế về con long nếu n đưa vào 0..20
//     Hàm get(F) được thiết kế NÉM RA EXCEPTION NẾU TA ĐƯA VÀO N < 0 || N > 20
//     tức là nếu gọi là getF(-5) thì CHỖ GỌI SẼ NHẬN VỀ EXCEPTION TÊN LÀ ILLEGALArgumentException 
    @Test (expected = IllegalArgumentException.class)
   public void testFactorialGivenWrongArgumentThrowsException(){
       MathUtil.getFactorial(-5);

   }
}
//             Test case #4: n = 3; 3! expected =6?
// Quy tắc chơi xanh đỏ 
// Xanh : Khi tất cả các test case đều xanh, tức là tất cả 
// EXPECTED PHẢi == ACTUAL 
// Đỏ : Chỉ cần có 1 test case màu đỏ, xem như hoàm toang tạch
//      Chỉ cần 1 expected != actual, xem như bỏ đi hết các test case 
// 1 thằng gây sai cho tất cả 
// Lí do : Hàm đa đúng thì phỉa đúng hết cho các case đã đươc nêu ra 
// chỉ cần 1 sự không == nhau của actual với expected, hàm không 
// ổn định về kết quả trả về = sai 

// Không thể test hết các case (NL2) nhưng đã test case bào thì phải ngon 
// xanh case đổi 
// Nói thêm về màu đỏ :
// Đỏ xảy ra khi: có 1 sư không công bằng nhau của Expected và actual 
// Lí do gì Expected != Aactual 
// có 2 lí do 
// Lí do 1 : Expected đúng , mình tính bên ngoài == tay khi chư acos hàm 
// Actual              sai , tình huống này hàm cùi bắp , bug bug 

// Lí do 2 : Expected sai, vứt luoon test case này đi, anh chàng QC/ DEV bị ngắt
// kì vọng mà sai, HI vọng gì ở Actual 
