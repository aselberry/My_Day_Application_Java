import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;



class MyDay {
    String today;
    public MyDay(String day){
        today = day;
    }
    public void timer_t(int current){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(15);
        num.add(30);
        num.add(50);
        num.add(120);
        

        int countdownMinutes = 0;
        if(current >=0){
            if(current <=num.get(0)){
                System.out.println("You have to stay and wait");
                num.set(0, current);
                countdownMinutes = current;
            }else if(current > num.get(0) && current<=num.get(1)){
                System.out.println("You can go somewhere in the campus and eat/take a nap");
                num.set(1, current);
                countdownMinutes = current;
                
            }else if(current> num.get(1) && current <= num.get(2)){
                System.out.println("You can go home, but make sure that you can be back on time!");
                num.set(2, current);
                countdownMinutes = current;
            }else if(current > num.get(2)){
                System.out.println("You can freely go :) ");
                num.set(3, current);
                countdownMinutes = current;
            }
            
            int minutesLeft = countdownMinutes;
            
            while(minutesLeft > 0){
             System.out.println(minutesLeft + " - minute(s) has left");
             try{
                 Thread.sleep(60000);
             } catch (InterruptedException e){
                 e.printStackTrace();
             }
             minutesLeft --;
            }
            
            System.out.println("Time is up - be on the place right now!");
        }else
        
        System.out.println("You do not have time, you need to stay!");
        
    }

    public void schedule(String today){
        ArrayList<String> date = new ArrayList();
        date.add("monday");
        date.add("tuesday");
        date.add("wednesday");
        date.add("thursday");
        date.add("friday");
        date.add("saturday");
        date.add("sunday");
        today.toLowerCase();
    

        Scanner scanner_d = new Scanner(System.in);
        StringBuilder worksToBeDone = new StringBuilder();
        int i = 1;
        if (!date.contains(today)) {
            System.out.println("Invalid input. Please enter a valid day of the week.");
            return;
        }

        switch(today){
            case "monday":
                System.out.println("LECT Analysis II- 8:00 - 10:00\nLECT Business Fundamentals - 11:00 - 12:00\nPRACT Analysis II 12:00 - 14:00\nTRAIN Learning Methodology - 14:00 - 17:00\nMENT Learning Methodology - 17:00 - 18:00\n\nOther works need to be done: \n");

                System.out.print("Enter a line of text (or 'done' to finish):\n");

                while (true) {
            
                    System.out.print(i + ") ");
                    i++;
                    String line = scanner_d.nextLine();
        
                    // Check if the user wants to exit
                    if (line.equalsIgnoreCase("done")) {
                        break;
                    }
        
                    // Append the line to the StringBuilder
                    worksToBeDone.append(line).append('\n');
                }
                
                System.out.println("\nAlright! Thanks for letting me know. It is the final list of work to be done today: \n");
                System.out.println("LECT Analysis II- 8:00 - 10:00\nLECT Business Fundamentals - 11:00 - 12:00\nPRACT Analysis II 12:00 - 14:00\nTRAIN Learning Methodology - 14:00 - 17:00\nMENT Learning Methodology - 17:00 - 18:00\n\nAdditional work:\n");
                System.out.println(worksToBeDone.toString());
                
            break;
                
            case "tuesday":
                System.out.println("PRACT ADS II- 10:00 - 12:00\nPRACT Basic Math - 12:00 - 14:00\nPRACT Business Fundamentals 14:00 - 16:00\nPRACT Programming - 16:00 - 19:00\n\n\nOther works need to be done: ");

                System.out.print("Enter a line of text (or 'done' to finish):\n");

                while (true) {
            
                    System.out.print(i + ") ");
                    i++;
                    String line = scanner_d.nextLine();
        
                    if (line.equalsIgnoreCase("done")) {
                        break;
                    }
        
                    worksToBeDone.append(line).append('\n');
                }

                System.out.println("\nAlright! Thanks for letting me know. It is the final list of work to be done today: \n");
                System.out.println("PRACT ADS II- 10:00 - 12:00\nPRACT Basic Math - 12:00 - 14:00\nPRACT Business Fundamentals 14:00 - 16:00\nPRACT Programming - 16:00 - 19:00\n\nAdditional work:\n");
                System.out.println(worksToBeDone.toString());

               // worksToBeDone = scanner_d.nextLine();
            break;

            case "wednesday":
                System.out.println("PRACT Functional Programming 12:00 - 14:00\n\n\nOther works need to be done: ");

                System.out.print("Enter a line of text (or 'done' to finish):\n");

                while (true) {
            
                    System.out.print(i + ") ");
                    i++;
                    String line = scanner_d.nextLine();
        
                    // Check if the user wants to exit
                    if (line.equalsIgnoreCase("done")) {
                        break;
                    }
        
                    // Append the line to the StringBuilder
                    worksToBeDone.append(line).append('\n');
                }

                System.out.println("\nAlright! Thanks for letting me know. It is the final list of work to be done today: \n");
                System.out.println("PRACT Functional Programming 12:00 - 14:00\n\nAdditional work:\n");
                System.out.println(worksToBeDone.toString());
                
                //worksToBeDone = scanner_d.nextLine();
            break;

            case "thursday":
                System.out.println("LECT Functional Programming 10:00 - 12:00\nPRACT: Databases II - 12:00 - 14:00\nLECT ADS II - 14:00 - 16:00\nPRACT Computer Systems - 16:00 - 17:30\nLECT Computer Systems - 17:45 - 19:45\n\nOther works need to be done: ");
                
                while (true) {
            
                    System.out.print(i + ") ");
                    i++;
                    String line = scanner_d.nextLine();
        
                    // Check if the user wants to exit
                    if (line.equalsIgnoreCase("done")) {
                        break;
                    }
        
                    // Append the line to the StringBuilder
                    worksToBeDone.append(line).append('\n');
                }

                System.out.println("\nAlright! Thanks for letting me know. It is the final list of work to be done today: \n");
                System.out.println("LECT Functional Programming 10:00 - 12:00\nPRACT: Databases II - 12:00 - 14:00\nLECT ADS II - 14:00 - 16:00\nPRACT Computer Systems - 16:00 - 17:30\nLECT Computer Systems - 17:45 - 19:45\n\nAdditional work:\n");
                System.out.println(worksToBeDone.toString());
                
            break;
            
            case "friday":
                System.out.println("PRACT Basic Math - 8:00 - 10:00\n\n\nOther works need to be done: ");

                while (true) {
            
                    System.out.print(i + ") ");
                    i++;
                    String line = scanner_d.nextLine();
        
                    // Check if the user wants to exit
                    if (line.equalsIgnoreCase("done")) {
                        break;
                    }
        
                    // Append the line to the StringBuilder
                    worksToBeDone.append(line).append('\n');
                }

                System.out.println("\nAlright! Thanks for letting me know. It is the final list of work to be done today: \n");
                System.out.println("PRACT Basic Math - 8:00 - 10:00\n\nAdditional work:\n");
                System.out.println(worksToBeDone.toString());
                
            break;

            default:
                System.out.println("Make sure you correctly put an input! Try it again...");
            break;

        }
          
    }

