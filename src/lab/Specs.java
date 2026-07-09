package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้


    /**
     * loopเพื่อหาตำแหน่งarrayที่ตรงกันกับkey
     * @param array ตัวเลข, key ตำแหน่ง, array ต้องไม่เป็น null     
     * @return ตำแหน่งarrayที่พบ
     * @throws IllegalArgumentException ถ้า arr เป็น null
     * 
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * 
     * @param radius รัศมี, ต้องมากกว่า 0
     * @return พื้นที่วงกลม
     * @throws IllegalArgumentException ถ้า radius น้อยกว่า 0
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)

    /**
     * ตัดช่องว่างหน้าหลังแล้วเปลี่ยนเป็นตัวพิมพ์เล็ก
     * @param s ข้อความ, ถ้าไม่มีตัวอักษร เป็น null
     * @return ข้อความที่ถูกตัดช่องว่างและแปลงเป็นตัวพิมพ์เล็ก
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
