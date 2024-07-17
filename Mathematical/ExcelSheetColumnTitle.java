public class ExcelSheetColumnTitle {
        public String convertToTitle(int columnNumber) {
            StringBuilder result = new StringBuilder();
            
            while (columnNumber > 0) {
                columnNumber--;  // Adjust columnNumber to be 0-based
                int remainder = columnNumber % 26;
                result.append((char) (remainder + 'A'));
                columnNumber /= 26;
            }
            
            return result.reverse().toString();
        }
        public static void main(String[] args) {
            ExcelSheetColumnTitle s=new ExcelSheetColumnTitle();
            String str=s.convertToTitle(28);
            System.out.println(str);
        }
    }
    
    

