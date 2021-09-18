package main;

import utils.HamMing;
import utils.SimHash;
import utils.TxtIO;

@SuppressWarnings("unused")
class mainTest {

    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        str[1] = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_add.txt");
        str[2] = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_del.txt");
        str[3] = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_dis_1.txt");
        str[4] = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_dis_10.txt");
        str[5] = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_dis_15.txt");
        String ansFileName = "D:/JAVA/rg/测试文本/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HamMing.getSimilarity(SimHash.getSimHash(str[0]), SimHash.getSimHash(str[i]));
            TxtIO.writeTxt(ans, ansFileName);
        }
    }

    public void origAndOrigTest(){
        String str0 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String str1 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String ansFileName = "D:/JAVA/rg/测试文本/ansOrigAndOrigTest.txt";
        double ans = HamMing.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }

    public void origAndAddTest(){
        String str0 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String str1 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_add.txt");
        String ansFileName = "D:/JAVA/rg/测试文本/ansOrigAndAddTest.txt";
        double ans = HamMing.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }

    public void origAndDelTest(){
        String str0 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String str1 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_del.txt");
        String ansFileName = "D:/JAVA/rg/测试文本/ansOrigAndDelTest.txt";
        double ans = HamMing.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }

    public void origAndDis1Test(){
        String str0 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String str1 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_dis_1.txt");
        String ansFileName = "D:/JAVA/rg/测试文本/ansOrigAndDis1Test.txt";
        double ans = HamMing.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }

    public void origAndDis10Test(){
        String str0 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String str1 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_dis_10.txt");
        String ansFileName = "D:/JAVA/rg/测试文本/ansOrigAndDis10Test.txt";
        double ans = HamMing.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }

    public void origAndDis15Test(){
        String str0 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String str1 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_dis_15.txt");
        String ansFileName = "D:/JAVA/rg/测试文本/ansOrigAndDis15Test.txt";
        double ans = HamMing.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

}