    public static void openWebPage(String url){
        try{
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Recommendations(String opt){
        switch(opt){
            case "a":   
                openWebPage("https://www.accuweather.com/en/hu/belvaros/187417/weather-forecast/187417?current=true"); 
            break;
            case "b":
                openWebPage("https://www.vogue.com/");
            break;
            case "c":
                openWebPage("https://www.internetsociety.org/blog/"); 
            break;
            default:
                System.err.println("Error: Try again!"); 
        
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHi! Its your personal assistant - how can I help you dear? :) These are the following options: (Press the number of the service you would like to use! \n1) Schedule\n2) Recommendations for the day\n3)Timer\n");

        int option = scanner.nextInt();
        
        while(option != 0){
            switch(option){
                case 1:
                    scanner.nextLine();
                    System.out.println("Hi Asel! I am glad to see you! Are you ready for the day? Give the NAME of the day of the week so I can show you the current schedule and possible slots: ");
                    String scanner_t = scanner.nextLine().toLowerCase();
                    MyDay sched = new MyDay(scanner_t);
                    sched.schedule(scanner_t);
                break;

                case 2:
                    System.out.println("Other services available:\na) See the weather for today\nb) Fashion trends for today\nc) Computer Science News for today");
                    scanner.nextLine();
                    String scanner_r = scanner.nextLine();
                    MyDay day = new MyDay(scanner_r);
                    day.Recommendations(scanner_r);
                break;

                case 3:
                    System.out.println("How many minutes left until your next class/lecture/work/meeting (Please indicate in MINUTES)?");
                    int current_t = scanner.nextInt();
                    MyDay myTimer = new MyDay("Monday"); 
                    myTimer.timer_t(current_t);
                break;

                default: 
                    System.out.println("Are you sure that you chose the option that is available on the list? (Press 'yes' if it is, press 'no' if you need anything else besides the given options!)\n ");
                    String additionalOption = scanner.nextLine();
                        if(additionalOption == "yes"){
                            System.out.println("Other services available:\na) See the weather for today\nb) Fashion trends for today\nc) Computer Science News for today");
                        }else{
                            System.out.println("Please choose the option again: ");
                            System.out.println("(Press the number of the service you would like to use! \n1) Schedule\n2) Recommendations for the day\n3)Timer\n");
                            
                        }
                
                break;    
            }

            System.out.println("Do you need anything else?\n\nHere are avialable options:\n\nPress the number of the service you would like to use! \n1) Schedule\n2) Recommendations for the day\n3)Timer\n\nIf you do not need anything else, press 0! ");
            option = scanner.nextInt();
        }

        
    
        // Close the scanner
        scanner.close(); 
       
        
    }
    
}