package homework;

public class TestTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        MyTime t2 = new MyTime(2);
        t2.incrementHour();
        MyTime t3 = new MyTime(21,34);
        t3.incrementMinute();
        MyTime t4 = new MyTime(24, 59, 59);
        t4.incrementSecond();
        MyTime t5 = new MyTime(t4);
        System.out.println("Constructed with:");
        System.out.println("t1: all arguments defaulted");
        System.out.printf("    %s\n", t1.toUniversalString());
        System.out.printf("    %s\n", t1.toString());
        System.out.println("t2: hour specified; minute and second defaulted");
        System.out.printf("    %s\n", t2.toUniversalString());
        System.out.printf("    %s\n", t2.toString());
        System.out.println("t3: hour and minute specified; second defaulted");
        System.out.printf("    %s\n", t3.toUniversalString());
        System.out.printf("    %s\n", t3.toString());
        System.out.println("t4: hour ,minute and second specified");
        System.out.printf("    %s\n", t4.toUniversalString());
        System.out.printf("    %s\n", t4.toString());
        System.out.println("t5: MyTime object t4 specified");
        System.out.printf("    %s\n", t5.toUniversalString());
        System.out.printf("    %s\n", t5.toString());
        MyTime t6 = new MyTime(15, 74, 99);
        System.out.println("t6: invalid values");
        System.out.printf("%s\n", t6.toUniversalString());
    }
}
    class MyTime{
        int hour,minute,second;

        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        public MyTime() {
        }

        public MyTime(int hour) {
            this.hour = hour;
        }

        public MyTime(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        public MyTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            //incrementMinute();
        }
        public MyTime(MyTime t){
            this.hour = t.getHour();
            this.minute = t.getMinute();
            this.second = t.getSecond();
        }

        public String toString(){
            String flag;
            if (hour > 0 && hour < 12) {
                flag = "AM";
            } else if (hour == 24 || hour == 0) {
                hour = 12;
                flag = "AM";
            } else {
                flag = "PM";
                if(hour != 12) {
                    hour %= 12;
                }
            }
            return alignItem(hour) + ":" + alignItem(minute) + ":" + alignItem(second) + " " + flag;
        }
        public String toUniversalString(){
            if (minute>=0 && minute<=59 && second>=0 && second<=59){
                return alignItem(hour)+":"+alignItem(minute)+":"+alignItem(second);
            }
            return "minute must be 0-59 \nsecond must be 0-59";
        }
        public static String alignItem(int i) {
            return String.format("%02d", i);
        }
        public void incrementHour(){
            if (hour == 24){
                hour = 1;
            }
            else {
                hour += 1;
            }
        }
        public void incrementMinute(){
            if (minute == 59){
                minute = 0;
                hour += 1;
                if (hour == 25){
                    hour = 1;
                }
            }
            else {
                minute += 1;
            }
        }
        public void incrementSecond(){
            if (second==59){
                second = 0;
                minute += 1;
                if (minute == 60){
                    minute = 0;
                    hour +=1;
                    if (hour == 25){
                        hour = 1;
                    }
                }
            }
            else {
                second += 1;
            }
        }
    }

