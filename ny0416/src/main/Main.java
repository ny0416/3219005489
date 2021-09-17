package main;

import utils.HamMing;
import utils.TxtIO;

@SuppressWarnings({"unused", "MismatchedReadAndWriteOfArray", "RedundantSuppression", "ConstantConditions", "AccessStaticViaInstance", "UnnecessarySemicolon"})
public class Main<similarity, resultFileName> {
    private String[] args;
    // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
    String str0;

    {
        assert args != null;
        str0 = TxtIO.readTxt(args[0]);
    }

    String str1 = TxtIO.readTxt(args[1]);
    String resultFileName = args[2];
    // 由字符串得出对应的 simHash值
    String simHash0 = SimHash.getSimHash(str0);
    String simHash1 = SimHash.getSimHash(str1);
    private HamMing Hamming;
    // 由 simHash值求出相似度
    double similarity = Hamming.getSimilarity(simHash0, simHash1);

    private static class SimHash {
        public static String getSimHash(String str0) {
            return str0;
        }
    }
    // 把相似度写入最后的结果文件中
        TxtIO.writeTxt(similarity, resultFileName);
    // 退出程序
        System.exit(0);
}
