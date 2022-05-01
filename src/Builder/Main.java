package Builder;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Dircetor dircetor = new Dircetor(textBuilder);
            dircetor.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Dircetor dircetor = new Dircetor(htmlBuilder);
            dircetor.construct();
            String result = htmlBuilder.getResult();
            System.out.println("filename : " + result);
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage : java Main plain 일반 텍스트로 문서작성");
        System.out.println("Usage : java Main html Html로 문서작성");
    }
}
