# Sistema de Auditoría de Cierre Financiero (Patrón de Diseño Iterator)

Este repositorio contiene un módulo de software desarrollado en Java para el escaneo y procesamiento secuencial de asientos contables al término de la jornada bancaria. El objetivo principal es estandarizar el recorrido de los registros de caja sin exponer las estructuras de almacenamiento internas.

---

## Organización y Componentes del Sistema

Para asegurar un acoplamiento débil y cumplir con los estándares de desarrollo limpio, el código fuente se centraliza en el directorio de producción de la siguiente manera:

* **`src/Transaccion.java`**
  Representa la entidad de datos (clase modelo) que encapsula las propiedades obligatorias de cada movimiento financiero: identificador único, estampa de tiempo, operación y volumen monetario.
* **`src/Iterator.java`**
  Abstracción de control (interfaz). Establece el contrato de operaciones necesarias para la navegación del lote, aislando la lógica del negocio de los índices físicos.
* **`src/Agregado.java`**
  Abstracción del contenedor (interfaz). Define la firma para la construcción delegada del agente de recorrido.
* **`src/TransaccionIterator.java`**
  Manejador concreto del recorrido. Implementa la lógica secuencial indexada, evaluando de forma segura los límites de memoria y descartando punteros nulos.
* **`src/RegistroFinanciero.java`**
  Repositorio de datos persistentes en memoria. Almacena de forma segura el lote consolidado de transacciones utilizando un contenedor estático de dimensión fija.
* **`src/Main.java`**
  Punto de entrada de la aplicación. Simula el comportamiento del sistema cliente (consola de auditoría) consumiendo el flujo de datos a través de las interfaces abstractas.

---

## Análisis y Sustentación Técnica del Recorrido

La selección de un algoritmo de recorrido indexado sobre un vector estático responde directamente a las reglas de negocio críticas del sector financiero:

### Consolidación de Estados de Cuenta (Inmutabilidad)
Al cierre de las operaciones bancarias, los movimientos generados durante el día se congelan en un lote cerrado para su verificación. La implementación de un arreglo de tamaño fijo (`Array`) garantiza que no se inyecten nuevas operaciones de forma asíncrona mientras se ejecuta la conciliación de saldos, previniendo descuadres contables.

### Integridad en la Inspección de Datos
El puntero aritmético del iterador avanza estrictamente de manera lineal (elemento por elemento). Al no exponer accesos aleatorios ni saltos de índice en la interfaz pública, se asegura que el módulo de auditoría analice el 100% de los registros en orden correlativo, eliminando el riesgo de omisión de transacciones por error humano.

### Encapsulamiento Estricto (Solo Lectura)
A través de las firmas `hasNext()` y `next()`, el entorno de ejecución externo solo puede interrogar y extraer la información para su despliegue. Se restringe cualquier capacidad de alteración, eliminación o edición de las propiedades de los objetos cargados, blindando la integridad de los registros financieros de prueba.

### Optimización y Prevención de Excepciones
El algoritmo valida la persistencia del ciclo mediante una doble compuerta de verificación lógica:

`return posicion < transacciones.length && transacciones[posicion] != null`