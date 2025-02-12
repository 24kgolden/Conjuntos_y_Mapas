package org.example;

/*Definición de Conjuntos
📌 Un conjunto (Set) es una colección de elementos únicos, es decir, no permite duplicados.
📌 En Java, los conjuntos están representados por la interfaz Set, con implementaciones como:

1-.HashSet → Basado en hashing, rápido para búsqueda y eliminación.
2-.TreeSet → Basado en un árbol rojo-negro, mantiene los elementos ordenados.
3-.LinkedHashSet → Mantiene el orden de inserción.*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        System.out.println("Conjuntos");
        // Agregar elementos
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");
        conjunto.add("Java"); // No se agregará porque ya existe

        // Imprimir conjunto
        System.out.println(conjunto);

        /*Operaciones Básicas con Conjuntos
📌      Operaciones fundamentales:

         Agregar elementos: add(elemento)
         Eliminar elementos: remove(elemento)
         Verificar existencia: contains(elemento)
         Tamaño del conjunto: size()
         Recorrer elementos: for-each*/
        System.out.println();
        System.out.println("Operacion Basica con Conjutno");
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("¿Contiene el 2? " + numeros.contains(2)); // true
        numeros.remove(2);
        System.out.println("Después de eliminar: " + numeros); // [1, 3]

        /*Operaciones entre Conjuntos
         📌 Operaciones matemáticas con conjuntos

         🔹 Unión (addAll) → Elementos de ambos conjuntos.
         🔹 Intersección (retainAll) → Elementos comunes en ambos.
         🔹 Diferencia (removeAll) → Elementos del primero que no están en el segundo.

       📌 Ejemplo de unión, intersección y diferencia*/
        System.out.println();
        System.out.println("Operaciones entre Conjuntos");
        Set<String> conjuntoA = new HashSet<>();
        Set<String> conjuntoB = new HashSet<>();

        conjuntoA.add("A"); conjuntoA.add("B"); conjuntoA.add("C");
        conjuntoB.add("B"); conjuntoB.add("C"); conjuntoB.add("D");

        // Unión
        Set<String> union = new HashSet<>(conjuntoA);
        union.addAll(conjuntoB);
        System.out.println("Unión: " + union); // [A, B, C, D]

        // Intersección
        Set<String> interseccion = new HashSet<>(conjuntoA);
        interseccion.retainAll(conjuntoB);
        System.out.println("Intersección: " + interseccion); // [B, C]

        // Diferencia
        Set<String> diferencia = new HashSet<>(conjuntoA);
        diferencia.removeAll(conjuntoB);
        System.out.println("Diferencia A - B: " + diferencia); // [A]

        /*Utilidad de los Conjuntos
         📌 Los conjuntos se usan en:
            ✅ Eliminación de duplicados en listas.
            ✅ Operaciones matemáticas de conjuntos (unión, intersección).
            ✅ Validación de elementos únicos (ejemplo: nombres de usuario).*/
        System.out.println();
        System.out.println("Utilidad de los Conjuntos");
        System.out.println("Elimiando Duplicado");
        List<Integer> lista = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> sinDuplicados = new HashSet<>(lista);
        System.out.println("Lista sin duplicados: " + sinDuplicados);


        /*Definición de Mapas
         📌 Un mapa (Map) es una estructura que asocia claves con valores.
         📌 En Java, los mapas están representados por la interfaz Map, con implementaciones como:
             HashMap → No garantiza orden, rápido para búsqueda.
             TreeMap → Ordenado por clave.
             LinkedHashMap → Mantiene el orden de inserción.*/

        //Calve y Valor de un Mapa
        //Un mapa almacena pares clave-valor
        //HashMap
        System.out.println();
        System.out.println("Calve y Valor de un Mapa");
        Map<String, Integer> edades = new HashMap<>();

        // Agregar elementos
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Pedro", 22);

        // Obtener valor por clave
        System.out.println("Edad de Ana: " + edades.get("Ana")); // 30

        //Operaciones con Mapas
        //Operaciones bascias en Map
        //Insertar(put)
        //Obtener(get)
        //Eliminar(remove)
        //Verificar clave (containskey)
        //Verificar valor (containsValue)
        //Recorrer (entrySet)
        System.out.println();
        System.out.println("Operaciones con Mapas");
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);

        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        //Los Mapas como Diccionario
        //Un mapa funciona como un diccionario, almacenando asocioaciones clave-valor
        //Ejemplo: Diccionario de Plabras
        System.out.println();
        System.out.println("Mapas como Diccionario");
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Hola", "Hello");
        diccionario.put("Mundo", "World");
        diccionario.put("Perro", "Dog");

        System.out.println("Traducción de 'Perro': " + diccionario.get("Perro")); // Dog


    }
}
