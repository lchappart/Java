public class Exo1 {
    private class Livre {
        String titre;

        public String getTitle() {
            return titre;
        }

        public void setTitle(String titre) {
            this.titre = titre;
        }
    }
    public static void main(String[] args) throws Exception {
        Exo1 e = new Exo1();
        Livre l = e.new Livre();
        l.setTitle("Le titre du livre");
        System.out.println(l.getTitle());
    }
}
