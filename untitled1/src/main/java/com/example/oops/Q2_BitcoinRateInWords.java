package com.example.oops;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Q2_BitcoinRateInWords {





        // Arrays to store words
        static String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
                "Seventy", "Eighty", "Ninety"};

        /**
         * Function to convert number into words (Indian format)
         */
        public static String numberToWords(int num) {
            if (num == 0) return "Zero";

            return convert(num).trim();
        }

        /**
         * Recursive helper function for conversion
         */
        private static String convert(int num) {
            if (num < 20)
                return units[num];

            else if (num < 100)
                return tens[num / 10] + " " + units[num % 10];

            else if (num < 1000)
                return units[num / 100] + " Hundred " + convert(num % 100);

            else if (num < 100000)
                return convert(num / 1000) + " Thousand " + convert(num % 1000);

            else if (num < 10000000)
                return convert(num / 100000) + " Lakh " + convert(num % 100000);

            else
                return convert(num / 10000000) + " Crore " + convert(num % 10000000);
        }

        public static void main(String[] args) {
            try {
                // Step 1: Create URL object
                URL url = new URL("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd,inr,eur");

                // Step 2: Open connection
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                // Step 3: Read response
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream())
                );

                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Step 4: Convert response to string
                String json = response.toString();

                // Step 5: Extract INR value manually
                // (Simple parsing since structure is fixed)
                int inrIndex = json.indexOf("\"inr\":");
                int start = inrIndex + 6;
                int end = json.indexOf(",", start);

                if (end == -1) {
                    end = json.indexOf("}", start);
                }

                int inrValue = Integer.parseInt(json.substring(start, end));

                // Step 6: Print number
                System.out.println("Bitcoin rate in INR: " + inrValue);

                // Step 7: Convert to words
                String words = numberToWords(inrValue);

                System.out.println("In words:");
                System.out.println(words);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

