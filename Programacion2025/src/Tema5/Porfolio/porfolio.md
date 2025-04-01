# Mi porfolio de la unidad UT4

## Ejercicio de clases:

1. Introducción a los TAD
2. Colecciones (JCF)
3. Collection
4. Set
5. HashSet
6. LinkedHashSet
7. TreeSet


## TAD COLA

Encolar: Entran los datos desde final a principio y desencola.

## TAD PILA

Apila los datos y los desapila.

## TAD: DEFINICIÓN

Modelo definido para representar tipos abstractos como una pila o un
conjunto → Creamos un nuevo tipo de dato más avanzado

La evolución ha sido:
1. Tipos primitivos
2. Tipos envoltorios (ej. Integer) y objetos (ej. String, arrays,)
3. Tipos definidos por nosotros (ej. clase Persona)
4. TAD (ej. conjunto)

## TAD: CARACTERÍSTICAS

● Se especifican mediante una interfaz

● Se definen mediante la implementación de esas interfaces

● Contienen: datos + operaciones (POO)

## TAD: EJEMPLOS DE USO

● Listas: una colección secuencial de elementos con operaciones como agregar, borrar, recorrer.

● Pilas: un colección de elementos que sigue la propiedad LIFO. Operaciones comunes incluyen push, pop, top.

● Colas: un colección de elementos que sigue la propiedad FIFO . Operaciones comunes incluyen enQueue o
agregarFinal, deQueue o retornarPrimero.

● Conjuntos: implementación de conjuntos con sus operaciones básicas (unión, intersección y diferencia),
operaciones de inserción, borrado, búsqueda...

● Diccionarios: son un conjunto de asociaciones de clave y valor. Sus operaciones comunes son put (colocar), get
(obtener), recorrer, eliminar.

● Grafos: Implementación de grafos; una serie de vértices unidos mediante una serie de arcos o aristas.

## INTERFAZ COLLECTION

Representa una colección de elementos.

Se especializa en varios sub-interfaces según:

| Interfaz   	| Ordenación                	| Duplicación 	| Nulos         	|
|------------	|---------------------------	|-------------	|---------------	|
| Set        	| No (según implementación) 	| No          	| Sí (sólo uno) 	|
| SortedSet  	| Si                        	| No          	| Sí            	|
| List       	| Sí (orden de inserción)   	| Si          	| Sí            	|

## INTERFAZ MAP

Representa un diccionario de datos: clave - valor.

Se especializa en varios sub-interfaces según:

| Interfaz  | Ordenación                                                                                | Duplicados                                               | Nulos                                                                               |
|-----------|-------------------------------------------------------------------------------------------|----------------------------------------------------------|-------------------------------------------------------------------------------------|
| Map       | No garantiza un orden especifico de los elementos                                         | No permite claves duplicadas, pero sí valores duplicados | Depende de la implementación: HashMap permite una clave null, HashTable no.         |
| SortedMap | Ordenas las claves de manera natural (Comparable) o mediante un comparador personalizado. | Idem                                                     | TreeMap (implementación de SortedMap) no permite claves null, pero si valores null. |

## INTERFAZ SET

● Implementa conjuntos de elementos

● Hereda de Collection

● Añade restricciones para que no pueda contener duplicados

● Según la implementación podrá estar o no ordenado

## CLASE HASHSET

● Almacena los elementos en una tabla hash
(usando la clase HashMap)

● Acceso rápido y aleatorio a los elementos

Ejemplo de ejercicio:

        public static void main(String[] args) {

            Set<String> set = new HashSet<>();
            String alumno = "Alumno1";
            String alumno2 = "Alumno2";
            String alumno3 = "Alumno3";
            String[] alumnos = {alumno, alumno2, alumno3};
            set.add(null);
            set.add(alumno);
            set.add(null);
            System.out.println(set);
    
            for (String alum : set) {
                System.out.println(alum);
            }
    
            Iterator<String> it = set.iterator();
            String s;
            while (it.hasNext()) {
                s = it.next();
                System.out.println(s);
                it.remove();
            }
        }

## ITERADORES

Una utilidad para recorrer colecciones:

Ya conocíamos los bucles. Pero hay uno
especialmente útil para las colecciones
for-each

    for(String s : nombre){
        System.out.println(s);
    }

Ahora tenemos un TAD de Java creado para
esta tarea: Iterador

    Iterator<Integer> iterator = conjunto.descendingIterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }

1. La interfaz Iterable provee a todas las colecciones la capacidad de obtener
   un iterador 


2. La interfaz Iterator es el tipo de dato de este iterador, implementado en las
   colecciones. Esta interfaz tiene los métodos necesarios para realizar
   recorridos en las colecciones.

## CLASE LINKEDHASHSET

● Igual que HashSet, almacena elementos en una tabla hash, pero:
● Los elementos se ordenan por orden de inserción.

    Set<String> linkedHashSet = new LinkedHashSet<>();

## HASHSET VS LINKEDHASHSET

En el Hashset realiza de manera no ordenada ya que conforme se van añadiendo se van colocando mediante 
una referencia mientras que el LinkedHashSet conforme lo vas añadiendo se va colocando.

## CLASE TREESET

● Utiliza estructura de árbol binario

● Elementos ordenados de forma ascendente según sus valores

● Es más lenta que HashSet, pero ofrece más funcionalidades

● No admite nulos

    TreeSet<Integer> treeSet = new TreeSet<>();

Ahora usamos la implementación en lugar de la interfaz para acceder a los métodos
adicionales.


