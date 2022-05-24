package ChapterFive;

import java.util.Scanner;

public class Nokia {
    /**
     * Display list of menu functions
     * Ask user to input a number to select an option
     * print the menu
     * If the user enters a number that has sub-menus
     * print the sub-menus
     * Ask the user to enter a number
     * print the menu
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = """
                   1 -> For Phonebook
                   2-> For Messages
                   3-> For Chat
                   4-> For Call register
                   5-> For Tones
                   6-> For Setting
                   7-> For Call divert
                   8 -> For Games
                   9-> For Calculator
                   10-> For Reminders
                   11-> For Clock
                   12-> For Profiles
                   13-> For Sim services
                   14-> For exit
                """;
        System.out.println(list);

        System.out.print("Press a number: ");
        int number = input.nextInt();

        switch (number) {
            case 1:
                String PhoneBook = """
                        1-> Search
                        2-> Service Nos.
                        3-> Add name
                        4-> Erase
                        5-> Edit
                        6-> Assign Tone
                        7-> Send b'card
                        8-> Options
                        9-> Speed dials
                        10->Voice tags
                        0-> Back
                        """;
                System.out.println(PhoneBook);

                int userNumber = input.nextInt();

                switch (userNumber) {
                    case 1 -> {
                        System.out.println("1. Search");
                        System.out.println("0. Back");
                        int userNumber2 = input.nextInt();
                        if (userNumber2 == 1) {
                            System.out.println("Search");
                        }
                    }
                    case 2 -> System.out.println("Service Nos.");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        System.out.println("Options");
                        String options = """
                                1. Type of view
                                2. Memory status
                                """;
                        System.out.println(options);

                        int userNumber2 = input.nextInt();
                        switch (userNumber2) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                    default -> System.out.println("Invalid number");
                }
                break;

            case 2:
                String Messages = """
                        1-> Write messages
                        2-> Inbox
                        3-> Outbox
                        4-> Picture messages
                        5-> Templates
                        6-> Simileys
                        7-> Message settings
                        8-> Info service
                        9-> Voice mailbox number
                        10-> Service command editor
                        """;
                System.out.println(Messages);

                userNumber = input.nextInt();

                switch (userNumber) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Simileys");
                    case 7 -> {
                        System.out.println("Message Settings");
                        String settings = """
                                1-> Set 1
                                2-> Common
                                """;
                        System.out.println(settings);

                        userNumber = input.nextInt();
                        switch (userNumber) {
                            case 1 -> {
                                System.out.println("Set 1");
                                String settings2 = """
                                        1-> Message centre number
                                        2-> Message sent as
                                        3-> Message validity
                                        """;
                                System.out.println(settings2);

                                userNumber = input.nextInt();
                                switch (userNumber) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("> Message validity");
                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                String settings3 = """
                                        1-> Delivery reports
                                        2-> Reply via same centre
                                        3-> Character support
                                        """;
                                System.out.println(settings3);

                                userNumber = input.nextInt();
                                switch (userNumber) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                }
                            }
                        }

                    }
                    case 8-> System.out.println("Info service");
                    case 9-> System.out.println("Voice mailbox number");
                    case 10-> System.out.println("Service command editor");
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                String CallRegister = """
                        1-> Missed calls
                        2-> Received calls
                        3-> Dialed numbers
                        4-> Erase recent calls
                        5-> Show call duration
                        6-> Show call costs
                        7-> Clear cost settings
                        8-> Prepaid credit
                        """;
                System.out.println(CallRegister);

                System.out.println("Enter a number to select an option");
                userNumber = input.nextInt();

                switch (userNumber) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent calls");
                    case 5 -> {
                        System.out.println("Show call duration");
                        String List = """
                                1-> Last call duration
                                2-> All calls' duration
                                3-> Received calls' duration
                                4-> Dialled calls' duration
                                5-> Clear timers
                                """;
                        System.out.println(List);

                        System.out.println("Enter a number to display option");
                        userNumber = input.nextInt();

                        switch (userNumber) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Received call duration");
                            case 4 -> System.out.println("Dialled calls' duration");
                            case 5 -> System.out.println("Clear timers");
                        }


                    }
                    case 6 -> {
                        System.out.println("Show call cost");
                        String List = """
                                1-> Last call costs
                                2-> All calls' cost
                                3-> Clear counters
                                """;
                        System.out.println(List);
                        System.out.println("Enter a number to select an option");
                        userNumber = input.nextInt();

                        switch (userNumber) {
                            case 1 -> System.out.println("Last call costs");
                            case 2 -> System.out.println("All calls' costs");
                            case 3 -> System.out.println("Clear counters");
                        }
                    }
                    case 7 -> {
                        System.out.println("Call cost setting");
                        String List = """
                                1-> Call cost limit
                                2-> Show costs in
                                """;
                        System.out.println(List);

                        System.out.println("Enter a number to select an option");
                        userNumber = input.nextInt();

                        switch (userNumber) {
                            case 1 -> System.out.println("Call cost limit");
                            case 2 -> System.out.println("Show costs in");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");
                }
                break;


            case 5:
                String Tones = """
                        1.Ringing tones
                        2.Ringing volume
                        3.Incoming call alert
                        4.Composer
                        5.Message alert tone
                        6.Keypad tones
                        7.Warning and game tones
                        8.Vibrating alert
                        9.Screen saver
                        """;
                System.out.println(Tones);

                userNumber = input.nextInt();

                switch (userNumber) {
                    case 1-> System.out.println("Ringing tones");
                    case 2-> System.out.println("Ringing volume");
                    case 3-> System.out.println("Incoming call alert");
                    case 4-> System.out.println("Composer");
                    case 5-> System.out.println("Message alert tone");
                    case 6-> System.out.println("Keypad tones");
                    case 7-> System.out.println("Warning and game tones");
                    case 8-> System.out.println("Vibrating alert");
                    case 9-> System.out.println("Screen saver");
                }
                break;

            case 6:
                String Setting= """
                        1.Call setting
                        2.Phone setting
                        3.Security setting
                        4.Restore factory setting
                        """;
                System.out.println(Setting);

                userNumber= input.nextInt();

                switch (userNumber) {
                    case 1-> {
                        System.out.println("Call setting");
                        String List = """
                                1.Automatic redial
                                2.Speed dailling
                                3.Call waiting options
                                4.Own number sending
                                5.Phone line in use
                                6.Automatic answer
                                """;
                        System.out.println(List);

                        System.out.println("Enter a number to display option");
                        userNumber = input.nextInt();

                        switch (userNumber) {
                            case 1-> System.out.println("Automatic redial");
                            case 2-> System.out.println("Speed dailling");
                            case 3-> System.out.println("Call waiting options");
                            case 4-> System.out.println("Own number sending");
                            case 5-> System.out.println("Phone line in use");
                            case 6-> System.out.println("Automatic answer");
                        }
                    }
                    case 2-> {
                        System.out.println("Phone setting");
                        String PhoneSetting = """
                                1.Language
                                2.Cell info display
                                3.Welcome note
                                4.Network selection
                                5.Lights
                                6.Confirm SIM service actions
                                """;
                        System.out.println(PhoneSetting);
                        System.out.println("Enter a number to display option");
                        userNumber = input.nextInt();

                        switch (userNumber) {
                            case 1-> System.out.println("Language");
                            case 2-> System.out.println("Cell info display");
                            case 3-> System.out.println("Welcome note");
                            case 4-> System.out.println("Network selection");
                            case 5-> System.out.println("Lights");
                            case 6-> System.out.println("Confirm SIM service actions");
                        }
                    }
                    case 3-> {
                        System.out.println("Security setting");
                        String SecuritySetting = """
                                1.PIN code request
                                2.Call barring service
                                3.Fixed dialling
                                4.Closed user group
                                5.Phone security
                                6.Change access codes
                                """;
                        System.out.println(SecuritySetting);

                        userNumber = input.nextInt();

                        switch (userNumber) {
                            case 1-> System.out.println("PIN code request");
                            case 2-> System.out.println("Call barring request");
                            case 3-> System.out.println("Fixed dialling");
                            case 4-> System.out.println("Closed user group");
                            case 5-> System.out.println("Phone security");
                            case 6-> System.out.println("Change access codes");
                        }
                    }

                    case 4-> System.out.println("Restore factory setting");
                }
                break;

            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11: {
                System.out.println("Clock");
                String Clock = """
                        1.Alarm clock
                        2.Clock setting
                        3.Date setting
                        4.Stopwatch
                        5.Countdown timer
                        6.Auto update of date and time
                        """;
                System.out.println(Clock);
                userNumber = input.nextInt();

                switch (userNumber) {
                    case 1-> System.out.println("Alarm clock");
                    case 2-> System.out.println("Clock setting");
                    case 3-> System.out.println("Date setting");
                    case 4-> System.out.println("Stopwatch");
                    case 5-> System.out.println("Countdown timer");
                    case 6-> System.out.println("Auto update of date and time");
                }
            }
            break;

            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;
            case 14:
                System.out.println("Exit");
        }

    }
}
