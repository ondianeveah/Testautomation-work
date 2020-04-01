package TestAutomation;


public class Strings {


    public static void main(String[] args) {
        countWords("Test automation is awesome");
        reverseString("Hello TAU!!");
        addSpaces("Hey!It'sMeOndia.");
    }

    public static void countWords(String text) {
    }

    public static void reverseString(String text) {
        for(int i = text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder((text)); //allows String to be modified

        for(int i = 0; i < modifiedText.length(); i++){
            if( i!= 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println (modifiedText);
    }

}
