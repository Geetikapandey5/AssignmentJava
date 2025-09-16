import java.io.*;
import java.util.*;

public class DocumentSolution {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        Document[] docs = new Document[4];
        
        for(int i = 0; i < 4; i++) {
            int id = Integer.parseInt(s.nextLine());
            String title = s.nextLine();
            String folderName = s.nextLine();
            int pages = Integer.parseInt(s.nextLine());
            docs[i] = new Document(id, title, folderName, pages);
        }

        Document[] result = docsWithOddPages(docs);

        // Simple bubble sort
        for(int i = 0; i < result.length - 1; i++) {
            for(int j = i + 1; j < result.length; j++) {
                if(result[i].getId() > result[j].getId()) {
                    Document temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i].getId() + " " + result[i].getTitle() + " " + result[i].getFolderName() + " " + result[i].getPages());
        }
    }

    public static Document[] docsWithOddPages(Document[] docs) {
        Document[] temp = new Document[docs.length];
        int count = 0;
        for(int i = 0; i < docs.length; i++) {
            if(docs[i].getPages() % 2 != 0) {
                temp[count] = docs[i];
                count++;
            }
        }

        Document[] result = new Document[count];
        for(int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}

class Document {
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getFolderName() {
        return folderName;
    }
    public int getPages() {
        return pages;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
}


