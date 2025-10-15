package Day8;

public class program4 {
    public static void main(String[] args) {

        // check if the character is vowel or consonants
        char ch=  'a';
        String res = isVowelOrConsonants(ch);
        System.out.println(res);
    }

    static String isVowelOrConsonants(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return "Vowel";
        }else{
            return "consonants";
        }
    }
}
