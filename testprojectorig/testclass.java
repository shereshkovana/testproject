import java.util.*;

public class testclass {
    public static Scanner sc;
    public static String s1 = "нет";
    public static String s2 = "да";
    public static boolean dd = false;
    public static boolean ronherm = false;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Привет, давай окунемся в обыкновенный день Гарри Поттера!");
        while(!dd)
            day();
        sc.close();
    }


    public static void day() {
        String str;
        System.out.println("Проснуться?(да/нет)");
        str = sc.nextLine();
        str = error(str);
        outer:
        if (str.equals(s1)) {
            dead();
            break outer;
        } else if (str.equals(s2)) {
            System.out.println("Сегодня выходной?");
            str = sc.nextLine();
            str = error(str);
            if (str.equals(s2)) {
                saving();
            }
            else if (str.equals(s1)) {
                System.out.println("Нужно идти на учебу?");
                str = sc.nextLine();
                str = error(str);
                if (str.equals(s1)) {
                    saving();
                }
                else if (str.equals(s2)) {
                    System.out.println("Пнуть Рона?");
                    str = sc.nextLine();
                    str = error(str);
                    if (str.equals(s2)) {
                        System.out.println("Потасовка.");
                        minus50();
                    }
                    else if (str.equals(s1)) {
                        System.out.println("Учеба.");
                    }
                    lunch();
                }
            }
        }
    }

    public static void saving() {
        String s;
        sc = new Scanner(System.in);
        System.out.println("Спасать мир?");
        s = sc.nextLine();
        s = error(s);
        if (s.equals(s1)) {
            lunch();
        } else if (s.equals(s2)) {
            System.out.println("Волан-де-Морт жив?");
            s = sc.nextLine();
            s = error(s);
            if (s.equals(s1)) {
                 disappointing();
            }
            else if (s.equals(s2)) {
                System.out.println("Сесть и ждать опасность.");
                System.out.println("Опасность пришла?");
                s = sc.nextLine();
                s = error(s);
                if (s.equals(s1)) {
                    disappointing();
                }
                else if (s.equals(s2)) {
                    System.out.println("Навалять Волан-де-Морту.");
                    System.out.println("Я жив?");
                    s = sc.nextLine();
                    s = error(s);
                    if (s.equals(s1)) {
                        dead();
                    }
                    else if (s.equals(s2)) {
                        System.out.println("Выслушать похвалу от Дамблдора.");
                        banquet();
                        sleeping();
                    }
                }
            }
        }
    }

    public static void dead() {
        System.out.println("Я умер.");
        dd = true;
    }

    public static void disappointing() {
        System.out.println("Разочароваться.");
        sleeping();
    }

    public static void lunch() {
        String s;
        sc = new Scanner(System.in);
        System.out.println("Обед.");
        System.out.println("Пойти в Запретный лес?");
        s = sc.nextLine();
        s = error(s);
        if (s.equals(s2)) {
            System.out.println("Я жив?");
            s = sc.nextLine();
            s = error(s);
            if (s.equals(s1)) {
                dead();
            }
            else if (s.equals(s2)) {
                hagrid();
            }
        }
        else if (s.equals(s1)) {
            System.out.println("Сыграть в квиддич?");
            s = sc.nextLine();
            s = error(s);
            if (s.equals(s2)) {
                quidditch();
            }
            else if (s.equals(s1)) {
                hagrid();
            }
        }
    }

    public static void sleeping() {System.out.println("Лечь спать.");}

    public static void minus50() {System.out.println("Минус 50 очков Гриффиндору!");}

    public static void hagrid() {
        String s;// = "";
        System.out.println("Идти к Хагриду.\nВернуться в Замок.");
        System.out.println("Напороться на Снегга?");
        s = sc.nextLine();
        s = error(s);
        if (s.equals(s1)) {
            sleeping();
        }
        else if (s.equals(s2)) {
            minus50();
            sleeping();
        }
    }

    public static void quidditch() {
        String s;// = "";
        System.out.println("Сбить Малфоя?");
        s = sc.nextLine();
        s = error(s);
        if (s.equals(s2)) {
            System.out.println("Радоваться. \nПобеда!");
            banquet();
            sleeping();
        }
        else if (s.equals(s1)) {
            System.out.println("Упасть с метлы.");
            hospital();
        }
    }

    public static void hospital() {
        String s; //= "";
        String ron = "Рон";
        String herm = "Гермиона";
        System.out.println("Посетить Больничное Крыло?");
        s = sc.nextLine();
        s = error(s);
        if (s.equals(s2)) {
            System.out.println("Отдать Добби носок.");
            sleeping();
        }
        else if (s.equals(s1)) {
            System.out.println("Попросить помощи?(Рон/Гермиона)");
            ronherm = true;
            s = sc.nextLine();
            s = error(s);
            ronherm = false;
            if (s.equals(herm)) {
                sleeping();
            }
            else if (s.equals(ron)) {
                System.out.println("Ох и Рон, снова нужна помощь.");
                hospital();
            }
        }
    }

    public static void banquet() {System.out.println("Пир в Большом зале.");}

    public static String error(String line) {
        if (!ronherm) {
            boolean bool1 = line.equals("да");
            boolean bool2 = line.equals("нет");
            while (!bool1 & !bool2) {
                //System.out.println(bool1 + " " + bool2);
                System.out.println("Некорректный ввод!");
                line = sc.nextLine();
                bool1 = line.equals("да");
                bool2 = line.equals("нет");
            }
            return line;
        }
        else {
            boolean bool1 = line.equals("Рон");
            boolean bool2 = line.equals("Гермиона");
            while (!bool1 & !bool2) {
                //System.out.println(bool1 + " " + bool2);
                System.out.println("Некорректный ввод!");
                line = sc.nextLine();
                bool1 = line.equals("Рон");
                bool2 = line.equals("Гермиона");
            }
            return line;
        }
    }
}