# Proyecto del Segundo Cuatrimestre Fundamentos de Programaci�n (Curso 2022/23)
Autor/a: Pablo Partal Garc�a   uvus:pabpargar



## Estructura de las carpetas del proyecto

* **/src**: Directorio con el c�digo fuente.
  * **fp.casas**: Paquete que contiene los tipos del proyecto.
  * **fp.casas.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
  * **fp.common**:	Paquete que contiene  
* **/data**: Contiene el dataset del proyecto.
    * **melb_data.csv**: Archivo csv que contiene datos de diferentes casas de melburne.
   
## Estructura del *dataset*

El dataset original constaba de 21 columnas y mas de 13000 lineas. El dataset finalmene consta de 18 columnas y de 3215 lineas de las cuales las dos ultimas han sido generadas aleatoriamente..

* **suburb**: de tipo String,  indica el suburbi donde se encuentra la casa.
* **address**: de tipo String, indica la direccion de la casa.
* **rooms**: de tipo Integer, indica el numero de habitaciones que tiene la casa sin contar dormitorios y ba�os.
* **type**: de tipo Enun, indica de que tipo es la casa.
* **price**: de tipo Double, indica el valor de la casa.
* **method**: de tipo String, indica el metodo de como se ha vendido la casa.
* **sellerG**: de tipo String, indica quien es el vendedor.
* **date**: de tipo LocalDate, fecha en la que se vendio la casa.
* **distance**: de tipo Double, distancia a la que esta la casa del centro en kilometros. 
* **postcode**: de tipo Double. codigo postal de la casa.
* **bedroom2**: de tipo Double. numero de dormitorios.
* **bathroom**: de tipo Double. numero de ba�os.
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
* **rooms**: de tipo Integer,consultable y modificable, indica el numero de habitaciones que tiene la casa sin contar dormitorios y ba�os.
* **type**: de tipo Enun,consultable y modificable, indica de que tipo es la casa.
* **price**: de tipo Double,consultable y modificable, indica el valor de la casa.
* **method**: de tipo String,consultable y modificable, indica el metodo de como se ha vendido la casa.
* **sellerG**: de tipo String,consultable y modificable,indica quien es el vendedor.
* **date**: de tipo LocalDate,consultable y modificable, fecha en la que se vendio la casa.
* **distance**: de tipo Double,consultable y modificable, distancia a la que esta la casa del centro en kilometros. 
* **postcode**: de tipo Double,consultable y modificable, codigo postal de la casa.
* **bedroom2**: de tipo Double,consultable y modificable, numero de dormitorios.
* **bathroom**: de tipo Double,consultable y modificable, numero de ba�os.
* **car**: de tipo Double,consultable y modificable, numero de coches que entran en el garaje.
* **landsize**: de tipo Double,consultable y modificable, metros cuadrados de jardin.
* **Pool**: de tipo Boolean, consultable y modificableconsultable y modificable, Si tiene o no piscina.
* **Other space**: de tipo List, consultable y modificable, Lista de otros espacio que tiene la casa.
* **Numtotalhabitaciones**: de tipo Integer, consultable, numero total de habtaciones de la casa.

**Constructores**: 

- C1: Tiene un par�metro por cada propiedad b�sica del tipo.
- C2: Crea un objeto de tipo Casa(String suburb, String address, Integer rooms, Type type, Double price, String method, String sellerG, LocalDate date, Double distance, Double postcode, Double bedroom2, Double bathroom, Double car, Double landsize, Coordenadas coordenadas, Boolean pool, String otherspace).

**Restricciones**:
 
- R1: La direccion no puede estar vacio.
- R2: El precio no puede ser negativo.

c
**Criterio de igualdad**: Dos casas son iguales si su direccion y su terreno son iguales.
.


**Criterio de ordenaci�n**: Por direccion y la logitud de su terreno.

.
## Tipos auxiliares
- Coordenadas. Esta compuesto por latitud y longitud. 

### Factor�a - FactoriaCasas
Clase de factor�a para construir objetos de tipo Casas.
- _Partidas leerCasas(String Fichero)_:Crea un objeto de tipo Casas partir de la informaci�n recogida en el archivo csv, cuya ruta se da como par�metro.

### Tipo Contenedor - Casas
Clase contenedora de los objetos de tipo Casa.
**Propiedades**:
-  _casas_, de tipo _Set\<casa\>_, consultable. Conjunto de casas.
 
**Constructores**: 
- C1: Constructor por defecto. Creal un objeto de tipo Casas sin ninguna partida almacenada.
- C2: Constructor con un par�metro de tipo Collection\<Casa\>. Crea un objeto de tipo Casas con las casas incluidas en la colecci�n dada como par�metro.

**Otras operaciones**:
- _getSellerg(String seller)_: devuelve true si el valor pasado por parametro existe en al menos un objeto del csv.
-_getsumacoches(String suburb)_: realiza la suma de las plazas de garajes en un barrio.
-_getcasascodigopostal(Double postcode)_:devuelve una lista filtrada por el codigo postal.
-_getcasasportype()_: devuelve un diccionario con clave el tipo de casa y valor los objetos casas que le pertenecen.
-_ getnumroomMethod()_: devuelve un diccionario de clave Method y valor la suma total de la habitaciones
-_a�adirCasa(Casa casa)_: a�ade una casa.
-_getnumeroCasa()_:cuenta el numero de casas totales.
-_eliminarcasa(Casa casa)_: elimina una casa.
-_a�adircasas(Collection<Casa> casa)_: a�ade una coleccion de casas.
-_getSellergStream(String seller)_: igual que getSellerg solo que realizo usando stream.
-_getsumacochesStream(String suburb)_: igual que getsumacoches solo que realizo usando stream.
-_getcasascodigopostalStream(Double postcode)_: igual que getcasascodigopostal solo que realizo usando stream.
-_getMaximoPrecioStream(Type type)_:devuelve el maximo precio segun el tipo.
-_getFiltrarMethodOrdenarFecha(String method)_: devuelve un conjunto de casas filtrado por el metodo pasado por parametro.
-_getCasasPorTypeStream()_:devuelve diccionario de clave type y valor un conjunto de casas.
-_getConjuntoDeSellerStream()_:devuelve un conjunto con todos los Sellerg.
-_getMayorLandsizeSegunSiTienePiscina()_:devuelve diccionario de clave Pool y valor el valor maximo de landsize.
-_getLasNCasasConMasRoomsPorSuburb(Integer n)_: devuelve diccionario de clave Suburb y de valor una lista ordenada con el mayor numero de habitaciones.
-_getSellerMayorPrecio()_:devuelve el suburb con el mayor precio.

    