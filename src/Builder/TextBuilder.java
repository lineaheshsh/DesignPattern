package Builder;

public class TextBuilder extends Builder{
    private StringBuffer sb = new StringBuffer();
    @Override
    public void makeTitle(String title) {
        sb.append("==============================\n");
        sb.append("[" + title + "]\n");
        sb.append("\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("ㅁ" + str + "ㅁ\n");
        sb.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            sb.append(" ." + items[i] + "\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("==============================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
