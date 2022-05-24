package ChapterFive;

import java.util.Scanner;

public class NokiaTwo {

    public static void main(String[] args) {

        homePageMenu();
        mainMenu();

    }

    private static void mainMenu() {
        Scanner input = new Scanner(System.in);
        String list = """
                 Main Menu
                 1. Phonebook
                 2. Messages
                 3. Chat
                 4. Call register
                 5. Tones
                 6. Setting
                 7. Call divert
                 8. Games
                 9. Calculator
                 10.Reminders
                 11.Clock
                 12.Profiles
                 13.Sim services
                 14.Exit
                """;
        System.out.println(list);

        int number = input.nextInt();

        switch (number) {
            case 1 -> PhoneBookMenu(input);
            case 2 -> MessageMenu(input);
            case 3 -> ChatMenu(input);
            case 4 -> CallRegisterMenu(input);
            case 5 -> TonesMenu(input);
            case 6-> SettingsMenu(input);
            case 7-> CallDivertMenu(input);
            case 8-> GamesMenu(input);
            case 9-> CalculatorMenu(input);
            case 10-> RemindersMenu(input);
            case 11-> ClockMenu(input);
            case 12-> ProfilesMenu(input);
            case 13-> SimServicesMenu(input);
            case 14-> Exit();
            default -> homePageMenu();

        }
    }











    private static void Exit() {
        HomePage();
    }

    private static void HomePage() {
        homePageMenu();
    }

    private static void homePageMenu() {
        System.out.println("2:41pm                         15/05/2022");
        System.out.println("                                         ");
        System.out.println("                 Home Page               ");
        System.out.println("                                         ");
        System.out.println("Menu                            Contacts ");
        System.out.println("                                         ");
        System.out.println("1. Menu ");
        System.out.println("2. Contacts");
        Scanner input2 = new Scanner(System.in);
        int userNumber2 = input2.nextInt();
        if (userNumber2 == 1) mainMenu();
        else if (userNumber2 == 2) contactsMenu();
    }

    private static void contactsMenu() {
        System.out.println(" Contacts ");
        System.out.println();
        System.out.println("-Chibuzor");
        System.out.println("  09099987656");
        System.out.println("0. Back");
        Scanner input2 = new Scanner(System.in);
        int userNumber2 = input2.nextInt();
        if (userNumber2 == 0) mainMenu();
    }

    private static void SimServicesMenu(Scanner input) {
        System.out.println("SIM services");
        System.out.println("0.Back");
        int userNumber2 = input.nextInt();
        if (userNumber2 == 0) mainMenu();
    }

    private static void ProfilesMenu(Scanner input) {
        System.out.println("Profiles");
        System.out.println("0.Back");
        int userNumber2 = input.nextInt();
        if (userNumber2 == 0) mainMenu();
    }

    private static void ClockMenu(Scanner input) {
        ClockMenuList(input);
    }

