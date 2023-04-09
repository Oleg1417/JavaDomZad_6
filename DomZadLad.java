import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
// ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

// “Введите цифру, соответствующую необходимому критерию:

// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации
// можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class DomZadLad {

  public static void main(String[] args) throws Exception {

    Laptop laptopOne = new Laptop();
    Laptop laptopTwo = new Laptop();
    Laptop laptopThree = new Laptop();

    laptopOne.setLaptop("MSI Stealth 17M");
    laptopOne.setCaseMaterial("Пластик");
    laptopOne.setColor("черный");
    laptopOne.setOperatingSystem("Windows 11 Home");
    laptopOne.setCpu("Intel Core i5");
    laptopOne.setCpuFrequency(1700);
    laptopOne.setDisplayTechnology("IPS");
    laptopOne.setDriveType("SSD");
    laptopOne.setMaxRunTime(8);
    laptopOne.setPowerSupplyPower(180);
    laptopOne.setRam(16);
    laptopOne.setRamFrequency(3200);
    laptopOne.setRamTipe("DDR4");
    laptopOne.setScreenSize(17.3);
    laptopOne.setSsdSize(512);
    laptopOne.setVideoCard("NVIDIA GeForce RTX 3060");
    laptopOne.setVideoMemorySize(6);
    laptopOne.setCost(131490);
    // System.out.println(laptopOne);

    laptopTwo.setLaptop("Huawei MateBook B3");
    laptopTwo.setCaseMaterial("алюминий");
    laptopTwo.setColor("серый");
    laptopTwo.setOperatingSystem("Windows 10 Pro");
    laptopTwo.setCpu("Intel Core i3");
    laptopTwo.setDisplayTechnology("IPS");
    laptopTwo.setDriveType("SSD");
    laptopTwo.setMaxRunTime(8);
    laptopTwo.setRam(8);
    laptopTwo.setRamTipe("DDR4");
    laptopTwo.setScreenSize(15.6);
    laptopTwo.setSsdSize(256);
    laptopTwo.setVideoCard("Intel UHD Graphics 620");
    laptopTwo.setCost(45690);
    // System.out.println(laptopTwo);

    laptopThree.setLaptop("MSI GF63 Thin 11UD");
    laptopThree.setCaseMaterial("алюминий");
    laptopThree.setColor("черный");
    laptopThree.setOperatingSystem("нет");
    laptopThree.setCpu("Intel Core i5");
    laptopThree.setCpuFrequency(2700);
    laptopThree.setDisplayTechnology("IPS");
    laptopThree.setDriveType("SSD");
    laptopThree.setMaxRunTime(7);
    laptopThree.setPowerSupplyPower(120);
    laptopThree.setRam(8);
    laptopThree.setRamFrequency(3200);
    laptopThree.setRamTipe("DDR4");
    laptopThree.setScreenSize(15.6);
    laptopThree.setSsdSize(512);
    laptopThree.setVideoCard("NVIDIA GeForce RTX 3050 Ti");
    laptopThree.setVideoMemorySize(4);
    laptopThree.setCost(84990);
    // System.out.println(laptopThree);

    HashMap<String, String> wishList = new HashMap<String, String>();
    addToWishList(wishList);

    var Laptops = new HashSet<Laptop>(Arrays.asList(laptopOne, laptopTwo, laptopThree));

    String fit = "подходящие ноутбуки:";

    for (var i : Laptops) {
      boolean f = true;
      for (String j : wishList.keySet()) {
        if (j.equalsIgnoreCase("CaseMaterial")) {
          if (!i.getCaseMaterial().equalsIgnoreCase(wishList.get(j))) {
            f = false;
          }
        }
        if (j.equalsIgnoreCase("OperatingSystem")) {
          if (!i.getOperatingSystem().equalsIgnoreCase(wishList.get(j))) {
            f = false;
          }
        }
        if (j.equalsIgnoreCase("Color")) {
          if (!i.getColor().equalsIgnoreCase(wishList.get(j))) {
            f = false;
          }
        }
        if (j.equalsIgnoreCase("Cpu")) {
          if (!i.getCpu().equalsIgnoreCase(wishList.get(j))) {
            f = false;
          }
        }
        if (j.equalsIgnoreCase("Ram")) {
          String s = Integer.toString(i.getRam());
          if (!s.equalsIgnoreCase(wishList.get(j))) {
            f = false;
          }
        }
        if (j.equalsIgnoreCase("SsdSize")) {
          String s = Integer.toString(i.getSsdSize());
          if (!s.equalsIgnoreCase(wishList.get(j))) {
            f = false;
          }
        }
      }
      if (f) {
        fit = fit + "\n" + i.getLaptop();
      }
    }

    if (!fit.equalsIgnoreCase("")) {
      System.out.println(fit);
    } else {
      System.out.println("Ничего не подходит");
    }
  }

  static public void addToWishList(Map<String, String> wishList) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Введите цифру, соответствующую необходимому критерию:\n1: Материал корпуса\n2: Операционная система\n3: Цвет\n4: Процессор\n5: Объем оперативной памяти\n6: Обьем жесткого диска");
    System.out.print("input: ");
    int chat = scanner.nextInt();
    switch (chat) {
      case 1:
        System.out.println("1: Пластик\n2: алюминий");
        chat = scanner.nextInt();
        if (chat == 1) {
          wishList.put("caseMaterial", "Пластик");
        } else {
          wishList.put("caseMaterial", "алюминий");
        }
        break;
      case 2:
        System.out.println("1: Windows 11\n2: Windows 10\n3: нет OS");
        chat = scanner.nextInt();
        if (chat == 1) {
          wishList.put("operatingSystem", "Windows 11 Home");
        } else if (chat == 2) {
          wishList.put("operatingSystem", "Windows 10 Pro");
        } else {
          wishList.put("operatingSystem", "нет OS");
        }
        break;
      case 3:
        System.out.println("1: Черный\n2: Серый");
        chat = scanner.nextInt();
        if (chat == 1) {
          wishList.put("color", "черный");
        } else {
          wishList.put("color", "серый");
        }
        break;
      case 4:
        System.out.println("1: Intel Core i5\n2: Intel Core i3");
        chat = scanner.nextInt();
        if (chat == 1) {
          wishList.put("cpu", "Intel Core i5");
        } else {
          wishList.put("cpu", "Intel Core i3");
        }
        break;
      case 5:
        System.out.println("1: 16 Гб\n2: 8 Гб");
        chat = scanner.nextInt();
        if (chat == 1) {
          wishList.put("ram", "16");
        } else {
          wishList.put("ram", "8");
        }
        break;
      case 6:
        System.out.println("1: 512 Гб\n2: 256 Гб");
        chat = scanner.nextInt();
        if (chat == 1) {
          wishList.put("ssdSize", "512");
        } else {
          wishList.put("ssdSize", "256");
        }
        break;

    }
    for (String i : wishList.keySet()) {
      System.out.println(i + " " + wishList.get(i));
    }
    System.out.println("1: Закончить поиск\n2: Добавить еще фильтр");
    chat = scanner.nextInt();
    if (chat < 2) {
    } else {
      addToWishList(wishList);
    }
    scanner.close();

  }

}
