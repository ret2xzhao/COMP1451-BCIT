package ca.bcit.comp1451.a00898485;

/**
 *
 * @author Xin Zhao (A00898485) with Pallveen Kaur
 * @version 1.0
 */

public class Test{
    public static void main(String[] args){
        new Test().test();
    }

    public void test() {
        Country Canada = new Country();
        Canada.createHashMap();
        System.out.println("--------------------------------------------------");
        Canada.showAllMappings();
        System.out.println("--------------------------------------------------");
        Canada.showAllMappings2();
        System.out.println("--------------------------------------------------");
        Canada.doesAnyProvinceContain("alberta");
        Canada.doesAnyProvinceContain("british columbia");
        Canada.doesAnyProvinceContain(" brunswick");
        Canada.doesAnyProvinceContain("scotia");
        Canada.doesAnyProvinceContain("");
        Canada.doesAnyProvinceContain(" ");
        Canada.doesAnyProvinceContain("ck");
        Canada.doesAnyProvinceContain("Arizona");
        Canada.doesAnyProvinceContain("Washington");
    }
}