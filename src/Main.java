//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello Mentor!");

        Book warUndPice = new Book("Война и Мир", "Лев Толстой", 1863);
        Book zemlianin = new Book("Землянин", "Роман Злотников", 2012);

        System.out.println(warUndPice.toString());
        System.out.println(zemlianin.toString());

    }
}