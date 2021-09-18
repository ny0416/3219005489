package utils;

@SuppressWarnings("unused")
class HamMingTest {
    public void getHammingDistanceTest() {
        String str0 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String str1 = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig_0.8_add.txt");
        int distance = HamMing.getHamMingDistance(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
    }


    public void getHammingDistanceFailTest() {
        // 测试str0.length()!=str1.length()的情况
        String str0 = "10101010";
        String str1 = "1010101";
        System.out.println(HamMing.getHamMingDistance(str0, str1));
    }

    public void getSimilarityTest() {
        String str0 = TxtIO.readTxt("D:/test/orig.txt");
        String str1 = TxtIO.readTxt("D:/test/orig_0.8_add.txt");
        int distance = HamMingUtils.getHamMingDistance(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        double similarity = HamMing.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        System.out.println("str0和str1的汉明距离: " + distance);
        System.out.println("str0和str1的相似度:" + similarity);
    }

    private static class SimHash {
        public static String getSimHash(String str0) {
            return str0;
        }
    }

    private static class HamMingUtils {
        public static char getHamMingDistance(String simHash, String simHash1) {
            return 0;
        }
    }
}