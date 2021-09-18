package main;

import utils.HamMing;
import utils.SimHash;
import utils.TxtIO;
@SuppressWarnings("MethodNameSameAsClassName")
public class main {

    public static void main(String[] args) {
        // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        String str0 = TxtIO.readTxt(args[0]);
        String str1 = TxtIO.readTxt(args[1]);
        String resultFileName = args[2];
        // 由字符串得出对应的 simHash值
        String simHash0 = SimHash.getSimHash(str0);
        String simHash1 = SimHash.getSimHash(str1);
        // 由 simHash值求出相似度
        double similarity = HamMing.getSimilarity(simHash0, simHash1);
        // 把相似度写入最后的结果文件中
        TxtIO.writeTxt(similarity, resultFileName);
        // 退出程序
        System.exit(0);
    }
}
