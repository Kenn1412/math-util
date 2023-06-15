/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hungdinh.mathutil.main;

import com.hungdinh.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //Ví dụ: -5 coi tính được không 
        // 0 coi tính ra mấy
        //20 coi tính ra mấy
        //21 coi tính ra mấy
        //TEST CASE: Một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng
        //giả lập hành vi xài của ai đó !!!
        
        //TEST CASE: LÀ 1 TÍNH HUỐNG SỬ DỤNG, XÀI APP (HÀM) MÀ NÓ BAO HÀM 
        //INOUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT: ĐẦU RA ỨNG VÓI XỬ LÍ CỦA HÀM, CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG
        //ĐẦU VÀO ĐỂ XỬ LÍ
        //KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KO 
        
        long expected = 120; // tao kì vọng 120 nếu tính 5!
        int n = 5;           //input 
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected" );
        System.out.println("5! = " + actual +" actual");
    }
}
