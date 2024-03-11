package za.com.dvt.oop.inheritence.exercise3;

import za.com.dvt.oop.inheritence.exercise3.hero.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        int level = Integer.parseInt(scanner.nextLine());

        Elf elf = new Elf(userName, level);
        MuseElf museElf = new MuseElf(userName, level);
        Wizard wizard = new Wizard(userName, level);
        DarkWizard darkWizard = new DarkWizard(userName, level);
        SoulMaster soulMaster = new SoulMaster(userName, level);
        Knight knight = new Knight(userName, level);
        DarkKnight darkKnight = new DarkKnight(userName, level);
        BladeKnight bladeKnight = new BladeKnight(userName, level);

        System.out.println(elf.getUserName() + elf.getLevel());
        System.out.println(museElf.getUserName() + museElf.getLevel());
        System.out.println(wizard.getUserName() + wizard.getLevel());
        System.out.println(darkWizard.getUserName() + darkWizard.getLevel());
        System.out.println(soulMaster.getUserName() + soulMaster.getLevel());
        System.out.println(knight.getUserName() + knight.getLevel());
        System.out.println(darkKnight.getUserName() + darkKnight.getLevel());
        System.out.println(bladeKnight.getUserName() + bladeKnight.getLevel());
    }
}
