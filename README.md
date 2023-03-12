# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso 2022/23)
Autor/a: Pablo Partal García   uvus:pabpargar



## Estructura de las carpetas del proyecto

* **/src**: Directorio con el código fuente.
  * **fp.casas**: Paquete que contiene los tipos del proyecto.
  * **fp.casas.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
  * **fp.common**:	Paquete que contiene  
* **/data**: Contiene el dataset del proyecto.
    * **melb_data.csv**: Archivo csv que contiene datos de diferentes casas de melburne.
   
## Estructura del *dataset*

El dataset original constaba de 21 columnas y mas de 13000 lineas. El dataset finalmene consta de 18 columnas y de 3215 lineas de las cuales las dos ultimas han sido generadas aleatoriamente.

* **suburb**: de tipo String,  indica el suburbi donde se encuentra la casa.
* **address**: de tipo String, indica la direccion de la casa.
* **rooms**: de tipo Integer, indica el numero de habitaciones que tiene la casa sin contar dormitorios y baños.
* **type**: de tipo Enun, indica de que tipo es la casa.
* **price**: de tipo Double, indica el valor de la casa.
* **method**: de tipo String, indica el metodo de como se ha vendido la casa.
* **sellerG**: de tipo String, indica quien es el vendedor.
* **date**: de tipo LocalDate, fecha en la que se vendio la casa.
* **distance**: de tipo Double, distancia a la que esta la casa del centro en kilometros. 
* **postcode**: de tipo Double. codigo postal de la casa.
* **bedroom2**: de tipo Double. numero de dormitorios.
* **bathroom**: de tipo Double. numero de baños.
* **car**: de tipo Double. numero de coches que entran en el garaje.
* **landsize**: de tipo Double. metros cuadrados de jardin.
* **Lattitude**: de tipo Double. latitud a la que se encuentra.
* **Longtitude**: de tipo Double. longitud a la que se encuentra.
* **Pool**: de tipo Boolean. Si tiene o no piscina.
* **Other space**: de tipo List. Lista de otros espacio que tiene la casa.


## Tipos implementados

Los tipos que se han implementado en el proyecto son los siguientes:

### Tipo Base - Casa
Representa una casa en concreto.
**Propiedades**:

* **suburb**: de tipo String, consultable y modificable, indica el suburbi donde se encuentra la casa.
* **address**: de tipo String,consultable y modificable, indica la direccion de la casa.
* **rooms**: de tipo Integer,consultable y modificable, indica el numero de habitaciones que tiene la casa sin contar dormitorios y baños.
* **type**: de tipo Enun,consultable y modificable, indica de que tipo es la casa.
* **price**: de tipo Double,consultable y modificable, indica el valor de la casa.
* **method**: de tipo String,consultable y modificable, indica el metodo de como se ha vendido la casa.
* **sellerG**: de tipo String,consultable y modificable,indica quien es el vendedor.
* **date**: de tipo LocalDate,consultable y modificable, fecha en la que se vendio la casa.
* **distance**: de tipo Double,consultable y modificable, distancia a la que esta la casa del centro en kilometros. 
* **postcode**: de tipo Double,consultable y modificable, codigo postal de la casa.
* **bedroom2**: de tipo Double,consultable y modificable, numero de dormitorios.
* **bathroom**: de tipo Double,consultable y modificable, numero de baños.
* **car**: de tipo Double,consultable y modificable, numero de coches que entran en el garaje.
* **landsize**: de tipo Double,consultable y modificable, metros cuadrados de jardin.
* **Pool**: de tipo Boolean, consultable y modificableconsultable y modificable, Si tiene o no piscina.
* **Other space**: de tipo List, consultable y modificable, Lista de otros espacio que tiene la casa.
* **Numtotalhabitaciones**: de tipo Integer, consultable, numero total de habtaciones de la casa.

**Constructores**: 

- C1: Tiene un parámetro por cada propiedad básica del tipo.
- C2: Crea un objeto de tipo Casa(String suburb, String address, Integer rooms, Type type, Double price, String method, String sellerG, LocalDate date, Double distance, Double postcode, Double bedroom2, Double bathroom, Double car, Double landsize, Coordenadas coordenadas, Boolean pool, String otherspace).

**Restricciones**:
 
- R1: La direccion no puede estar vacio.
- R2: El precio no puede ser negativo.

c
**Criterio de igualdad**: Dos casas son iguales si su direccion y su terreno son iguales.
.


**Criterio de ordenación**: Por direccion y la logitud de su terreno.

.
## Tipos auxiliares
- Coordenadas. Esta compuesto por latitud y longitud. 
    