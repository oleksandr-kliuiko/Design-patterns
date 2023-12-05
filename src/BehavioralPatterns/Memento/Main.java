package BehavioralPatterns.Memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        History history = new History();

        editor.setContent("12345");
        history.addSnapshot(editor.createSnapshot());

        editor.setContent("54321");
        history.addSnapshot(editor.createSnapshot());
        editor.restoreSnapshot(history.getSnapshot(1));
        System.out.println("Поточний стан редактора: " + editor.getContent());

        editor.restoreSnapshot(history.getSnapshot(0));
        System.out.println("Поточний стан редактора: " + editor.getContent());
    }
}
