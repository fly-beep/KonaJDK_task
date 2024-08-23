import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<byte[]> memoryHog = new ArrayList<>();
        // 循环 50 次
        // 总垃圾： 50*625 MB ≈ 31.5 GB
        for(int i = 0;i < 50;i++) {
            // 每次产生 10000*1024*64 字节数据 = 625 MB
            for(int j = 0;j < 10000;j++) {
                // 每次新增 64 KB 数据
                memoryHog.add(new byte[1024*64]);
            }
            memoryHog.clear();
        }
    }
}