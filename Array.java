package src;

public class Array {
    // Essa função remove o ùltimo elemento do array.
    public static String[] removeUltimo(String[] array){
        for (int i = array.length - 1; i >= 0; i--){
            if (array[i] != null){
                array[i] = null ;
                return array;
            }
        }
        System.out.println("Nenhum item foi removido.");
        return array;
    }

    // Essa função remove o primeiro numro do array.
    public static String[] removePrimeiro(String[] array){
        if (array[0] != null){
            array[0] = null;
            for (int i = 1; i < array.length - 1; i++){
                if (array[i] != null){
                    array[i - 1] = array[1];
                }
            }
            return array;
        }
        System.out.println("Nenhum item foi removido.");
        return array;
    }

    // Essa função Remove um elemento do array em uma posição especifica
    public static String[] removeEspecifica(String[] array, int position){
        if (position < 0){
            System.out.println("O indice e menor que 0");
            return array;
        }
        if (position >= array.length){


        }
        if (array[position] != null){
            array[position] = null;
            for (int i = position + 1; i < array.length; i++) {
                if (array[i] != null) {
                    array[position] = array[i];
                    array[i] = null;
                    break;
                }
            }
        }
        System.out.println("Nenhum valor foi removido pois o local ja esta vazio");
        return array;
    }
    public static void main(String[] args){

    }
}
