package Test;

import utils.SimHash;
import utils.TxtIO;

@SuppressWarnings("unused")
public class SimHashTest {

    public void getHashTest(){
        String[] strings = {"余华", "是", "一位", "真正", "的", "作家"};
        for (String string : strings) {
            String stringHash = SimHash.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    public void getSimHashTest(){
        String str0 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String str1 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_add.txt");
        System.out.println(SimHash.getSimHash(str0));
        System.out.println(SimHash.getSimHash(str1));
    }

}
