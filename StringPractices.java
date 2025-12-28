public class StringPractices {
    public static void main(String[] args ) {

        String name = "Rajiv";
        String title = "Ranjan";

        // length()
        System.out.println("Length of name: "+ name.length());
        System.out.println("Length of title: "+ title.length());

        //charAt()
        System.out.println("First character of name: "+ name.charAt(0));
        System.out.println("Second character of title: "+ title.charAt(1));

        //substring()
        System.out.println("Substring of name : "+ name.substring(1 , 4));
        System.out.println("Substring of title: "+ title.substring(0 , 3));

        //equals()
        System.out.println("name equals title: "+ name.equals(title));

        //equqlsIgnoreCase()
        System.out.println("name equalsIgnoreCase title: "+ name.equalsIgnoreCase(title));

        //toUpperCase
        System.out.println("name in uppercase: "+ name.toUpperCase());
        System.out.println("title in upperccase: "+ title.toUpperCase());

        //toLowerCase()
        System.out.println("name in lowercase: "+ name.toLowerCase());
        System.out.println("title in lowercase: "+ title.toLowerCase());

        //trim()
        String newName = " Rajiv ";
        System.out.println("Before trim: '" + newName + "'");
        System.out.println("After trim: '" + newName.trim() + "'");

    }
}