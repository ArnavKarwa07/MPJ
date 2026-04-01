package Assignment_3;

class HillstationBase {
    public void famousfood() {
        System.out.println("Famous food: Local cuisine");
    }

    public void famousfor() {
        System.out.println("Famous for: Scenic beauty");
    }
}

class Manali extends HillstationBase {
    @Override
    public void famousfood() {
        System.out.println("Famous food: Siddu");
    }

    @Override
    public void famousfor() {
        System.out.println("Famous for: Snow-covered mountains and adventure sports");
    }
}

class Mussoorie extends HillstationBase {
    @Override
    public void famousfood() {
        System.out.println("Famous food: Aloo ke Gutke");
    }

    @Override
    public void famousfor() {
        System.out.println("Famous for: The Queen of Hills and beautiful viewpoints");
    }
}

class Nainital extends HillstationBase {
    @Override
    public void famousfood() {
        System.out.println("Famous food: Bhatt ki Churkani");
    }

    @Override
    public void famousfor() {
        System.out.println("Famous for: Naini Lake and pleasant weather");
    }
}

public class hillstations {
    public static void main(String[] args) {
        System.out.println("===== METHOD OVERRIDING (RUNTIME POLYMORPHISM) =====\n");

        HillstationBase[] stations = { new Manali(), new Mussoorie(), new Nainital() };
        String[] stationNames = { "Manali", "Mussoorie", "Nainital" };

        for (int i = 0; i < stations.length; i++) {
            HillstationBase station = stations[i]; // Parent class reference
            System.out.println("--- " + stationNames[i] + " ---");
            station.famousfood();
            station.famousfor();
            System.out.println();
        }
    }
}