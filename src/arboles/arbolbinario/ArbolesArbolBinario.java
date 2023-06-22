package arboles.arbolbinario;

import java.util.Scanner;

public class ArbolesArbolBinario {

    public static void main(String[] args) {
        ArbolBinario abo = new ArbolBinario();
        int var;
        int valor;
        Scanner scanf = new Scanner(System.in);
        System.out.println(" Cuantos Datos Insertaras: ");
        int n = scanf.nextInt();
        for (int i = 0; i < n; i++) {
            valor = (int) (Math.random() * 65535 + 1);
            abo.agregar(valor);
            System.out.println((i + 1) + ": " + valor);
        }

        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1.- Altura del arbol");
            System.out.println("2.- Altura Derecho e Izquierda");
            System.out.println("3.- Recorrido en PreOrden");
            System.out.println("4.- Recorrido en InOrden");
            System.out.println("5.- Recorrido en PostOrden");
            System.out.println("0.- Salir");
            var = scanf.nextInt();
            switch (var) {
                case 1:
                    System.out.println("La alturra del arbol es:" + abo.retornarAltura());
                    break;
                case 2:
                    abo.imprimirBalance();
                    break;
                case 3:
                    abo.preOrder();
                    break;
                case 4:
                    abo.inOrder();
                    break;
                case 5:
                    abo.posOrder();
                    break;
            }
        } while (var != 0);

    }

}
