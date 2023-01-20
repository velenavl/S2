public class S21 {
    static String str1 = "Hello!";
    static String str2 = "!olleH";

    public static void main(String[] args) {
        // 1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        word(str1, str2);
        // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        word(str1, new StringBuilder(str2).reverse().toString());

        System.out.println();
        int a = 3, b = 56;
        System.out.println(compilerMathToStr(a, b, '+'));
        System.out.println(compilerMathToStr(a, b, '-'));
        System.out.println(compilerMathToStr(a, b, '*'));


        System.out.println();
        System.out.println("Примеры с заменой знака '=' на слово 'равно'");
        System.out.println(replacEqual(compilerMathToStr(a, b, '+')));
        System.out.println(nextReplacEquel(compilerMathToStr(a, b, '-')));
        System.out.println();

    }
    public static void word(String str1, String str2) {
        System.out.println(str1.contains(str2));
    }

    // 4. Дано два числа, например 3 и 56,
    // необходимо составить следующие строки:
    // 3 + 56 = 59
    // 3 – 56 = -53
    // 3 * 56 = 168
    // Используем метод StringBuilder.append()..
    public static String compilerMathToStr(int num1, int num2, char sign) {
        StringBuilder mathTask = new StringBuilder();
        mathTask.append(num1).append(" ").append(sign).append(" ").append(num2).append(" = ");
        switch (sign){
            case '+':
                mathTask.append(num1 + num2);
                break;
            case '-':
                mathTask.append(num1 - num2);
                break;
            case '*':
                mathTask.append(num1 * num2);
                break;
        }
        return mathTask.toString();
    }

    //5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
    public static String replacEqual(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.deleteCharAt(index).insert(index, "равно").toString();
    }

    // 6 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    public static String nextReplacEquel(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.replace(index, index + 1, "равно").toString();
    }







//    public static void main(String[] args) {
//
//
//        // 5
//        System.out.println();
//        System.out.println("5-6.\nПримеры с заменой знака '=' на слово");
//        System.out.println(replacEqual(compilerMathToStr(a, b, '+')));
//
//        // 6
//        System.out.println(nextReplacEquel(compilerMathToStr(a, b, '-')));
//        System.out.println();
//    }



}
