import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class WeatherInfo {
    String date;
    String day;
    String weather;

    WeatherInfo(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        WeatherInfo[] weatherInfoArr = new WeatherInfo[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            String[] data = sc.nextLine().split(" ");

            if(data[2].equals("Rain")){
                WeatherInfo weatherInfo = new WeatherInfo(data[0], data[1], data[2]);
                weatherInfoArr[cnt] = weatherInfo;
                cnt++;
            }
        }

        Arrays.sort(weatherInfoArr, 0, cnt, Comparator.comparing(info -> info.date));

        System.out.print(weatherInfoArr[0].date + " "
                        + weatherInfoArr[0].day + " "
                        + weatherInfoArr[0].weather);

    }
}