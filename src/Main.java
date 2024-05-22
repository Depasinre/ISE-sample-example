import com.numerology.*;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        String[] birthdays;

        // 根据命令行参数决定从文件读取还是从控制台读取输入
        if (args.length > 0 && args[0].equals("file")) {
            try {
                birthdays = InputHandler.getInputFromFile("birthdays.txt");
            } catch (IOException e) {
                System.out.println("Error reading from file. " + e.getMessage());
                return;
            }
        } else {
            birthdays = InputHandler.getInputFromUser();
        }

        // 处理第一个生日
        processBirthday(birthdays[0], "first");
        // 如果有第二个生日，则处理第二个生日
        if (birthdays[1] != null && !birthdays[1].isEmpty()) {
            processBirthday(birthdays[1], "second");
        }
    }

    private static void processBirthday(String birthday, String label) {
        try {
            // 解析日期
            int[] date = DateParser.parseDate(birthday);
            // 计算生命路径数字
            int lifePath = LifePathCalculator.calculateLifePathNumber(date[0], date[1], date[2]);
            // 获取幸运颜色
            String luckyColour = LuckyColourIdentifier.getLuckyColour(lifePath);
            // 获取世代名称
            String generation = GenerationIdentifier.getGeneration(date[0]);

            // 打印结果
            System.out.println("Life Path Number for " + label + " birthday: " + lifePath);
            System.out.println("Lucky Colour for " + label + " birthday: " + luckyColour);
            System.out.println("Generation for " + label + " birthday: " + generation);
            System.out.println("Is Life Path Number a master number: " + (lifePath == 11 || lifePath == 22 || lifePath == 33));
        } catch (ParseException e) {
            System.out.println("Invalid date format for " + label + " birthday. Please try again.");
        }
    }
}
