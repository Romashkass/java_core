package org.example.module3._1;

import java.util.Arrays;

public class Module3_1 {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        String base = "Hello, user! How are you?";
        System.out.println(base);

        System.out.println(textEditor.concat(base, "Fine!"));
        System.out.println(textEditor.insert(base, " dear", 6));
        System.out.println(textEditor.remove(base, '!'));
        System.out.println(textEditor.replace(base, "user", "programmer"));

        System.out.println(textEditor.reverse("Hello world!"));
//        System.out.println(textEditor.reverse(textEditor.readFromKeyboard()));
        System.out.println(textEditor.deleteSpaces("Hello, user! How are you? Fine!"));
        System.out.println(textEditor.upperLetters("YoU NEveR Be ALONe"));
        System.out.println(textEditor.evenLetters("ahahahah"));
        System.out.println(Arrays.toString(textEditor.arrayFiller(new String[]{"Spring", "", "", "Winter"})));
        System.out.println(Arrays.toString(textEditor.arrayFiller(new String[]{"Spring", null, null, "Winter"})));
//        System.out.println(Arrays.toString(textEditor.arrayFiller(textEditor.readArrayFromKeyboard())));
        textEditor.what();
    }
}
