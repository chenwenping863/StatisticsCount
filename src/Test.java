/**
 * Created by chenwenping on 17/3/5.
 */
public class Test {

    public static void main(String arg[]) {
        String str = "你你好138302ksdskdmks中国啊的是的ksjdjsk8392389232好138302ksdskdmks中国啊的是的ksjdjsk8392389232";
        int chineseCount = 0;
        int englishCount = 0;
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char charTemp = str.charAt(i);
            if ((charTemp >= 'a' && charTemp <= 'z') || (charTemp >= 'A' && charTemp <= 'Z')) {
                englishCount ++;
            } else if (charTemp >= '0' && charTemp <= '9') {
                digitCount ++;
            } else {
                chineseCount ++;
            }
        }

        System.out.print("英文字母个数：" + englishCount + "\n");
        System.out.print("汉字个数：" + chineseCount + "\n");
        System.out.print("数字个数：" + digitCount + "\n");
    }
}
