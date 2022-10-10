public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox1 = new MagicBox<>(5);
        magicBox1.add("Олеся");
        magicBox1.add("Алексей");
        magicBox1.add("Милина");
        magicBox1.add("Алла");
        magicBox1.add("Илона");
        magicBox1.add("Андрей");

        System.out.println(magicBox1.pick());

        MagicBox<Integer> magicBox2 = new MagicBox<>(5);
        magicBox2.add(50);
        magicBox2.add(13);
        magicBox2.add(21);
        magicBox2.add(5);

        System.out.println(magicBox2.pick());

    }
}

