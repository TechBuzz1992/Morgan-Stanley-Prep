public class EnumsExample {

    enum TrafficSignal {
        RED("STOP"), GREEN("GO");

        private String action;

        private TrafficSignal(String name) {
            this.action = name;
        }

        public String getAction(){
            return this.action;
        }

    }

    public static void main(String[] args) {
        TrafficSignal[] signals = TrafficSignal.values();
        for(TrafficSignal signal: signals){
            System.out.println(signal.getAction()+ " " +signal.name() + " " + signal.ordinal());
        }

        System.out.println(TrafficSignal.valueOf(signals[0].action));

    }

}