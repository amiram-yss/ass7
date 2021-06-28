public class Test1 {
    public static void main(String[] args) {
        HypernymCollection hc = new HypernymCollection();
        hc.insertHypernym("Charlie");
        hc.insertHypernym("Benjamin");
        hc.insertHypernym("Amiram");
        hc.getHypernymByKey("Amiram").addHyponym("Hatich");
        hc.getHypernymByKey("Amiram").addHyponym("Yafe");
        hc.getHypernymByKey("Amiram").addHyponym("Madhim");
        hc.getHypernymByKey("Amiram").addHyponym("Yafe");
        hc.getHypernymByKey("Amiram").addHyponym("Yafe");
        hc.getHypernymByKey("Amiram").addHyponym("Madhim");
        hc.getHypernymByKey("Benjamin").addHyponym("Child");
        hc.getHypernymByKey("Benjamin").addHyponym("UGLY");
        hc.getHypernymByKey("Benjamin").addHyponym("beautiful");
        hc.getHypernymByKey("Benjamin").addHyponym("king");
        hc.getHypernymByKey("Benjamin").addHyponym("Child");
        hc.getHypernymByKey("Benjamin").addHyponym("Child");
        hc.getHypernymByKey("Benjamin").addHyponym("Stupid");
        hc.getHypernymByKey("Benjamin").addHyponym("Child");
        hc.getHypernymByKey("Benjamin").addHyponym("Stupid");
        System.out.println(hc);
        System.out.println(FileManager.isRoute("C:\\Users\\amira\\OneDrive - Bar-Ilan University\\לימודים\\תשפא\\ב\\מונחה עצמות\\ass7"));
    }
}
