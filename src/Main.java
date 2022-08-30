import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<String> currentList = new ArrayList<>();

    public static void main(String[] args) {

        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
                case 1:
                    showList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Entre com uma opcao valida");
            }
        }
    }

    public static int menu() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Menu");
        System.out.println("----------------------");
        System.out.println("0. Sair do programa");
        System.out.println("1. Mostrar to-do list");
        System.out.println("2. Adicionar novo item");
        System.out.println("3. Remover item");
        System.out.println();
        System.out.print("Acao escolhida: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void showList() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");


    }

    public static void addItem() {
        System.out.println("Adicionar Item");
        System.out.println("----------------------");
        System.out.print("Enter com o valor: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        showList();
    }

    public static void removeItem() {
        System.out.println("Remover Item");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual valor gostaria de remover?");
        int index = scanner.nextInt();
        if((index-1)<0 || index>currentList.size()) {
            System.out.println("Valor invalido! Porfa for digite um valor entre 1 ate "+currentList.size());
        }else {
            currentList.remove(index-1);
        }
        System.out.println("----------------------");
        showList();


    }
}