import java.util.Scanner;

class Fun {


    static int countWords(String text) {
        if (text.trim().isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    
    static int countLetters(String text) {

        int letterCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }

        return letterCount;
    }

 
    static int countCodeLetters() {

        String codeText = """
        import java.util.Scanner;

        class Fun {
            static int countWords(String text) {
                String[] words = text.trim().split(" \s+");
                return words.length;
            }
        }
        """;

        int letterCount = 0;

        for (int i = 0; i < codeText.length(); i++) {
            char ch = codeText.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }

        return letterCount;
    }

   
    static int countCodeWords() {

        String codeText = """
        import java.util.Scanner;

        class Fun {
            static int countWords(String text) {
                String[] words = text.trim().split("\\\\s+");
                return words.length;
            }
        }
        """;

        return countWords(codeText);
    }

    
    static int countSentences(String text) {
        if (text.trim().isEmpty()) {
            return 0;
        }
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }

    
    static String mostFrequentWord(String text) {

        String[] words = text.trim().split("\\s+");
        int maxCount = 0;
        String mostFrequent = "";

        for (int i = 0; i < words.length; i++) {

            int count = 0;

            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = words[i];
            }
        }

        return mostFrequent;
    }

  
    static String filterNegativeWords(String text) {

        String[] negativeWords = {
            "bad", "poor", "slow", "worst",
            "terrible", "awful", "disappointing",
            "unhappy", "negative", "hate"
        };

        String result = text;

        for (int i = 0; i < negativeWords.length; i++) {
            result = result.replace(negativeWords[i], "***");
        }

        return result;
    }

    
    static boolean containsPromotion(String text) {

        String[] promoWords = {"sale", "discount", "offer", "free"};

        for (int i = 0; i < promoWords.length; i++) {

            if (text.contains(promoWords[i])) {
                return true;
            }
        }

        return false;
    }

    
    static String reverseSentence(String text) {

        String[] words = text.trim().split("\\s+");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed = reversed + words[i] + " ";
        }

        return reversed.trim();
    }
}


public class Experiment42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name- Kanishka, Batch-4, Specialization-Core, SAP-590017366");

        // Code Analysis
        System.out.println("\nTotal Words In Code: " + Fun.countCodeWords());
        System.out.println("Total Letters In Code: " + Fun.countCodeLetters());
        System.out.println();

        // User Input
        System.out.println("Enter feedback:");
        String originalFeedback = sc.nextLine();

        String cleanedFeedback = originalFeedback.toLowerCase();
        cleanedFeedback = cleanedFeedback.replace(".", "");
        cleanedFeedback = cleanedFeedback.replace(",", "");
        cleanedFeedback = cleanedFeedback.replace("!", "");
        cleanedFeedback = cleanedFeedback.replace("?", "");

        System.out.println("\nTotal Words: " + Fun.countWords(cleanedFeedback));
        System.out.println("Total Letters: " + Fun.countLetters(originalFeedback));
        System.out.println("Total Sentences: " + Fun.countSentences(originalFeedback));
        System.out.println("Most Frequent Word: " + Fun.mostFrequentWord(cleanedFeedback));

        String filtered = Fun.filterNegativeWords(cleanedFeedback);
        System.out.println("Filtered Feedback: " + filtered);

        if (Fun.containsPromotion(cleanedFeedback)) {
            System.out.println("Contains Promotion Keyword: Yes");
        } else {
            System.out.println("Contains Promotion Keyword: No");
        }

        System.out.println("Reversed Sentence: " + Fun.reverseSentence(filtered));

        sc.close();
    }
}