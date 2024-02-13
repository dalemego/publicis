# Procesador de planillas

Este proyecto contiene las clases para obtener el monto total del procesamiento de plantillas y clase de JUnit con los casos de prueba correspondientes.

Las clases incluidas son las siguientes:

* ProcesadorPlantillas.java: Contiene la clase principal que invoca el metodo para obtener el monto mensual total.
    * public static void main(String[] args)

* Planilla: Definicion de planilla que contiene el metodo y la logica para obtener el monto mensual total. 
    * HashTable<Float, String> obternerTotalPagoMensual(int periodo)
    * El metodo retorna un objeto HashTable con el fin de que la llave corresponda al monto calculado y el valor al texto resultado del procesamiento (OK, ERROR). Lo anterior para proporcionar informacion adicional a los casos de prueba.
    * int periodo: Corresponde al valor de entrada correspondiente al mes (1-12), para ser usado en la entrada del programa, sin embargo esto no esta implementado en el main, se deja simplemente como observacion.

* Empleado: Definicion del empleado, contiene los atributos de interes correspondientes al empleado presente en la planilla. 
    * getId: Obtiene el ID del empleado.
    * getNombre: Obtiene el nombre del empleado.
    * getMontoMensual:Obtiene el monto mensual correspondiente al empleado.
     * getActivo:Obtiene el estado del empleado, activo o inactivo. 
     
* ProveedorMiembrosPlantilla: Clase de referencia para emular la libreria o conexion externa que contendra los datos de la planilla. Contiene una lista estatica predefinida con valores de planilla de ejemplo.
    * List<Empleado> obtenerEmpleado(int periodo): Obtiene la lista de empleados correspondientes a un periodo definido. 
    * agregarEmpleado(id,nombre,montoMensual,activo): Metodo de ejemplo para poder agregar nuevos registros a la lista desde los casos de prueba. 

## Casos de prueba

Se incluye una clase JUnit que contiene 4 casos para probar los siguientes escenarios.

* test1RegistroCorrecto: Evalua que el monto total pueda obtenerse con datos en condiciones normales.

* testIdCero: Evalua que el monto total pueda obtenerse cuando el campo ID es cero en alguno de los registros. En este caso se espera que el metodo retorne ERROR.

* testNombreVacio: Evalua que el monto total pueda obtenerse cuando el campo Nombre es vacio en alguno de los registros. En este caso se espera que el metodo retorne ERROR.

* testMontoNegativo: Evalua que el monto total pueda obtenerse cuando el campo montoMensual tiene un valor negativo. En este caso se espera que el metodo retorne ERROR.

