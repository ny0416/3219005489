package Test;

public class MainTest {

    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TxtIO.readTxt("D:/test/orig.txt");
        str[1] = TxtIO.readTxt("D:/test/orig_0.8_add.txt");
        str[2] = TxtIO.readTxt("D:/test/orig_0.8_del.txt");
        str[3] = TxtIO.readTxt("D:/test/orig_0.8_dis_1.txt");
        str[4] = TxtIO.readTxt("D:/test/orig_0.8_dis_10.txt");
        str[5] = TxtIO.readTxt("D:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = Hamming.getSimilarity(SimHash.getSimHash(str[0]), SimHash.getSimHash(str[i]));
            TxtIO.writeTxt(ans, ansFileName);
        }
    }


    public void origAndOrigTest(){
        String str0 = TxtIO.readTxt("D:/test/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/orig.txt");
        String ansFileName = "D:/test/ansOrigAndOrigTest.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }


    public void origAndAddTest(){
        String str0 = TxtIO.readTxt("D:/test/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/orig_0.8_add.txt");
        String ansFileName = "D:/test/ansOrigAndAddTest.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }


    public void origAndDelTest(){
        String str0 = TxtIO.readTxt("D:/test/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/orig_0.8_del.txt");
        String ansFileName = "D:/test/ansOrigAndDelTest.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }


    public void origAndDis1Test(){
        String str0 = TxtIO.readTxt("D:/test/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/orig_0.8_dis_1.txt");
        String ansFileName = "D:/test/ansOrigAndDis1Test.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }


    public void origAndDis10Test(){
        String str0 = TxtIO.readTxt("D:/test/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/orig_0.8_dis_10.txt");
        String ansFileName = "D:/test/ansOrigAndDis10Test.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TxtIO.readTxt("D:/test/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/ansOrigAndDis15Test.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        TxtIO.writeTxt(ans,ansFileName);
    }

    private static class TxtIO {
        public static String readTxt(String s) {
            return s;
        }

        public static void writeTxt(double ans, String ansFileName) {
        }
    }

    private static class SimHash {
        public static void getSimHash(String s) {
        }
    }
}
