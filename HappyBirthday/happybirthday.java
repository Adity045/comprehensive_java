package HappyBirthday;

// ...existing code...
public class happybirthday {
    public static void main(String[] args) {
        String name = args.length > 0 ? String.join(" ", args) : "Friend";

        String[] card = {
            "  ********************************************",
            "  *                                          *",
            "  *           H A P P Y   B I R T H D A Y    *",
            "  *                                          *",
            "  *             To: " + padRight(name, 25) + " *",
            "  *                                          *",
            "  ********************************************",
            "",
            "        .-''-.",
            "       / .--. \\",
            "      / /    \\ \\",
            "      | |    | |   🎂",
            "      | |.-\"-.| |",
            "     ///'.::::.`\\",
            "    ||| ::/  \\:: ;",
            "    ||; ::\\__/:: ;",
            "     \\\\\\'::::'//",
            "      `=':-..-'`",
            "",
            "  Wishing you a day filled with joy and sweet surprises!",
            ""
        };

        for (String line : card) {
            System.out.println(line);
        }
    }

    private static String padRight(String s, int width) {
        if (s.length() >= width) return s.substring(0, width);
        return s + " ".repeat(width - s.length());
    }
}
// ...existing code...