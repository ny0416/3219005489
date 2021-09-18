package Test;

import utils.SimHash;

@SuppressWarnings("unused")
public class ShortStringExceptionTest {
    public void shortStringExceptionTest(){
        //测试str.length()<200的情况
        System.out.println(SimHash.getSimHash("一位真正的作家"));
    }
}
