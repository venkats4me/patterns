public class ExcelColumnName {
    public static String getExcelColumnName(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Adjust for 1-based indexing
            sb.insert(0, (char) ('A' + (n % 26)));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getExcelColumnName(15));
    }
}