package day13MethotCreation_MethodOverloading;

public class ConcatenationResult {
    private String concatenatedString;
    private int product;

    public ConcatenationResult(String concatenatedString, int product) {
        this.concatenatedString = concatenatedString;
        this.product = product;
    }

    public String getConcatenatedString() {
        return concatenatedString;
    }

    public int getProduct() {
        return product;
    }

    public static ConcatenationResult concatenateStringsAndMultiply(String[] strings, int... numbers) {
        StringBuilder result = new StringBuilder();
        int product = 1;

        for (String str : strings) {
            result.append(str).append(" ");
        }

        for (int num : numbers) {
            product *= num;
        }

        return new ConcatenationResult(result.toString(), product);
    }

    public static void main(String[] args) {
        String[] strings = {"Java,", "toplama", "işlemi,", "Güzel"};
        ConcatenationResult result = concatenateStringsAndMultiply(strings, 2, 3, 4);

        System.out.println("Concatenated String: " + result.getConcatenatedString());
        System.out.println("Product: " + result.getProduct());
    }


}

