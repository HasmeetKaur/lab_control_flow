import java.util.Scanner;   // ADDED
public class WhatToWear {
        public static void main(String[] args){
                // put code in here
                int temperature;
                String weatherDescription;

                if (temperature <= 20) {
                        if (weatherDescription == "Rainy"){
                                coldRain();
                        }
                        else if (weatherDescription == "Sunny"){
                                coldSun();
                        }
                        else if (weatherDescription == "Cloudy"){
                                coldCloud();
                        }
                }

                if ((temperature > 20) && (temperature <=30)) {
                        if (weatherDescription == "Rainy"){
                                warmRain();
                        }
                        else if (weatherDescription == "Sunny"){
                                warmSun();
                        }
                        else if (weatherDescription == "Cloudy"){
                                warmCloud();
                        }
                }

                if (temperature >= 30) {
                        if (weatherDescription == "Rainy"){
                                hotRain();
                        }
                        else if (weatherDescription == "Sunny"){
                                hotSun();
                        }
                        else if (weatherDescription == "Cloudy"){
                                hotCloud();
                        }
                }
                // input weather details
                Scanner userInput = new Scanner(System.in);
        }
}