    private static void ClockMenuList(Scanner input) {
        int userNumber;
        System.out.println("Clock");
        String Clock = """
                1.Alarm clock
                2.Clock setting
                3.Date setting
                4.Stopwatch
                5.Countdown timer
                6.Auto update of date and time
                0.Back
                """;
        System.out.println(Clock);
        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("Alarm clock");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) ClockMenuList(input);
            }
            case 2 -> {
                System.out.println("Clock setting");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) ClockMenuList(input);
            }
            case 3 -> {
                System.out.println("Date setting");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) ClockMenuList(input);
            }
            case 4 -> {
                System.out.println("Stopwatch");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) ClockMenuList(input);
            }
            case 5 -> {
                System.out.println("Countdown timer");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) ClockMenuList(input);
            }
            case 6 -> {
                System.out.println("Auto update of date and time");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) ClockMenuList(input);
            }
            case 0-> mainMenu();
            default -> System.out.println("Invalid number");
        }
    }

    private static void RemindersMenu(Scanner input) {
        System.out.println("Reminders");
        System.out.println("0.Back");
        int userNumber2 = input.nextInt();
        if (userNumber2 == 0) mainMenu();
    }

    private static void CalculatorMenu(Scanner input) {
        System.out.println("Calculator");
        System.out.println("0.Back");
        int userNumber2 = input.nextInt();
        if (userNumber2 == 0) mainMenu();
    }

    private static void GamesMenu(Scanner input) {
        System.out.println("Games");
        System.out.println("0.Back");
        int userNumber2 = input.nextInt();
        if (userNumber2 == 0) mainMenu();
    }

    private static void CallDivertMenu(Scanner input) {
        System.out.println("Call divert");
        System.out.println("0.Back");
        int userNumber2 = input.nextInt();
        if (userNumber2 == 0) mainMenu();
        
    }

    private static void SettingsMenu(Scanner input) {
        int userNumber;
        String Setting = """
                Settings Menu
                1.Call setting
                2.Phone setting
                3.Security setting
                4.Restore factory setting
                0.Back
                """;
        System.out.println(Setting);

        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> CallSettingMenu(input);
            case 2 -> PhoneSettingMenu(input);
            case 3 -> SecuritySettingMenu(input);
            case 4 -> RestoreFactorySettingMenu(input);
            case 0 -> mainMenu();
            default -> System.out.println("Invalid number");
        }
    }

    private static void CallSettingMenu(Scanner input) {
        int userNumber;
        System.out.println("Call setting");
        String List = """
                1.Automatic redial
                2.Speed dailling
                3.Call waiting options
                4.Own number sending
                5.Phone line in use
                6.Automatic answer
                0.Back
                """;
        System.out.println(List);

        System.out.println("Enter a number to display option");
        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 ->{
                System.out.println("Automatic redial");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallSettingMenu(input);
            }
            case 2 -> {
                System.out.println("Speed dailling");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallSettingMenu(input);
            }
            case 3 -> {
                System.out.println("Call waiting options");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallSettingMenu(input);
            }
            case 4 -> {
                System.out.println("Own number sending");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallSettingMenu(input);
            }
            case 5 -> {
                System.out.println("Phone line in use");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallSettingMenu(input);
            }
            case 6 -> {
                System.out.println("Automatic answer");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallSettingMenu(input);
            }
            case 0 -> SettingsMenu(input);
            default -> System.out.println("Invalid number");
        }
    }

    private static void PhoneSettingMenu(Scanner input) {
        int userNumber;
        System.out.println("Phone setting");
        String PhoneSetting = """
                1.Language
                2.Cell info display
                3.Welcome note
                4.Network selection
                5.Lights
                6.Confirm SIM service actions
                0.Back
                """;
        System.out.println(PhoneSetting);
        System.out.println("Enter a number to display option");
        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("Language");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneSettingMenu(input);
            }
            case 2 -> {
                System.out.println("Cell info display");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneSettingMenu(input);
            }
            case 3 -> {
                System.out.println("Welcome note");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneSettingMenu(input);
            }
            case 4 -> {
                System.out.println("Network selection");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneSettingMenu(input);
            }
            case 5 -> {
                System.out.println("Lights");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneSettingMenu(input);
            }
            case 6 -> {
                System.out.println("Confirm SIM service actions");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneSettingMenu(input);
            }
            case 0 -> SettingsMenu(input);
            default -> System.out.println("Invalid number");
        }
    }

    private static void RestoreFactorySettingMenu(Scanner input) {
        System.out.println("Restore factory setting");
        System.out.println("0.Back");
        int userNumber2 = input.nextInt();
        if (userNumber2 == 0) SettingsMenu(input);
    }

    private static void SecuritySettingMenu(Scanner input) {
        int userNumber;
        System.out.println("Security setting");
        String SecuritySetting = """
                1.PIN code request
                2.Call barring service
                3.Fixed dialling
                4.Closed user group
                5.Phone security
                6.Change access codes
                0.Back
                """;
        System.out.println(SecuritySetting);

        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("PIN code request");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) SecuritySettingMenu(input);
            }
            case 2 -> {
                System.out.println("Call barring request");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) SecuritySettingMenu(input);
            }
            case 3 -> {
                System.out.println("Fixed dialling");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) SecuritySettingMenu(input);
            }
            case 4 -> {
                System.out.println("Closed user group");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) SecuritySettingMenu(input);
            }
            case 5 -> {
                System.out.println("Phone security");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) SecuritySettingMenu(input);
            }
            case 6 -> {
                System.out.println("Change access codes");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) SecuritySettingMenu(input);
            }
            case 0 -> SettingsMenu(input);
            default -> System.out.println("Invalid number");
        }
    }

    private static void TonesMenu(Scanner input) {
        int userNumber;
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
                0.Back
                """;
        System.out.println(Tones);

        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("Ringing tones");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 2 -> {
                System.out.println("Ringing volume");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 3 -> {
                System.out.println("Incoming call alert");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 4 -> {
                System.out.println("Composer");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 5 -> {
                System.out.println("Message alert tone");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 6 -> {
                System.out.println("Keypad tones");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 7 -> {
                System.out.println("Warning and game tones");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 8 ->{
                System.out.println("Vibrating alert");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 9 -> {
                System.out.println("Screen saver");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) TonesMenu(input);
            }
            case 0 -> mainMenu();
            default -> System.out.println("Invalid number");
        }
    }

    private static void CallRegisterMenu(Scanner input) {
        int userNumber;
        String CallRegister = """
                1.Missed calls
                2.Received calls
                3.Dialed numbers
                4.Erase recent calls
                5.Show call duration
                6.Show call costs
                7.Call cost settings
                8.Prepaid credit
                0.Back
                """;
        System.out.println(CallRegister);

        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("Missed calls");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallRegisterMenu(input);
            }
            case 2 -> {
                System.out.println("Received calls");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallRegisterMenu(input);
            }
            case 3 -> {
                System.out.println("Dialled numbers");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallRegisterMenu(input);
            }
            case 4 -> {
                System.out.println("Erase recent calls");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallRegisterMenu(input);
            }
            case 5 -> CallDurationMenu(input);
            case 6 -> CallCostMenu(input);
            case 7 -> CallCostSettingMenu(input);
            case 8 -> {
                System.out.println("Prepaid credit");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallRegisterMenu(input);
            }
            case 0 -> mainMenu();
            default -> System.out.println("Invalid number");
        }
    }

    private static void CallCostSettingMenu(Scanner input) {
        int userNumber;
        System.out.println("Call cost setting");
        String List = """
                1.Call cost limit
                2.Show costs in
                0. Back
                """;
        System.out.println(List);

        System.out.println("Enter a number to select an option");
        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("Call cost limit");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallCostSettingMenu(input);
            }
            case 2 -> {
                System.out.println("Show costs in");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallCostSettingMenu(input);
            }
            case 0-> CallRegisterMenu(input);
            default -> System.out.println("Invalid number");
        }
    }

    private static void CallCostMenu(Scanner input) {
        int userNumber;
        System.out.println("Show call cost");
        String List = """
                1.Last call costs
                2.All calls' cost
                3.Clear counters
                0.Back
                """;
        System.out.println(List);
        System.out.println("Enter a number to select an option");
        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("Last call costs");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallCostMenu(input);
            }
            case 2 -> {
                System.out.println("All calls' costs");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallCostMenu(input);
            }
            case 3 -> {
                System.out.println("Clear counters");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallCostMenu(input);
            }
            case 0-> CallRegisterMenu(input);
            default -> System.out.println("Invalid number");
        }
    }

    private static void CallDurationMenu(Scanner input) {
        int userNumber;
        System.out.println("Show call duration");
        String List = """
                1.Last call duration
                2.All calls' duration
                3.Received calls' duration
                4.Dialled calls' duration
                5.Clear timers
                0.Back
                """;
        System.out.println(List);

        System.out.println("Enter a number to display option");
        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("Last call duration");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallDurationMenu(input);
            }
            case 2 -> {
                System.out.println("All calls' duration");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallDurationMenu(input);
            }
            case 3 -> {
                System.out.println("Received call duration");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallDurationMenu(input);
            }
            case 4 -> {
                System.out.println("Dialled calls' duration");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallDurationMenu(input);
            }

            case 5 -> {
                System.out.println("Clear timers");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CallDurationMenu(input);
            }
            case 0 -> CallRegisterMenu(input);
            default -> System.out.println("Invalid number");
        }
    }

    private static void ChatMenu(Scanner input) {
        System.out.println("Chat");
        System.out.println("0.Back");
        int userNumber2 = input.nextInt();
        if (userNumber2 == 0) mainMenu();

    }

    private static void MessageMenu(Scanner input) {
        int userNumber;
        String Messages = """
                1.Write messages
                2.Inbox
                3.Outbox
                4.Picture messages
                5.Templates
                6.Simileys
                7.Message settings
                8.Info service
                9.Voice mailbox number
                10.Service command editor
                0. Back
                """;
        System.out.println(Messages);

        userNumber = input.nextInt();

        switch (userNumber) {
            case 1 -> {
                System.out.println("Write messages");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 2 -> {
                System.out.println("Inbox");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 3 -> {
                System.out.println("Outbox");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 4 -> {
                System.out.println("Picture messages");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 5 -> {
                System.out.println("Templates");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 6 -> {
                System.out.println("Simileys");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 7 -> MessageSetting(input);
            case 8 -> {
                System.out.println("Info service");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 9 -> {
                System.out.println("Voice mailbox number");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 10 -> {
                System.out.println("Service command editor");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) MessageMenu(input);
            }
            case 0-> mainMenu();
            default -> System.out.println("Invalid number");
        }
    }

    private static void MessageSetting(Scanner input) {
        int userNumber;
        System.out.println("Message Settings");
        String settings = """
                1.Set 1
                2.Common
                0.Back
                """;
        System.out.println(settings);

        userNumber = input.nextInt();
        switch (userNumber) {
            case 1 -> Set1Menu(input);
            case 2 -> CommonMenu(input);
            case 0-> MessageMenu(input);
            default -> System.out.println("Invalid number");
        }
    }

    private static void Set1Menu(Scanner input) {
        int userNumber;
        System.out.println("Set 1");
        String settings2 = """
                1. Message centre number
                2. Message sent as
                3. Message validity
                0. Back
                """;
        System.out.println(settings2);

        userNumber = input.nextInt();
        switch (userNumber) {
            case 1 -> {
                System.out.println("Message centre number");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) Set1Menu(input);
            }
            case 2 -> {
                System.out.println("Message sent as");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) Set1Menu(input);
            }
            case 3 -> {
                System.out.println("> Message validity");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) Set1Menu(input);
            }
            case 0-> MessageSetting(input);
            default -> System.out.println("Invalid number");

        }
    }

    private static void CommonMenu(Scanner input) {
        int userNumber;
        System.out.println("Common");
        String settings3 = """
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                0. Back
                """;
        System.out.println(settings3);

        userNumber = input.nextInt();
        switch (userNumber) {
            case 1 -> {
                System.out.println("Delivery reports");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CommonMenu(input);
            }
            case 2 -> {
                System.out.println("Reply via same centre");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CommonMenu(input);
            }
            case 3 -> {
                System.out.println("Character support");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) CommonMenu(input);
            }
            case 0-> MessageSetting(input);
            default -> System.out.println("Invalid number");

        }
    }

    private static void PhoneBookMenu(Scanner input) {
        int userNumber;
        String PhoneBook = """
                PhoneBook Menu
                1.Search
                2.Service Nos.
                3.Add name
                4.Erase
                5.Edit
                6.Assign Tone
                7.Send b'card
                8.Options
                9.Speed dials
                10.Voice tags
                0.Back
                """;
        System.out.println(PhoneBook);

        userNumber = input.nextInt();

        switch (userNumber) {

            case 1 -> {
                System.out.println("1.Search");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }

            case 2 -> {
                System.out.println("1.Service Nos.");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }
            case 3 -> {
                System.out.println("1.Add name");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }
            case 4 -> {
                System.out.println("Erase");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }
            case 5 -> {
                System.out.println("Edit");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }
            case 6 -> {
                System.out.println("Assign tone");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }
            case 7 -> {
                System.out.println("Send b'card");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }
            case 8 -> OptionsMenu(input);
            case 9 -> {
                System.out.println("Speed dials");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }
            case 10 -> {
                System.out.println("Voice tags");
                System.out.println("0.Back");
                int userNumber2 = input.nextInt();
                if (userNumber2 == 0) PhoneBookMenu(input);
            }
            case 0 -> mainMenu();
            default -> System.out.println("Invalid number");
        }
    }

    private static void OptionsMenu(Scanner input) {
        System.out.println("Options");
        String options = """
                1. Type of view
                2. Memory status
                0. Back
                """;
        System.out.println(options);

        int userNumber2 = input.nextInt();
        switch (userNumber2) {
            case 1 -> {
                System.out.println("Type of view");
                System.out.println("0.Back");
                int userNumber3 = input.nextInt();
                if (userNumber3 == 0) OptionsMenu(input);
            }
            case 2 -> {
                System.out.println("Memory status");
                System.out.println("0.Back");
                int userNumber3 = input.nextInt();
                if (userNumber3 == 0) OptionsMenu(input);
            }
            case 0 -> PhoneBookMenu(input);
            default -> System.out.println("Invalid number");
        }
    }
}