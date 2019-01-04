import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {


    private static final String CREDIT_CARD_REGEX = "([0-9]{16})";
    ;
    private static final Pattern CREDIT_CARD_PATTERN = Pattern.compile(CREDIT_CARD_REGEX);


    public static void main(String[] args) {


        String regex = "[^xyz]+";
        String reg_num = "\\d{16}";
        String text = "{\n" +
                "  \"payload\": {\n" +
                "    \"order\": {\n" +
                "      \"email\": \"chandra.mohan@kohls.com\",\n" +
                "      \"isBillAddressEqualtoShipAddress\": \"true\",\n" +
                "      \"cartID\": \"4507501\",\n" +
                "      \"shippingMethod\": \"USSTD\",\n" +
                "      \"cartItems\": [\n" +
                "        {\n" +
                "          \"shippingMethod\": \"USSTD\",\n" +
                "          \"skuCode\": \"98441766\",\n" +
                "          \"qty\": \"1\",\n" +
                "          \"cartItemID\": \"5381251\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"billAddress\": {\n" +
                "        \"addr1\": \"1150 Great Mall Dr\",\n" +
                "        \"addr2\": \"null\",\n" +
                "        \"city\": \"Milpitas\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"postalCode\": \"95035\",\n" +
                "        \"firstName\": \"Alice\",\n" +
                "        \"lastName\": \"Brown\",\n" +
                "        \"phoneNumber\": \"1234567890\"\n" +
                "      },\n" +
                "      \"customerName\": {\n" +
                "        \"firstName\": \"FirstName\",\n" +
                "        \"lastName\": \"LastName\"\n" +
                "      },\n" +
                "      \"paymentTypes\": {\n" +
                "        \"creditCards\": [\n" +
                "          {\n" +
                "            \"nameOnCard\": \"Seen Costanza\",\n" +
                "            \"cardNum\": \"6011000990911111\",\n" +
                "            \"type\": \"DISC\",\n" +
                "            \"expDate\": \"12/2021\",\n" +
                "            \"securityCode\": \"345\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";


        String billAddress = "\"billAddress\": {\n" +
                "        \"addr1\": \"1150 Great Mall Dr\",\n" +
                "        \"addr2\": \"null\",\n" +
                "        \"city\": \"Pune\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"postalCode\": \"95035\",\n" +
                "        \"firstName\": \"Alice\",\n" +
                "        \"lastName\": \"Brown\",\n" +
                "        \"phoneNumber\": \"1234567890\"\n" +
                "      },";

        //Pattern pattern = Pattern.compile("(.*)(billAddress)(.*)([:\\s+{])(.*)(addr1)([\"](.*)[\"][\\s*,])(.*)");
        //(.*\s*)("addr2")(.*,)
        Pattern pattern = Pattern.compile("(.*)(\"billAddress\":)(.*\\s*)(\"addr1\":)(.*,)(.*\\s*)(\"addr2\":)(.*,)(.*\\s*)" +
                "(\"city\":)(.*,)(.*\\s*)(\"state\":)(.*,)(.*\\s*)(\"postalCode\":)(.*,)(.*\\s*)(\"firstName\":)(.*,)(.*\\s*)" +
                "(\"lastName\":)(.*,)(.*\\s*)(\"phoneNumber\":)(.*[0-9]*)(.*\\s*)(.*)", Pattern.MULTILINE);

        Matcher billAddressMatcher = pattern.matcher(billAddress);
        System.out.println("Group Count:" + billAddressMatcher.groupCount());
        if (billAddressMatcher.find()) {
            System.out.println("Found value 1: " + billAddressMatcher.group(1));
            System.out.println("Found value 2: " + billAddressMatcher.group(2));
            System.out.println("Found value 3: " + billAddressMatcher.group(3));
            System.out.println("Found value 4: " + billAddressMatcher.group(4));
            System.out.println("Found value 5: " + billAddressMatcher.group(5));
            System.out.println("Found value 6: " + billAddressMatcher.group(6));
            System.out.println("Found value 7: " + billAddressMatcher.group(7));
            System.out.println("Found value 8: " + billAddressMatcher.group(8));
            System.out.println("Found value 9:" + billAddressMatcher.group(9));
            System.out.println("Found value 10:" + billAddressMatcher.group(10));
            System.out.println("Found value 11:" + billAddressMatcher.group(11));
            System.out.println("Found value 12:" + billAddressMatcher.group(12));
            System.out.println("Found value 13:" + billAddressMatcher.group(13));
            System.out.println("Found value 14:" + billAddressMatcher.group(14));
            System.out.println("Found value 15:" + billAddressMatcher.group(15));
            System.out.println("Found value 16:" + billAddressMatcher.group(16));
            System.out.println("Found value 17:" + billAddressMatcher.group(17));
            System.out.println("Found value 18:" + billAddressMatcher.group(18));
            System.out.println("Found value 19:" + billAddressMatcher.group(19));
            System.out.println("Found value 20:" + billAddressMatcher.group(20));
            System.out.println("Found value 21:" + billAddressMatcher.group(21));
            System.out.println("Found value 22:" + billAddressMatcher.group(22));
            System.out.println("Found value 23:" + billAddressMatcher.group(23));
            System.out.println("Found value 24:" + billAddressMatcher.group(24));
            System.out.println("Found value 25:" + billAddressMatcher.group(25));
            System.out.println("Found value 26:" + billAddressMatcher.group(26));
            System.out.println("Found value 27:" + billAddressMatcher.group(27));
            System.out.println("Found value 28:" + billAddressMatcher.group(28));
        } else {
            System.out.println("No match");
        }


    }
}


////        System.out.println(text.matches(reg_num));
////        Pattern pattern = Pattern.compile("(\\w)(\\s+)([\\d+]|[.,])");
////       pattern = "(?i)(<title.*?>)(.+?)";
////        //System.out.println("Removes whitespace between a    456 . word character and     .".replaceAll(pattern, "$1$3"));
////        System.out.println("hello this is first <title> elem and here is 2nd <title> elem".replaceAll(pattern,"$2"));
//
//
//        text="\"addr1\": \"1150 Great Mall Dr\",";
//
//       //
//
//        Pattern pattern = Pattern.compile("(.*)(addr1)(.*)");
//
//
//        //System.out.println(text.replaceAll(pattern,"$1$3"));
