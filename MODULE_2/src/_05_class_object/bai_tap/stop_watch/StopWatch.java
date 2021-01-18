package _05_class_object.bai_tap.stop_watch;



public class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {
        }

        public long getStatTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }
        public void star(){
            startTime = System.currentTimeMillis();
        }
        public void stop(){
            endTime = System.currentTimeMillis();
        }
        public long getElapsedTime(){
            return endTime - startTime;
        }
}
