package BehavioralPatterns.Memento;

public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(content);
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.content = snapshot.getContent();
    }

}
