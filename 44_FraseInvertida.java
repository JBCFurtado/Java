public class FraseInvertida {
    public static void main(String[] args) {
String string = "JAVA";
String temp = "";
for (int i = (string.length() - 1); i >= 0; i--) {
temp += string.charAt(i);
}
        System.out.println(temp);
}
}