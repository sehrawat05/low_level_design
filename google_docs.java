
import java.util.ArrayList;

public class google_docs {

    static abstract class DocumentElement {

        public abstract String render();
    }

    static class TextElement extends DocumentElement {

        String text;

        public TextElement(String text) {
            this.text = text;
        }

        @Override
        public String render() {
            return text;
        }
    }

    static class ImageElement extends DocumentElement {

        String imageUrl;

        public ImageElement(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        @Override
        public String render() {
            return "![Image](" + imageUrl + ")";
        }
    }

    static class Document {

        ArrayList<DocumentElement> elements;

        public Document() {
            this.elements = new ArrayList<>();
        }

        public void addElement(DocumentElement element) {
            elements.add(element);
        }

        public String render() {

            StringBuilder result = new StringBuilder();

            for (DocumentElement element : elements) {
                result.append(element.render()).append("\n");
            }

            return result.toString();
        }
    }

    static class Persistence {

        public void save(Document document) {
        }
    }

    static class saveToFile extends Persistence {

        @Override
        public void save(Document document) {
            System.out.println("Saving to file");
        }
    }

    static class saveToDatabase extends Persistence {

        @Override
        public void save(Document document) {
            System.out.println("Saving to database");
        }
    }

    static class DocumentEditor {

        Document document;
        Persistence persistence;
        String renderedDoc;

        public DocumentEditor(Document document, Persistence persistence) {
            this.document = document;
            this.persistence = persistence;
            this.renderedDoc = "";
        }

        public void addText(String text) {
            document.addElement(new TextElement(text));
            renderedDoc = "";
        }

        public void addImage(String path) {
            document.addElement(new ImageElement(path));
            renderedDoc = "";
        }

        public String renderDoc() {

            if (renderedDoc.isEmpty()) {
                renderedDoc = document.render();
            }

            return renderedDoc;
        }

        public void save() {
            persistence.save(document);
        }
    }

    public static void main(String[] args) {

        Document document = new Document();

        Persistence persistence = new saveToFile();

        DocumentEditor editor = new DocumentEditor(document, persistence);

        editor.addText("Hello World");

        editor.addImage("https://www.google.com/image.png");

        System.out.println(editor.renderDoc());

        editor.save();
    }
}
