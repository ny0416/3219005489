package Test;

import utils.TxtIO;

@SuppressWarnings({"unused", "ForLoopReplaceableByForEach"})
public class TxtIOTest {

    public void readTxtTest() {
        // 路径存在，正常读取
        String str = TxtIO.readTxt("D:/JAVA/rg/测试文本/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtIO.writeTxt(elem[i], "D:/JAVA/rg/测试文本/ans.txt");
        }
    }

    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = TxtIO.readTxt("D:/JAVA/rg/测试文本/none.txt");
    }

    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtIO.writeTxt(elem[i], "D:/JAVA/rg/测试文本/ans.txt");
        }
    }
}
